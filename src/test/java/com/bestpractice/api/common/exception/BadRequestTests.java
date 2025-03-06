package com.bestpractice.api.common.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BadRequestTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - 
        // WHEN -  
        BadRequest badRequest = new BadRequest();
        // THEN - assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequestString() {
        // GIVEN - String msg = "Bad Request";
        // WHEN - BadRequest badRequest = new BadRequest(msg);
        // THEN - assertEquals("Bad Request", badRequest.getMessage());
    }

    @Test
    void testBadRequestThrowable() {
        // GIVEN - Throwable cause = new RuntimeException();
        // WHEN - BadRequest badRequest = new BadRequest(cause);
        // THEN - assertNotNull(badRequest.getCause());
    }

    @Test
    void testBadRequestStringThrowable() {
        // GIVEN - String msg = "Bad Request";
        //         Throwable cause = new RuntimeException();
        // WHEN - BadRequest badRequest = new BadRequest(msg, cause);
        // THEN - assertEquals("Bad Request", badRequest.getMessage());
        //         assertNotNull(badRequest.getCause());
    }
}
