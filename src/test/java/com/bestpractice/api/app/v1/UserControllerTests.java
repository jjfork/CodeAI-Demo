package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTests {

    private UserService userService;

    @BeforeEach
    void setUp() {
        // Initialize your dependencies here, e.g., mock repositories or services
    }

    @Test
    void testGenerateUser() {
        // GIVEN a UserRequest object with valid data
        UserRequest userRequest = new UserRequest();
        userRequest.setUsername("testUsername");
        userRequest.setEmail("testEmail@example.com");
        userRequest.setPassword("testPassword");

        // WHEN the generateUser method is called with the user request
        User generatedUser = userService.generateUser(userRequest);

        // THEN the generated user object should have the expected values
        assertEquals("testUsername", generatedUser.getUsername());
        assertEquals("testEmail@example.com", generatedUser.getEmail());
    }
}
