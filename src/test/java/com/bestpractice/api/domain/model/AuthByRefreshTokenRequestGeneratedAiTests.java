package com.bestpractice.api.domain.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthByRefreshTokenRequestGeneratedAiTests {

    private AuthByRefreshTokenRequest request;

    @BeforeEach
    void setUp() {
        request = new AuthByRefreshTokenRequest();
    }

    @Test
    void testDefaultRefreshTokenIsNull() {
        // GIVEN a new instance of the request
        // WHEN no value is set
        // THEN the default value should be null
        assertEquals(null, request.getRefreshToken());
    }

    @Test
    void testSetAndGetValidToken() {
        // GIVEN a non‑empty token
        String token = "valid-token-123";

        // WHEN setting the refresh token
        request.setRefreshToken(token);

        // THEN the getter should return the same token
        assertEquals(token, request.getRefreshToken());
    }

    @Test
    void testSetAndGetEmptyString() {
        // GIVEN an empty string
        String token = "";

        // WHEN setting the refresh token
        request.setRefreshToken(token);

        // THEN the getter should return the empty string
        assertEquals("", request.getRefreshToken());
    }

    @Test
    void testSetAndGetWhitespaceString() {
        // GIVEN a whitespace‑only string
        String token = "   ";

        // WHEN setting the refresh token
        request.setRefreshToken(token);

        // THEN the getter should return the whitespace string
        assertEquals("   ", request.getRefreshToken());
    }

    @Test
    void testSetAndGetNullToken() {
        // GIVEN a null value
        String token = null;

        // WHEN setting the refresh token to null
        request.setRefreshToken(token);

        // THEN the getter should return null
        assertEquals(null, request.getRefreshToken());
    }
}
