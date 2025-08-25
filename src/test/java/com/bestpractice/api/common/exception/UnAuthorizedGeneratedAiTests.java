package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.Test
public class UnAuthorizedGeneratedAiTests {

    private UnAuthorized unAuthorized;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        unAuthorized = new UnAuthorized();
    }

    @org.junit.jupiter.api.Test
    void constructor_noArgs() {
        // GIVEN: No arguments are passed to the constructor.
        // WHEN: The UnAuthorized constructor is called.
        // THEN: A new UnAuthorized object is created with no message or cause.
        assertNotNull(unAuthorized);
        assertEquals(RuntimeException.class, unAuthorized.getClass());
    }

    @org.junit.jupiter.api.Test
    void constructor_withMessage() {
        // GIVEN: A message is passed to the constructor.
        // WHEN: The UnAuthorized constructor is called with a message.
        // THEN: A new UnAuthorized object is created with the provided message and no cause.
        unAuthorized = new UnAuthorized("Unauthorized access denied");
        assertEquals("Unauthorized access denied", unAuthorized.getMessage());
        assertEquals(null, unAuthorized.getCause());
    }

    @org.junit.jupiter.api.Test
    void constructor_withMessageAndCause() {
        // GIVEN: A message and a cause are passed to the constructor.
        // WHEN: The UnAuthorized constructor is called with a message and a cause.
        // THEN: A new UnAuthorized object is created with the provided message and cause.
        unAuthorized = new UnAuthorized("Unauthorized access denied", new RuntimeException("Something went wrong"));
        assertEquals("Unauthorized access denied", unAuthorized.getMessage());
        assertSame(RuntimeException.class, unAuthorized.getCause().getClass());
    }
}
