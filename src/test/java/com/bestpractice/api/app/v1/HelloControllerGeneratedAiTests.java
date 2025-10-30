package com.bestpractice.api.app.v1;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelloControllerGeneratedAiTests {

    private HelloController helloController;

    @BeforeEach
    void setUp() {
        helloController = new HelloController();
    }

    @Test
    void sample1_shouldReturnHelloWorldKeyValue() {
        // GIVEN: a HelloController instance
        // WHEN: calling sample1 method
        Map<String, String> result = helloController.sample1();
        // THEN: the result should contain the expected key-value pair
        assertNotNull(result, "Result map should not be null");
        assertEquals(1, result.size(), "Result map should contain exactly one entry");
        assertEquals("Hello world.", result.get("key"), "Value for 'key' should be 'Hello world.'");
    }

    @Test
    void sample1_shouldNotThrowAnyException() {
        // GIVEN: a HelloController instance
        // WHEN: calling sample1 method
        Map<String, String> result = helloController.sample1();
        // THEN: no exception should be thrown and result should be valid
        assertNotNull(result, "Result map should not be null");
        assertEquals("Hello world.", result.get("key"), "Value for 'key' should be 'Hello world.'");
    }

    @Test
    void sample1_exceptionScenario_shouldThrowRuntimeException() {
        // GIVEN: a HelloController instance with overridden behavior to throw exception
        HelloController faultyController = new HelloController() {
            @Override
            public Map<String, String> sample1() {
                throw new RuntimeException("Forced exception for testing");
            }
        };
        // WHEN & THEN: calling sample1 should throw RuntimeException
        assertThrows(RuntimeException.class, faultyController::sample1, "Expected RuntimeException to be thrown");
    }
}
