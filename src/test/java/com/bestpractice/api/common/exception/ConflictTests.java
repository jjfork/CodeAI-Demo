package com.bestpractice.api.common.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConflictTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testConflict() {
        // GIVEN - A new Conflict object is created.
        Conflict conflict = new Conflict();
        // WHEN - The message of the Conflict object is accessed.
        String message = conflict.getMessage();
        // THEN - The message should be null.
        assertNull(message);
    }

    @Test
    void testConflictWithMessage() {
        // GIVEN - A new Conflict object is created with a message.
        String message = "This is a conflict.";
        Conflict conflict = new Conflict(message);
        // WHEN - The message of the Conflict object is accessed.
        String actualMessage = conflict.getMessage();
        // THEN - The message should be equal to the provided message.
        assertEquals(message, actualMessage);
    }

    @Test
    void testConflictWithCause() {
        // GIVEN - A new RuntimeException is created as the cause.
        RuntimeException cause = new RuntimeException("This is a cause.");
        // WHEN - A new Conflict object is created with the cause.
        Conflict conflict = new Conflict(cause);
        // THEN - The cause of the Conflict object should be equal to the provided cause.
        assertSame(cause, conflict.getCause());
    }

    @Test
    void testConflictWithMessageAndCause() {
        // GIVEN - A message and a RuntimeException are created.
        String message = "This is a conflict.";
        RuntimeException cause = new RuntimeException("This is a cause.");
        // WHEN - A new Conflict object is created with the message and cause.
        Conflict conflict = new Conflict(message, cause);
        // THEN - The message and cause of the Conflict object should be equal to the provided values.
        assertEquals(message, conflict.getMessage());
        assertSame(cause, conflict.getCause());
    }
}
