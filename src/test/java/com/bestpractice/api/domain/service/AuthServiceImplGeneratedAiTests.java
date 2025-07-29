package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.model.Credential;
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
import static org.mockito.Mockito.*;

class AuthServiceImplGeneratedAiTests {

    @InjectMocks
    private AuthServiceImpl authServiceImpl;

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @Mock
    private AuthComponent authComponent;

    @Mock
    private UserPersistentRepository userPersistentRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void login_ValidCredentials_ReturnsAuthResponse() {
        // GIVEN
        String email = "test@example.com";
        String password = "password123";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(true);
        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken = new Credential("Bearer", "refreshToken", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);

        // WHEN
        AuthResponse response = authServiceImpl.login(email, password);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken", response.getRefreshToken());
    }


    @Test
    void login_InvalidCredentials_ThrowsUnAuthorizedException() {
        // GIVEN
        String email = "test@example.com";
        String password = "wrongPassword";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(false);

        // WHEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));

    }


    @Test
    void login_RefreshToken_ReturnsAuthResponse() {
        // GIVEN
        String refreshToken = "refreshToken";
        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(authComponent.decodeJwt(refreshToken)).thenReturn(decodedJWT);
        String email = "test@example.com";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);

        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken2 = new Credential("Bearer", "refreshToken2", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);


        // WHEN
        AuthResponse response = authServiceImpl.login(refreshToken);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken2", response.getRefreshToken());
    }
```java
package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.model.Credential;
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
import static org.mockito.Mockito.*;

class AuthServiceImplGeneratedAiTests {

    @InjectMocks
    private AuthServiceImpl authServiceImpl;

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @Mock
    private AuthComponent authComponent;

    @Mock
    private UserPersistentRepository userPersistentRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void login_ValidCredentials_ReturnsAuthResponse() {
        // GIVEN
        String email = "test@example.com";
        String password = "password123";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(true);
        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken = new Credential("Bearer", "refreshToken", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);

        // WHEN
        AuthResponse response = authServiceImpl.login(email, password);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken", response.getRefreshToken());
    }


    @Test
    void login_InvalidCredentials_ThrowsUnAuthorizedException() {
        // GIVEN
        String email = "test@example.com";
        String password = "wrongPassword";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(false);

        // WHEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));

    }


    @Test
    void login_RefreshToken_ReturnsAuthResponse() {
        // GIVEN
        String refreshToken = "refreshToken";
        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(authComponent.decodeJwt(refreshToken)).thenReturn(decodedJWT);
        String email = "test@example.com";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);

        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken2 = new Credential("Bearer", "refreshToken2", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);


        // WHEN
        AuthResponse response = authServiceImpl.login(refreshToken);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken2", response.getRefreshToken());
    }
```java
package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.model.Credential;
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
import static org.mockito.Mockito.*;

class AuthServiceImplGeneratedAiTests {

    @InjectMocks
    private AuthServiceImpl authServiceImpl;

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @Mock
    private AuthComponent authComponent;

    @Mock
    private UserPersistentRepository userPersistentRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void login_ValidCredentials_ReturnsAuthResponse() {
        // GIVEN
        String email = "test@example.com";
        String password = "password123";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(true);
        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken = new Credential("Bearer", "refreshToken", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);

        // WHEN
        AuthResponse response = authServiceImpl.login(email, password);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken", response.getRefreshToken());
    }


    @Test
    void login_InvalidCredentials_ThrowsUnAuthorizedException() {
        // GIVEN
        String email = "test@example.com";
        String password = "wrongPassword";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(false);

        // WHEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));

    }


    @Test
    void login_RefreshToken_ReturnsAuthResponse() {
        // GIVEN
        String refreshToken = "refreshToken";
        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(authComponent.decodeJwt(refreshToken)).thenReturn(decodedJWT);
        String email = "test@example.com";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);

        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken2 = new Credential("Bearer", "refreshToken2", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);


        // WHEN
        AuthResponse response = authServiceImpl.login(refreshToken);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken2", response.getRefreshToken());
    }
