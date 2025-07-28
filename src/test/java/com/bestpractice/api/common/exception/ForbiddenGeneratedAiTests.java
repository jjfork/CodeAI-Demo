package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForbiddenGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testForbidden_NoArgsConstructor() {
    // GIVEN - 
    // WHEN - Forbidden forbidden = new Forbidden();
    // THEN - assertNotNull(forbidden);
  }

  @Test
  void testForbidden_StringConstructor() {
    // GIVEN - String msg = "test message";
    // WHEN - Forbidden forbidden = new Forbidden(msg);
    // THEN - assertEquals("test message", forbidden.getMessage());
  }

  @Test
  void testForbidden_ThrowableConstructor() {
    // GIVEN - Throwable cause = new RuntimeException();
    // WHEN - Forbidden forbidden = new Forbidden(cause);
    // THEN - assertEquals(cause, forbidden.getCause());
  }

  @Test
  void testForbidden_StringThrowableConstructor() {
    // GIVEN - String msg = "test message";
    //         Throwable cause = new RuntimeException();
    // WHEN - Forbidden forbidden = new Forbidden(msg, cause);
    // THEN - assertEquals("test message", forbidden.getMessage());
    //       assertEquals(cause, forbidden.getCause());
  }


}
