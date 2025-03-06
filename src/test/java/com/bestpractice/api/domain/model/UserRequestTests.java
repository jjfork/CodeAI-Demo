package com.bestpractice.api.domain.model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRequestTests {

    private UserRequest userRequest;

    @BeforeEach
    void setUp() {
        userRequest = new UserRequest();
    }

    @Test
    void testConvert_ValidInput_ReturnsUserObject() {
        // GIVEN
        String id = "123";
        String encodePw = "hashedPassword";
        userRequest.setUsername("testUsername");
        userRequest.setEmail("testEmail@example.com");
        userRequest.setPassword("testPassword");

        // WHEN
        User user = userRequest.convert(id, encodePw);

        // THEN
        assertNotNull(user);
        assertEquals(id, user.getId());
        assertEquals("testUsername", user.getUsername());
        assertEquals("testEmail@example.com", user.getEmail());
        assertEquals("hashedPassword", user.getPassword());
    }
}

class User {
    private String id;
    private String username;
    private String email;
    private String password;

    public User(String id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}