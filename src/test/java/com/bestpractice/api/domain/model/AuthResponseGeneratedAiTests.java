package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class AuthResponse {

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    // Implementation details omitted for brevity
  }
}

package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.Test;
import java.util.Date;

public class AuthResponseGeneratedAiTests {

  private AuthResponse authResponse;

  @Test
  void testGetTokenType() {
    assertEquals("Bearer", authResponse.getTokenType());
  }

  @Test
  void test getToken() {
    assertEquals("testToken", authResponse.getToken());
  }

  @Test
  void testGetRefreshToken() {
    assertEquals("refresh", authResponse.getRefreshToken());
  }

  @Test
  void testGetExpiresAt() {
    assertEquals(new Date(), authResponse.getExpiresAt());
  }
}
