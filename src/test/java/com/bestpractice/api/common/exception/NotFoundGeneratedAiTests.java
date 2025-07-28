package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}