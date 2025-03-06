package com.bestpractice.api.domain.model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ErrorResponseTests {
    private ErrorResponse errorResponse;

    @BeforeEach
    void setUp() {
        errorResponse = new ErrorResponse();
    }

    @Test
    void testGetStatus() {
        // GIVEN - An ErrorResponse object
        // WHEN - getStatus() is called
        int actualStatus = errorResponse.getStatus();
        // THEN - The returned status should be the default value (likely 0)
        assertEquals(0, actualStatus);
    }

    @Test
    void testSetStatus() {
        // GIVEN - An ErrorResponse object
        // WHEN - setStatus(500) is called
        errorResponse.setStatus(500);
        // THEN - The status should be updated to 500
        assertEquals(500, errorResponse.getStatus());
    }

    @Test
    void testGetError() {
        // GIVEN - An ErrorResponse object
        // WHEN - getError() is called
        String actualError = errorResponse.getError();
        // THEN - The returned error should be null (default value)
        assertNull(actualError);
    }

    @Test
    void testSetError() {
        // GIVEN - An ErrorResponse object
        // WHEN - setError("Internal Server Error") is called
        errorResponse.setError("Internal Server Error");
        // THEN - The error should be updated to "Internal Server Error"
        assertEquals("Internal Server Error", errorResponse.getError());
    }

    @Test
    void testGetMessage() {
        // GIVEN - An ErrorResponse object
        // WHEN - getMessage() is called
        String actualMessage = errorResponse.getMessage();
        // THEN - The returned message should be null (default value)
        assertNull(actualMessage);
    }

    @Test
    void testSetMessage() {
        // GIVEN - An ErrorResponse object
        // WHEN - setMessage("Something went wrong") is called
        errorResponse.setMessage("Something went wrong");
        // THEN - The message should be updated to "Something went wrong"
        assertEquals("Something went wrong", errorResponse.getMessage());
    }
}
