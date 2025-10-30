package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.common.exception.InternalServerError;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.UserRequest;
import com.bestpractice.api.domain.model.UserResponse;
import com.bestpractice.api.infrastrucuture.entity.User;
import com.bestpractice.api.infrastrucuture.persistent.UserPersistentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplGeneratedAiTests {

    @Mock
    private UserPersistentRepository userRepository;

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        reset(userRepository, encryptionComponent);
    }

    @Test
    void getUserById_shouldReturnUser_whenUserExists() {
        // GIVEN
        String userId = "123";
        User expectedUser = new User();
        when(userRepository.findById(userId)).thenReturn(expectedUser);

        // WHEN
        User actualUser = userService.getUserById(userId);

        // THEN
        assertEquals(expectedUser, actualUser);
    }

    @Test
    void getUserById_shouldReturnNull_whenUserDoesNotExist() {
        // GIVEN
        String userId = "notfound";
        when(userRepository.findById(userId)).thenReturn(null);

        // WHEN
        User actualUser = userService.getUserById(userId);

        // THEN
        assertEquals(null, actualUser);
    }

    @Test
    void getAuthenticatedUser_shouldReturnUser_whenCredentialsAreValid() {
        // GIVEN
        String email = "test@example.com";
        String rawPw = "password";
        User user = new User();
        user.setPassword("encodedPw");
        when(userRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(user.getPassword(), rawPw)).thenReturn(true);

        // WHEN
        User result = userService.getAuthenticatedUser(email, rawPw);

        // THEN
        assertEquals(user, result);
    }

    @Test
    void getAuthenticatedUser_shouldThrowUnAuthorized_whenUserNotFound() {
        // GIVEN
        String email = "notfound@example.com";
        String rawPw = "password";
        when(userRepository.findByEmail(email)).thenReturn(null);

        // WHEN & THEN
        assertThrows(UnAuthorized.class, () -> userService.getAuthenticatedUser(email, rawPw));
    }

    @Test
    void getAuthenticatedUser_shouldThrowUnAuthorized_whenPasswordDoesNotMatch() {
        // GIVEN
        String email = "test@example.com";
        String rawPw = "wrongpassword";
        User user = new User();
        user.setPassword("encodedPw");
        when(userRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(user.getPassword(), rawPw)).thenReturn(false);

        // WHEN & THEN
        assertThrows(UnAuthorized.class, () -> userService.getAuthenticatedUser(email, rawPw));
    }

    @Test
    void getAuthenticatedUser_shouldThrowInternalServerError_whenRepositoryThrowsException() {
        // GIVEN
        String email = "error@example.com";
        String rawPw = "password";
        when(userRepository.findByEmail(email)).thenThrow(new RuntimeException("DB error"));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> userService.getAuthenticatedUser(email, rawPw));
    }

    @Test
    void generateUser_shouldReturnUserResponse_whenInsertSucceeds() {
        // GIVEN
        UserRequest request = mock(UserRequest.class);
        String encPw = "encodedPw";
        String newId = "newId";
        User user = new User();
        user.setId(newId);
        user.setUsername("username");
        user.setEmail("email@example.com");

        when(encryptionComponent.encodePassword(request.getPassword())).thenReturn(encPw);
        when(userRepository.newId()).thenReturn(newId);
        when(request.convert(newId, encPw)).thenReturn(user);
        when(userRepository.insert(user)).thenReturn(user);

        // WHEN
        UserResponse response = userService.generateUser(request);

        // THEN
        assertEquals(newId, response.getId());
        assertEquals("username", response.getUsername());
        assertEquals("email@example.com", response.getEmail());
    }

    @Test
    void generateUser_shouldThrowConflict_whenRepositoryThrowsConflict() {
        // GIVEN
        UserRequest request = mock(UserRequest.class);
        String encPw = "encodedPw";
        String newId = "newId";
        User user = new User();

        when(encryptionComponent.encodePassword(request.getPassword())).thenReturn(encPw);
        when(userRepository.newId()).thenReturn(newId);
        when(request.convert(newId, encPw)).thenReturn(user);
        when(userRepository.insert(user)).thenThrow(new Conflict());

        // WHEN & THEN
        assertThrows(Conflict.class, () -> userService.generateUser(request));
    }

    @Test
    void generateUser_shouldThrowInternalServerError_whenRepositoryThrowsOtherException() {
        // GIVEN
        UserRequest request = mock(UserRequest.class);
        String encPw = "encodedPw";
        String newId = "newId";
        User user = new User();

        when(encryptionComponent.encodePassword(request.getPassword())).thenReturn(encPw);
        when(userRepository.newId()).thenReturn(newId);
        when(request.convert(newId, encPw)).thenReturn(user);
        when(userRepository.insert(user)).thenThrow(new RuntimeException());

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> userService.generateUser(request));
    }
}
