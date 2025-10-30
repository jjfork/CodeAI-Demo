package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AuthResponseGeneratedAiTests {

    private String tokenType;
    private String token;
    private String refreshToken;
    private Date expiresAt;

    @BeforeEach
    void setUp() {
        // Reset state before each test
        tokenType = "Bearer";
        token = "sampleToken";
        refreshToken = "sampleRefreshToken";
        expiresAt = new Date();
    }

    @Test
    void testGetTokenTypeReturnsCorrectValue() {
        // GIVEN: an AuthResponse instance with predefined tokenType
        AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);

        // WHEN: getTokenType is called
        String result = authResponse.getTokenType();

        // THEN: the returned value should match the initialized tokenType
        assertNotNull(result);
        assertEquals(tokenType, result);
    }

    @Test
    void testGetTokenReturnsCorrectValue() {
        // GIVEN: an AuthResponse instance with predefined token
        AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);

        // WHEN: getToken is called
        String result = authResponse.getToken();

        // THEN: the returned value should match the initialized token
        assertNotNull(result);
        assertEquals(token, result);
    }

    @Test
    void testGetRefreshTokenReturnsCorrectValue() {
        // GIVEN: an AuthResponse instance with predefined refreshToken
        AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);

        // WHEN: getRefreshToken is called
        String result = authResponse.getRefreshToken();

        // THEN: the returned value should match the initialized refreshToken
        assertNotNull(result);
        assertEquals(refreshToken, result);
    }

    @Test
    void testGetExpiresAtReturnsCorrectValue() {
        // GIVEN: an AuthResponse instance with predefined expiresAt date
        AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);

        // WHEN: getExpiresAt is called
        Date result = authResponse.getExpiresAt();

        // THEN: the returned value should match the initialized expiresAt date
        assertNotNull(result);
        assertEquals(expiresAt, result);
    }

    @Test
    void testConstructorAllowsNullValues() {
        // GIVEN: null values for all parameters
        String nullTokenType = null;
        String nullToken = null;
        String nullRefreshToken = null;
        Date nullExpiresAt = null;

        // WHEN: creating AuthResponse with null values
        AuthResponse authResponse = new AuthResponse(nullTokenType, nullToken, nullRefreshToken, nullExpiresAt);

        // THEN: getters should return null without throwing exceptions
        assertThat(authResponse.getTokenType()).isNull();
        assertThat(authResponse.getToken()).isNull();
        assertThat(authResponse.getRefreshToken()).isNull();
        assertThat(authResponse.getExpiresAt()).isNull();
    }

    @Test
    void testConstructorHandlesEmptyStrings() {
        // GIVEN: empty string values for string parameters
        String empty = "";
        AuthResponse authResponse = new AuthResponse(empty, empty, empty, null);

        // WHEN & THEN: getters should return the empty strings without exceptions
        assertEquals(empty, authResponse.getTokenType());
        assertEquals(empty, authResponse.getToken());
        assertEquals(empty, authResponse.getRefreshToken());
        assertThat(authResponse.getExpiresAt()).isNull();
    }

    @Test
    void testConstructorDoesNotThrowExceptionWithValidValues() {
        // GIVEN: valid values for all parameters
        // WHEN & THEN: no exception should be thrown and object should be created
        AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
        assertNotNull(authResponse);
        assertEquals(tokenType, authResponse.getTokenType());
        assertEquals(token, authResponse.getToken());
        assertEquals(refreshToken, authResponse.getRefreshToken());
        assertEquals(expiresAt, authResponse.getExpiresAt());
    }

    @Test
    void testConstructorWithFutureExpiryDate() {
        // GIVEN: a future expiry date
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, futureDate);

        // WHEN: getExpiresAt is called
        Date result = authResponse.getExpiresAt();

        // THEN: the returned date should match the future date
        assertNotNull(result);
        assertEquals(futureDate, result);
    }

    @Test
    void testConstructorWithPastExpiryDate() {
        // GIVEN: a past expiry date
        Date pastDate = new Date(System.currentTimeMillis() - 100000);
        AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, pastDate);

        // WHEN: getExpiresAt is called
        Date result = authResponse.getExpiresAt();

        // THEN: the returned date should match the past date
        assertNotNull(result);
        assertEquals(pastDate, result);
    }
}
