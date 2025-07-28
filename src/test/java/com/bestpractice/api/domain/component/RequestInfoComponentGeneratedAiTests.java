package com.bestpractice.api.domain.component;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RequestInfoComponentGeneratedAiTests {
  private RequestInfoComponent requestInfoComponent;

  @BeforeEach
  void setUp() {
    requestInfoComponent = new RequestInfoComponent();
  }

  @Test
  void testGetUserId() {
    // GIVEN - Setup
    String userId = "testUserId";
    // WHEN - Action
    requestInfoComponent.setUserId(userId);
    // THEN - Assertion
    assertEquals(userId, requestInfoComponent.getUserId());
  }

  @Test
  void testSetUserId() {
    // GIVEN - Setup
    String userId = "testUserId";
    // WHEN - Action
    requestInfoComponent.setUserId(userId);
    // THEN - Assertion
    assertEquals(userId, requestInfoComponent.getUserId());
  }

  @Test
  void testGetUserEmail() {
    // GIVEN - Setup
    String userEmail = "testUserEmail";
    // WHEN - Action
    requestInfoComponent.setUserEmail(userEmail);
    // THEN - Assertion
    assertEquals(userEmail, requestInfoComponent.getUserEmail());
  }

  @Test
  void testSetUserEmail() {
    // GIVEN - Setup
    String userEmail = "testUserEmail";
    // WHEN - Action
    requestInfoComponent.setUserEmail(userEmail);
    // THEN - Assertion
    assertEquals(userEmail, requestInfoComponent.getUserEmail());
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN - Setup
    boolean isRefreshToken = true;
    // WHEN - Action
    requestInfoComponent.setRefreshToken(isRefreshToken);
    // THEN - Assertion
    assertEquals(isRefreshToken, requestInfoComponent.isRefreshToken());
  }

  @Test
  void testSetRefreshToken() {
    // GIVEN - Setup
    boolean isRefreshToken = true;
    // WHEN - Action
    requestInfoComponent.setRefreshToken(isRefreshToken);
    // THEN - Assertion
    assertEquals(isRefreshToken, requestInfoComponent.isRefreshToken());
  }

  @Test
  void testGetPath() {
    // GIVEN - Setup
    String path = "/testPath";
    // WHEN - Action
    requestInfoComponent.setPath(path);
    // THEN - Assertion
    assertEquals(path, requestInfoComponent.getPath());
  }

  @Test
  void testSetPath() {
    // GIVEN - Setup
    String path = "/testPath";
    // WHEN - Action
    requestInfoComponent.setPath(path);
    // THEN - Assertion
    assertEquals(path, requestInfoComponent.getPath());
  }

  @Test
  void testGetHttpMethod() {
    // GIVEN - Setup
    String httpMethod = "GET";
    // WHEN - Action
    requestInfoComponent.setHttpMethod(httpMethod);
    // THEN - Assertion
    assertEquals(httpMethod, requestInfoComponent.getHttpMethod());
  }

  @Test
  void testSetHttpMethod() {
    // GIVEN - Setup
    String httpMethod = "GET";
    // WHEN - Action
    requestInfoComponent.setHttpMethod(httpMethod);
    // THEN - Assertion
    assertEquals(httpMethod, requestInfoComponent.getHttpMethod());
  }

  @Test
  void testGetRequestId() {
    // GIVEN - Setup
    String requestId = "testRequestId";
    // WHEN - Action
    requestInfoComponent.setRequestId(requestId);
    // THEN - Assertion
    assertEquals(requestId, requestInfoComponent.getRequestId());
  }

  @Test
  void testSetRequestId() {
    // GIVEN - Setup
    String requestId = "testRequestId";
    // WHEN - Action
    requestInfoComponent.setRequestId(requestId);
    // THEN - Assertion
    assertEquals(requestId, requestInfoComponent.getRequestId());
  }
}
