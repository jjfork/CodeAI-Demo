package com.bestpractice.api.app.v1;

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

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class HelloControllerGeneratedAiTests {

    private HelloController controller;

    @BeforeEach
    void setUp() {
        controller = new HelloController();
    }

    @Test
    void sample1ReturnsCorrectMap() {
        // GIVEN
        // controller initialized in setUp

        // WHEN
        Map<String, String> result = controller.sample1();

        // THEN
        assertThat(result).isNotNull();
        assertThat(result).hasSize(1);
        assertThat(result).containsEntry("key", "Hello world.");
    }

    @Test
    void sample1ReturnsImmutableMap() {
        // GIVEN
        Map<String, String> result = controller.sample1();

        // WHEN
        // attempt to modify the map

        // THEN
        assertThatThrownBy(() -> result.put("another", "value"))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void sample1MapIsNotNull() {
        // GIVEN
        // controller set up

        // WHEN
        Map<String, String> result = controller.sample1();

        // THEN
        assertThat(result).isNotNull();
    }
}
