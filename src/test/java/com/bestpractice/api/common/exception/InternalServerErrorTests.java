package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InternalServerErrorTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor_NoMessage() {
        // GIVEN - 
        // WHEN - An instance of InternalServerError is created without a message
        InternalServerError exception = new InternalServerError();
        // THEN - The exception message should be null
        assertNull(exception.getMessage());
    }

    @Test
    void testConstructor_WithMessage() {
        // GIVEN - A message string
        String message = "Test Error Message";
        // WHEN - An instance of InternalServerError is created with the message
        InternalServerError exception = new InternalServerError(message);
        // THEN - The exception message should be equal to the provided message
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testConstructor_WithCause() {
        // GIVEN - A RuntimeException as a cause
        Throwable cause = new RuntimeException("Test Cause");
        // WHEN - An instance of InternalServerError is created with the cause
        InternalServerError exception = new InternalServerError(cause);
        // THEN - The exception's cause should be equal to the provided RuntimeException
        assertSame(cause, exception.getCause());
    }

    @Test
    void testConstructor_WithMessageAndCause() {
        // GIVEN - A message string and a RuntimeException as a cause
        String message = "Test Error Message";
        Throwable cause = new RuntimeException("Test Cause");
        // WHEN - An instance of InternalServerError is created with the message and cause
        InternalServerError exception = new InternalServerError(message, cause);
        // THEN - The exception message should be equal to the provided message and the cause should be equal to the provided RuntimeException
        assertEquals(message, exception.getMessage());
        assertSame(cause, exception.getCause());
    }
}
