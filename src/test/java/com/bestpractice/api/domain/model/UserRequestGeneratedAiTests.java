package com.bestpractice.api.domain.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bestpractice.api.infrastrucuture.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRequestGeneratedAiTests {

    private UserRequest userRequest;

    @BeforeEach
    void setUp() {
        userRequest = new UserRequest();
    }

    @Test
    void testGettersAndSetters() {
        // GIVEN
        String username = "john_doe";
        String email = "john@example.com";
        String password = "secret";

        // WHEN
        userRequest.setUsername(username);
        userRequest.setEmail(email);
        userRequest.setPassword(password);

        // THEN
        assertEquals(username, userRequest.getUsername());
        assertEquals(email, userRequest.getEmail());
        assertEquals(password, userRequest.getPassword());
    }

    @Test
    void testConvertCreatesUserWithCorrectFields() {
        // GIVEN
        userRequest.setUsername("alice");
        userRequest.setEmail("alice@example.com");
        userRequest.setPassword("plainPassword");
        String id = "user-123";
        String encodedPassword = "encodedPassword";

        // WHEN
        User user = userRequest.convert(id, encodedPassword);

        // THEN
        assertEquals(id, user.getId());
        assertEquals("alice", user.getUsername());
        assertEquals("alice@example.com", user.getEmail());
        assertEquals(encodedPassword, user.getPassword());
    }

    @Test
    void testGettersReturnNullInitially() {
        // GIVEN
        // userRequest is freshly instantiated in setUp()

        // WHEN
        String username = userRequest.getUsername();
        String email = userRequest.getEmail();
        String password = userRequest.getPassword();

        // THEN
        assertEquals(null, username);
        assertEquals(null, email);
        assertEquals(null, password);
    }
}
