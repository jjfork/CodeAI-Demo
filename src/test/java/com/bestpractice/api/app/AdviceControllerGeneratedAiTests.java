package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}
