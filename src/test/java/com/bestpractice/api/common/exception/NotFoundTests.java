package com.bestpractice.api.common.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testNotFound() {
        // GIVEN - 
        // WHEN -  
        NotFound exception = new NotFound();
        // THEN - assertNotNull(exception);
    }

    @Test
    void testNotFoundString() {
        // GIVEN - String msg = "Resource not found";
        // WHEN - NotFound exception = new NotFound(msg);
        // THEN - assertEquals(msg, exception.getMessage());
    }

    @Test
    void testNotFoundThrowable() {
        // GIVEN - Throwable cause = new RuntimeException();
        // WHEN - NotFound exception = new NotFound(cause);
        // THEN - assertEquals(cause, exception.getCause());
    }

    @Test
    void testNotFoundStringThrowable() {
        // GIVEN - String msg = "Resource not found";
        //         Throwable cause = new RuntimeException();
        // WHEN - NotFound exception = new NotFound(msg, cause);
        // THEN - assertEquals(msg, exception.getMessage());
        //         assertEquals(cause, exception.getCause());
    }
}
