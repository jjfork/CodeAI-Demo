package com.bestpractice.api.common.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForbiddenTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testForbidden() {
        // GIVEN - No arguments provided
        Forbidden exception = new Forbidden();
        // WHEN - Exception is created
        // THEN - Default message should be null
        assertNull(exception.getMessage());
    }

    @Test
    void testForbiddenWithMessage() {
        // GIVEN - Message provided
        String message = "Access forbidden";
        Forbidden exception = new Forbidden(message);
        // WHEN - Exception is created
        // THEN - Provided message should be present
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testForbiddenWithCause() {
        // GIVEN - Throwable cause provided
        Throwable cause = new RuntimeException("Internal error");
        Forbidden exception = new Forbidden(cause);
        // WHEN - Exception is created
        // THEN - Cause should be present
        assertSame(cause, exception.getCause());
    }

    @Test
    void testForbiddenWithMessageAndCause() {
        // GIVEN - Message and Throwable cause provided
        String message = "Access forbidden";
        Throwable cause = new RuntimeException("Internal error");
        Forbidden exception = new Forbidden(message, cause);
        // WHEN - Exception is created
        // THEN - Both message and cause should be present
        assertEquals(message, exception.getMessage());
        assertSame(cause, exception.getCause());
    }
}
