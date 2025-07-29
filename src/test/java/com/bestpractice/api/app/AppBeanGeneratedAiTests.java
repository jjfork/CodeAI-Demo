package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.bestpractice.api.common.property.CredentialProperty;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.RequestInfoComponent;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class AppBeanGeneratedAiTests {

  @InjectMocks
  private AppBean appBean;

  @Mock
  private AuthComponent authComponent;

  @Mock
  private RequestInfoComponent requestInfo;

  @Mock
  private CredentialProperty credentialProperty;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testSwaggerSpringMvcPlugin() {
    appBean.swaggerSpringMvcPlugin();
    verify(authComponent, times(1)).decodeJwt("token");
  }

  @Test
  void testApiInfo() {
    String apiInfo = appBean.apiInfo().getName();
    assertEquals("Spring boot best practice API", apiInfo);
  }


}