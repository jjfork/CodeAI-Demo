package com.bestpractice.api.common.exception;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InternalServerErrorGeneratedAiTests {

    @BeforeEach
    void setUp() {
        // No state to reset
    }

    @Test
    void testDefaultConstructor() {
        // GIVEN
        // WHEN
        InternalServerError exception = new InternalServerError();
        // THEN
        assertThat(exception.getMessage()).isNull();
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void testMessageConstructor() {
        // GIVEN
        String message = "Error occurred";
        // WHEN
        InternalServerError exception = new InternalServerError(message);
        // THEN
        assertThat(exception.getMessage()).isEqualTo(message);
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void testCauseConstructor() {
        // GIVEN
        Throwable cause = new RuntimeException("Root cause");
        // WHEN
        InternalServerError exception = new InternalServerError(cause);
        // THEN
        assertThat(exception.getMessage()).isEqualTo(cause.toString());
        assertThat(exception.getCause()).isEqualTo(cause);
    }

    @Test
    void testMessageAndCauseConstructor() {
        // GIVEN
        String message = "Composite error";
        Throwable cause = new IllegalArgumentException("Invalid argument");
        // WHEN
        InternalServerError exception = new InternalServerError(message, cause);
        // THEN
        assertThat(exception.getMessage()).isEqualTo(message);
        assertThat(exception.getCause()).isEqualTo(cause);
    }
}
