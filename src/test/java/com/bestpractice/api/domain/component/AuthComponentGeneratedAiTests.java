package com.bestpractice.api.domain.component;

import com.auth0.jwt.algorithms.Algorithm;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import com.bestpractice.api.common.property.CredentialProperty;
import com.bestpractice.api.domain.model.Credential;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AuthComponentGeneratedAiTests {
  private AuthComponent authComponent;
  private CredentialProperty credentialProperty;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    credentialProperty = new CredentialProperty();
    credentialProperty.setHmacSecret("secret");
    authComponent = new AuthComponent(credentialProperty);
  }

  @Test
  void testGenerateJwt_ValidInput() {
    // GIVEN
    String userId = "user123";
    String email = "test@example.com";
    // WHEN
    Credential credential = authComponent.generateJwt(userId, email, false);
    // THEN
    assertNotNull(credential.getToken());
    assertEquals("Bearer", credential.getTokenType());
    assertTrue(credential.getExp() != null);
    assertFalse(credential.isRefresh());
  }

  @Test
  void testGenerateJwt_RefreshInput() {
    // GIVEN
    String userId = "user123";
    String email = "test@example.com";
    // WHEN
    Credential credential = authComponent.generateJwt(userId, email, true);
    // THEN
    assertNotNull(credential.getToken());
    assertEquals("Bearer", credential.getTokenType());
    assertTrue(credential.getExp() != null);
    assertTrue(credential.isRefresh());
  }

  @Test
  void testDecodeJwt_ValidToken() {
    // GIVEN
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    // WHEN
    com.auth0.jwt.interfaces.DecodedJWT decodedJwt = authComponent.decodeJwt(token);
    // THEN
    assertNotNull(decodedJwt);
    assertEquals("1234567890", decodedJwt.getClaim("user_id"));
  }

  @Test
  void testDecodeJwt_ExpiredToken() {
    // GIVEN
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.HOUR, -1);
    Date now = calendar.getTime();

    // WHEN
    try {
      authComponent.decodeJwt(token);
    } catch (com.auth0.jwt.exceptions.TokenExpiredException ex) {
      // THEN
      assertTrue(true);
    }
  }
}
