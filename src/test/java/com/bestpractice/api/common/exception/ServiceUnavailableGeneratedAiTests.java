package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ServiceUnavailableGeneratedAiTests {

    @BeforeEach
    void setUp() {
        // Reset or initialize any shared state before each test
    }

    @Test
    void testDefaultConstructor() {
        // GIVEN: a default constructor call
        // WHEN: creating a new instance using the default constructor
        ServiceUnavailable exception = new ServiceUnavailable();
        // THEN: the message and cause should be null
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    void testConstructorWithMessage() {
        // GIVEN: a specific message
        String message = "Service is unavailable";
        // WHEN: creating a new instance with the message
        ServiceUnavailable exception = new ServiceUnavailable(message);
        // THEN: the message should match and cause should be null
        assertEquals(message, exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    void testConstructorWithCause() {
        // GIVEN: a specific cause
        Throwable cause = new RuntimeException("Underlying cause");
        // WHEN: creating a new instance with the cause
        ServiceUnavailable exception = new ServiceUnavailable(cause);
        // THEN: the cause should match and message should be cause.toString()
        assertEquals(cause, exception.getCause());
        assertThat(exception.getMessage()).contains("Underlying cause");
    }

    @Test
    void testConstructorWithMessageAndCause() {
        // GIVEN: a specific message and cause
        String message = "Service failed";
        Throwable cause = new RuntimeException("Root cause");
        // WHEN: creating a new instance with both message and cause
        ServiceUnavailable exception = new ServiceUnavailable(message, cause);
        // THEN: both message and cause should match
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void testThrowingServiceUnavailableDefaultConstructor() {
        // GIVEN: no message or cause
        // WHEN & THEN: assertThrows should catch the exception
        ServiceUnavailable thrown = assertThrows(ServiceUnavailable.class, () -> {
            throw new ServiceUnavailable();
        });
        // THEN: message and cause should be null
        assertNull(thrown.getMessage());
        assertNull(thrown.getCause());
    }

    @Test
    void testThrowingServiceUnavailableWithMessage() {
        // GIVEN: a specific message
        String message = "Service down";
        // WHEN & THEN: assertThrows should catch the exception
        ServiceUnavailable thrown = assertThrows(ServiceUnavailable.class, () -> {
            throw new ServiceUnavailable(message);
        });
        // THEN: the message should match
        assertEquals(message, thrown.getMessage());
    }

    @Test
    void testThrowingServiceUnavailableWithCause() {
        // GIVEN: a specific cause
        Throwable cause = new RuntimeException("Network error");
        // WHEN & THEN: assertThrows should catch the exception
        ServiceUnavailable thrown = assertThrows(ServiceUnavailable.class, () -> {
            throw new ServiceUnavailable(cause);
        });
        // THEN: the cause should match
        assertEquals(cause, thrown.getCause());
    }

    @Test
    void testThrowingServiceUnavailableWithMessageAndCause() {
        // GIVEN: a specific message and cause
        String message = "Database down";
        Throwable cause = new RuntimeException("Timeout");
        // WHEN & THEN: assertThrows should catch the exception
        ServiceUnavailable thrown = assertThrows(ServiceUnavailable.class, () -> {
            throw new ServiceUnavailable(message, cause);
        });
        // THEN: both message and cause should match
        assertEquals(message, thrown.getMessage());
        assertEquals(cause, thrown.getCause());
    }
}
