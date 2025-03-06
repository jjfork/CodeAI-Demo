package com.bestpractice.api.domain.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.infrastrucuture.entity.User;
import com.bestpractice.api.infrastrucuture.persistent.UserPersistentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;


class AuthServiceImplTests {

    @Mock
    private UserPersistentRepository userPersistentRepository;

    @InjectMocks
    private AuthService authService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testLoginSuccess() {
        // GIVEN
        String email = "test@example.com";
        String password = "password";
        User user = new User("id", "username", email, password);
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);

        // WHEN
        AuthResponse authResponse = authService.login(email, password);

        // THEN
        assertNotNull(authResponse);
        assertEquals("Bearer", authResponse.getTokenType());
        assertNotNull(authResponse.getToken());
        assertNotNull(authResponse.getRefreshToken());
        assertNotNull(authResponse.getExpiresAt());
    }

    @Test
    void testLoginFailure() {
        // GIVEN
        String email = "test@example.com";
        String password = "password";
        when(userPersistentRepository.findByEmail(email)).thenReturn(null);

        // WHEN
        assertThrows(UnAuthorized.class, () -> authService.login(email, password));
    }


}