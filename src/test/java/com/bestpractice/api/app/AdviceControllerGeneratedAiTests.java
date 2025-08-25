package com.bestpractice.api.app;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.bestpractice.api.common.exception.BadRequest;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.common.exception.Forbidden;
import com.bestpractice.api.common.exception.NotFound;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.model.ErrorResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit5.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AdviceControllerGeneratedAiTests {

    private AdviceController controller;

    @BeforeEach
    void setUp() {
        controller = new AdviceController();
    }

    @Test
    void badRequest() {
        // GIVEN a BadRequest exception
        // WHEN the method is called
        // THEN the ErrorResponse should be created with status 400, error "Bad request", and message "Bad request parameter"
        ErrorResponse res = controller.badRequest();
        assertEquals(400, res.getStatus());
        assertEquals("Bad request", res.getError());
        assertEquals("Bad request parameter", res.getMessage());
    }

    @Test
    void unAuthorized() {
        // GIVEN a UnAuthorized exception
        // WHEN the method is called
        // THEN the ErrorResponse should be created with status 401, error "Unauthorized", and message "Incorrect authentication info"
        ErrorResponse res = controller.unAuthorized();
        assertEquals(401, res.getStatus());
        assertEquals("Unauthorized", res.getError());
        assertEquals("Incorrect authentication info", res.getMessage());
    }

    @Test
    void forbidden() {
        // GIVEN a Forbidden exception
        // WHEN the method is called
        // THEN the ErrorResponse should be created with status 403, error "Forbidden", and message "Not allowed"
        ErrorResponse res = controller.forbidden();
        assertEquals(403, res.getStatus());
        assertEquals("Forbidden", res.getError());
        assertEquals("Not allowed", res.getMessage());
    }

    @Test
    void notFound01() {
        // GIVEN a NoHandlerFoundException
        // WHEN the method is called
        // THEN the shareNotFound method should be called and the returned ErrorResponse should be checked
        ErrorResponse res = controller.notFound01();
        assertEquals(404, res.getStatus());
        assertEquals("Not found", res.getError());
        assertEquals("Not found path", res.getMessage());
    }

    @Test
    void notFound02() {
        // GIVEN a NotFound exception
        // WHEN the method is called
        // THEN the shareNotFound method should be called and the returned ErrorResponse should be checked
        ErrorResponse res = controller.notFound02();
        assertEquals(404, res.getStatus());
        assertEquals("Not found", res.getError());
        assertEquals("Not found path", res.getMessage());
    }

    @Test
    void conflict() {
        // GIVEN a Conflict exception
        // WHEN the method is called
        // THEN the ErrorResponse should be created with status 409, error "Conflict", and message "Already exist data"
        ErrorResponse res = controller.conflict();
        assertEquals(409, res.getStatus());
        assertEquals("Conflict", res.getError());
        assertEquals("Already exist data", res.getMessage());
    }

    @Test
    void serverError() {
        // GIVEN an Exception
        // WHEN the method is called
        // THEN the ErrorResponse should be created with status 500, error "Internal server error", and message "Internal server error"
        ErrorResponse res = controller.serverError(new Exception());
        assertEquals(500, res.getStatus());
        assertEquals("Internal server error", res.getError());
        assertEquals("Internal server error", res.getMessage());
    }
}