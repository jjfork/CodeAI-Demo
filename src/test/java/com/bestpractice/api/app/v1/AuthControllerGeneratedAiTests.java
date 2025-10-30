package com.bestpractice.api.app.v1;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.common.exception.BadRequest;
import com.bestpractice.api.domain.model.AuthByEmailRequest;
import com.bestpractice.api.domain.model.AuthByRefreshTokenRequest;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.service.AuthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class AuthControllerGeneratedAiTests {

    private AuthService authService;
    private AuthController authController;

    @BeforeEach
    public void setUp() {
        authService = Mockito.mock(AuthService.class);
        authController = new AuthController(authService);
    }

    @Test
    public void givenOptionsRequest_whenOptionsAuth_thenReturnsAllowedHeaders() {
        // GIVEN
        // No special setup required

        // WHEN
        ResponseEntity<Object> response = authController.optionsAuth();

        // THEN
        assertEquals("POST,OPTIONS", response.getHeaders().getFirst("Allow"));
        assertEquals("*", response.getHeaders().getFirst("Access-Control-Allow-Origin"));
    }

    @Test
    public void givenValidEmailRequest_whenLogin_thenReturnsAuthResponse() {
        // GIVEN
        AuthByEmailRequest request = new AuthByEmailRequest();
        request.setEmail("test@example.com");
        request.setPassword("password");
        BindingResult bindingResult = mock(BindingResult.class);
        when(bindingResult.hasErrors()).thenReturn(false);
        AuthResponse expectedResponse = new AuthResponse("token123", "refreshToken123", "userId123", new Date());
        when(authService.login("test@example.com", "password")).thenReturn(expectedResponse);

        // WHEN
        AuthResponse actualResponse = authController.login(request, bindingResult);

        // THEN
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void givenInvalidEmailRequest_whenLogin_thenThrowsBadRequest() {
        // GIVEN
        AuthByEmailRequest request = new AuthByEmailRequest();
        BindingResult bindingResult = mock(BindingResult.class);
        when(bindingResult.hasErrors()).thenReturn(true);
        when(bindingResult.getObjectName()).thenReturn("authByEmailRequest");

        // WHEN & THEN
        assertThrows(BadRequest.class, () -> authController.login(request, bindingResult));
    }

    @Test
    public void givenAuthServiceThrowsException_whenEmailLogin_thenPropagatesException() {
        // GIVEN
        AuthByEmailRequest request = new AuthByEmailRequest();
        request.setEmail("test@example.com");
        request.setPassword("password");
        BindingResult bindingResult = mock(BindingResult.class);
        when(bindingResult.hasErrors()).thenReturn(false);
        when(authService.login("test@example.com", "password")).thenThrow(new RuntimeException("Service error"));

        // WHEN & THEN
        assertThrows(RuntimeException.class, () -> authController.login(request, bindingResult));
    }

    @Test
    public void givenValidRefreshTokenRequest_whenLogin_thenReturnsAuthResponse() {
        // GIVEN
        AuthByRefreshTokenRequest request = new AuthByRefreshTokenRequest();
        request.setRefreshToken("refresh-token");
        BindingResult bindingResult = mock(BindingResult.class);
        when(bindingResult.hasErrors()).thenReturn(false);
        AuthResponse expectedResponse = new AuthResponse("token456", "refreshToken456", "userId456", new Date());
        when(authService.login("refresh-token")).thenReturn(expectedResponse);

        // WHEN
        AuthResponse actualResponse = authController.login(request, bindingResult);

        // THEN
        assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void givenInvalidRefreshTokenRequest_whenLogin_thenThrowsBadRequest() {
        // GIVEN
        AuthByRefreshTokenRequest request = new AuthByRefreshTokenRequest();
        BindingResult bindingResult = mock(BindingResult.class);
        when(bindingResult.hasErrors()).thenReturn(true);
        when(bindingResult.getObjectName()).thenReturn("authByRefreshTokenRequest");

        // WHEN & THEN
        assertThrows(BadRequest.class, () -> authController.login(request, bindingResult));
    }

    @Test
    public void givenAuthServiceThrowsException_whenRefreshTokenLogin_thenPropagatesException() {
        // GIVEN
        AuthByRefreshTokenRequest request = new AuthByRefreshTokenRequest();
        request.setRefreshToken("refresh-token");
        BindingResult bindingResult = mock(BindingResult.class);
        when(bindingResult.hasErrors()).thenReturn(false);
        when(authService.login("refresh-token")).thenThrow(new RuntimeException("Service error"));

        // WHEN & THEN
        assertThrows(RuntimeException.class, () -> authController.login(request, bindingResult));
    }
}
