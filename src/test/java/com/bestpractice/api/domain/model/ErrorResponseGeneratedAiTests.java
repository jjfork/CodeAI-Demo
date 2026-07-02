package com.bestpractice.api.domain.model;

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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ErrorResponseGeneratedAiTests {

    private ErrorResponse errorResponse;

    @BeforeEach
    void setUp() {
        errorResponse = new ErrorResponse();
    }

    @Test
    void testDefaultValues() {
        // GIVEN a new ErrorResponse instance
        // WHEN accessing its fields without setting them
        // THEN all fields should have their default values
        assertThat(errorResponse.getStatus()).isEqualTo(0);
        assertThat(errorResponse.getError()).isNull();
        assertThat(errorResponse.getMessage()).isNull();
    }

    @Test
    void testSetStatus() {
        // GIVEN an ErrorResponse instance
        // WHEN setting the status to 404
        // THEN getStatus should return 404
        errorResponse.setStatus(404);
        assertThat(errorResponse.getStatus()).isEqualTo(404);
    }

    @Test
    void testSetError() {
        // GIVEN an ErrorResponse instance
        // WHEN setting the error to "Not Found"
        // THEN getError should return "Not Found"
        errorResponse.setError("Not Found");
        assertThat(errorResponse.getError()).isEqualTo("Not Found");
    }

    @Test
    void testSetMessage() {
        // GIVEN an ErrorResponse instance
        // WHEN setting the message to "Resource not found"
        // THEN getMessage should return "Resource not found"
        errorResponse.setMessage("Resource not found");
        assertThat(errorResponse.getMessage()).isEqualTo("Resource not found");
    }

    @Test
    void testSetAllFields() {
        // GIVEN an ErrorResponse instance
        // WHEN setting status, error, and message
        // THEN getters should return the set values
        errorResponse.setStatus(500);
        errorResponse.setError("Internal Server Error");
        errorResponse.setMessage("An unexpected error occurred");
        assertThat(errorResponse.getStatus()).isEqualTo(500);
        assertThat(errorResponse.getError()).isEqualTo("Internal Server Error");
        assertThat(errorResponse.getMessage()).isEqualTo("An unexpected error occurred");
    }

    @Test
    void testSetStatusBoundaryValues() {
        // GIVEN an ErrorResponse instance
        // WHEN setting status to Integer.MIN_VALUE
        // THEN getStatus should return Integer.MIN_VALUE
        errorResponse.setStatus(Integer.MIN_VALUE);
        assertThat(errorResponse.getStatus()).isEqualTo(Integer.MIN_VALUE);

        // WHEN setting status to Integer.MAX_VALUE
        // THEN getStatus should return Integer.MAX_VALUE
        errorResponse.setStatus(Integer.MAX_VALUE);
        assertThat(errorResponse.getStatus()).isEqualTo(Integer.MAX_VALUE);
    }

    @Test
    void testSetErrorNull() {
        // GIVEN an ErrorResponse instance
        // WHEN setting the error to null
        // THEN getError should return null
        errorResponse.setError(null);
        assertThat(errorResponse.getError()).isNull();
    }

    @Test
    void testSetMessageNull() {
        // GIVEN an ErrorResponse instance
        // WHEN setting the message to null
        // THEN getMessage should return null
        errorResponse.setMessage(null);
        assertThat(errorResponse.getMessage()).isNull();
    }
}
