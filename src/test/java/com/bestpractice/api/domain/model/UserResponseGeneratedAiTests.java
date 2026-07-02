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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserResponseGeneratedAiTests {

    private UserResponse userResponse;

    @BeforeEach
    void setUp() {
        userResponse = new UserResponse("123", "john_doe", "john@example.com");
    }

    @Test
    void getIdReturnsCorrectValue() {
        // GIVEN
        // userResponse initialized in setUp
        // WHEN
        String id = userResponse.getId();
        // THEN
        assertEquals("123", id);
    }

    @Test
    void getUsernameReturnsCorrectValue() {
        // GIVEN
        // userResponse initialized in setUp
        // WHEN
        String username = userResponse.getUsername();
        // THEN
        assertEquals("john_doe", username);
    }

    @Test
    void getEmailReturnsCorrectValue() {
        // GIVEN
        // userResponse initialized in setUp
        // WHEN
        String email = userResponse.getEmail();
        // THEN
        assertEquals("john@example.com", email);
    }

    @Test
    void constructorAcceptsNullValues() {
        // GIVEN
        // WHEN
        UserResponse nullUser = new UserResponse(null, null, null);
        // THEN
        assertEquals(null, nullUser.getId());
        assertEquals(null, nullUser.getUsername());
        assertEquals(null, nullUser.getEmail());
    }

    @Test
    void constructorWithEmptyStrings() {
        // GIVEN
        // WHEN
        UserResponse emptyUser = new UserResponse("", "", "");
        // THEN
        assertEquals("", emptyUser.getId());
        assertEquals("", emptyUser.getUsername());
        assertEquals("", emptyUser.getEmail());
    }

    @Test
    void constructorWithWhitespaceStrings() {
        // GIVEN
        // WHEN
        UserResponse whitespaceUser = new UserResponse("   ", "\t", "\n");
        // THEN
        assertEquals("   ", whitespaceUser.getId());
        assertEquals("\t", whitespaceUser.getUsername());
        assertEquals("\n", whitespaceUser.getEmail());
    }

    @Test
    void constructorWithLongString() {
        // GIVEN
        String longString = "a".repeat(1000);
        // WHEN
        UserResponse longUser = new UserResponse(longString, longString, longString);
        // THEN
        assertEquals(longString, longUser.getId());
        assertEquals(longString, longUser.getUsername());
        assertEquals(longString, longUser.getEmail());
    }
}
