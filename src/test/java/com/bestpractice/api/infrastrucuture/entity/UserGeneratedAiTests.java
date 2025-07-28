package com.bestpractice.api.infrastrucuture.entity;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserGeneratedAiTests {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User("id1", "username1", "email1@example.com", "password123");
    }

    @Test
    void testGettersAndSetters() {
        // GIVEN a User object
        String expectedId = "id1";
        String expectedUsername = "username1";
        String expectedEmail = "email1@example.com";
        String expectedPassword = "password123";

        // WHEN getting the values using getters
        String actualId = user.getId();
        String actualUsername = user.getUsername();
        String actualEmail = user.getEmail();
        String actualPassword = user.getPassword();

        // THEN assert that the retrieved values match the expected values
        assertEquals(expectedId, actualId);
        assertEquals(expectedUsername, actualUsername);
        assertEquals(expectedEmail, actualEmail);
        assertEquals(expectedPassword, actualPassword);
    }
}
