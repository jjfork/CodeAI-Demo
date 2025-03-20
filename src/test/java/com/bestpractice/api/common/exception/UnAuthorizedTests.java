package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnAuthorizedTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor() {
        UnAuthorized unauthorized = new UnAuthorized();
        assertNotNull(unauthorized);
    }

    @Test
    void testConstructorWithMessage() {
        String message = "Unauthorized access";
        UnAuthorized unauthorized = new UnAuthorized(message);
        assertEquals(message, unauthorized.getMessage());
    }

    @Test
    void testConstructorWithCause() {
        Throwable cause = new RuntimeException();
        UnAuthorized unauthorized = new UnAuthorized(cause);
        assertSame(cause, unauthorized.getCause());
    }

    @Test
    void testConstructorWithMessageAndCause() {
        String message = "Unauthorized access";
        Throwable cause = new RuntimeException();
        UnAuthorized unauthorized = new UnAuthorized(message, cause);
        assertEquals(message, unauthorized.getMessage());
        assertSame(cause, unauthorized.getCause());
    }
}
