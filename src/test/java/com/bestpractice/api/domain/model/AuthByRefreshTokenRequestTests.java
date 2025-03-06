package com.bestpractice.api.domain.model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthByRefreshTokenRequestTests {
    private AuthByRefreshTokenRequest authByRefreshTokenRequest;

    @BeforeEach
    void setUp() {
        authByRefreshTokenRequest = new AuthByRefreshTokenRequest();
    }

    @Test
    void testGetRefreshToken_ReturnsNullWhenNotSet() {
        // GIVEN - refreshToken is not set
        String refreshToken = authByRefreshTokenRequest.getRefreshToken();
        // THEN - refreshToken should be null
        assertNull(refreshToken);
    }

    @Test
    void testSetRefreshToken_SetsRefreshToken() {
        // GIVEN - A valid refreshToken value
        String refreshTokenValue = "someRefreshToken";
        // WHEN - setRefreshToken is called with the value
        authByRefreshTokenRequest.setRefreshToken(refreshTokenValue);
        // THEN - getRefreshToken should return the set value
        assertEquals(refreshTokenValue, authByRefreshTokenRequest.getRefreshToken());
    }
}
