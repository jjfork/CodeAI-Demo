package com.bestpractice.api.app;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.common.util.Util;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.RequestInfoComponent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class InterceptorControllerGeneratedAiTests {

    private AuthComponent authComponent;
    private RequestInfoComponent requestInfo;
    private InterceptorController interceptorController;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private DecodedJWT decodedJWT;

    @BeforeEach
    void setUp() {
        authComponent = mock(AuthComponent.class);
        requestInfo = new RequestInfoComponent();
        interceptorController = new InterceptorController(authComponent, requestInfo);
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        decodedJWT = mock(DecodedJWT.class);
    }

    @Test
    void givenValidBearerToken_whenPreHandle_thenReturnsTrue() throws IOException {
        // GIVEN
        when(request.getRequestURI()).thenReturn("/api/v1/data");
        when(request.getMethod()).thenReturn("GET");
        try (MockedStatic<Util> utilMock = mockStatic(Util.class)) {
            utilMock.when(Util::getSpringProfileActive).thenReturn(Collections.singletonList("prod"));
            Enumeration<String> headers = Collections.enumeration(Collections.singletonList("Bearer validtoken"));
            when(request.getHeaders("Authorization")).thenReturn(headers);
            when(authComponent.decodeJwt("validtoken")).thenReturn(decodedJWT);
            when(decodedJWT.getSubject()).thenReturn("user123");
            Claim emailClaim = mock(Claim.class);
            when(emailClaim.asString()).thenReturn("user@example.com");
            when(decodedJWT.getClaim(AuthComponent.ClaimUserEmailKey)).thenReturn(emailClaim);
            Claim refreshClaim = mock(Claim.class);
            when(refreshClaim.asBoolean()).thenReturn(true);
            when(decodedJWT.getClaim(AuthComponent.ClaimRefreshKey)).thenReturn(refreshClaim);

            // WHEN
            boolean result = interceptorController.preHandle(request, response, new Object());

            // THEN
            assertTrue(result);
            assertEquals("user123", requestInfo.getUserId());
            assertEquals("user@example.com", requestInfo.getUserEmail());
            assertTrue(requestInfo.isRefreshToken());
        }
    }

    @Test
    void givenNoAuthorizationHeader_whenPreHandle_thenThrowsUnAuthorized() {
        // GIVEN
        when(request.getRequestURI()).thenReturn("/api/v1/data");
        when(request.getMethod()).thenReturn("GET");
        try (MockedStatic<Util> utilMock = mockStatic(Util.class)) {
            utilMock.when(Util::getSpringProfileActive).thenReturn(Collections.singletonList("prod"));
            when(request.getHeaders("Authorization")).thenReturn(Collections.emptyEnumeration());

            // WHEN & THEN
            assertThrows(UnAuthorized.class, () -> interceptorController.preHandle(request, response, new Object()));
        }
    }

    @Test
    void givenNonBearerAuthorizationHeader_whenPreHandle_thenThrowsUnAuthorized() {
        // GIVEN
        when(request.getRequestURI()).thenReturn("/api/v1/data");
        when(request.getMethod()).thenReturn("GET");
        try (MockedStatic<Util> utilMock = mockStatic(Util.class)) {
            utilMock.when(Util::getSpringProfileActive).thenReturn(Collections.singletonList("prod"));
            Enumeration<String> headers = Collections.enumeration(Collections.singletonList("Token sometoken"));
            when(request.getHeaders("Authorization")).thenReturn(headers);

            // WHEN & THEN
            assertThrows(UnAuthorized.class, () -> interceptorController.preHandle(request, response, new Object()));
        }
    }

    @Test
    void givenLocalProfile_whenPreHandle_thenSkipsAuthAndReturnsTrue() throws IOException {
        // GIVEN
        when(request.getRequestURI()).thenReturn("/api/v1/data");
        when(request.getMethod()).thenReturn("GET");
        try (MockedStatic<Util> utilMock = mockStatic(Util.class)) {
            utilMock.when(Util::getSpringProfileActive).thenReturn(Collections.singletonList("local"));

            // WHEN
            boolean result = interceptorController.preHandle(request, response, new Object());

            // THEN
            assertTrue(result);
            assertNull(requestInfo.getUserId());
        }
    }

    @Test
    void givenErrorPath_whenPreHandle_thenReturnsFalse() throws IOException {
        // GIVEN
        when(request.getRequestURI()).thenReturn("error");
        when(request.getMethod()).thenReturn("GET");

        // WHEN
        boolean result = interceptorController.preHandle(request, response, new Object());

        // THEN
        assertFalse(result);
    }

    @Test
    void givenPostHandle_whenCalled_thenNoException() {
        // GIVEN
        // WHEN
        interceptorController.postHandle(request, response, new Object(), new ModelAndView());

        // THEN
        assertTrue(true);
    }

    @Test
    void givenAfterCompletion_whenCalled_thenNoException() {
        // GIVEN
        // WHEN
        interceptorController.afterCompletion(request, response, new Object(), null);

        // THEN
        assertTrue(true);
    }
}
