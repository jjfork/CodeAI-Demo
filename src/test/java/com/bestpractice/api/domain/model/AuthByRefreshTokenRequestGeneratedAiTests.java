package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AuthByRefreshTokenRequestGeneratedAiTests {

    private AuthByRefreshTokenRequest request;

    @BeforeEach
    void setUp() {
        request = new AuthByRefreshTokenRequest();
    }

    @Test
    void testSetAndGetRefreshToken() {
        // GIVEN: a valid refresh token string
        String token = "sampleRefreshToken";

        // WHEN: setting the refresh token
        request.setRefreshToken(token);

        // THEN: the getter should return the same token
        assertEquals(token, request.getRefreshToken());
    }

    @Test
    void testGetRefreshTokenInitiallyNull() {
        // GIVEN: a new AuthByRefreshTokenRequest instance

        // WHEN: retrieving the refresh token without setting it

        // THEN: the refresh token should be null
        assertNull(request.getRefreshToken());
    }

    @Test
    void testSetRefreshTokenToNull() {
        // GIVEN: a refresh token already set
        request.setRefreshToken("existingToken");

        // WHEN: setting the refresh token to null
        request.setRefreshToken(null);

        // THEN: the getter should return null
        assertNull(request.getRefreshToken());
    }

    @Test
    void testSetRefreshTokenEmptyString() {
        // GIVEN: an empty string as refresh token
        String emptyToken = "";

        // WHEN: setting the refresh token to empty string
        request.setRefreshToken(emptyToken);

        // THEN: the getter should return the empty string
        assertEquals(emptyToken, request.getRefreshToken());
    }

    @Test
    void testSetRefreshTokenLongString() {
        // GIVEN: a very long refresh token string
        String longToken = "a".repeat(500);

        // WHEN: setting the refresh token to a long string
        request.setRefreshToken(longToken);

        // THEN: the getter should return the same long string
        assertEquals(longToken, request.getRefreshToken());
    }

    @Test
    void testSetRefreshTokenDoesNotThrowException() {
        // GIVEN: a valid refresh token string
        String token = "validToken";

        // WHEN: setting the refresh token
        request.setRefreshToken(token);

        // THEN: the getter should return the same token without throwing exceptions
        assertEquals(token, request.getRefreshToken());
    }

    @Test
    void testSetRefreshTokenNullDoesNotThrowException() {
        // GIVEN: a null refresh token

        // WHEN: setting the refresh token to null
        request.setRefreshToken(null);

        // THEN: the getter should return null without throwing exceptions
        assertNull(request.getRefreshToken());
    }
}
