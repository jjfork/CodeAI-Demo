package com.bestpractice.api.domain.component;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import com.bestpractice.api.common.property.CredentialProperty; 
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
    authComponent = new AuthComponent(credentialProperty);
  }

  @Test
  void testDecodeJwt_ValidToken() {
    // GIVEN
    String userId = "user123";
    String email = "user@example.com";
    Map<String, Object> header = new HashMap<>();
    header.put("alg", "HS256");
    header.put("typ", "JWT");
    String token = JWT.create()
        .withIssuer("myProvider")
        .withAudience("any")
        .withIssuedAt(new Date())
        .withHeader(header)
        .withClaim("user_id", userId)
        .withClaim("user_email", email)
        .sign(Algorithm.HMAC256("secretKey"));

    // WHEN
    DecodedJWT decodedJwt = authComponent.decodeJwt(token);

    // THEN
    assertEquals(userId, decodedJwt.getClaim("user_id").asString());
    assertEquals(email, decodedJwt.getClaim("user_email").asString());
  }

  @Test
  void testDecodeJwt_ExpiredToken() {
    // GIVEN
    String userId = "user123";
    String email = "user@example.com";
    Map<String, Object> header = new HashMap<>();
    header.put("alg", "HS256");
    header.put("typ", "JWT");
    Date expiredDate = new Date(System.currentTimeMillis() - 1000);
    String token = JWT.create()
        .withIssuer("myProvider")
        .withAudience("any")
        .withIssuedAt(new Date())
        .withHeader(header)
        .withClaim("user_id", userId)
        .withClaim("user_email", email)
        .withExpiresAt(expiredDate)
        .sign(Algorithm.HMAC256("secretKey"));

    // WHEN
    assertThrows(TokenExpiredException.class, () -> authComponent.decodeJwt(token));
  }


  @Test
  void testGenerateJwt_ValidCredential() {
    // GIVEN
    String userId = "user123";
    String email = "user@example.com";

    // WHEN
    Credential credential = authComponent.generateJwt(userId, email, false);

    // THEN
    assertNotNull(credential.getToken());
    assertEquals("Bearer", credential.getType());
  }


}