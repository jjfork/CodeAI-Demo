package com.bestpractice.api.app.v1;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import java.util.Map;

class HelloControllerGeneratedAiTests {

    private HelloController helloController;

    @BeforeEach
    void setUp() {
        // GIVEN: a fresh instance of HelloController before each test
        helloController = new HelloController();
    }

    @Test
    void sample1_ShouldReturnMapWithHelloWorldMessage() {
        // GIVEN: the controller is initialized (handled in @BeforeEach)

        // WHEN: the sample1 endpoint method is invoked
        Map<String, String> result = helloController.sample1();

        // THEN: the result contains exactly one entry with key "key" and value "Hello world."
        Assertions.assertThat(result)
                .isNotNull()
                .hasSize(1)
                .containsEntry("key", "Hello world.");
    }
}
