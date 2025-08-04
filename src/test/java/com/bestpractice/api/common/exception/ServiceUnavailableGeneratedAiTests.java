package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
    GIVEN("A new instance of ServiceUnavailable") WHEN(new ServiceUnavailable()) THEN("The constructor should not throw an exception");
  }

  @Test
  void testServiceUnavailableWithMessage() {
    GIVEN("A message string") WHEN(new ServiceUnavailable("Error message")) THEN("The constructor with message should create a ServiceUnavailable exception with the provided message");
  }

  @Test
  void testServiceUnavailableWithCause() {
    GIVEN("A Throwable cause") WHEN(new ServiceUnavailable(new RuntimeException())) THEN("The constructor with cause should create a ServiceUnavailable exception with the provided cause");
  }

  @Test
  void testServiceUnavailableWithMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new ServiceUnavailable("Error message", new RuntimeException())) THEN("The constructor with message and cause should create a ServiceUnavailable exception with the provided message and cause");
  }

}