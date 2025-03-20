package com.bestpractice.api.domain.component;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RequestInfoComponentTests {
  private RequestInfoComponent requestInfoComponent;

  @BeforeEach
  void setUp() {
    requestInfoComponent = new RequestInfoComponent();
  }

  @Test
  void testGetUserId() {
    // GIVEN - Setup
    String userId = "testUser";
    // WHEN - Action
    requestInfoComponent.setUserId(userId);
    // THEN - Assertion
    assertEquals(userId, requestInfoComponent.getUserId());
  }

  @Test
  void testSetUserId() {
    // GIVEN - Setup
    String userId = "testUser";
    // WHEN - Action
    requestInfoComponent.setUserId(userId);
    // THEN - Assertion
    assertEquals(userId, requestInfoComponent.getUserId());
  }

  @Test
  void testGetPath() {
    // GIVEN - Setup
    String path = "/api/users";
    // WHEN - Action
    requestInfoComponent.setPath(path);
    // THEN - Assertion
    assertEquals(path, requestInfoComponent.getPath());
  }

  @Test
  void testSetPath() {
    // GIVEN - Setup
    String path = "/api/users";
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
    String requestId = "1234567890";
    // WHEN - Action
    requestInfoComponent.setRequestId(requestId);
    // THEN - Assertion
    assertEquals(requestId, requestInfoComponent.getRequestId());
  }

  @Test
  void testSetRequestId() {
    // GIVEN - Setup
    String requestId = "1234567890";
    // WHEN - Action
    requestInfoComponent.setRequestId(requestId);
    // THEN - Assertion
    assertEquals(requestId, requestInfoComponent.getRequestId());
  }

}
