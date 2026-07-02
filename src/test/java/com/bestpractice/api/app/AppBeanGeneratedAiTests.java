package com.bestpractice.api.app;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.bestpractice.api.domain.component.AuthComponent;
import com.bestpractice.api.domain.component.RequestInfoComponent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class AppBeanGeneratedAiTests {

    @Mock
    private AuthComponent authComponent;

    @Mock
    private RequestInfoComponent requestInfoComponent;

    private AppBean.SwaggerConfig swaggerConfig;
    private AppBean.SwaggerConfig.WebMvcConfig webMvcConfig;

    @BeforeEach
    void setUp() {
        swaggerConfig = new AppBean.SwaggerConfig();
        webMvcConfig = new AppBean.SwaggerConfig.WebMvcConfig();
        // Inject mocks into WebMvcConfig via reflection
        ReflectionTestUtils.setField(webMvcConfig, "authComponent", authComponent);
        ReflectionTestUtils.setField(webMvcConfig, "requestInfo", requestInfoComponent);
    }

    @Test
    void swaggerSpringMvcPlugin_shouldReturnDocketWithSwagger2AndApiInfo() {
        // GIVEN
        // WHEN
        Docket docket = swaggerConfig.swaggerSpringMvcPlugin();
        // THEN
        assertThat(docket).isNotNull();
        assertThat(docket.getDocumentationType()).isEqualTo(DocumentationType.SWAGGER_2);
        ApiInfo apiInfo = docket.getApiInfo();
        assertThat(apiInfo).isNotNull();
        assertThat(apiInfo.getTitle()).isEqualTo("Spring boot best practice API");
        assertThat(apiInfo.getDescription()).isEqualTo("Spring boot best practice API document");
        assertThat(apiInfo.getVersion()).isEqualTo("0.0.1");
    }

    @Test
    void webMvcConfig_shouldRegisterInterceptorForApiPaths() {
        // GIVEN
        InterceptorRegistry registry = mock(InterceptorRegistry.class);
        // WHEN
        webMvcConfig.addInterceptors(registry);
        // THEN
        verify(registry, times(1)).addInterceptor(any());
    }
}