```java
package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.model.Credential;
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
import static org.mockito.Mockito.*;

class AuthServiceImplGeneratedAiTests {

    @InjectMocks
    private AuthServiceImpl authServiceImpl;

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @Mock
    private AuthComponent authComponent;

    @Mock
    private UserPersistentRepository userPersistentRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void login_ValidCredentials_ReturnsAuthResponse() {
        // GIVEN
        String email = "test@example.com";
        String password = "password123";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(true);
        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken = new Credential("Bearer", "refreshToken", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);

        // WHEN
        AuthResponse response = authServiceImpl.login(email, password);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken", response.getRefreshToken());
    }


    @Test
    void login_InvalidCredentials_ThrowsUnAuthorizedException() {
        // GIVEN
        String email = "test@example.com";
        String password = "wrongPassword";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(false);

        // WHEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));

    }


    @Test
    void login_RefreshToken_ReturnsAuthResponse() {
        // GIVEN
        String refreshToken = "refreshToken";
        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(authComponent.decodeJwt(refreshToken)).thenReturn(decodedJWT);
        String email = "test@example.com";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);

        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken2 = new Credential("Bearer", "refreshToken2", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);


        // WHEN
        AuthResponse response = authServiceImpl.login(refreshToken);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken2", response.getRefreshToken());
    }
```java
package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.model.Credential;
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
import static org.mockito.Mockito.*;

class AuthServiceImplGeneratedAiTests {

    @InjectMocks
    private AuthServiceImpl authServiceImpl;

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @Mock
    private AuthComponent authComponent;

    @Mock
    private UserPersistentRepository userPersistentRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void login_ValidCredentials_ReturnsAuthResponse() {
        // GIVEN
        String email = "test@example.com";
        String password = "password123";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(true);
        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken = new Credential("Bearer", "refreshToken", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);

        // WHEN
        AuthResponse response = authServiceImpl.login(email, password);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken", response.getRefreshToken());
    }


    @Test
    void login_InvalidCredentials_ThrowsUnAuthorizedException() {
        // GIVEN
        String email = "test@example.com";
        String password = "wrongPassword";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(false);

        // WHEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));

    }


    @Test
    void login_RefreshToken_ReturnsAuthResponse() {
        // GIVEN
        String refreshToken = "refreshToken";
        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(authComponent.decodeJwt(refreshToken)).thenReturn(decodedJWT);
        String email = "test@example.com";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);

        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken2 = new Credential("Bearer", "refreshToken2", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);


        // WHEN
        AuthResponse response = authServiceImpl.login(refreshToken);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken2", response.getRefreshToken());
    }
```java
package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.model.Credential;
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
import static org.mockito.Mockito.*;

class AuthServiceImplGeneratedAiTests {

    @InjectMocks
    private AuthServiceImpl authServiceImpl;

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @Mock
    private AuthComponent authComponent;

    @Mock
    private UserPersistentRepository userPersistentRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void login_ValidCredentials_ReturnsAuthResponse() {
        // GIVEN
        String email = "test@example.com";
        String password = "password123";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(true);
        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken = new Credential("Bearer", "refreshToken", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);

        // WHEN
        AuthResponse response = authServiceImpl.login(email, password);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken", response.getRefreshToken());
    }


    @Test
    void login_InvalidCredentials_ThrowsUnAuthorizedException() {
        // GIVEN
        String email = "test@example.com";
        String password = "wrongPassword";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(false);

        // WHEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));

    }


    @Test
    void login_RefreshToken_ReturnsAuthResponse() {
        // GIVEN
        String refreshToken = "refreshToken";
        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(authComponent.decodeJwt(refreshToken)).thenReturn(decodedJWT);
        String email = "test@example.com";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);

        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken2 = new Credential("Bearer", "refreshToken2", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);


        // WHEN
        AuthResponse response = authServiceImpl.login(refreshToken);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken2", response.getRefreshToken());
    }
```java
package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.model.Credential;
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
import static org.mockito.Mockito.*;

class AuthServiceImplGeneratedAiTests {

    @InjectMocks
    private AuthServiceImpl authServiceImpl;

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @Mock
    private AuthComponent authComponent;

    @Mock
    private UserPersistentRepository userPersistentRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void login_ValidCredentials_ReturnsAuthResponse() {
        // GIVEN
        String email = "test@example.com";
        String password = "password123";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(true);
        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken = new Credential("Bearer", "refreshToken", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);

        // WHEN
        AuthResponse response = authServiceImpl.login(email, password);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken", response.getRefreshToken());
    }


    @Test
    void login_InvalidCredentials_ThrowsUnAuthorizedException() {
        // GIVEN
        String email = "test@example.com";
        String password = "wrongPassword";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(false);

        // WHEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));

    }


