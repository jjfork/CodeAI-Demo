package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ForbiddenGeneratedAiTests {

    private Forbidden forbidden;

    void setUp() {
        forbidden = new Forbidden();
    }

    void constructor_no_args() {
        // GIVEN: A new Forbidden exception instance is created without arguments.
        // WHEN: The constructor is called.
        // THEN: The exception is initialized with no message and the cause is null.
        assertNull(forbidden.getMessage());
        assertNull(forbidden.getCause());
    }

    void constructor_with_message() {
        // GIVEN: A new Forbidden exception instance is created with a message.
        // WHEN: The constructor is called with a message.
        // THEN: The exception is initialized with the provided message and the cause is null.
        String message = "Access denied";
        forbidden = new Forbidden(message);
        assertEquals(message, forbidden.getMessage());
        assertNull(forbidden.getCause());
    }

    void constructor_with_message_and_cause() {
        // GIVEN: A new Forbidden exception instance is created with a message and a cause.
        // WHEN: The constructor is called with a message and a cause.
        String message = "Access denied";
        Throwable cause = new NullPointerException("Something went wrong");
        forbidden = new Forbidden(message, cause);
        assertEquals(message, forbidden.getMessage());
        assertEquals(cause, forbidden.getCause());
    }
}
