package com.bestpractice.api.domain.model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AuthResponseTests {

    private String tokenType;
    private String token;
    private String refreshToken;
    private Date expiresAt;

    @BeforeEach
    void setUp() {
        tokenType = "Bearer";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
        refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
        expiresAt = new Date();
    }

    @Test
    void testGetTokenType() {
        // GIVEN - An AuthResponse object is created.
        AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
        // WHEN - The getTokenType method is called on the authResponse object.
        String actualTokenType = authResponse.getTokenType();
        // THEN - The returned token type should be equal to the expected token type.
        assertEquals("Bearer", actualTokenType);
    }

    @Test
    void testGetToken() {
        // GIVEN - An AuthResponse object is created.
        AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
        // WHEN - The getToken method is called on the authResponse object.
        String actualToken = authResponse.getToken();
        // THEN - The returned token should be equal to the expected token.
        assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
    }

    @Test
    void testGetRefreshToken() {
        // GIVEN - An AuthResponse object is created.
        AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
        // WHEN - The getRefreshToken method is called on the authResponse object.
        String actualRefreshToken = authResponse.getRefreshToken();
        // THEN - The returned refresh token should be equal to the expected refresh token.
        assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
    }

    @Test
    void testGetExpiresAt() {
        // GIVEN - An AuthResponse object is created.
        AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
        // WHEN - The getExpiresAt method is called on the authResponse object.
        Date actualExpiresAt = authResponse.getExpiresAt();
        // THEN - The returned expiration date should be equal to the expected expiration date.
        assertEquals(expiresAt, actualExpiresAt);
    }
}
