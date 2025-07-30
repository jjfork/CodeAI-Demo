package com.bestpractice.api.domain.component;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

@ExtendWith(UNKNOWN.class)
public class AuthComponentGeneratedAiTests {

    @InjectMocks
    private AuthComponent authComponent;

    @Mock
    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        when(credentialProperty.getHmacSecret()).thenReturn("secret");
        when(credentialProperty.convertToIntExpires()).thenReturn(1);
    }

    @Test
    void testDecodeJwt_MissingClaimException() {
        // GIVEN
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
        // WHEN
        assertThrows(MissingClaimException.class, () -> authComponent.decodeJwt("missing_claim_token"));
    }

    @Test
    void testDecodeJwt_IncorrectClaimException() {
        // GIVEN
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
        // WHEN
        assertThrows(IncorrectClaimException.class, () -> authComponent.decodeJwt("incorrect_claim_token"));
    }

    @Test
    void testDecodeJwt_JWTDecodeException() {
        // GIVEN
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
        // WHEN
        assertThrows(JWTDecodeException.class, () -> authComponent.decodeJwt("invalid_token"));
    }

    @Test
    void testGetExpiration() {
        // GIVEN
        int hour = 1;
        // WHEN
        Date expiration = authComponent.getExpiration(hour);
        // THEN
        assertNotNull(expiration);
    }
}