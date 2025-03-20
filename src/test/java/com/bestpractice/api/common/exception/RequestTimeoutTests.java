package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestTimeoutTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testRequestTimeout_NoMessage() {
        // GIVEN - A new instance of RequestTimeout is created without a message.
        RequestTimeout exception = new RequestTimeout();
        // THEN - The exception message should be null.
        assertNull(exception.getMessage());
    }

    @Test
    void testRequestTimeout_WithMessage() {
        // GIVEN - A message string is defined.
        String message = "Request timed out";
        // WHEN - A new instance of RequestTimeout is created with the message.
        RequestTimeout exception = new RequestTimeout(message);
        // THEN - The exception message should be equal to the provided message.
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testRequestTimeout_WithCause() {
        // GIVEN - A RuntimeException is created as a cause.
        RuntimeException cause = new RuntimeException("Underlying error");
        // WHEN - A new instance of RequestTimeout is created with the cause.
        RequestTimeout exception = new RequestTimeout(cause);
        // THEN - The exception's cause should be equal to the provided RuntimeException.
        assertSame(cause, exception.getCause());
    }

    @Test
    void testRequestTimeout_WithMessageAndCause() {
        // GIVEN - A message string and a RuntimeException are defined as cause.
        String message = "Request timed out";
        RuntimeException cause = new RuntimeException("Underlying error");
        // WHEN - A new instance of RequestTimeout is created with the message and cause.
        RequestTimeout exception = new RequestTimeout(message, cause);
        // THEN - The exception message should be equal to the provided message.
        assertEquals(message, exception.getMessage());
        // AND - The exception's cause should be equal to the provided RuntimeException.
        assertSame(cause, exception.getCause());
    }
}
