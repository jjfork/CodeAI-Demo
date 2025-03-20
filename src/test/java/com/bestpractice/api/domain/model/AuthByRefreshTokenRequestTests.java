package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

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
    void testGetRefreshToken() {
        // GIVEN - A refreshToken is set.
        String refreshToken = "someRefreshToken";
        authByRefreshTokenRequest.setRefreshToken(refreshToken);
        // WHEN - The getRefreshToken method is called.
        String actualRefreshToken = authByRefreshTokenRequest.getRefreshToken();
        // THEN - The returned refreshToken matches the set value.
        assertEquals(refreshToken, actualRefreshToken);
    }

    @Test
    void testSetRefreshToken() {
        // GIVEN - A new refreshToken is provided.
        String refreshToken = "someRefreshToken";
        // WHEN - The setRefreshToken method is called with the new refreshToken.
        authByRefreshTokenRequest.setRefreshToken(refreshToken);
        // THEN - The refreshToken attribute of the object is updated to the new value.
        assertEquals(refreshToken, authByRefreshTokenRequest.getRefreshToken());
    }
}
