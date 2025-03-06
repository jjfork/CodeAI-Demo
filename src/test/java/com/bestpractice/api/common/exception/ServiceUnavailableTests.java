package com.bestpractice.api.common.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceUnavailableTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testServiceUnavailable() {
    // GIVEN - 
    // WHEN - ServiceUnavailable is instantiated without arguments
    ServiceUnavailable exception = new ServiceUnavailable();
    // THEN - The exception message should be null
    assertNull(exception.getMessage());
  }

  @Test
  void testServiceUnavailableWithMessage() {
    // GIVEN - A message string
    String message = "Service is unavailable";
    // WHEN - ServiceUnavailable is instantiated with the message
    ServiceUnavailable exception = new ServiceUnavailable(message);
    // THEN - The exception message should be the provided message
    assertEquals(message, exception.getMessage());
  }

  @Test
  void testServiceUnavailableWithCause() {
    // GIVEN - A Throwable cause
    Throwable cause = new RuntimeException("Some other error");
    // WHEN - ServiceUnavailable is instantiated with the cause
    ServiceUnavailable exception = new ServiceUnavailable(cause);
    // THEN - The exception's cause should be the provided cause
    assertSame(cause, exception.getCause());
  }

  @Test
  void testServiceUnavailableWithMessageAndCause() {
    // GIVEN - A message string and a Throwable cause
    String message = "Service is unavailable";
    Throwable cause = new RuntimeException("Some other error");
    // WHEN - ServiceUnavailable is instantiated with the message and cause
    ServiceUnavailable exception = new ServiceUnavailable(message, cause);
    // THEN - The exception message should be the provided message and the cause should be the provided cause
    assertEquals(message, exception.getMessage());
    assertSame(cause, exception.getCause());
  }

}
