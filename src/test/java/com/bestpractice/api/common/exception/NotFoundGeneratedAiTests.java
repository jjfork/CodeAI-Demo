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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class NotFoundGeneratedAiTests {

    @BeforeEach
    void resetState() {
        // No mutable state to reset for NotFound
    }

    @Test
    void defaultConstructorShouldCreateExceptionWithNoMessage() {
        // GIVEN
        // WHEN
        NotFound exception = new NotFound();
        // THEN
        assertThat(exception).isInstanceOf(RuntimeException.class);
        assertThat(exception.getMessage()).isNull();
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void messageConstructorShouldSetMessageCorrectly() {
        // GIVEN
        String expectedMessage = "Resource not found";
        // WHEN
        NotFound exception = new NotFound(expectedMessage);
        // THEN
        assertThat(exception.getMessage()).isEqualTo(expectedMessage);
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void messageConstructorWithNullShouldSetMessageNull() {
        // GIVEN
        String nullMessage = null;
        // WHEN
        NotFound exception = new NotFound(nullMessage);
        // THEN
        assertThat(exception.getMessage()).isNull();
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void messageConstructorWithEmptyStringShouldSetEmptyMessage() {
        // GIVEN
        String emptyMessage = "";
        // WHEN
        NotFound exception = new NotFound(emptyMessage);
        // THEN
        assertThat(exception.getMessage()).isEqualTo(emptyMessage);
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void messageConstructorWithWhitespaceShouldSetWhitespaceMessage() {
        // GIVEN
        String whitespaceMessage = "   ";
        // WHEN
        NotFound exception = new NotFound(whitespaceMessage);
        // THEN
        assertThat(exception.getMessage()).isEqualTo(whitespaceMessage);
        assertThat(exception.getCause()).isNull();
    }

    @Test
    void causeConstructorShouldSetCauseCorrectly() {
        // GIVEN
        Throwable cause = new IllegalArgumentException("Invalid argument");
        // WHEN
        NotFound exception = new NotFound(cause);
        // THEN
        assertThat(exception.getCause()).isSameAs(cause);
        assertThat(exception.getMessage()).isEqualTo(cause.toString());
    }

    @Test
    void messageAndCauseConstructorShouldSetBothMessageAndCause() {
        // GIVEN
        String expectedMessage = "Item missing";
        Throwable cause = new NullPointerException("Null value");
        // WHEN
        NotFound exception = new NotFound(expectedMessage, cause);
        // THEN
        assertThat(exception.getMessage()).isEqualTo(expectedMessage);
        assertThat(exception.getCause()).isSameAs(cause);
    }
}
