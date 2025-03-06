package com.bestpractice.api.infrastrucuture.entity;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTests {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User("id1", "username1", "email1@example.com", "password123");
    }

    @Test
    void testGettersAndSetters() {
        // GIVEN a User object
        // WHEN getting and setting the id, username, email, and password
        // THEN the values should be correctly set and retrieved
        assertEquals("id1", user.getId());
        assertEquals("username1", user.getUsername());
        assertEquals("email1@example.com", user.getEmail());
        assertEquals("password123", user.getPassword());

        user.setId("newId");
        user.setUsername("newUsername");
        user.setEmail("newEmail@example.com");
        user.setPassword("newPassword");

        assertEquals("newId", user.getId());
        assertEquals("newUsername", user.getUsername());
        assertEquals("newEmail@example.com", user.getEmail());
        assertEquals("newPassword", user.getPassword());
    }
}
