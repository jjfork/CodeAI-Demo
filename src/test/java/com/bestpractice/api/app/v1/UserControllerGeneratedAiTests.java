package com.bestpractice.api.app.v1;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.common.exception.BadRequest;
import com.bestpractice.api.domain.model.UserRequest;
import com.bestpractice.api.domain.model.UserResponse;
import com.bestpractice.api.domain.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.validation.BindingResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class UserControllerGeneratedAiTests {

    private UserService userService;
    private UserController userController;
    private BindingResult bindingResult;

    @BeforeEach
    void setUp() {
        userService = Mockito.mock(UserService.class);
        bindingResult = Mockito.mock(BindingResult.class);
        userController = new UserController(userService);
    }

    @Test
    void givenValidRequest_whenCreateUser_thenReturnsUserResponse() {
        // GIVEN
        UserRequest request = new UserRequest();
        when(bindingResult.hasErrors()).thenReturn(false);
        UserResponse expectedResponse = new UserResponse("id123", "John", "Doe");
        when(userService.generateUser(request)).thenReturn(expectedResponse);

        // WHEN
        UserResponse actualResponse = userController.createUser(request, bindingResult);

        // THEN
        assertEquals(expectedResponse, actualResponse);
        verify(userService, times(1)).generateUser(request);
    }

    @Test
    void givenInvalidRequest_whenCreateUser_thenThrowsBadRequest() {
        // GIVEN
        UserRequest request = new UserRequest();
        when(bindingResult.hasErrors()).thenReturn(true);
        when(bindingResult.getObjectName()).thenReturn("userRequest");

        // WHEN & THEN
        assertThrows(BadRequest.class, () -> userController.createUser(request, bindingResult));
        verify(userService, never()).generateUser(any());
    }
}
