package com.bestpractice.api.infrastrucuture.entity;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.bestpractice.api.infrastrucuture.entity.SharedData;
import com.google.common.base.Preconditions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserGeneratedAiTests {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User("idValue", "usernameValue", "emailValue", "password123");
    }

    @Test
    void testConstructor() {
        // GIVEN: A new User object is created.
        // WHEN: The constructor is called with specific values.
        // THEN: The user's id, username, email, and password are set to the provided values.
        assertEquals("idValue", user.getId());
        assertEquals("usernameValue", user.getUsername());
        assertEquals("emailValue", user.getEmail());
        assertEquals("password123", user.getPassword());
    }

    @Test
    void testGettersAndSetters() {
        // GIVEN: A User object is created.
        // WHEN: The getters and setters for each field are called.
        // THEN: The values of the fields are correctly returned and set.
        user = new User();
        user.setPassword("password123");
        assertEquals("idValue", user.getId());
        assertEquals("usernameValue", user.getUsername());
        assertEquals("emailValue", user.getEmail());
        assertEquals("password123", user.getPassword());
        user.setId("newId");
        user.setUsername("newUsername");
        user.setEmail("newEmail");
        user.setPassword("newPassword");
        assertEquals("newId", user.getId());
        assertEquals("newUsername", user.getUsername());
        assertEquals("newEmail", user.getEmail());
        assertEquals("newPassword", user.getPassword());
    }
}