package com.bestpractice.api.domain.service;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.model.Credential;
import com.bestpractice.api.infrastrucuture.entity.User;
import com.bestpractice.api.infrastrucuture.persistent.UserPersistentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AuthServiceImplGeneratedAiTests {

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @Mock
    private AuthComponent authComponent;

    @Mock
    private UserPersistentRepository userPersistentRepository;

    @InjectMocks
    private AuthServiceImpl authServiceImpl;

    @BeforeEach
    void setUp() {
        // Reset mocks before each test
        reset(encryptionComponent, authComponent, userPersistentRepository);
    }

    @Test
    void givenValidCredentials_whenLogin_thenReturnAuthResponse() {
        // GIVEN
        String email = "test@example.com";
        String password = "password";
        User user = new User();
        user.setId(1L);
        user.setEmail(email);
        user.setPassword("hashedPassword");

        Credential token = new Credential("Bearer", "accessToken", new Date(), false);
        Credential refreshToken = new Credential("Bearer", "refreshToken", new Date(), true);

        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(true);
        when(authComponent.generateJwt(user.getId(), user.getEmail(), false)).thenReturn(token);
        when(authComponent.generateJwt(user.getId(), user.getEmail(), true)).thenReturn(refreshToken);

        // WHEN
        AuthResponse response = authServiceImpl.login(email, password);

        // THEN
        assertNotNull(response);
        assertEquals(token.getTokenType(), response.getTokenType());
        assertEquals(token.getToken(), response.getToken());
        assertEquals(refreshToken.getToken(), response.getRefreshToken());
        assertEquals(String.valueOf(token.getExp()), response.getExp());
    }

    @Test
    void givenInvalidEmail_whenLogin_thenThrowUnAuthorized() {
        // GIVEN
        String email = "invalid@example.com";
        String password = "password";
        when(userPersistentRepository.findByEmail(email)).thenReturn(null);

        // WHEN & THEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));
    }

    @Test
    void givenInvalidPassword_whenLogin_thenThrowUnAuthorized() {
        // GIVEN
        String email = "test@example.com";
        String password = "wrongPassword";
        User user = new User();
        user.setId(1L);
        user.setEmail(email);
        user.setPassword("hashedPassword");

        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(false);

        // WHEN & THEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));
    }

    @Test
    void givenValidRefreshToken_whenLogin_thenReturnAuthResponse() {
        // GIVEN
        String refreshTokenStr = "refreshToken";
        String email = "test@example.com";
        User user = new User();
        user.setId(1L);
        user.setEmail(email);

        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(decodedJWT.getClaim(AuthComponent.ClaimUserEmailKey).asString()).thenReturn(email);
        when(decodedJWT.getClaim(AuthComponent.ClaimRefreshKey).asBoolean()).thenReturn(true);

        Credential token = new Credential("Bearer", "accessToken", new Date(), false);
        Credential refreshToken = new Credential("Bearer", "newRefreshToken", new Date(), true);

        when(authComponent.decodeJwt(refreshTokenStr)).thenReturn(decodedJWT);
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(authComponent.generateJwt(user.getId(), user.getEmail(), false)).thenReturn(token);
        when(authComponent.generateJwt(user.getId(), user.getEmail(), true)).thenReturn(refreshToken);

        // WHEN
        AuthResponse response = authServiceImpl.login(refreshTokenStr);

        // THEN
        assertNotNull(response);
        assertEquals(token.getTokenType(), response.getTokenType());
        assertEquals(token.getToken(), response.getToken());
        assertEquals(refreshToken.getToken(), response.getRefreshToken());
        assertEquals(String.valueOf(token.getExp()), response.getExp());
    }

    @Test
    void givenInvalidRefreshToken_whenLogin_thenThrowUnAuthorized() {
        // GIVEN
        String refreshTokenStr = "invalidRefreshToken";
        String email = "test@example.com";
        User user = new User();
        user.setId(1L);
        user.setEmail(email);

        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(decodedJWT.getClaim(AuthComponent.ClaimUserEmailKey).asString()).thenReturn(email);
        when(decodedJWT.getClaim(AuthComponent.ClaimRefreshKey).asBoolean()).thenReturn(false);

        when(authComponent.decodeJwt(refreshTokenStr)).thenReturn(decodedJWT);
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);

        // WHEN & THEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(refreshTokenStr));
    }

    @Test
    void givenRefreshTokenWithUnknownUser_whenLogin_thenThrowUnAuthorized() {
        // GIVEN
        String refreshTokenStr = "refreshToken";
        String email = "unknown@example.com";

        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(decodedJWT.getClaim(AuthComponent.ClaimUserEmailKey).asString()).thenReturn(email);
        when(decodedJWT.getClaim(AuthComponent.ClaimRefreshKey).asBoolean()).thenReturn(true);

        when(authComponent.decodeJwt(refreshTokenStr)).thenReturn(decodedJWT);
        when(userPersistentRepository.findByEmail(email)).thenReturn(null);

        // WHEN & THEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(refreshTokenStr));
    }
}