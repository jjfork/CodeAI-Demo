package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import com.bestpractice.api.domain.model.ErrorResponse; 

class AdviceControllerGeneratedAiTests {

    @InjectMocks
    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testBadRequest() {
        // GIVEN - 
        // WHEN -  adviceController.badRequest() is called
        ErrorResponse response = adviceController.badRequest();
        // THEN - assert that the status code is 400
        assertEquals(400, response.getStatus());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - 
        // WHEN -  adviceController.unAuthorized() is called
        ErrorResponse response = adviceController.unAuthorized();
        // THEN - assert that the status code is 401
        assertEquals(401, response.getStatus());
    }

    @Test
    void testForbidden() {
        // GIVEN - 
        // WHEN -  adviceController.forbidden() is called
        ErrorResponse response = adviceController.forbidden();
        // THEN - assert that the status code is 403
        assertEquals(403, response.getStatus());
    }

    @Test
    void testNotFound01() {
        // GIVEN - 
        // WHEN -  adviceController.notFound01() is called
        ErrorResponse response = adviceController.notFound01();
        // THEN - assert that the status code is 404
        assertEquals(404, response.getStatus());
    }

    @Test
    void testNotFound02() {
        // GIVEN - 
        // WHEN -  adviceController.notFound02() is called
        ErrorResponse response = adviceController.notFound02();
        // THEN - assert that the status code is 404
        assertEquals(404, response.getStatus());
    }

    @Test
    void testConflict() {
        // GIVEN - 
        // WHEN -  adviceController.conflict() is called
        ErrorResponse response = adviceController.conflict();
        // THEN - assert that the status code is 409
        assertEquals(409, response.getStatus());
    }

    @Test
    void testServerError() {
        // GIVEN - 
        // WHEN -  adviceController.serverError(new Exception()) is called
        ErrorResponse response = adviceController.serverError(new Exception());
        // THEN - assert that the status code is 500
        assertEquals(500, response.getStatus());
    }

}