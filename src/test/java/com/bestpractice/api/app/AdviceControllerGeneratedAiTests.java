package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.common.exception.BadRequest;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.common.exception.Forbidden;
import com.bestpractice.api.common.exception.NotFound;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.model.ErrorResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.servlet.NoHandlerFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN: A BadRequest exception scenario
        // WHEN: Calling badRequest handler
        ErrorResponse response = adviceController.badRequest();
        // THEN: Verify the response content
        assertEquals(400, response.getStatus());
        assertEquals("Bad request", response.getError());
        assertEquals("Bad request parameter", response.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN: An UnAuthorized exception scenario
        // WHEN: Calling unAuthorized handler
        ErrorResponse response = adviceController.unAuthorized();
        // THEN: Verify the response content
        assertEquals(401, response.getStatus());
        assertEquals("Unauthorized", response.getError());
        assertEquals("Incorrect authentication info", response.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN: A Forbidden exception scenario
        // WHEN: Calling forbidden handler
        ErrorResponse response = adviceController.forbidden();
        // THEN: Verify the response content
        assertEquals(403, response.getStatus());
        assertEquals("Forbidden", response.getError());
        assertEquals("Not allowed", response.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN: A NoHandlerFoundException scenario
        // WHEN: Calling notFound01 handler
        ErrorResponse response = adviceController.notFound01();
        // THEN: Verify the response content
        assertEquals(404, response.getStatus());
        assertEquals("Not found", response.getError());
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN: A NotFound exception scenario
        // WHEN: Calling notFound02 handler
        ErrorResponse response = adviceController.notFound02();
        // THEN: Verify the response content
        assertEquals(404, response.getStatus());
        assertEquals("Not found", response.getError());
        assertEquals("Not found path", response.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN: A Conflict exception scenario
        // WHEN: Calling conflict handler
        ErrorResponse response = adviceController.conflict();
        // THEN: Verify the response content
        assertEquals(409, response.getStatus());
        assertEquals("Conflict", response.getError());
        assertEquals("Already exist data", response.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN: A generic Exception scenario
        Exception ex = new Exception("Test exception");
        // WHEN: Calling serverError handler
        ErrorResponse response = adviceController.serverError(ex);
        // THEN: Verify the response content
        assertEquals(500, response.getStatus());
        assertEquals("Internal server error", response.getError());
        assertEquals("Internal server error", response.getMessage());
    }

    @Test
    void testServerErrorThrowsWhenExceptionIsNull() {
        // GIVEN: Null passed to serverError
        // WHEN & THEN: Verify NullPointerException is thrown
        assertThrows(NullPointerException.class, () -> adviceController.serverError(null));
    }

    @Test
    void testBadRequestHandlerDoesNotThrow() {
        // GIVEN WHEN THEN: Ensure badRequest handler does not throw
        assertEquals(400, adviceController.badRequest().getStatus());
    }

    @Test
    void testUnAuthorizedHandlerDoesNotThrow() {
        // GIVEN WHEN THEN: Ensure unAuthorized handler does not throw
        assertEquals(401, adviceController.unAuthorized().getStatus());
    }

    @Test
    void testForbiddenHandlerDoesNotThrow() {
        // GIVEN WHEN THEN: Ensure forbidden handler does not throw
        assertEquals(403, adviceController.forbidden().getStatus());
    }

    @Test
    void testNotFound01HandlerDoesNotThrow() {
        // GIVEN WHEN THEN: Ensure notFound01 handler does not throw
        assertEquals(404, adviceController.notFound01().getStatus());
    }

    @Test
    void testNotFound02HandlerDoesNotThrow() {
        // GIVEN WHEN THEN: Ensure notFound02 handler does not throw
        assertEquals(404, adviceController.notFound02().getStatus());
    }

    @Test
    void testConflictHandlerDoesNotThrow() {
        // GIVEN WHEN THEN: Ensure conflict handler does not throw
        assertEquals(409, adviceController.conflict().getStatus());
    }
}
