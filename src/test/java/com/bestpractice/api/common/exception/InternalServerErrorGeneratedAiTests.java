package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InternalServerErrorGeneratedAiTests {

    @Test
    void constructor_noArgs() {
        // GIVEN: No arguments are passed to the constructor
        // WHEN: The InternalServerError constructor is called without arguments
        // THEN: A new InternalServerError object is created with no message
        InternalServerError exception = new InternalServerError();
        assertNotNull(exception);
    }

    @Test
    void constructor_withMsg() {
        // GIVEN: A message is passed to the constructor
        // WHEN: The InternalServerError constructor is called with a message
        // THEN: A new InternalServerError object is created with the given message
        InternalServerError exception = new InternalServerError("Something went wrong");
        assertNotNull(exception);
        assertEquals("Something went wrong", exception.getMessage());
    }

    @Test
    void constructor_withCause() {
        // GIVEN: A throwable cause is passed to the constructor
        // WHEN: The InternalServerError constructor is called with a cause
        // THEN: A new InternalServerError object is created with the given message and cause
        Throwable cause = new NullPointerException("NullPointerException occurred");
        InternalServerError exception = new InternalServerError(cause);
        assertNotNull(exception);
        assertEquals("NullPointerException occurred", exception.getMessage());
        assertSame(cause, exception.getCause());
    }

    @Test
    void constructor_withMsgAndCause() {
        // GIVEN: A message and a cause are passed to the constructor
        // WHEN: The InternalServerError constructor is called with a message and a cause
        // THEN: A new InternalServerError object is created with the given message and cause
        Throwable cause = new NullPointerException("NullPointerException occurred");
        InternalServerError exception = new InternalServerError("Something went wrong", cause);
        assertNotNull(exception);
        assertEquals("Something went wrong", exception.getMessage());
        assertSame(cause, exception.getCause());
    }
}
