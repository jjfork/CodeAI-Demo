package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceUnavailableTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testServiceUnavailable_DefaultConstructor() {
    // GIVEN - 
    // WHEN - ServiceUnavailable exception = new ServiceUnavailable();
    // THEN - assertNotNull(exception);
    ServiceUnavailable exception = new ServiceUnavailable();
    assertNotNull(exception);
  }

  @Test
  void testServiceUnavailable_WithMessage() {
    // GIVEN - String message = "Test Message";
    // WHEN - ServiceUnavailable exception = new ServiceUnavailable(message);
    // THEN - assertEquals("Test Message", exception.getMessage());
    String message = "Test Message";
    ServiceUnavailable exception = new ServiceUnavailable(message);
    assertEquals(message, exception.getMessage());
  }

  @Test
  void testServiceUnavailable_WithCause() {
    // GIVEN - RuntimeException cause = new RuntimeException("Test Cause");
    // WHEN - ServiceUnavailable exception = new ServiceUnavailable(cause);
    // THEN - assertNotNull(exception.getCause());
    // AND - assertEquals(cause, exception.getCause());
    RuntimeException cause = new RuntimeException("Test Cause");
    ServiceUnavailable exception = new ServiceUnavailable(cause);
    assertNotNull(exception.getCause());
    assertEquals(cause, exception.getCause());
  }

  @Test
  void testServiceUnavailable_WithMessageAndCause() {
    // GIVEN - String message = "Test Message";
    //         RuntimeException cause = new RuntimeException("Test Cause");
    // WHEN - ServiceUnavailable exception = new ServiceUnavailable(message, cause);
    // THEN - assertEquals("Test Message", exception.getMessage());
    // AND - assertNotNull(exception.getCause());
    // AND - assertEquals(cause, exception.getCause());
    String message = "Test Message";
    RuntimeException cause = new RuntimeException("Test Cause");
    ServiceUnavailable exception = new ServiceUnavailable(message, cause);
    assertEquals(message, exception.getMessage());
    assertNotNull(exception.getCause());
    assertEquals(cause, exception.getCause());
  }

}
