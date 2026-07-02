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

public class BadRequestGeneratedAiTests {

    private BadRequest exception;

    @BeforeEach
    void setUp() {
        // No shared state to reset, but method included for completeness
    }

    @Test
    void testDefaultConstructor() {
        // GIVEN
        // No preconditions needed

        // WHEN
        exception = new BadRequest();

        // THEN
        assertThat(exception).isInstanceOf(RuntimeException.class);
        assertThat(exception.getMessage()).isNull();
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void testConstructorWithMessage() {
        // GIVEN
        String message = "Invalid request";

        // WHEN
        exception = new BadRequest(message);

        // THEN
        assertThat(exception).isInstanceOf(RuntimeException.class);
        assertThat(exception.getMessage()).isEqualTo(message);
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void testConstructorWithCause() {
        // GIVEN
        Throwable cause = new IllegalArgumentException("Bad argument");

        // WHEN
        exception = new BadRequest(cause);

        // THEN
        assertThat(exception).isInstanceOf(RuntimeException.class);
        assertThat(exception.getMessage()).isEqualTo(cause.toString());
        assertThat(exception.getCause()).isEqualTo(cause);
    }

    @Test
    void testConstructorWithMessageAndCause() {
        // GIVEN
        String message = "Invalid request";
        Throwable cause = new IllegalArgumentException("Bad argument");

        // WHEN
        exception = new BadRequest(message, cause);

        // THEN
        assertThat(exception).isInstanceOf(RuntimeException.class);
        assertThat(exception.getMessage()).isEqualTo(message);
        assertThat(exception.getCause()).isEqualTo(cause);
    }

    @Test
    void testConstructorWithNullMessage() {
        // GIVEN
        String message = null;

        // WHEN
        exception = new BadRequest(message);

        // THEN
        assertThat(exception).isInstanceOf(RuntimeException.class);
        assertThat(exception.getMessage()).isNull();
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void testConstructorWithEmptyMessage() {
        // GIVEN
        String message = "";

        // WHEN
        exception = new BadRequest(message);

        // THEN
        assertThat(exception).isInstanceOf(RuntimeException.class);
        assertThat(exception.getMessage()).isEqualTo(message);
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void testConstructorWithWhitespaceMessage() {
        // GIVEN
        String message = "   ";

        // WHEN
        exception = new BadRequest(message);

        // THEN
        assertThat(exception).isInstanceOf(RuntimeException.class);
        assertThat(exception.getMessage()).isEqualTo(message);
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void testConstructorWithNullCause() {
        // GIVEN
        Throwable cause = null;

        // WHEN
        exception = new BadRequest(cause);

        // THEN
        assertThat(exception).isInstanceOf(RuntimeException.class);
        assertThat(exception.getMessage()).isNull();
        assertThat(exception.getCause()).isNull();
    }
}
