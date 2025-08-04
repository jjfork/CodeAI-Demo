package com.bestpractice.api.app.v1;

    @Test

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
    void testLoginWithEmailSuccess() throws Exception {
        // GIVEN
        AuthByEmailRequest request = new AuthByEmailRequest();
        request.setEmail("test@example.com");
        request.setPassword("password123");
        AuthResponse expectedResponse = new AuthResponse("token_value");

        when(authService.login(request.getEmail(), request.getPassword())).thenReturn(expectedResponse);

        // WHEN
        mockMvc.perform(post("/api/v1/auth/email-login")
                .contentType("application/json")
                .content("{\"email\":\"test@example.com\",\"password\":\"password123\"}"))
                .andExpect(status().isOk());

        // THEN
        // Assertions can be added here based on the expected response
    }

    @Test
    void testLoginWithEmailBadRequest() throws Exception {
        // GIVEN
        AuthByEmailRequest request = new AuthByEmailRequest();
        request.setEmail("invalid_email");
        request.setPassword("password123");
        when(authService.login(request.getEmail(), request.getPassword())).thenThrow(new BadRequest("Invalid email format"));

        // WHEN
        mockMvc.perform(post("/api/v1/auth/email-login")
                .contentType("application/json")
                .content("{\"email\":\"invalid_email\",\"password\":\"password123\"}"))
                .andExpect(status().isBadRequest());

        // THEN
        // Assertions can be added here based on the expected error response
    }

    @Test
    void testLoginWithRefreshTokenSuccess() throws Exception {
        // GIVEN
        AuthByRefreshTokenRequest request = new AuthByRefreshTokenRequest();
        request.setRefreshToken("refreshToken_value");
        AuthResponse expectedResponse = new AuthResponse("new_token_value");
        expectedResponse.setToken("new_token_value"); 

        when(authService.login(request.getRefreshToken())).thenReturn(expectedResponse);

        // WHEN
        mockMvc.perform(post("/api/v1/auth/refreshtoken-login")
                .contentType("application/json")
                .content("{\"refreshToken\":\"refreshToken_value\"}"))
                .andExpect(status().isOk());

        // THEN
        // Assertions can be added here based on the expected response
    }


    @Test
    void testLoginWithRefreshTokenBadRequest() throws Exception {
        // GIVEN
        AuthByRefreshTokenRequest request = new AuthByRefreshTokenRequest();
        request.setRefreshToken("invalid_refreshToken");

        when(authService.login(request.getRefreshToken())).thenThrow(new BadRequest("Invalid refresh token"));

        // WHEN
        mockMvc.perform(post("/api/v1/auth/refreshtoken-login")
                .contentType("application/json")
                .content("{\"refreshToken\":\"invalid_refreshToken\"}"))
                .andExpect(status().isBadRequest());

        // THEN
        // Assertions can be added here based on the expected error response
    }



    @AfterEach
    void tearDown() {
        // Clean up any resources used in the test
    }

    @AfterAll
    static void afterAll() {
        // Perform any final cleanup tasks
    }

    @BeforeAll
    static void beforeAll() {
        // Initialize any shared resources or configurations
    }
}
