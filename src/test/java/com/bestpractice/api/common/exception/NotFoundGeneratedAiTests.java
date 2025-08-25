package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

    private NotFound exception;

    @Test
    void testConstructorWithoutArguments() {
        // GIVEN: No arguments are passed to the constructor.
        // WHEN: The constructor is called.
        // THEN: A NotFound exception is created with no message.
        assertNotNull(exception);
        assertEquals(RuntimeException.class, exception.getClass());
    }

    @Test
    void testConstructorWithMessage() {
        // GIVEN: A message is passed to the constructor.
        // WHEN: The constructor is called with a message.
        // THEN: A NotFound exception is created with the provided message.
        String message = "Resource not found";
        exception = new NotFound(message);
        assertEquals(message, exception.getMessage());
        assertEquals(RuntimeException.class, exception.getClass());
    }

    @Test
    void testConstructorWithThrowable() {
        // GIVEN: A Throwable object is passed to the constructor.
        // WHEN: The constructor is called with a Throwable object.
        Throwable cause = new NullPointerException("Simulated cause");
        exception = new NotFound(cause);
        assertEquals(cause, exception.getCause());
        assertEquals(RuntimeException.class, exception.getClass());
    }

    @Test
    void testConstructorWithMessageAndThrowable() {
        // GIVEN: A message and a Throwable object are passed to the constructor.
        // WHEN: The constructor is called with a message and a Throwable object.
        String message = "Error occurred";
        Throwable cause = new NullPointerException("Simulated cause");
        exception = new NotFound(message, cause);
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
        assertEquals(RuntimeException.class, exception.getClass());
    }
}
