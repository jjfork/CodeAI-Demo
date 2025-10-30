package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AuthByEmailRequestGeneratedAiTests {

    private AuthByEmailRequest authByEmailRequest;

    @BeforeEach
    void setUp() {
        authByEmailRequest = new AuthByEmailRequest();
    }

    @Test
    void testGetAndSetEmail() {
        // GIVEN: an email value to set
        String email = "test@example.com";

        // WHEN: setting the email on the request object
        authByEmailRequest.setEmail(email);

        // THEN: the email should be retrievable and match the set value
        assertEquals(email, authByEmailRequest.getEmail());
    }

    @Test
    void testGetAndSetPassword() {
        // GIVEN: a password value to set
        String password = "securePassword123";

        // WHEN: setting the password on the request object
        authByEmailRequest.setPassword(password);

        // THEN: the password should be retrievable and match the set value
        assertEquals(password, authByEmailRequest.getPassword());
    }

    @Test
    void testEmailInitiallyNull() {
        // GIVEN: a newly created request object

        // WHEN: retrieving the email without setting it

        // THEN: the email should be null
        assertNull(authByEmailRequest.getEmail());
    }

    @Test
    void testPasswordInitiallyNull() {
        // GIVEN: a newly created request object

        // WHEN: retrieving the password without setting it

        // THEN: the password should be null
        assertNull(authByEmailRequest.getPassword());
    }

    @Test
    void testSetEmailWithNullValue() {
        // GIVEN: a null email value
        String email = null;

        // WHEN: setting the email to null
        authByEmailRequest.setEmail(email);

        // THEN: the email should be null
        assertNull(authByEmailRequest.getEmail());
    }

    @Test
    void testSetPasswordWithNullValue() {
        // GIVEN: a null password value
        String password = null;

        // WHEN: setting the password to null
        authByEmailRequest.setPassword(password);

        // THEN: the password should be null
        assertNull(authByEmailRequest.getPassword());
    }

    @Test
    void testSetEmailWithInvalidFormat() {
        // GIVEN: an invalid email format
        String invalidEmail = "invalid-email";

        // WHEN: setting the invalid email
        authByEmailRequest.setEmail(invalidEmail);

        // THEN: the email should be set as is (no validation in setter)
        assertEquals(invalidEmail, authByEmailRequest.getEmail());
    }

    @Test
    void testSetEmailAndPasswordTogether() {
        // GIVEN: valid email and password
        String email = "user@example.com";
        String password = "password123";

        // WHEN: setting both email and password
        authByEmailRequest.setEmail(email);
        authByEmailRequest.setPassword(password);

        // THEN: both values should be retrievable and match the set values
        assertEquals(email, authByEmailRequest.getEmail());
        assertEquals(password, authByEmailRequest.getPassword());
    }

    @Test
    void testSetEmailNullAndPasswordValid() {
        // GIVEN: null email and valid password
        String password = "passwordOnly";

        // WHEN: setting email to null and password to a value
        authByEmailRequest.setEmail(null);
        authByEmailRequest.setPassword(password);

        // THEN: email should be null and password should match
        assertNull(authByEmailRequest.getEmail());
        assertEquals(password, authByEmailRequest.getPassword());
    }

    @Test
    void testSetPasswordNullAndEmailValid() {
        // GIVEN: valid email and null password
        String email = "emailOnly@example.com";

        // WHEN: setting password to null and email to a value
        authByEmailRequest.setPassword(null);
        authByEmailRequest.setEmail(email);

        // THEN: password should be null and email should match
        assertNull(authByEmailRequest.getPassword());
        assertEquals(email, authByEmailRequest.getEmail());
    }
}
