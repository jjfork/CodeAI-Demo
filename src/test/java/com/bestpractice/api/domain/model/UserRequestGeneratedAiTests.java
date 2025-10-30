package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.infrastrucuture.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserRequestGeneratedAiTests {

    private UserRequest userRequest;

    @BeforeEach
    void setUp() {
        userRequest = new UserRequest();
        userRequest.setUsername(null);
        userRequest.setEmail(null);
        userRequest.setPassword(null);
    }

    @Test
    void testSetAndGetUsername() {
        // GIVEN: a username to set
        String username = "testUser";

        // WHEN: setting the username
        userRequest.setUsername(username);

        // THEN: the username should be retrievable and match the set value
        assertEquals(username, userRequest.getUsername());
    }

    @Test
    void testSetAndGetEmail() {
        // GIVEN: an email to set
        String email = "test@example.com";

        // WHEN: setting the email
        userRequest.setEmail(email);

        // THEN: the email should be retrievable and match the set value
        assertEquals(email, userRequest.getEmail());
    }

    @Test
    void testSetAndGetPassword() {
        // GIVEN: a password to set
        String password = "securePassword";

        // WHEN: setting the password
        userRequest.setPassword(password);

        // THEN: the password should be retrievable and match the set value
        assertEquals(password, userRequest.getPassword());
    }

    @Test
    void testConvertCreatesUserCorrectly() {
        // GIVEN: a populated UserRequest and conversion parameters
        String id = "12345";
        String encodedPassword = "encodedPw";
        String email = "convert@example.com";
        String username = "convertUser";
        userRequest.setEmail(email);
        userRequest.setUsername(username);

        // WHEN: converting to a User entity
        User user = userRequest.convert(id, encodedPassword);

        // THEN: the User entity should have the expected values
        assertNotNull(user);
        assertEquals(id, user.getId());
        assertEquals(encodedPassword, user.getPassword());
        assertEquals(email, user.getEmail());
        assertEquals(username, user.getUsername());
    }

    @Test
    void testConvertWithNullValues() {
        // GIVEN: a UserRequest with null username and email
        String id = "id123";
        String encodedPassword = "encodedPw";

        // WHEN: converting to a User entity
        User user = userRequest.convert(id, encodedPassword);

        // THEN: the User entity should still be created but with null fields for username and email
        assertNotNull(user);
        assertEquals(id, user.getId());
        assertEquals(encodedPassword, user.getPassword());
        assertNull(user.getEmail());
        assertNull(user.getUsername());
    }

    @Test
    void testConvertWithNullIdThrowsException() {
        // GIVEN: a populated UserRequest
        userRequest.setEmail("email@example.com");
        userRequest.setUsername("username");

        // WHEN & THEN: converting with null id should throw NullPointerException when accessing id length
        assertThrows(NullPointerException.class, () -> {
            String encodedPassword = "encodedPw";
            User user = userRequest.convert(null, encodedPassword);
            user.getId().length();
        });
    }

    @Test
    void testConvertWithNullPasswordThrowsException() {
        // GIVEN: a populated UserRequest
        userRequest.setEmail("email@example.com");
        userRequest.setUsername("username");

        // WHEN & THEN: converting with null password should throw NullPointerException when accessing password length
        assertThrows(NullPointerException.class, () -> {
            User user = userRequest.convert("id123", null);
            user.getPassword().length();
        });
    }

    @Test
    void testConvertWithNullIdAndPasswordThrowsException() {
        // GIVEN: a populated UserRequest
        userRequest.setEmail("email@example.com");
        userRequest.setUsername("username");

        // WHEN & THEN: converting with both null id and password should throw NullPointerException when accessing either
        assertThrows(NullPointerException.class, () -> {
            User user = userRequest.convert(null, null);
            user.getId().length();
            user.getPassword().length();
        });
    }

    @Test
    void testConvertWithAllFieldsNullThrowsException() {
        // GIVEN: a completely null UserRequest
        userRequest.setUsername(null);
        userRequest.setEmail(null);
        userRequest.setPassword(null);

        // WHEN & THEN: converting with null id and password should throw NullPointerException when accessing any field
        assertThrows(NullPointerException.class, () -> {
            User user = userRequest.convert(null, null);
            user.getId().length();
        });
    }

    @Test
    void testConvertWithValidIdAndNullEmailAndUsername() {
        // GIVEN: a UserRequest with null email and username
        String id = "validId";
        String encodedPassword = "encodedPw";
        userRequest.setEmail(null);
        userRequest.setUsername(null);

        // WHEN: converting to a User entity
        User user = userRequest.convert(id, encodedPassword);

        // THEN: the User entity should have id and password set, but null email and username
        assertEquals(id, user.getId());
        assertEquals(encodedPassword, user.getPassword());
        assertNull(user.getEmail());
        assertNull(user.getUsername());
    }

    @Test
    void testConvertWithEmptyStrings() {
        // GIVEN: a UserRequest with empty strings for email and username
        String id = "validId";
        String encodedPassword = "encodedPw";
        userRequest.setEmail("");
        userRequest.setUsername("");

        // WHEN: converting to a User entity
        User user = userRequest.convert(id, encodedPassword);

        // THEN: the User entity should have empty strings for email and username
        assertEquals("", user.getEmail());
        assertEquals("", user.getUsername());
        assertEquals(id, user.getId());
        assertEquals(encodedPassword, user.getPassword());
    }
}
