package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AuthServiceTests {

    private AuthService authService;

    @BeforeEach
    void setUp() {
        authService = new AuthService() {
            @Override
            public AuthResponse login(String email, String password) {
                return null;
            }

            @Override
            public AuthResponse login(String refreshToken) {
                return null;
            }
        };
    }

    @Test
    void testLogin() {
        // GIVEN
        String email = "test@example.com";
        String password = "password";
        // WHEN
        AuthResponse response = authService.login(email, password);
        // THEN
        assertNotNull(response);
    }

    @Test
    void testLoginWithRefreshToken() {
        // GIVEN
        String refreshToken = "some_refresh_token";
        // WHEN
        AuthResponse response = authService.login(refreshToken);
        // THEN
        assertNotNull(response);
    }
}
