package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InternalServerErrorGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testInternalServerError_NoArgs() {
    // GIVEN - 
    // WHEN - InternalServerError exception = new InternalServerError();
    // THEN - assertNotNull(exception);
    InternalServerError exception = new InternalServerError();
    assertNotNull(exception);
  }

  @Test
  void testInternalServerError_String() {
    // GIVEN - String msg = "Test Message";
    // WHEN - InternalServerError exception = new InternalServerError(msg);
    // THEN - assertEquals("Test Message", exception.getMessage());
    String msg = "Test Message";
    InternalServerError exception = new InternalServerError(msg);
    assertEquals(msg, exception.getMessage());
  }

  @Test
  void testInternalServerError_Throwable() {
    // GIVEN - Throwable cause = new RuntimeException();
    // WHEN - InternalServerError exception = new InternalServerError(cause);
    // THEN - assertEquals(cause, exception.getCause());
    RuntimeException cause = new RuntimeException();
    InternalServerError exception = new InternalServerError(cause);
    assertEquals(cause, exception.getCause());
  }

  @Test
  void testInternalServerError_StringThrowable() {
    // GIVEN - String msg = "Test Message";
    //         Throwable cause = new RuntimeException();
    // WHEN - InternalServerError exception = new InternalServerError(msg, cause);
    // THEN - assertEquals("Test Message", exception.getMessage());
    //       assertEquals(cause, exception.getCause());
    String msg = "Test Message";
    RuntimeException cause = new RuntimeException();
    InternalServerError exception = new InternalServerError(msg, cause);
    assertEquals(msg, exception.getMessage());
    assertEquals(cause, exception.getCause());
  }


}
