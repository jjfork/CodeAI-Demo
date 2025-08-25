package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceUnavailableGeneratedAiTests {

    @BeforeEach
    void setUpBeforeEach() {
        // Reset state before each test
    }

    @Test
    void testConstructorWithoutArguments() {
        // GIVEN: No arguments are passed to the constructor.
        // WHEN: The constructor is called.
        // THEN: A ServiceUnavailable object is created with no message.
        ServiceUnavailable serviceUnavailable = new ServiceUnavailable();
        assertEquals(null, serviceUnavailable.getMessage());
    }

    @Test
    void testConstructorWithMessage() {
        // GIVEN: A message is passed to the constructor.
        // WHEN: The constructor is called with a message.
        // THEN: A ServiceUnavailable object is created with the given message.
        String message = "Service is temporarily unavailable";
        ServiceUnavailable serviceUnavailable = new ServiceUnavailable(message);
        assertEquals(message, serviceUnavailable.getMessage());
    }

    @Test
    void testConstructorWithThrowable() {
        // GIVEN: A throwable is passed to the constructor.
        // WHEN: The constructor is called with a throwable.
        Throwable cause = new NullPointerException("Something went wrong");
        ServiceUnavailable serviceUnavailable = new ServiceUnavailable(cause);
        assertEquals(cause, serviceUnavailable.getCause());
    }

    @Test
    void testConstructorWithMessageAndThrowable() {
        // GIVEN: A message and a throwable are passed to the constructor.
        String msg = "Service unavailable";
        Throwable cause = new IllegalArgumentException("Invalid input");
        ServiceUnavailable serviceUnavailable = new ServiceUnavailable(msg, cause);
        assertEquals(msg, serviceUnavailable.getMessage());
        assertEquals(cause, serviceUnavailable.getCause());
    }
}
