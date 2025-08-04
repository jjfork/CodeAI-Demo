package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.model.Credential;
import com.bestpractice.api.infrastrucuture.entity.User;
import com.bestpractice.api.infrastrucuture.persistent.UserPersistentRepository;

@SpringBootTest
public class AuthServiceImplGeneratedAiTests {

  @Autowired
  private AuthServiceImpl authService;
  @Autowired
  private UserPersistentRepository userPersistentRepository;
  @Autowired
  private AuthComponent authComponent;

  @BeforeEach
  void setUp() {
    // Reset any state before each test
  }

  @Test
  void login_ValidCredentials_ReturnsAuthResponse() {
    // GIVEN
    String email = "test@example.com";
    String password = "password";
    User user = new User(1, email, authComponent.encodePassword(password));
    when(userPersistentRepository.findByEmail(email)).thenReturn(user);

    // WHEN
    Credential response = authService.login(email, password);

    // THEN
    assertNotNull(response);
    assertEquals("Bearer", response.getTokenType());
  }

  @Test
  void login_InvalidCredentials_ThrowsUnauthorizedException() {
    // GIVEN
    String email = "test@example.com";
    String password = "wrongpassword";
    User user = new User(1, email, authComponent.encodePassword("correctpassword"));
    when(userPersistentRepository.findByEmail(email)).thenReturn(user);

    // WHEN
    // THEN
    assertThrows(com.bestpractice.api.common.exception.UnAuthorized.class, () -> authService.login(email, password));
  }


  @Test
  void login_RefreshToken_ReturnsAuthResponse() {
    // GIVEN
    String refreshToken = "test_refresh_token";
    User user = new User(1, "test@example.com", authComponent.encodePassword("password"));

    when(authComponent.decodeJwt(refreshToken)).thenReturn(mock(DecodedJWT.class));
    when(userPersistentRepository.findByEmail("test@example.com")).thenReturn(user);

    // WHEN
    Credential response = authService.login(refreshToken);

    // THEN
    assertNotNull(response);
    assertEquals("Bearer", response.getTokenType());
  }


}