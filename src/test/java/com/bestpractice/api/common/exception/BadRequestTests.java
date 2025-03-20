package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - No arguments provided
        BadRequest exception = new BadRequest();
        // THEN - Exception message should be null
        assertNull(exception.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Message provided
        String message = "Invalid input";
        BadRequest exception = new BadRequest(message);
        // THEN - Exception message should match the provided message
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Throwable cause provided
        Throwable cause = new RuntimeException("Internal error");
        BadRequest exception = new BadRequest(cause);
        // THEN - Exception cause should match the provided cause
        assertSame(cause, exception.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Message and Throwable cause provided
        String message = "Invalid input";
        Throwable cause = new RuntimeException("Internal error");
        BadRequest exception = new BadRequest(message, cause);
        // THEN - Exception message should match the provided message
        assertEquals(message, exception.getMessage());
        // THEN - Exception cause should match the provided cause
        assertSame(cause, exception.getCause());
    }
}
