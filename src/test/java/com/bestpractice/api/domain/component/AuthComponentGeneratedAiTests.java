package com.bestpractice.api.domain.component;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import com.auth0.jwt.algorithms.Algorithm;
import com.bestpractice.api.common.property.CredentialProperty;
import com.bestpractice.api.domain.model.Credential;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


class AuthComponentGeneratedAiTests {

  @Mock
  private CredentialProperty credentialProperty;

  @InjectMocks
  private AuthComponent authComponent;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    when(credentialProperty.getHmacSecret()).thenReturn("secret");
    when(credentialProperty.convertToIntExpires()).thenReturn(2);
  }

  @Test
  void testDecodeJwt_ValidToken() {
    // GIVEN
    String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiMTIzNDU2IiwidXNlcl9lbWFpbCI6ImFub3V0QGV4YW1wbGUuY29tIiwiZXhwIjoxNjgzODg5MDgwLCJpc3MiOiJNYW51ZmFjdCIsImF1ZCI6ImFuZyJ9.Xw8L7lR_v-zI0bTq4jKzU2aO9G8yY5t6u8m6gQ";

    // WHEN
    com.auth0.jwt.interfaces.DecodedJWT decodedJwt = authComponent.decodeJwt(token);

    // THEN
    assertNotNull(decodedJwt);
    assertEquals("123456", decodedJwt.getClaim("user_id").asString());
    assertEquals("anout@example.com", decodedJwt.getClaim("user_email").asString());
    assertTrue(decodedJwt.getExpiresAt().after(new Date()));
  }

  @Test
  void testGenerateJwt_Access() {
    // GIVEN
    String userId = "123456";
    String email = "anout@example.com";

    // WHEN
    Credential credential = authComponent.generateJwt(userId, email, false);

    // THEN
    assertNotNull(credential);
    assertNotNull(credential.getToken());
    assertTrue(credential.isRefresh() == false);
  }

  @Test
  void testGenerateJwt_Refresh() {
    // GIVEN
    String userId = "123456";
    String email = "anout@example.com";

    // WHEN
    Credential credential = authComponent.generateJwt(userId, email, true);

    // THEN
    assertNotNull(credential);
    assertNotNull(credential.getToken());
    assertTrue(credential.isRefresh() == true);
  }



}