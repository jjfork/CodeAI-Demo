package com.bestpractice.api.domain.model;

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
import static org.assertj.core.api.Assertions.assertThat;

class ErrorResponseGeneratedAiTests {

    private ErrorResponse errorResponse;

    @BeforeEach
    void setUp() {
        errorResponse = new ErrorResponse();
    }

    @Test
    void testDefaultValues() {
        // GIVEN a new ErrorResponse
        // WHEN accessing properties
        // THEN default values should be 0 for status and null for error and message
        assertThat(errorResponse.getStatus()).isEqualTo(0);
        assertThat(errorResponse.getError()).isNull();
        assertThat(errorResponse.getMessage()).isNull();
    }

    @Test
    void testSettersAndGetters() {
        // GIVEN an ErrorResponse instance
        // WHEN setting status, error, and message
        int status = 404;
        String error = "Not Found";
        String message = "The requested resource was not found.";
        errorResponse.setStatus(status);
        errorResponse.setError(error);
        errorResponse.setMessage(message);
        // THEN getters should return the set values
        assertThat(errorResponse.getStatus()).isEqualTo(status);
        assertThat(errorResponse.getError()).isEqualTo(error);
        assertThat(errorResponse.getMessage()).isEqualTo(message);
    }
