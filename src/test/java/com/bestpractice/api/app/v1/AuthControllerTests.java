package com.bestpractice.api.app.v1;

AuthByEmailRequest request = new AuthByEmailRequest("test@example.com", "password"); 

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
AuthByRefreshTokenRequest refreshTokenRequest = new AuthByRefreshTokenRequest("refreshToken");
AuthResponse response = new AuthResponse("token"); 
