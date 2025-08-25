package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(Mockito.class)
public class AuthByEmailRequestGeneratedAiTests {

    private AuthByEmailRequest authByEmailRequest;

    @BeforeEach
    void setUp() {
        authByEmailRequest = new AuthByEmailRequest();
    }

    @Test
    void testGetAndSetEmail() {
        // GIVEN: A new AuthByEmailRequest object
        // WHEN: The email field is set to "test@example.com"
        authByEmailRequest.setEmail("test@example.com");
        // THEN: The email field is set to "test@example.com"
        assertEquals("test@example.com", authByEmailRequest.getEmail());
    }

    @Test
    void testGetAndSetPassword() {
        // GIVEN: A new AuthByEmailRequest object
        // WHEN: The password field is set to "secretPassword"
        authByEmailRequest.setPassword("secretPassword");
        // THEN: The password field is set to "secretPassword"
        assertEquals("secretPassword", authByEmailRequest.getPassword());
    }

    @Test
    void testGetEmailNotNull() {
        // GIVEN: A new AuthByEmailRequest object
        // WHEN: The email field is set to "test@example.com"
        authByEmailRequest.setEmail("test@example.com");
        // THEN: The email field is not null
        assertNotNull(authByEmailRequest.getEmail());
    }

    @Test
    void testGetPasswordNotNull() {
        // GIVEN: A new AuthByEmailRequest object
        // WHEN: The password field is set to "secretPassword"
        authByEmailRequest.setPassword("secretPassword");
        // THEN: The password field is not null
        assertNotNull(authByEmailRequest.getPassword());
    }
}
