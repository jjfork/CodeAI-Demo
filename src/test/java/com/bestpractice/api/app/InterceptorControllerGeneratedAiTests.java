package com.bestpractice.api.app;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.common.util.Util;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.RequestInfoComponent;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class InterceptorController implements HandlerInterceptor {
  private final Logger logger = LoggerFactory.getLogger(InterceptorController.class);

  private static final String SPRING_ERROR_PATH = "error";
  private static final List<String> DISABLE_AUTH_ENDPOINTS = List.of("/api/v1/user", "/api/v1/auth");

  private final AuthComponent authComponent;
  private final RequestInfoComponent requestInfo;

  public InterceptorController(AuthComponent authComponent, RequestInfoComponent requestInfo) {
    this.authComponent = authComponent;
    this.requestInfo = requestInfo;
  }

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
    this.requestInfo.setRequestId(UUID.randomUUID().toString());
    this.requestInfo.setPath(request.getRequestURI());
    this.requestInfo.setHttpMethod(request.getMethod());

    StringBuilder accessLogBuilder = new StringBuilder();
    accessLogBuilder.append("AUDIT ").append("RequestId: ").append(this.requestInfo.getRequestId()).append(", Path: ").append(this.requestInfo.getPath()).append(", Method: ").append(this.requestInfo.getHttpMethod());

    if (!this.requestInfo.getPath().startsWith(SPRING_ERROR_PATH) &&
        !DISABLE_AUTH_ENDPOINTS.contains(this.requestInfo.getPath()) &&
        !Util.getSpringProfileActive().contains("local")) {

      Enumeration<String> authorization = request.getHeaders("Authorization");
      if (!authorization.hasMoreElements()) {
        logger.info(accessLogBuilder.toString());
        throw new UnAuthorized("Authorization header is empty");
      }

      String bearerToken = authorization.nextElement();
      if (!bearerToken.contains("Bearer")) {
        logger.info(accessLogBuilder.toString());
        throw new UnAuthorized("Authorization supports Bearer format");
      }

      bearerToken = bearerToken.replace("Bearer", "").trim();
      DecodedJWT decodedJWT = this.authComponent.decodeJwt(bearerToken);
      this.requestInfo.setUserId(decodedJWT.getSubject());
      this.requestInfo.setUserEmail(decodedJWT.getClaim(AuthComponent.ClaimUserEmailKey).asString());
      this.requestInfo.setRefreshToken(decodedJWT.getClaim(AuthComponent.ClaimRefreshKey).asBoolean());

      accessLogBuilder.append(". UserId: ").append(this.requestInfo.getUserId());
    }

    if (!this.requestInfo.getPath().startsWith(SPRING_ERROR_PATH)) {
      logger.info(accessLogBuilder.toString());
    }

    return !this.requestInfo.getPath().startsWith(SPRING_ERROR_PATH);
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) {
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
  }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class InterceptorControllerGeneratedAiTests {

  private InterceptorController interceptjava
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class InterceptorControllerGeneratedAiTests {

  private InterceptorController interceptorController;
  private AuthComponent authComponentMock;
  private RequestInfoComponent requestInfoComponentMock;

  @BeforeEach
  void setUp() {
    authComponentMock = Mockito.mock(AuthComponent.class);
    requestInfoComponentMock = Mockito.mock(RequestInfoComponent.class);
    interceptorController = new InterceptorController(authComponentMock, requestInfoComponentMock);
  }

  @Test
  void preHandle_validAuthorizationHeader_shouldDecodeJWT() {
    // GIVEN
    Mockito.when(authComponentMock.decodeJwt("Bearer validToken"))
      .thenReturn(Mockito.any(DecodedJWT.class));

    // WHEN
    String result = null;
    try {
      interceptorController.preHandle(Mockito.any(HttpServletRequest.class), Mockito.any(HttpServletResponse.class), Mockito.any(Object.class));
    } catch (Exception e) {
      // Handle any exceptions that might be thrown
      fail("Exception thrown unexpectedly");
    }

    // THEN
    verify(authComponentMock, Mockito.times(1)).decodeJwt("Bearer validToken");
    verify(requestInfoComponentMock).setRequestId(UUID.randomUUID().toString());
    verify(requestInfoComponentMock).setPath(Mockito.anyString());
    verify(requestInfoComponentMock).setHttpMethod(Mockito.anyString());
  }

  @Test
  void preHandle_noAuthorizationHeader_shouldThrowUnAuthorizedException() {
    // GIVEN
    Mockito.doThrow(new UnAuthorized("Authorization header is empty"))
        .when(authComponentMock).decodeJwt("Bearer validToken");

    // WHEN
    // THEN
    try {
      interceptorController.preHandle(Mockito.any(HttpServletRequest.class), Mockito.any(HttpServletResponse.class), Mockito.any(Object.class));
      fail("Exception thrown unexpectedly");
    } catch (UnAuthorized e) {
      // Expected exception
    }
  }

  @Test
  void preHandle_invalidAuthorizationHeader_shouldThrowUnAuthorizedException() {
    // GIVEN
    Mockito.doThrow(new UnAuthorized("Authorization supports Bearer format"))
        .when(authComponentMock).decodeJwt("InvalidHeader");

    // WHEN
    // THEN
    try {
      interceptorController.preHandle(Mockito.any(HttpServletRequest.class), Mockito.any(HttpServletResponse.class), Mockito.any(Object.class));
      fail("Exception thrown unexpectedly");
    } catch (UnAuthorized e) {
      // Expected exception
    }
  }
}