package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.Test
public class BadRequestGeneratedAiTests {

    private BadRequest badRequest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        badRequest = new BadRequest();
    }

    @org.junit.jupiter.api.Test
    void constructor_noArgs() {
        // GIVEN: A new instance of BadRequest is created without arguments.
        // WHEN: The constructor is called.
        // THEN: The instance is created without a message.
        assertNotNull(badRequest);
    }

    @org.junit.jupiter.api.Test
    void constructor_withMsg() {
        // GIVEN: A new instance of BadRequest is created with a message.
        // WHEN: The constructor is called with a message.
        // THEN: The instance is created with the provided message.
        String msg = "Invalid request";
        BadRequest badRequest = new BadRequest(msg);
        assertEquals(msg, badRequest.getMessage());
    }

    @org.junit.jupiter.api.Test
    void constructor_withCause() {
        // GIVEN: A new instance of BadRequest is created with a Throwable cause.
        // WHEN: The constructor is called with a cause.
        Throwable cause = new Throwable();
        BadRequest badRequest = new BadRequest(cause);
        assertEquals(cause, badRequest.getCause());
    }

    @org.junit.jupiter.api.Test
    void constructor_withMsgAndCause() {
        // GIVEN: A new instance of BadRequest is created with a message and a cause.
        // WHEN: The constructor is called with a message and a cause.
        Throwable cause = new Throwable();
        BadRequest badRequest = new BadRequest(cause, "Detailed error message");
        assertEquals(cause, badRequest.getCause());
        assertEquals("Detailed error message", badRequest.getMessage());
    }
}
