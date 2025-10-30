package com.bestpractice.api.infrastrucuture.entity;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserGeneratedAiTests {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    void testDefaultConstructorAndSettersGetters() {
        // GIVEN - a new User object and test data
        String id = "123";
        String username = "testuser";
        String email = "test@example.com";
        String password = "securePassword";

        // WHEN - setting values using setters
        user.setId(id);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        // THEN - verify getters return expected values
        assertEquals(id, user.getId());
        assertEquals(username, user.getUsername());
        assertEquals(email, user.getEmail());
        assertEquals(password, user.getPassword());
    }

    @Test
    void testParameterizedConstructor() {
        // GIVEN - test data for constructor
        String id = "456";
        String username = "anotheruser";
        String email = "another@example.com";
        String password = "anotherPassword";

        // WHEN - creating User with parameterized constructor
        User paramUser = new User(id, username, email, password);

        // THEN - verify fields are initialized correctly
        assertEquals(id, paramUser.getId());
        assertEquals(username, paramUser.getUsername());
        assertEquals(email, paramUser.getEmail());
        assertEquals(password, paramUser.getPassword());
    }

    @Test
    void testSetIdUpdatesValue() {
        // GIVEN - initial id
        String initialId = "initId";
        user.setId(initialId);
        assertEquals(initialId, user.getId());

        // WHEN - updating id
        String newId = "newId";
        user.setId(newId);

        // THEN - verify id is updated
        assertEquals(newId, user.getId());
    }

    @Test
    void testSetUsernameUpdatesValue() {
        // GIVEN - initial username
        String initialUsername = "initUser";
        user.setUsername(initialUsername);
        assertEquals(initialUsername, user.getUsername());

        // WHEN - updating username
        String newUsername = "newUser";
        user.setUsername(newUsername);

        // THEN - verify username is updated
        assertEquals(newUsername, user.getUsername());
    }

    @Test
    void testSetEmailUpdatesValue() {
        // GIVEN - initial email
        String initialEmail = "init@example.com";
        user.setEmail(initialEmail);
        assertEquals(initialEmail, user.getEmail());

        // WHEN - updating email
        String newEmail = "new@example.com";
        user.setEmail(newEmail);

        // THEN - verify email is updated
        assertEquals(newEmail, user.getEmail());
    }

    @Test
    void testSetPasswordUpdatesValue() {
        // GIVEN - initial password
        String initialPassword = "initPass";
        user.setPassword(initialPassword);
        assertEquals(initialPassword, user.getPassword());

        // WHEN - updating password
        String newPassword = "newPass";
        user.setPassword(newPassword);

        // THEN - verify password is updated
        assertEquals(newPassword, user.getPassword());
    }

    @Test
    void testSetPasswordToNull() {
        // GIVEN - a null password value
        String nullPassword = null;

        // WHEN - setting password to null
        user.setPassword(nullPassword);

        // THEN - verify password is null
        assertEquals(null, user.getPassword());
    }

    @Test
    void testSetUsernameToNull() {
        // GIVEN - a null username value
        String nullUsername = null;

        // WHEN - setting username to null
        user.setUsername(nullUsername);

        // THEN - verify username is null
        assertEquals(null, user.getUsername());
    }

    @Test
    void testSetEmailToNull() {
        // GIVEN - a null email value
        String nullEmail = null;

        // WHEN - setting email to null
        user.setEmail(nullEmail);

        // THEN - verify email is null
        assertEquals(null, user.getEmail());
    }
}
