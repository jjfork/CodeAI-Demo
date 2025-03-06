package com.bestpractice.api.domain.component;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BCryptPasswordEncryptionComponentTests {

  @Autowired
  private BCryptPasswordEncryptionComponent component;

  @BeforeEach
  void setUp() {
  }

  @Test
  void encodePassword_GivenRawPassword_ReturnsEncodedPassword() {
    String rawPassword = "password123";
    String encodedPassword = component.encodePassword(rawPassword);
    assertNotNull(encodedPassword);
    assertTrue(encodedPassword.length() > 0);
  }

  @Test
  void matchedPassword_GivenRawPasswordAndEncodedPassword_ReturnsTrue() {
    String rawPassword = "password123";
    String encodedPassword = component.encodePassword(rawPassword);
    assertTrue(component.matchedPassword(rawPassword, encodedPassword));
  }

  @Test
  void matchedPassword_GivenDifferentPasswords_ReturnsFalse() {
    String rawPassword = "password123";
    String encodedPassword = component.encodePassword(rawPassword);
    assertFalse(component.matchedPassword("wrongpassword", encodedPassword));
  }
}