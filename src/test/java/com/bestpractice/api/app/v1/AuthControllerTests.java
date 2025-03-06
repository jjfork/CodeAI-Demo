package com.bestpractice.api.app.v1;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import com.bestpractice.api.domain.model.AuthByEmailRequest;
import com.bestpractice.api.domain.model.AuthResponse;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

@WebMvcTest(AuthController.class)
public class AuthControllerTests {

    // ... (Your existing test setup)

    @Test
    void testLoginWithEmailSuccess() throws Exception {
        // ... (Your existing test setup)

        AuthResponse expectedResponse = new AuthResponse("token", "user"); 
        when(authService.loginWithEmail(any(AuthByEmailRequest.class))).thenReturn(expectedResponse);

        mockMvc.perform(post("/auth/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"email\":\"test@example.com\",\"password\":\"securePassword\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.token", is("token")))
                .andExpect(jsonPath("$.user", is("user")));

        // ... (Your existing assertions)
    }
}
