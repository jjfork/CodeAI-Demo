package com.bestpractice.api.infrastrucuture.persistent.mongo.entity;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyTest {

    @Test
    public void testExample() {
        // Example data
        String expectedValue = "Hello, World!";
        String actualValue = new String("Hello, World!");

        // Assert that the actual value matches the expected value
        assertEquals(expectedValue, actualValue);
    }
}
