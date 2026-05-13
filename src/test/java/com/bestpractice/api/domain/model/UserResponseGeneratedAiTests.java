package com.bestpractice.api.domain.model;

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

public class UserResponseGeneratedAiTests {

    private UserResponse userResponse;

    @BeforeEach
    void setUp() {
        userResponse = new UserResponse("123", "john_doe", "john@example.com");
    }

    @Test
    void testGetId() {
        // GIVEN
        // WHEN
        String id = userResponse.getId();
        // THEN
        assertThat(id).isEqualTo("123");
    }

    @Test
    void testGetUsername() {
        // GIVEN
        // WHEN
        String username = userResponse.getUsername();
        // THEN
        assertThat(username).isEqualTo("john_doe");
    }
