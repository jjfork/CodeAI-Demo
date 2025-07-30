package com.bestpractice.api.domain.model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals(tokenType, actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals(token, actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals(refreshToken, actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}

/*
2025-07-29 18:54:43.038 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:54:43.045 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-29 18:54:43.135 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class AuthResponseGeneratedAiTests {

  private String tokenType = "Bearer";
  private String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
  private String refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
  private Date expiresAt = new Date(1678886400000L);

  @BeforeEach
  void setUp() {
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assert actualTokenType.equals(tokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assert actualToken.equals(token);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assert actualRefreshToken.equals(refreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assert actualExpiresAt.equals(expiresAt);
  }
}

/*
2025-07-28 15:47:31.052 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:47:31.055 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-28 15:47:31.055 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-28 15:47:31.055 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:48:42.812 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3491, outputTokenCount = 819, totalTokenCount = 4310 }
2025-07-28 15:48:42.812 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:48:42.812 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}



```
2025-07-28 15:48:42.812 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-28 15:48:42.812 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:49:02.822 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:49:02.822 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-28 15:49:02.822 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-28 15:49:02.822 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:50:25.864 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 6140, outputTokenCount = 819, totalTokenCount = 6959 }
2025-07-28 15:50:25.864 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:50:25.864 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}



```
2025-07-28 15:50:25.864 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-28 15:50:25.864 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:50:49.634 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:50:49.634 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-28 15:50:49.634 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-28 15:50:49.634 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:53:19.163 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 7973, outputTokenCount = 819, totalTokenCount = 8792 }
2025-07-28 15:53:19.163 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:53:19.163 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}



```
2025-07-28 15:53:19.163 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-28 15:53:19.165 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
* /


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-29 18:54:43.135 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:54:56.625 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 572, outputTokenCount = 111, totalTokenCount = 683 }
2025-07-29 18:54:56.625 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-29 18:54:56.625 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
Please provide me with the Java class you want to test. I will then generate JUnit 5 tests for it following all your requirements.  

For example, you can paste the code of a class like this:

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```

Once you provide the class, I'll generate the corresponding test class in the same package with meaningful test methods using AssertJ and Mockito. 



2025-07-29 18:54:56.625 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-29 18:54:56.625 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-29 18:55:17.475 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:55:17.476 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-29 18:55:17.476 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class AuthResponseGeneratedAiTests {

  private String tokenType = "Bearer";
  private String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
  private String refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
  private Date expiresAt = new Date(1678886400000L);

  @BeforeEach
  void setUp() {
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assert actualTokenType.equals(tokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assert actualToken.equals(token);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assert actualRefreshToken.equals(refreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assert actualExpiresAt.equals(expiresAt);
  }
}

/*
2025-07-28 15:47:31.052 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:47:31.055 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-28 15:47:31.055 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-28 15:47:31.055 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:48:42.812 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3491, outputTokenCount = 819, totalTokenCount = 4310 }
2025-07-28 15:48:42.812 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:48:42.812 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}



```
2025-07-28 15:48:42.812 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-28 15:48:42.812 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:49:02.822 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:49:02.822 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-28 15:49:02.822 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-28 15:49:02.822 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:50:25.864 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 6140, outputTokenCount = 819, totalTokenCount = 6959 }
2025-07-28 15:50:25.864 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:50:25.864 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}



```
2025-07-28 15:50:25.864 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-28 15:50:25.864 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:50:49.634 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:50:49.634 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-28 15:50:49.634 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-28 15:50:49.634 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:53:19.163 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 7973, outputTokenCount = 819, totalTokenCount = 8792 }
2025-07-28 15:53:19.163 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:53:19.163 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}



```
2025-07-28 15:53:19.163 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-28 15:53:19.165 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
* /


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-29 18:55:17.476 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:55:35.787 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 572, outputTokenCount = 178, totalTokenCount = 750 }
2025-07-29 18:55:35.787 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-29 18:55:35.787 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
Please provide me with the Java class you want to test. I need the code of the class to generate the corresponding test cases following your requirements. 

Once you provide the class, I will:

1.  **Analyze the class:** Identify public and protected methods to test.
2.  **Generate test class:** Create a new class with the name specified by your convention (e.g., `ClassNameGeneratedAiTests`).
3.  **Write test methods:** Implement JUnit5 tests using GIVEN-WHEN-THEN structure, assertions from AssertJ, and mocking with Mockito where necessary.
4.  **Add `@BeforeEach`:** Ensure state is reset before each test method.
5.  **Format as plain text:**  Avoid code block formatting.



Let me know if you have any other questions or specific requirements for the tests! 

2025-07-29 18:55:35.787 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-29 18:55:35.788 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-29 18:55:55.058 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:55:55.058 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-29 18:55:55.058 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class AuthResponseGeneratedAiTests {

  private String tokenType = "Bearer";
  private String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
  private String refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
  private Date expiresAt = new Date(1678886400000L);

  @BeforeEach
  void setUp() {
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assert actualTokenType.equals(tokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assert actualToken.equals(token);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assert actualRefreshToken.equals(refreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assert actualExpiresAt.equals(expiresAt);
  }
}

/*
2025-07-28 15:47:31.052 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:47:31.055 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-28 15:47:31.055 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-28 15:47:31.055 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:48:42.812 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3491, outputTokenCount = 819, totalTokenCount = 4310 }
2025-07-28 15:48:42.812 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:48:42.812 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}



```
2025-07-28 15:48:42.812 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-28 15:48:42.812 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:49:02.822 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:49:02.822 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-28 15:49:02.822 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-28 15:49:02.822 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:50:25.864 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 6140, outputTokenCount = 819, totalTokenCount = 6959 }
2025-07-28 15:50:25.864 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:50:25.864 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}



```
2025-07-28 15:50:25.864 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-28 15:50:25.864 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:50:49.634 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:50:49.634 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generating code...
2025-07-28 15:50:49.634 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import javax.validation.constraints.NotNull;

public class AuthResponse {

  @NotNull
  @JsonProperty("token_type")
  private final String tokenType;

  @NotNull
  @JsonProperty("token")
  private final String token;

  @NotNull
  @JsonProperty("refresh_token")
  private final String refreshToken;

  @JsonProperty("expired_at")
  private final Date expiresAt;

  public AuthResponse(String tokenType, String token, String refreshToken, Date expiresAt) {
    this.tokenType = tokenType;
    this.token = token;
    this.refreshToken = refreshToken;
    this.expiresAt = expiresAt;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getToken() {
    return token;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public Date getExpiresAt() {
    return expiresAt;
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-28 15:50:49.634 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:53:19.163 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 7973, outputTokenCount = 819, totalTokenCount = 8792 }
2025-07-28 15:53:19.163 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-28 15:53:19.163 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AuthResponseGeneratedAiTests {

  private String tokenType;
  private String token;
  private String refreshToken;
  private Date expiresAt;

  @BeforeEach
  void setUp() {
    tokenType = "Bearer";
    token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    refreshToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    expiresAt = new Date();
  }

  @Test
  void testGetTokenType() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualTokenType = authResponse.getTokenType();
    // THEN
    assertEquals("Bearer", actualTokenType);
  }

  @Test
  void testGetToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualToken = authResponse.getToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualToken);
  }

  @Test
  void testGetRefreshToken() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    String actualRefreshToken = authResponse.getRefreshToken();
    // THEN
    assertEquals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c", actualRefreshToken);
  }

  @Test
  void testGetExpiresAt() {
    // GIVEN
    AuthResponse authResponse = new AuthResponse(tokenType, token, refreshToken, expiresAt);
    // WHEN
    Date actualExpiresAt = authResponse.getExpiresAt();
    // THEN
    assertEquals(expiresAt, actualExpiresAt);
  }
}



```
2025-07-28 15:53:19.163 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-28 15:53:19.165 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
* /


>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
  - Do not add another "s" if the class name already ends with "s".
  - Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
    Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, MOCKITO for mocking, and ASSERTJ for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.
14. If error compilation refers to 'reference to assertThat is ambiguous' please do not use org.assertj.core.api.Assertions.assertThat, apart that please use assertEquals(expected, actual) from org.junit.jupiter.api.Assertions.assertEquals
15. Please do not forget about necessary imports
16. Check if the class name matches the requirements, e.g. classWithUnitTests instead of classWithUnitTest
17. If a test fails, check it again to see if it's well written, is assertion correct

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-29 18:55:55.060 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:56:28.222 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 572, outputTokenCount = 327, totalTokenCount = 899 }
2025-07-29 18:56:28.222 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
2025-07-29 18:56:28.222 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Generated code:
```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

public class ClassWithUnitTests {

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testPublicMethod() {
        // GIVEN
        String input = "Hello";

        // WHEN
        String output = publicMethod(input);

        // THEN
        assertEquals("World, Hello!", output);
    }
}


```



**Explanation:**

1.  **Imports:** The code includes necessary imports for JUnit 5 (`@Test`, `@BeforeEach`), Mockito (`MockitoAnnotations.openMocks`), and AssertJ (`org.junit.jupiter.api.Assertions.assertEquals`).
2.  **`setUp()` Method:** This method is annotated with `@BeforeEach` to ensure it runs before each test. It initializes mocks using `MockitoAnnotations.openMocks(this)`.
3.  **`testPublicMethod()` Test:**
    *   **GIVEN:** Sets up the input string "Hello".
    *   **WHEN:** Calls the `publicMethod()` method with the input string.
    *   **THEN:** Asserts that the output of `publicMethod()` is "World, Hello!" using `assertEquals`.

**Note:** You need to replace `publicMethod(input)` with the actual implementation of your public method in the `ClassWithUnitTests` class.




2025-07-29 18:56:28.222 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Refining code...
2025-07-29 18:56:28.224 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthResponseGeneratedAiTests.java}] - Done
*/
