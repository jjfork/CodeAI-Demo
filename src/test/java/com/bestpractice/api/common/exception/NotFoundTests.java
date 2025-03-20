package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NotFoundTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound_DefaultConstructor() {
    // GIVEN - 
    // WHEN - NotFound exception = new NotFound();
    // THEN - assertNotNull(exception);
  }

  @Test
  void testNotFound_StringConstructor() {
    // GIVEN - String msg = "Resource not found";
    // WHEN - NotFound exception = new NotFound(msg);
    // THEN - assertEquals("Resource not found", exception.getMessage());
  }

  @Test
  void testNotFound_ThrowableConstructor() {
    // GIVEN - Throwable cause = new RuntimeException();
    // WHEN - NotFound exception = new NotFound(cause);
    // THEN - assertNotNull(exception.getCause());
  }

  @Test
  void testNotFound_StringThrowableConstructor() {
    // GIVEN - String msg = "Resource not found";
    //         Throwable cause = new RuntimeException();
    // WHEN - NotFound exception = new NotFound(msg, cause);
    // THEN - assertEquals("Resource not found", exception.getMessage());
    //       assertNotNull(exception.getCause());
  }

}
