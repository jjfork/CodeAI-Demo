package com.bestpractice.api.common.exception;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class NotFoundGeneratedAiTests {

    @BeforeEach
    void setUp() {
        // No state to reset
    }

    @Test
    void testDefaultConstructor() {
        // GIVEN
        // WHEN
        NotFound exception = new NotFound();
        // THEN
        assertThat(exception).isNotNull();
        assertThat(exception.getMessage()).isNull();
    }

    @Test
    void testMessageConstructor() {
        // GIVEN
        String message = "Resource not found";
        // WHEN
        NotFound exception = new NotFound(message);
        // THEN
        assertThat(exception).isNotNull();
        assertThat(exception.getMessage()).isEqualTo(message);
    }

    @Test
    void testCauseConstructor() {
        // GIVEN
        Throwable cause = new IllegalArgumentException("Invalid argument");
        // WHEN
        NotFound exception = new NotFound(cause);
        // THEN
        assertThat(exception).isNotNull();
        assertThat(exception.getCause()).isEqualTo(cause);
        assertThat(exception.getMessage()).isEqualTo(cause.toString());
    }
