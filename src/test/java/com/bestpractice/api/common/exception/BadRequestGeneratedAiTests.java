package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}