    @Test
    void login_RefreshToken_ReturnsAuthResponse() {
        // GIVEN
        String refreshToken = "refreshToken";
        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(authComponent.decodeJwt(refreshToken)).thenReturn(decodedJWT);
        String email = "test@example.com";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);

        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken2 = new Credential("Bearer", "refreshToken2", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);


        // WHEN
        AuthResponse response = authServiceImpl.login(refreshToken);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken2", response.getRefreshToken());
    }
```java
package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.model.Credential;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AuthServiceImplGeneratedAiTests {

    @InjectMocks
    private AuthServiceImpl authServiceImpl;

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @Mock
    private AuthComponent authComponent;

    @Mock
    private UserPersistentRepository userPersistentRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void login_ValidCredentials_ReturnsAuthResponse() {
        // GIVEN
        String email = "test@example.com";
        String password = "password123";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(true);
        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken = new Credential("Bearer", "refreshToken", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);

        // WHEN
        AuthResponse response = authServiceImpl.login(email, password);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken", response.getRefreshToken());
    }


    @Test
    void login_InvalidCredentials_ThrowsUnAuthorizedException() {
        // GIVEN
        String email = "test@example.com";
        String password = "wrongPassword";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(false);

        // WHEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));

    }


    @Test
    void login_RefreshToken_ReturnsAuthResponse() {
        // GIVEN
        String refreshToken = "refreshToken";
        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(authComponent.decodeJwt(refreshToken)).thenReturn(decodedJWT);
        String email = "test@example.com";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);

        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken2 = new Credential("Bearer", "refreshToken2", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);


        // WHEN
        AuthResponse response = authServiceImpl.login(refreshToken);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken2",```java
package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.model.Credential;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AuthServiceImplGeneratedAiTests {

    @InjectMocks
    private AuthServiceImpl authServiceImpl;

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @Mock
    private AuthComponent authComponent;

    @Mock
    private UserPersistentRepository userPersistentRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void login_ValidCredentials_ReturnsAuthResponse() {
        // GIVEN
        String email = "test@example.com";
        String password = "password123";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(true);
        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken = new Credential("Bearer", "refreshToken", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);

        // WHEN
        AuthResponse response = authServiceImpl.login(email, password);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken", response.getRefreshToken());
    }


    @Test
    void login_InvalidCredentials_ThrowsUnAuthorizedException() {
        // GIVEN
        String email = "test@example.com";
        String password = "wrongPassword";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(false);

        // WHEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));

    }


    @Test
    void login_RefreshToken_ReturnsAuthResponse() {
        // GIVEN
        String refreshToken = "refreshToken";
        DecodedJWT decodedJWT = mock(DecodedJWT.class);
        when(authComponent.decodeJwt(refreshToken)).thenReturn(decodedJWT);
        String email = "test@example.com";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);

        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken2 = new Credential("Bearer", "refreshToken2", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);


        // WHEN
        AuthResponse response = authServiceImpl.login(refreshToken);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken2",```java
package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.BCryptPasswordEncryptionComponent;
import com.bestpractice.api.domain.model.AuthResponse;
import com.bestpractice.api.domain.model.Credential;
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
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AuthServiceImplGeneratedAiTests {

    @InjectMocks
    private AuthServiceImpl authServiceImpl;

    @Mock
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @Mock
    private AuthComponent authComponent;

    @Mock
    private UserPersistentRepository userPersistentRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void login_ValidCredentials_ReturnsAuthResponse() {
        // GIVEN
        String email = "test@example.com";
        String password = "password123";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(true);
        Credential token = new Credential("Bearer", "jwtToken", false, new Date());
        Credential refreshToken = new Credential("Bearer", "refreshToken", true, new Date());
        when(authComponent.generateJwt(anyString(), anyString(), anyBoolean())).thenReturn(token);

        // WHEN
        AuthResponse response = authServiceImpl.login(email, password);

        // THEN
        assertNotNull(response);
        assertEquals("jwtToken", response.getToken());
        assertEquals("refreshToken", response.getRefreshToken());
    }


    @Test
    void login_InvalidCredentials_ThrowsUnAuthorizedException() {
        // GIVEN
        String email = "test@example.com";
        String password = "wrongPassword";
        User user = new User("user1", "testUsername", email, "hashedPassword");
        when(userPersistentRepository.findByEmail(email)).thenReturn(user);
        when(encryptionComponent.matchedPassword(password, user.getPassword())).thenReturn(false);

        // WHEN
        assertThrows(UnAuthorized.class, () -> authServiceImpl.login(email, password));

    }