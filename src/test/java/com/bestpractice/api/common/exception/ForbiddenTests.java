package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ForbiddenTests {

    @Test
    void testForbidden() {
        Forbidden forbidden = new Forbidden();
        assertNotNull(forbidden);
    }

    @Test
    void testForbiddenString() {
        String message = "Test Message";
        Forbidden forbidden = new Forbidden(message);
        assertEquals(message, forbidden.getMessage());
    }

    @Test
    void testForbiddenThrowable() {
        Throwable cause = new RuntimeException();
        Forbidden forbidden = new Forbidden(cause);
        assertSame(cause, forbidden.getCause());
    }

    @Test
    void testForbiddenStringThrowable() {
        String message = "Test Message";
        Throwable cause = new RuntimeException();
        Forbidden forbidden = new Forbidden(message, cause);
        assertEquals(message, forbidden.getMessage());
        assertSame(cause, forbidden.getCause());
    }
} 
