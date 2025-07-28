package com.bestpractice.api.domain.component;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BCryptPasswordEncryptionComponentGeneratedAiTests {

  private BCryptPasswordEncryptionComponent component;

  @BeforeEach
  void setUp() {
    component = new BCryptPasswordEncryptionComponent();
  }

  @Test
  void givenRawPassword_whenEncodePassword_thenReturnsEncodedString() {
    // GIVEN a raw password
    String rawPassword = "password123";
    // WHEN the password is encoded
    String encodedPassword = component.encodePassword(rawPassword);
    // THEN the encoded password should not be null and not empty
    assertNotNull(encodedPassword);
    assertFalse(encodedPassword.isEmpty()); 
  }

  @Test
  void givenRawPasswordAndEncodedPassword_whenMatchedPassword_thenReturnTrue() {
    // GIVEN a raw password and its encoded version
    String rawPassword = "password123";
    String encodedPassword = component.encodePassword(rawPassword);
    // WHEN the passwords are compared
    boolean isMatch = component.matchedPassword(rawPassword, encodedPassword);
    // THEN the match should be true
    assertTrue(isMatch);
  }

  @Test
  void givenDifferentPasswords_whenMatchedPassword_thenReturnFalse() {
    // GIVEN a raw password and an encoded password for a different string
    String rawPassword = "password123";
    String encodedPassword = component.encodePassword("differentPassword");
    // WHEN the passwords are compared
    boolean isMatch = component.matchedPassword(rawPassword, encodedPassword);
    // THEN the match should be false
    assertFalse(isMatch);
  }

}
