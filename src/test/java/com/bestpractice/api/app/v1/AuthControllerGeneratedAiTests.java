package com.bestpractice.api.app.v1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.bestpractice.api.common.exception.BadRequest;
import com.bestpractice.api.domain.model.AuthByEmailRequest;
import com.bestpractice.api.domain.model.AuthByRefreshTokenRequest;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.service.AuthService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit5.MockitoExtension;
import org.mockito.junit5.MockitoJUnitRunner;
import org.mockito.Mockito;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
class AuthControllerGeneratedAiTests {

  private AuthController controller;
  private AuthService authService;

  @org.junit.jupiter.api.BeforeEach
  void setUp() {
    authService = Mockito.of(new AuthService());
    controller = new AuthController(authService);
  }

  @Test
  void loginEmailSuccessful() {
    // GIVEN
    Mockito.when(authService.login(Mockito.anyString(), Mockito.anyString()))
        .thenReturn(new AuthResponse());

    // WHEN
    // THEN
    AuthResponse response = controller.login(
        new AuthByEmailRequest("test@example.com", "password"),
        null);

    // Assert that the response is as expected
    Mockito.verify(authService, Mockito.times(1)).login("test@example.com", "password");
  }

  @Test
  void loginEmailInvalidRequest() {
    // GIVEN
    Mockito.when(authService.login(Mockito.anyString(), Mockito.anyString()))
        .thenReturn(new AuthResponse());

    // WHEN
    // THEN
    BadRequest exception =
        controller.login(
            new AuthByEmailRequest("test@example.com", ""),
            null);

    // Assert that the exception is as expected
    Mockito.verify(authService, Mockito.times(1)).login("test@example.com", "");
  }

  @Test
  void loginRefreshTokenSuccessful() {
    // GIVEN
    Mockito.when(authService.login(Mockito.anyString()))
        .thenReturn(new AuthResponse());

    // WHEN
    // THEN
    AuthResponse response = controller.login(
        new AuthByRefreshTokenRequest("refreshToken"),
        null);

    // Assert that the response is as expected
    Mockito.verify(authService, Mockito.times(1)).login("refreshToken");
  }

  @Test
  void loginRefreshTokenInvalidRequest() {
    // GIVEN
    Mockito.when(authService.login(Mockito.anyString()))
        .thenReturn(new AuthResponse());

    // WHEN
    // THEN
    BadRequest exception =
        controller.login(
            new AuthByRefreshTokenRequest(""),
            null);

    // Assert that the exception is as expected
    Mockito.verify(authService, Mockito.times(1)).login("");
  }
}
