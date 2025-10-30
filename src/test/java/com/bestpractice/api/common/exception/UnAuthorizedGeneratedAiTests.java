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

public class UnAuthorizedGeneratedAiTests {

    @BeforeEach
    void setUp() {
        // Reset or initialize any shared state before each test
    }

    @Test
    void testDefaultConstructor() {
        // GIVEN: no parameters
        // WHEN: creating the exception using the default constructor
        UnAuthorized exception = new UnAuthorized();

        // THEN: the message and cause should be null
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    void testConstructorWithMessage() {
        // GIVEN: a message string
        String message = "Unauthorized access";

        // WHEN: creating the exception with a message
        UnAuthorized exception = new UnAuthorized(message);

        // THEN: the message should match and cause should be null
        assertEquals(message, exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    void testConstructorWithCause() {
        // GIVEN: a cause throwable
        Throwable cause = new RuntimeException("Root cause");

        // WHEN: creating the exception with a cause
        UnAuthorized exception = new UnAuthorized(cause);

        // THEN: the cause should match and message should contain cause details
        assertEquals(cause, exception.getCause());
        assertThat(exception.getMessage()).contains("Root cause");
    }

    @Test
    void testConstructorWithMessageAndCause() {
        // GIVEN: a message and a cause
        String message = "Unauthorized with cause";
        Throwable cause = new RuntimeException("Root cause");

        // WHEN: creating the exception with both message and cause
        UnAuthorized exception = new UnAuthorized(message, cause);

        // THEN: both message and cause should match
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void testThrowingExceptionDefaultConstructor() {
        // GIVEN: no parameters
        // WHEN & THEN: assert that throwing the exception results in UnAuthorized being thrown
        UnAuthorized thrown = assertThrows(UnAuthorized.class, () -> {
            throw new UnAuthorized();
        });

        // THEN: the thrown exception should have null message and cause
        assertNull(thrown.getMessage());
        assertNull(thrown.getCause());
    }

    @Test
    void testThrowingExceptionWithMessage() {
        // GIVEN: a message string
        String message = "Unauthorized access";

        // WHEN & THEN: assert that throwing the exception results in UnAuthorized being thrown
        UnAuthorized thrown = assertThrows(UnAuthorized.class, () -> {
            throw new UnAuthorized(message);
        });

        // THEN: the thrown exception should have the correct message and no cause
        assertEquals(message, thrown.getMessage());
        assertNull(thrown.getCause());
    }

    @Test
    void testThrowingExceptionWithCause() {
        // GIVEN: a cause throwable
        Throwable cause = new RuntimeException("Root cause");

        // WHEN & THEN: assert that throwing the exception results in UnAuthorized being thrown
        UnAuthorized thrown = assertThrows(UnAuthorized.class, () -> {
            throw new UnAuthorized(cause);
        });

        // THEN: the thrown exception should have the correct cause and message containing cause details
        assertEquals(cause, thrown.getCause());
        assertThat(thrown.getMessage()).contains("Root cause");
    }

    @Test
    void testThrowingExceptionWithMessageAndCause() {
        // GIVEN: a message and a cause
        String message = "Unauthorized with cause";
        Throwable cause = new RuntimeException("Root cause");

        // WHEN & THEN: assert that throwing the exception results in UnAuthorized being thrown
        UnAuthorized thrown = assertThrows(UnAuthorized.class, () -> {
            throw new UnAuthorized(message, cause);
        });

        // THEN: the thrown exception should have the correct message and cause
        assertEquals(message, thrown.getMessage());
        assertEquals(cause, thrown.getCause());
    }
}
