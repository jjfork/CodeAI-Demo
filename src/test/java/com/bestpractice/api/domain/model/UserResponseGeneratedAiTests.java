package com.bestpractice.api.domain.model;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.fasterxml.jackson.annotation.JsonProperty;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserResponseGeneratedAiTests {

    @Test
    void getId() {
        // GIVEN a UserResponse object
        // WHEN the getId() method is called
        // THEN the id should return "123"
        assertEquals("123", new UserResponse("123", "john.doe", "john.doe@example.com").getId());
    }

    @Test
    void getUsername() {
        // GIVEN a UserResponse object
        // WHEN the getUsername() method is called
        // THEN the username should return "john.doe"
        assertEquals("john.doe", new UserResponse("123", "john.doe", "john.doe@example.com").getUsername());
    }

    @Test
    void getEmail() {
        // GIVEN a UserResponse object
        // WHEN the getEmail() method is called
        // THEN the email should return "john.doe@example.com"
        assertEquals("john.doe@example.com", new UserResponse("123", "john.doe", "john.doe@example.com").getEmail());
    }
}