package com.bestpractice.api.domain.component;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MyExtension.class)
public class MyComponentTest {

    @BeforeAll
    static void setUpBeforeAllTests() {
        // Setup code that runs before all tests
    }

    @AfterAll
    static void tearDownAfterAllTests() {
        // Teardown code that runs after all tests
    }

    @BeforeEach
    void setUpBeforeEachTest() {
        // Setup code that runs before each test
    }

    @AfterEach
    void tearDownAfterEachTest() {
        // Teardown code that runs after each test
    }

    @Test
    void testMyMethod() {
        // Test logic here
    }

    @Test
    void testAnotherMethod() {
        // Test logic here
    }
}

// Dummy extension class to satisfy the annotation
class MyExtension {}