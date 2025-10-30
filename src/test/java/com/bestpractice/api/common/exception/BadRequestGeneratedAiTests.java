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

public class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
        // Reset or initialize any shared state before each test
    }

    @Test
    void testDefaultConstructor() {
        // GIVEN: no input parameters

        // WHEN: creating BadRequest using default constructor
        BadRequest badRequest = new BadRequest();

        // THEN: the message and cause should be null
        assertNull(badRequest.getMessage());
        assertNull(badRequest.getCause());
    }

    @Test
    void testConstructorWithMessage() {
        // GIVEN: a message string
        String message = "Invalid request";

        // WHEN: creating BadRequest with a message
        BadRequest badRequest = new BadRequest(message);

        // THEN: the message should match and cause should be null
        assertEquals(message, badRequest.getMessage());
        assertNull(badRequest.getCause());
    }

    @Test
    void testConstructorWithCause() {
        // GIVEN: a throwable cause
        Throwable cause = new IllegalArgumentException("Cause");

        // WHEN: creating BadRequest with a cause
        BadRequest badRequest = new BadRequest(cause);

        // THEN: the cause should match and message should be cause.toString()
        assertEquals(cause, badRequest.getCause());
        assertTrue(badRequest.getMessage().contains("Cause"));
    }

    @Test
    void testConstructorWithMessageAndCause() {
        // GIVEN: a message and a throwable cause
        String message = "Invalid request with cause";
        Throwable cause = new IllegalArgumentException("Cause");

        // WHEN: creating BadRequest with both message and cause
        BadRequest badRequest = new BadRequest(message, cause);

        // THEN: both message and cause should match
        assertEquals(message, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testThrowingBadRequestWithMessage() {
        // GIVEN: a message string
        String message = "Bad request occurred";

        // WHEN & THEN: throwing BadRequest should be caught by assertThrows
        BadRequest thrown = assertThrows(BadRequest.class, () -> {
            throw new BadRequest(message);
        });

        // THEN: verify the message and cause
        assertEquals(message, thrown.getMessage());
        assertNull(thrown.getCause());
    }

    @Test
    void testThrowingBadRequestWithCause() {
        // GIVEN: a throwable cause
        Throwable cause = new IllegalArgumentException("Invalid argument");

        // WHEN & THEN: throwing BadRequest should be caught by assertThrows
        BadRequest thrown = assertThrows(BadRequest.class, () -> {
            throw new BadRequest(cause);
        });

        // THEN: verify the cause and message
        assertEquals(cause, thrown.getCause());
        assertTrue(thrown.getMessage().contains("Invalid argument"));
    }

    @Test
    void testThrowingBadRequestWithMessageAndCause() {
        // GIVEN: a message and a throwable cause
        String message = "Bad request with cause";
        Throwable cause = new IllegalArgumentException("Invalid argument");

        // WHEN & THEN: throwing BadRequest should be caught by assertThrows
        BadRequest thrown = assertThrows(BadRequest.class, () -> {
            throw new BadRequest(message, cause);
        });

        // THEN: verify both message and cause
        assertEquals(message, thrown.getMessage());
        assertEquals(cause, thrown.getCause());
    }
}
