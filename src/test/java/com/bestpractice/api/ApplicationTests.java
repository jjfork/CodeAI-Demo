package com.bestpractice.api;

import org.springframework.boot.SpringApplication;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testMainMethod() {
        // GIVEN - Set up the context for testing the main method
        String[] args = {}; 

        // WHEN - Execute the main method
        SpringApplication.run(Application.class, args);

        // THEN - Assert that the application runs successfully
        assertTrue(true); // Replace with a more specific assertion if needed
    }
}