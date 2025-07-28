package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceUnavailableGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testServiceUnavailable_NoArguments() {
        // GIVEN - Initialize a ServiceUnavailable object without any arguments
        ServiceUnavailable exception = new ServiceUnavailable();
        // THEN - Assert that the exception message is null
        assertNull(exception.getMessage());
    }

    @Test
    void testServiceUnavailable_WithMessage() {
        // GIVEN - Initialize a ServiceUnavailable object with a message
        String message = "Service unavailable";
        ServiceUnavailable exception = new ServiceUnavailable(message);
        // THEN - Assert that the exception message is equal to the provided message
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testServiceUnavailable_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(cause);
        // THEN - Assert that the exception's cause is equal to the provided RuntimeException
        assertSame(cause, exception.getCause());
    }

    @Test
    void testServiceUnavailable_WithMessageAndCause() {
        // GIVEN - Initialize a RuntimeException as the cause and a message
        String message = "Service unavailable";
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(message, cause);
        // THEN - Assert that the exception message is equal to the provided message and the cause is equal to the provided RuntimeException
        assertEquals(message, exception.getMessage());
        assertSame(cause, exception.getCause());
    }
}
