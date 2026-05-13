package com.bestpractice.api.domain.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthByRefreshTokenRequestGeneratedAiTests {

    private AuthByRefreshTokenRequest request;

    @BeforeEach
    void setUp() {
        request = new AuthByRefreshTokenRequest();
    }

    @Test
    void testSetAndGetRefreshToken() {
        // GIVEN
        String token = "sampleToken123";

        // WHEN
        request.setRefreshToken(token);
        String result = request.getRefreshToken();

        // THEN
        assertEquals(token, result);
    }

    @Test
    void testSetRefreshTokenNull() {
        // GIVEN
        String token = null;

        // WHEN
        request.setRefreshToken(token);
        String result = request.getRefreshToken();

        // THEN
        assertEquals(null, result);
    }

    @Test
    void testDefaultRefreshTokenIsNull() {
        // GIVEN
        // no action

        // WHEN
        String result = request.getRefreshToken();

        // THEN
        assertEquals(null, result);
    }
}
