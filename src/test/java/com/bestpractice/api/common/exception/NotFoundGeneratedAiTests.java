package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class NotFoundGeneratedAiTests {

    @BeforeEach
    void setUp() {
        // Reset or initialize any shared state before each test
    }

    @Test
    void testDefaultConstructor() {
        // GIVEN: no parameters
        // WHEN: creating the exception using the default constructor
        NotFound exception = new NotFound();

        // THEN: the message and cause should be null
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    void testConstructorWithMessage() {
        // GIVEN: a message string
        String message = "Resource not found";

        // WHEN: creating the exception with a message
        NotFound exception = new NotFound(message);

        // THEN: the message should match and cause should be null
        assertEquals(message, exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    void testConstructorWithCause() {
        // GIVEN: a cause throwable
        Throwable cause = new IllegalArgumentException("Invalid argument");

        // WHEN: creating the exception with a cause
        NotFound exception = new NotFound(cause);

        // THEN: the cause should match and message should contain cause details
        assertEquals(cause, exception.getCause());
        assertTrue(exception.getMessage().contains("Invalid argument"));
    }

    @Test
    void testConstructorWithMessageAndCause() {
        // GIVEN: a message and a cause
        String message = "Resource missing";
        Throwable cause = new NullPointerException("Null value");

        // WHEN: creating the exception with both message and cause
        NotFound exception = new NotFound(message, cause);

        // THEN: both message and cause should match
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void testThrowingNotFoundExceptionWithMessage() {
        // GIVEN: a message string
        String message = "Resource not found";

        // WHEN & THEN: assertThrows should catch the NotFound exception
        NotFound thrown = assertThrows(NotFound.class, () -> {
            throw new NotFound(message);
        });

        // THEN: the message should match
        assertEquals(message, thrown.getMessage());
    }

    @Test
    void testThrowingNotFoundExceptionWithCause() {
        // GIVEN: a cause throwable
        Throwable cause = new IllegalArgumentException("Invalid argument");

        // WHEN & THEN: assertThrows should catch the NotFound exception
        NotFound thrown = assertThrows(NotFound.class, () -> {
            throw new NotFound(cause);
        });

        // THEN: the cause should match and message should contain cause details
        assertEquals(cause, thrown.getCause());
        assertTrue(thrown.getMessage().contains("Invalid argument"));
    }

    @Test
    void testThrowingNotFoundExceptionWithMessageAndCause() {
        // GIVEN: a message and a cause
        String message = "Resource missing";
        Throwable cause = new NullPointerException("Null value");

        // WHEN & THEN: assertThrows should catch the NotFound exception
        NotFound thrown = assertThrows(NotFound.class, () -> {
            throw new NotFound(message, cause);
        });

        // THEN: both message and cause should match
        assertEquals(message, thrown.getMessage());
        assertEquals(cause, thrown.getCause());
    }
}
