package com.bestpractice.api.app.v1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.bestpractice.api.common.exception.BadRequest;
import com.bestpractice.api.domain.model.UserRequest;
import com.bestpractice.api.domain.model.UserResponse;
import com.bestpractice.api.domain.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit5.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserControllerGeneratedAiTests {

  private UserController userController;
  private UserService userService;

  @BeforeEach
  void setUp() {
    // Mocking the userService dependency
    userService = mock(UserService.class);
    userController = new UserController(userService);
  }

  @Test
  void createUser_validRequest_returnsCreatedUserResponse() {
    // GIVEN
    UserRequest request = new UserRequest("John Doe", "john.doe@example.com");
    // WHEN
    UserResponse response = userController.createUser(request, null);
    // THEN
    assertNotNull(response);
    assertEquals(UserResponse.class, response.getClass());
    verify(userService).generateUser(request);
  }

  @Test
  void createUser_invalidRequest_throwsBadRequestException() {
    // GIVEN
    UserRequest request = new UserRequest("", "");
    // WHEN
    // THEN
    BadRequest exception = assertThrows(BadRequest.class, () -> userController.createUser(request, null));
    assertEquals("User name cannot be empty", exception.getMessage());
    verify(userService, never()).generateUser(request);
  }
}
