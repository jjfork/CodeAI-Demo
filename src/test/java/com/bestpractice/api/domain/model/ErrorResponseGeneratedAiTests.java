package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

@org.junit.jupiter.api.ExtensionRegistry.ExtensionContextRegister
public class ErrorResponseGeneratedAiTests {

    private ErrorResponse errorResponse;

    @BeforeEach
    void setUp() {
        errorResponse = new ErrorResponse();
    }

    @Test
    void testGetSetStatus() {
        // GIVEN: A new ErrorResponse object
        // WHEN: The status is set to 400
        errorResponse.setStatus(400);
        // THEN: The status is correctly set to 400
        assertEquals(400, errorResponse.getStatus());
    }

    @Test
    void testGetSetError() {
        // GIVEN: A new ErrorResponse object
        // WHEN: The error is set to "Invalid Input"
        errorResponse.setError("Invalid Input");
        // THEN: The error is correctly set to "Invalid Input"
        assertEquals("Invalid Input", errorResponse.getError());
    }

    @Test
    void testGet setMessage() {
        // GIVEN: A new ErrorResponse object
        // WHEN: The message is set to "Something went wrong"
        errorResponse.setMessage("Something went wrong");
        // THEN: The message is correctly set to "Something went wrong"
        assertEquals("Something went wrong", errorResponse.getMessage());
    }
}
