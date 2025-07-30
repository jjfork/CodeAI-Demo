package com.bestpractice.api.common.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceUnavailableGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testServiceUnavailable() {
    GIVEN("A new instance of ServiceUnavailable") WHEN(new ServiceUnavailable()) THEN(assertNotNull(it));
  }

  @Test
  void testServiceUnavailableString() {
    GIVEN("A message string") WHEN(new ServiceUnavailable("Test Message")) THEN(assertEquals("Test Message", it.getMessage()));
  }

  @Test
  void testServiceUnavailableThrowable() {
    GIVEN("A Throwable instance") WHEN(new ServiceUnavailable(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testServiceUnavailableStringThrowable() {
    GIVEN("A message string and a Throwable instance") 
      WHEN(new ServiceUnavailable("Test Message", new RuntimeException())) 
      THEN(assertEquals("Test Message", it.getMessage()));
    THEN(assertNotNull(it.getCause()));
  }
}