package com.bestpractice.api.domain.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import com.bestpractice.api.infrastrucuture.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UserRequestGeneratedAiTests {

    private UserRequest userRequest;

    @BeforeEach
    void setUp() {
        userRequest = new UserRequest();
    }

    @Test
    void testGettersReturnNullWhenNotSet() {
        // GIVEN no values set
        // WHEN getters are called
        // THEN all getters return null
        assertNull(userRequest.getUsername());
        assertNull(userRequest.getEmail());
        assertNull(userRequest.getPassword());
    }

    @Test
    void testSettersWithEmptyString() {
        // GIVEN empty strings
        String empty = "";
        // WHEN setters are called
        userRequest.setUsername(empty);
        userRequest.setEmail(empty);
        userRequest.setPassword(empty);
        // THEN getters return the empty strings
        assertEquals(empty, userRequest.getUsername());
        assertEquals(empty, userRequest.getEmail());
        assertEquals(empty, userRequest.getPassword());
    }

    @Test
    void testSettersWithWhitespaceString() {
        // GIVEN whitespace-only strings
        String whitespace = "   ";
        // WHEN setters are called
        userRequest.setUsername(whitespace);
        userRequest.setEmail(whitespace);
        userRequest.setPassword(whitespace);
        // THEN getters return the whitespace strings
        assertEquals(whitespace, userRequest.getUsername());
        assertEquals(whitespace, userRequest.getEmail());
        assertEquals(whitespace, userRequest.getPassword());
    }

    @Test
    void testConvertCreatesUserWithCorrectFields() {
        // GIVEN
        String id = "user-123";
        String encodedPassword = "encodedSecret";
        userRequest.setUsername("alice");
        userRequest.setEmail("alice@example.com");
        userRequest.setPassword("plainPassword");
        // WHEN
        User user = userRequest.convert(id, encodedPassword);
        // THEN
        assertEquals(id, user.getId());
        assertEquals("alice", user.getUsername());
        assertEquals("alice@example.com", user.getEmail());
        assertEquals(encodedPassword, user.getPassword());
    }

    @Test
    void testConvertWithNullIdAndPassword() {
        // GIVEN
        userRequest.setUsername("bob");
        userRequest.setEmail("bob@example.com");
        userRequest.setPassword("secret");
        // WHEN
        User user = userRequest.convert(null, null);
        // THEN
        assertNull(user.getId());
        assertEquals("bob", user.getUsername());
        assertEquals("bob@example.com", user.getEmail());
        assertNull(user.getPassword());
    }

    @Test
    void testConvertWithEmptyIdAndPassword() {
        // GIVEN
        userRequest.setUsername("charlie");
        userRequest.setEmail("charlie@example.com");
        userRequest.setPassword("pass");
        // WHEN
        User user = userRequest.convert("", "");
        // THEN
        assertEquals("", user.getId());
        assertEquals("charlie", user.getUsername());
        assertEquals("charlie@example.com", user.getEmail());
        assertEquals("", user.getPassword());
    }
}
