package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthByEmailRequestGeneratedAiTests {
  private AuthByEmailRequest authByEmailRequest;

  @BeforeEach
  void setUp() {
    authByEmailRequest = new AuthByEmailRequest();
  }

  @Test
  void testGetEmail() {
    // GIVEN - Set the email value
    String expectedEmail = "test@example.com";
    authByEmailRequest.setEmail(expectedEmail);
    // WHEN - Get the email value
    String actualEmail = authByEmailRequest.getEmail();
    // THEN - Assert that the actual email matches the expected email
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  void testSetEmail() {
    // GIVEN - Set a new email value
    String newEmail = "new_test@example.com";
    // WHEN - Set the email using the setEmail method
    authByEmailRequest.setEmail(newEmail);
    // THEN - Assert that the set email matches the new email
    assertEquals(newEmail, authByEmailRequest.getEmail());
  }

  @Test
  void testGetPassword() {
    // GIVEN - Set the password value
    String expectedPassword = "securePassword";
    authByEmailRequest.setPassword(expectedPassword);
    // WHEN - Get the password value
    String actualPassword = authByEmailRequest.getPassword();
    // THEN - Assert that the actual password matches the expected password
    assertEquals(expectedPassword, actualPassword);
  }

  @Test
  void testSetPassword() {
    // GIVEN - Set a new password value
    String newPassword = "newPassword123";
    // WHEN - Set the password using the setPassword method
    authByEmailRequest.setPassword(newPassword);
    // THEN - Assert that the set password matches the new password
    assertEquals(newPassword, authByEmailRequest.getPassword());
  }
}

/*
2025-07-28 15:38:41.729 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:38:41.732 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 15:38:41.732 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;

public class AuthByEmailRequest {
  @Email
  @NotNull
  @JsonProperty("email")
  private String email;

  @NotNull
  @JsonProperty("password")
  private String password;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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
import static org.junit.jupiter.api.Assertions.*;

public class AuthByEmailRequestGeneratedAiTests {
  private AuthByEmailRequest authByEmailRequest;

  @BeforeEach
  void setUp() {
    authByEmailRequest = new AuthByEmailRequest();
  }

  @Test
  void testGetEmail() {
    // GIVEN - Set the email value
    String expectedEmail = "test@example.com";
    authByEmailRequest.setEmail(expectedEmail);
    // WHEN - Get the email value
    String actualEmail = authByEmailRequest.getEmail();
    // THEN - Assert that the actual email matches the expected email
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  void testSetEmail() {
    // GIVEN - Set a new email value
    String newEmail = "new_test@example.com";
    // WHEN - Call setEmail method with the new email
    authByEmailRequest.setEmail(newEmail);
    // THEN - Assert that the email value is updated
    assertEquals(newEmail, authByEmailRequest.getEmail());
  }

  @Test
  void testGetPassword() {
    // GIVEN - Set the password value
    String expectedPassword = "password123";
    authByEmailRequest.setPassword(expectedPassword);
    // WHEN - Get the password value
    String actualPassword = authByEmailRequest.getPassword();
    // THEN - Assert that the actual password matches the expected password
    assertEquals(expectedPassword, actualPassword);
  }

  @Test
  void testSetPassword() {
    // GIVEN - Set a new password value
    String newPassword = "newPassword";
    // WHEN - Call setPassword method with the new password
    authByEmailRequest.setPassword(newPassword);
    // THEN - Assert that the password value is updated
    assertEquals(newPassword, authByEmailRequest.getPassword());
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

2025-07-28 15:38:41.732 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:39:18.450 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2587, outputTokenCount = 479, totalTokenCount = 3066 }
2025-07-28 15:39:18.450 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Done
2025-07-28 15:39:18.450 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthByEmailRequestGeneratedAiTests {
  private AuthByEmailRequest authByEmailRequest;

  @BeforeEach
  void setUp() {
    authByEmailRequest = new AuthByEmailRequest();
  }

  @Test
  void testGetEmail() {
    // GIVEN - Set the email value
    String expectedEmail = "test@example.com";
    authByEmailRequest.setEmail(expectedEmail);
    // WHEN - Get the email value
    String actualEmail = authByEmailRequest.getEmail();
    // THEN - Assert that the actual email matches the expected email
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  void testSetEmail() {
    // GIVEN - Set a new email value
    String newEmail = "new_test@example.com";
    // WHEN - Call setEmail method with the new email
    authByEmailRequest.setEmail(newEmail);
    // THEN - Assert that the email value is updated
    assertEquals(newEmail, authByEmailRequest.getEmail());
  }

  @Test
  void testGetPassword() {
    // GIVEN - Set the password value
    String expectedPassword = "password123";
    authByEmailRequest.setPassword(expectedPassword);
    // WHEN - Get the password value
    String actualPassword = authByEmailRequest.getPassword();
    // THEN - Assert that the actual password matches the expected password
    assertEquals(expectedPassword, actualPassword);
  }

  @Test
  void testSetPassword() {
    // GIVEN - Set a new password value
    String newPassword = "newPassword";
    // WHEN - Call setPassword method with the new password
    authByEmailRequest.setPassword(newPassword);
    // THEN - Assert that the password value is updated
    assertEquals(newPassword, authByEmailRequest.getPassword());
  }
}




2025-07-28 15:39:18.451 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 15:39:18.451 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Done
2025-07-28 15:39:42.401 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:39:42.401 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 15:39:42.401 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;

public class AuthByEmailRequest {
  @Email
  @NotNull
  @JsonProperty("email")
  private String email;

  @NotNull
  @JsonProperty("password")
  private String password;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

import static org.junit.jupiter.api.Assertions.*;

public class AuthByEmailRequestGeneratedAiTests {
  private AuthByEmailRequest authByEmailRequest;

  @BeforeEach
  void setUp() {
    authByEmailRequest = new AuthByEmailRequest();
  }

  @Test
  void testGetEmail() {
    // GIVEN - Set the email value
    String expectedEmail = "test@example.com";
    authByEmailRequest.setEmail(expectedEmail);
    // WHEN - Get the email value
    String actualEmail = authByEmailRequest.getEmail();
    // THEN - Assert that the actual email matches the expected email
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  void testSetEmail() {
    // GIVEN - Set a new email value
    String newEmail = "new_test@example.com";
    // WHEN - Call setEmail method with the new email
    authByEmailRequest.setEmail(newEmail);
    // THEN - Assert that the email value is updated
    assertEquals(newEmail, authByEmailRequest.getEmail());
  }

  @Test
  void testGetPassword() {
    // GIVEN - Set the password value
    String expectedPassword = "password123";
    authByEmailRequest.setPassword(expectedPassword);
    // WHEN - Get the password value
    String actualPassword = authByEmailRequest.getPassword();
    // THEN - Assert that the actual password matches the expected password
    assertEquals(expectedPassword, actualPassword);
  }

  @Test
  void testSetPassword() {
    // GIVEN - Set a new password value
    String newPassword = "newPassword";
    // WHEN - Call setPassword method with the new password
    authByEmailRequest.setPassword(newPassword);
    // THEN - Assert that the password value is updated
    assertEquals(newPassword, authByEmailRequest.getPassword());
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

2025-07-28 15:39:42.401 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:40:47.982 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 4430, outputTokenCount = 479, totalTokenCount = 4909 }
2025-07-28 15:40:47.982 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Done
2025-07-28 15:40:47.982 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthByEmailRequestGeneratedAiTests {
  private AuthByEmailRequest authByEmailRequest;

  @BeforeEach
  void setUp() {
    authByEmailRequest = new AuthByEmailRequest();
  }

  @Test
  void testGetEmail() {
    // GIVEN - Set the email value
    String expectedEmail = "test@example.com";
    authByEmailRequest.setEmail(expectedEmail);
    // WHEN - Get the email value
    String actualEmail = authByEmailRequest.getEmail();
    // THEN - Assert that the actual email matches the expected email
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  void testSetEmail() {
    // GIVEN - Set a new email value
    String newEmail = "new_test@example.com";
    // WHEN - Call setEmail method with the new email
    authByEmailRequest.setEmail(newEmail);
    // THEN - Assert that the email value is updated
    assertEquals(newEmail, authByEmailRequest.getEmail());
  }

  @Test
  void testGetPassword() {
    // GIVEN - Set the password value
    String expectedPassword = "password123";
    authByEmailRequest.setPassword(expectedPassword);
    // WHEN - Get the password value
    String actualPassword = authByEmailRequest.getPassword();
    // THEN - Assert that the actual password matches the expected password
    assertEquals(expectedPassword, actualPassword);
  }

  @Test
  void testSetPassword() {
    // GIVEN - Set a new password value
    String newPassword = "newPassword";
    // WHEN - Call setPassword method with the new password
    authByEmailRequest.setPassword(newPassword);
    // THEN - Assert that the password value is updated
    assertEquals(newPassword, authByEmailRequest.getPassword());
  }
}




2025-07-28 15:40:47.982 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 15:40:47.982 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Done
2025-07-28 15:41:11.880 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:41:11.882 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 15:41:11.882 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;

public class AuthByEmailRequest {
  @Email
  @NotNull
  @JsonProperty("email")
  private String email;

  @NotNull
  @JsonProperty("password")
  private String password;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

import static org.junit.jupiter.api.Assertions.*;

public class AuthByEmailRequestGeneratedAiTests {
  private AuthByEmailRequest authByEmailRequest;

  @BeforeEach
  void setUp() {
    authByEmailRequest = new AuthByEmailRequest();
  }

  @Test
  void testGetEmail() {
    // GIVEN - Set the email value
    String expectedEmail = "test@example.com";
    authByEmailRequest.setEmail(expectedEmail);
    // WHEN - Get the email value
    String actualEmail = authByEmailRequest.getEmail();
    // THEN - Assert that the actual email matches the expected email
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  void testSetEmail() {
    // GIVEN - Set a new email value
    String newEmail = "new_test@example.com";
    // WHEN - Call setEmail method with the new email
    authByEmailRequest.setEmail(newEmail);
    // THEN - Assert that the email value is updated
    assertEquals(newEmail, authByEmailRequest.getEmail());
  }

  @Test
  void testGetPassword() {
    // GIVEN - Set the password value
    String expectedPassword = "password123";
    authByEmailRequest.setPassword(expectedPassword);
    // WHEN - Get the password value
    String actualPassword = authByEmailRequest.getPassword();
    // THEN - Assert that the actual password matches the expected password
    assertEquals(expectedPassword, actualPassword);
  }

  @Test
  void testSetPassword() {
    // GIVEN - Set a new password value
    String newPassword = "newPassword";
    // WHEN - Call setPassword method with the new password
    authByEmailRequest.setPassword(newPassword);
    // THEN - Assert that the password value is updated
    assertEquals(newPassword, authByEmailRequest.getPassword());
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

2025-07-28 15:41:11.882 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:43:37.154 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 6273, outputTokenCount = 479, totalTokenCount = 6752 }
2025-07-28 15:43:37.154 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Done
2025-07-28 15:43:37.154 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthByEmailRequestGeneratedAiTests {
  private AuthByEmailRequest authByEmailRequest;

  @BeforeEach
  void setUp() {
    authByEmailRequest = new AuthByEmailRequest();
  }

  @Test
  void testGetEmail() {
    // GIVEN - Set the email value
    String expectedEmail = "test@example.com";
    authByEmailRequest.setEmail(expectedEmail);
    // WHEN - Get the email value
    String actualEmail = authByEmailRequest.getEmail();
    // THEN - Assert that the actual email matches the expected email
    assertEquals(expectedEmail, actualEmail);
  }

  @Test
  void testSetEmail() {
    // GIVEN - Set a new email value
    String newEmail = "new_test@example.com";
    // WHEN - Call setEmail method with the new email
    authByEmailRequest.setEmail(newEmail);
    // THEN - Assert that the email value is updated
    assertEquals(newEmail, authByEmailRequest.getEmail());
  }

  @Test
  void testGetPassword() {
    // GIVEN - Set the password value
    String expectedPassword = "password123";
    authByEmailRequest.setPassword(expectedPassword);
    // WHEN - Get the password value
    String actualPassword = authByEmailRequest.getPassword();
    // THEN - Assert that the actual password matches the expected password
    assertEquals(expectedPassword, actualPassword);
  }

  @Test
  void testSetPassword() {
    // GIVEN - Set a new password value
    String newPassword = "newPassword";
    // WHEN - Call setPassword method with the new password
    authByEmailRequest.setPassword(newPassword);
    // THEN - Assert that the password value is updated
    assertEquals(newPassword, authByEmailRequest.getPassword());
  }
}




2025-07-28 15:43:37.154 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 15:43:37.154 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.AuthByEmailRequestGeneratedAiTests.java}] - Done
*/
