package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserResponseGeneratedAiTests {
  private String id = "123";
  private String username = "testuser";
  private String email = "test@example.com";
  private UserResponse userResponse;

  @BeforeEach
  void setUp() {
    userResponse = new UserResponse(id, username, email);
  }

  @Test
  void testGetId() {
    // GIVEN - A UserResponse object is created.
    // WHEN - The getId method is called on the userResponse object.
    String actualId = userResponse.getId();
    // THEN - The returned id should be equal to the provided id.
    assertEquals(id, actualId);
  }

  @Test
  void testGetUsername() {
    // GIVEN - A UserResponse object is created.
    // WHEN - The getUsername method is called on the userResponse object.
    String actualUsername = userResponse.getUsername();
    // THEN - The returned username should be equal to the provided username.
    assertEquals(username, actualUsername);
  }

  @Test
  void testGetEmail() {
    // GIVEN - A UserResponse object is created.
    // WHEN - The getEmail method is called on the userResponse object.
    String actualEmail = userResponse.getEmail();
    // THEN - The returned email should be equal to the provided email.
    assertEquals(email, actualEmail);
  }
}
