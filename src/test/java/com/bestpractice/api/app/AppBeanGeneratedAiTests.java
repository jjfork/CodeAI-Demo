package com.bestpractice.api.app;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

import com.bestpractice.api.domain.RequestInfoComponent; 
import com.bestpractice.api.domain.AuthComponent; 

public class AppBeanGeneratedAiTests {

  @InjectMocks
  private AppBean appBean;

  @Mock
  private RequestInfoComponent requestInfoComponent;
  @Mock
  private AuthComponent authComponent;


  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }



  @Test
  void testSwaggerSpringMvcPlugin() {
    // GIVEN - Set up the necessary preconditions
    // WHEN - Call the method under test
    Docket docket = appBean.swaggerSpringMvcPlugin();
    // THEN - Assert that the expected result is returned
    assertNotNull(docket);
  }

  @Test
  void testApiInfo() {
    // GIVEN - Set up the necessary preconditions
    // WHEN - Call the method under test
    ApiInfo apiInfo = appBean.apiInfo();
    // THEN - Assert that the expected result is returned
    assertNotNull(apiInfo);
  }



}