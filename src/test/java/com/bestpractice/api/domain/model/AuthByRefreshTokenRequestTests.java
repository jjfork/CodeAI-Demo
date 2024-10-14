package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthByRefreshTokenRequestTests {
  private AuthByRefreshTokenRequest authByRefreshTokenRequest;

  @BeforeEach
  void setUp() {
    authByRefreshTokenRequest = new AuthByRefreshTokenRequest();
  }

  @Test
  void testGetRefreshToken() {
    String refreshToken = "testRefreshToken";
    authByRefreshTokenRequest.setRefreshToken(refreshToken);
    assertEquals(refreshToken, authByRefreshTokenRequest.getRefreshToken());
  }
}
