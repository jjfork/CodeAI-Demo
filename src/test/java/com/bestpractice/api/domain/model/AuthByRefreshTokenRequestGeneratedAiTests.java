package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthByRefreshTokenRequestGeneratedAiTests {
  private AuthByRefreshTokenRequest authByRefreshTokenRequest;

  @BeforeEach
  void setUp() {
    authByRefreshTokenRequest = new AuthByRefreshTokenRequest();
  }

  @Test
  void testGetRefreshToken_WhenRefreshTokenIsSet_ReturnsExpectedValue() {
    // GIVEN - Set the refreshToken value
    String expectedRefreshToken = "someRefreshToken";
    authByRefreshTokenRequest.setRefreshToken(expectedRefreshToken);
    // WHEN - Get the refreshToken value
    String actualRefreshToken = authByRefreshTokenRequest.getRefreshToken();
    // THEN - Assert that the retrieved refreshToken matches the set value
    assertEquals(expectedRefreshToken, actualRefreshToken);
  }

  @Test
  void testSetRefreshToken_WhenNewRefreshTokenIsSet_UpdatesRefreshToken() {
    // GIVEN - Set a new refreshToken value
    String newRefreshToken = "someUpdatedRefreshToken";
    // WHEN - Call the setRefreshToken method with the new value
    authByRefreshTokenRequest.setRefreshToken(newRefreshToken);
    // THEN - Assert that the refreshToken is updated correctly
    assertEquals(newRefreshToken, authByRefreshTokenRequest.getRefreshToken());
  }
}
