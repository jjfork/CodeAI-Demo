package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthByEmailRequestGeneratedAiTests {
  private AuthByEmailRequest authByEmailRequest;

  @BeforeEach
  void setUp() {
    authByEmailRequest = new AuthByEmailRequest();
  }

  @Test
  void testGetEmail() {
    // GIVEN - Set the email value
    String expectedEmail = "test@example.com";
    authByEmailRequest.setEmail(expectedEmail);
    // WHEN - Get the email value
    String actualEmail = authByEmailRequest.getEmail();
    // THEN - Assert that the actual email matches the expected email
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  void testSetEmail() {
    // GIVEN - Set a new email value
    String newEmail = "new_test@example.com";
    // WHEN - Call setEmail method with the new email
    authByEmailRequest.setEmail(newEmail);
    // THEN - Assert that the email value is updated
    assertEquals(newEmail, authByEmailRequest.getEmail());
  }

  @Test
  void testGetPassword() {
    // GIVEN - Set the password value
    String expectedPassword = "password123";
    authByEmailRequest.setPassword(expectedPassword);
    // WHEN - Get the password value
    String actualPassword = authByEmailRequest.getPassword();
    // THEN - Assert that the actual password matches the expected password
    assertEquals(expectedPassword, actualPassword);
  }

  @Test
  void testSetPassword() {
    // GIVEN - Set a new password value
    String newPassword = "newPassword";
    // WHEN - Call setPassword method with the new password
    authByEmailRequest.setPassword(newPassword);
    // THEN - Assert that the password value is updated
    assertEquals(newPassword, authByEmailRequest.getPassword());
  }
}
