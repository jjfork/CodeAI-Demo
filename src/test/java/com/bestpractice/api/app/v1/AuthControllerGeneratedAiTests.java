package com.bestpractice.api.app.v1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import com.bestpractice.api.domain.model.AuthByEmailRequest;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.service.AuthService;

class AuthControllerGeneratedAiTests {

  @Mock
  private AuthService authService;

  @InjectMocks
  private AuthController authController;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testLoginWithEmailAndPassword() {
    // GIVEN
    AuthByEmailRequest request = new AuthByEmailRequest();
    request.setEmail("test@example.com");
    request.setPassword("password123");
    AuthResponse expectedResponse = new AuthResponse("Bearer", "token_value", "refresh_token", null);

    // WHEN
    when(authService.login(request.getEmail(), request.getPassword())).thenReturn(expectedResponse);
    AuthResponse actualResponse = authController.login(request, null);

    // THEN
    assertEquals(expectedResponse, actualResponse);
  }

  @Test
  void testLoginWithRefreshToken() {
    // GIVEN
    AuthByRefreshTokenRequest request = new AuthByRefreshTokenRequest();
    request.setRefreshToken("refresh_token_value");
    AuthResponse expectedResponse = new AuthResponse("Bearer", "token_value", "refresh_token", null);

    // WHEN
    when(authService.login(request.getRefreshToken())).thenReturn(expectedResponse);
    AuthResponse actualResponse = authController.login(request, null);

    // THEN
    assertEquals(expectedResponse, actualResponse);
  }
}