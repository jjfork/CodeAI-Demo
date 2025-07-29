package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnAuthorizedGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor_NoArgs() {
        // GIVEN 

        // WHEN
        UnAuthorized unauthorized = new UnAuthorized(); 

        // THEN
        assertNotNull(unauthorized);
    }

    @Test
    void testConstructor_WithMessage() {
        // GIVEN
        String message = "Unauthorized access";

        // WHEN
        UnAuthorized unauthorized = new UnAuthorized(message);

        // THEN
        assertEquals(message, unauthorized.getMessage());
    }

    @Test
    void testConstructor_WithCause() {
        // GIVEN
        Throwable cause = new RuntimeException();

        // WHEN
        UnAuthorized unauthorized = new UnAuthorized(cause);

        // THEN
        assertSame(cause, unauthorized.getCause());
    }

    @Test
    void testConstructor_WithMessageAndCause() {
        // GIVEN
        String message = "Unauthorized access";
        Throwable cause = new RuntimeException();

        // WHEN
        UnAuthorized unauthorized = new UnAuthorized(message, cause);

        // THEN
        assertEquals(message, unauthorized.getMessage());
        assertSame(cause, unauthorized.getCause());
    }
}
