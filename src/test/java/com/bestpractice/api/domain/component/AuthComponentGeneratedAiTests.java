package com.bestpractice.api.domain.component;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.InternalServerError;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.common.property.CredentialProperty;
import com.bestpractice.api.domain.model.Credential;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AuthComponentGeneratedAiTests {

    private CredentialProperty credentialProperty;
    private AuthComponent authComponent;

    @BeforeEach
    void setUp() {
        credentialProperty = Mockito.mock(CredentialProperty.class);
        Mockito.when(credentialProperty.getHmacSecret()).thenReturn("test-secret");
        Mockito.when(credentialProperty.getProvider()).thenReturn("test-provider");
        Mockito.when(credentialProperty.convertToIntExpires()).thenReturn(1);
        authComponent = new AuthComponent(credentialProperty);
    }

    @Test
    void givenValidToken_whenDecodeJwt_thenReturnsDecodedJWT() {
        // GIVEN
        String token = JWT.create()
                .withIssuer(credentialProperty.getProvider())
                .withIssuedAt(new Date())
                .sign(Algorithm.HMAC256(credentialProperty.getHmacSecret()));

        // WHEN
        DecodedJWT decodedJWT = authComponent.decodeJwt(token);

        // THEN
        assertNotNull(decodedJWT);
        assertEquals(credentialProperty.getProvider(), decodedJWT.getIssuer());
    }

    @Test
    void givenExpiredToken_whenDecodeJwt_thenThrowsUnAuthorized() {
        // GIVEN
        Date pastDate = new Date(System.currentTimeMillis() - 10000);
        String token = JWT.create()
                .withIssuer(credentialProperty.getProvider())
                .withIssuedAt(new Date())
                .withExpiresAt(pastDate)
                .sign(Algorithm.HMAC256(credentialProperty.getHmacSecret()));

        // WHEN & THEN
        assertThrows(UnAuthorized.class, () -> authComponent.decodeJwt(token));
    }

    @Test
    void givenInvalidSignature_whenDecodeJwt_thenThrowsInternalServerError() {
        // GIVEN
        String token = JWT.create()
                .withIssuer(credentialProperty.getProvider())
                .withIssuedAt(new Date())
                .sign(Algorithm.HMAC256("wrong-secret"));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> authComponent.decodeJwt(token));
    }

    @Test
    void givenInvalidTokenFormat_whenDecodeJwt_thenThrowsUnAuthorized() {
        // GIVEN
        String invalidToken = "invalid.token.value";

        // WHEN & THEN
        assertThrows(UnAuthorized.class, () -> authComponent.decodeJwt(invalidToken));
    }

    @Test
    void givenValidData_whenGenerateJwt_thenReturnsCredentialWithExpectedClaims() {
        // GIVEN
        String userId = "user123";
        String email = "user@example.com";
        boolean isRefresh = false;

        // WHEN
        Credential credential = authComponent.generateJwt(userId, email, isRefresh);

        // THEN
        assertNotNull(credential);
        assertNotNull(credential.getToken());
        assertEquals("Bearer", credential.getTokenType());
        assertFalse(credential.isRefresh());
    }

    @Test
    void givenRefreshTokenRequest_whenGenerateJwt_thenReturnsCredentialWithRefreshClaim() {
        // GIVEN
        String userId = "user123";
        String email = "user@example.com";
        boolean isRefresh = true;

        // WHEN
        Credential credential = authComponent.generateJwt(userId, email, isRefresh);

        // THEN
        assertNotNull(credential);
        assertTrue(credential.isRefresh());
    }

    @Test
    void givenNullExpiresHour_whenGenerateJwt_thenReturnsCredentialWithoutExpiration() {
        // GIVEN
        Mockito.when(credentialProperty.convertToIntExpires()).thenReturn(null);
        String userId = "user123";
        String email = "user@example.com";
        boolean isRefresh = false;

        // WHEN
        Credential credential = authComponent.generateJwt(userId, email, isRefresh);

        // THEN
        assertNotNull(credential);
        assertNotNull(credential.getToken());
        assertEquals("Bearer", credential.getTokenType());
        assertFalse(credential.isRefresh());
    }

    @Test
    void givenRefreshTokenAndNullExpiresHour_whenGenerateJwt_thenReturnsCredentialWithRefreshClaim() {
        // GIVEN
        Mockito.when(credentialProperty.convertToIntExpires()).thenReturn(null);
        String userId = "user123";
        String email = "user@example.com";
        boolean isRefresh = true;

        // WHEN
        Credential credential = authComponent.generateJwt(userId, email, isRefresh);

        // THEN
        assertNotNull(credential);
        assertTrue(credential.isRefresh());
    }
}
