package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceUnavailableGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testServiceUnavailable() {
    // GIVEN - 
    // WHEN - 
    ServiceUnavailable exception = new ServiceUnavailable();
    // THEN - assertNotNull(exception);
  }

  @Test
  void testServiceUnavailableString() {
    // GIVEN - String msg = "This is a service unavailable message";
    // WHEN - ServiceUnavailable exception = new ServiceUnavailable(msg);
    // THEN - assertEquals(msg, exception.getMessage());
  }

  @Test
  void testServiceUnavailableThrowable() {
    // GIVEN - Throwable cause = new RuntimeException();
    // WHEN - ServiceUnavailable exception = new ServiceUnavailable(cause);
    // THEN - assertEquals(cause, exception.getCause());
  }

  @Test
  void testServiceUnavailableStringThrowable() {
    // GIVEN - String msg = "This is a service unavailable message";
    // Throwable cause = new RuntimeException();
    // WHEN - ServiceUnavailable exception = new ServiceUnavailable(msg, cause);
    // THEN - assertEquals(msg, exception.getMessage());
    // assertEquals(cause, exception.getCause());
  }

}

/*
2025-07-28 15:01:46.562 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:01:46.563 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Generating code...
2025-07-28 15:01:46.563 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class ServiceUnavailable extends RuntimeException {
  public ServiceUnavailable() {
    super();
  }

  public ServiceUnavailable(String msg) {
    super(msg);
  }

  public ServiceUnavailable(Throwable cause) {
    super(cause);
  }

  public ServiceUnavailable(String msg, Throwable cause) {
    super(msg, cause);
  }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceUnavailableGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testServiceUnavailable() {
        // GIVEN - Initialize a ServiceUnavailable object without any arguments
        ServiceUnavailable exception = new ServiceUnavailable();
        // THEN - Assert that the exception message is null
        assertNull(exception.getMessage());
    }

    @Test
    void testServiceUnavailableWithMessage() {
        // GIVEN - Initialize a ServiceUnavailable object with a message
        String message = "Service unavailable";
        ServiceUnavailable exception = new ServiceUnavailable(message);
        // THEN - Assert that the exception message is equal to the provided message
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testServiceUnavailableWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(cause);
        // THEN - Assert that the exception's cause is equal to the provided RuntimeException
        assertSame(cause, exception.getCause());
    }

    @Test
    void testServiceUnavailableWithMessageAndCause() {
        // GIVEN - Initialize a RuntimeException as the cause and a message
        String message = "Service unavailable";
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(message, cause);
        // THEN - Assert that the exception message is equal to the provided message and the cause is equal to the provided RuntimeException
        assertEquals(message, exception.getMessage());
        assertSame(cause, exception.getCause());
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

2025-07-28 15:01:46.565 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:02:22.593 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2362, outputTokenCount = 437, totalTokenCount = 2799 }
2025-07-28 15:02:22.594 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Done
2025-07-28 15:02:22.594 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceUnavailableGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testServiceUnavailable() {
        // GIVEN - Initialize a ServiceUnavailable object without any arguments
        ServiceUnavailable exception = new ServiceUnavailable();
        // THEN - Assert that the exception message is null
        assertNull(exception.getMessage());
    }

    @Test
    void testServiceUnavailableWithMessage() {
        // GIVEN - Initialize a ServiceUnavailable object with a message
        String message = "Service unavailable";
        ServiceUnavailable exception = new ServiceUnavailable(message);
        // THEN - Assert that the exception message is equal to the provided message
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testServiceUnavailableWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(cause);
        // THEN - Assert that the exception's cause is equal to the provided RuntimeException
        assertSame(cause, exception.getCause());
    }

    @Test
    void testServiceUnavailableWithMessageAndCause() {
        // GIVEN - Initialize a RuntimeException as the cause and a message
        String message = "Service unavailable";
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(message, cause);
        // THEN - Assert that the exception message is equal to the provided message and the cause is equal to the provided RuntimeException
        assertEquals(message, exception.getMessage());
        assertSame(cause, exception.getCause());
    }
}




2025-07-28 15:02:22.594 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Refining code...
2025-07-28 15:02:22.594 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Done
2025-07-28 15:02:42.500 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:02:42.500 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Generating code...
2025-07-28 15:02:42.500 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class ServiceUnavailable extends RuntimeException {
  public ServiceUnavailable() {
    super();
  }

  public ServiceUnavailable(String msg) {
    super(msg);
  }

  public ServiceUnavailable(Throwable cause) {
    super(cause);
  }

  public ServiceUnavailable(String msg, Throwable cause) {
    super(msg, cause);
  }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceUnavailableGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testServiceUnavailable() {
        // GIVEN - Initialize a ServiceUnavailable object without any arguments
        ServiceUnavailable exception = new ServiceUnavailable();
        // THEN - Assert that the exception message is null
        assertNull(exception.getMessage());
    }

    @Test
    void testServiceUnavailableWithMessage() {
        // GIVEN - Initialize a ServiceUnavailable object with a message
        String message = "Service unavailable";
        ServiceUnavailable exception = new ServiceUnavailable(message);
        // THEN - Assert that the exception message is equal to the provided message
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testServiceUnavailableWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(cause);
        // THEN - Assert that the exception's cause is equal to the provided RuntimeException
        assertSame(cause, exception.getCause());
    }

    @Test
    void testServiceUnavailableWithMessageAndCause() {
        // GIVEN - Initialize a RuntimeException as the cause and a message
        String message = "Service unavailable";
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(message, cause);
        // THEN - Assert that the exception message is equal to the provided message and the cause is equal to the provided RuntimeException
        assertEquals(message, exception.getMessage());
        assertSame(cause, exception.getCause());
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

2025-07-28 15:02:42.500 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:10:56.053 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 4048, outputTokenCount = 443, totalTokenCount = 4491 }
2025-07-28 15:10:56.053 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Done
2025-07-28 15:10:56.053 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceUnavailableGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testServiceUnavailable_NoArguments() {
        // GIVEN - Initialize a ServiceUnavailable object without any arguments
        ServiceUnavailable exception = new ServiceUnavailable();
        // THEN - Assert that the exception message is null
        assertNull(exception.getMessage());
    }

    @Test
    void testServiceUnavailable_WithMessage() {
        // GIVEN - Initialize a ServiceUnavailable object with a message
        String message = "Service unavailable";
        ServiceUnavailable exception = new ServiceUnavailable(message);
        // THEN - Assert that the exception message is equal to the provided message
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testServiceUnavailable_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(cause);
        // THEN - Assert that the exception's cause is equal to the provided RuntimeException
        assertSame(cause, exception.getCause());
    }

    @Test
    void testServiceUnavailable_WithMessageAndCause() {
        // GIVEN - Initialize a RuntimeException as the cause and a message
        String message = "Service unavailable";
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(message, cause);
        // THEN - Assert that the exception message is equal to the provided message and the cause is equal to the provided RuntimeException
        assertEquals(message, exception.getMessage());
        assertSame(cause, exception.getCause());
    }
}




2025-07-28 15:10:56.053 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Refining code...
2025-07-28 15:10:56.053 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Done
2025-07-28 15:11:20.898 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:11:20.900 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Generating code...
2025-07-28 15:11:20.900 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class ServiceUnavailable extends RuntimeException {
  public ServiceUnavailable() {
    super();
  }

  public ServiceUnavailable(String msg) {
    super(msg);
  }

  public ServiceUnavailable(Throwable cause) {
    super(cause);
  }

  public ServiceUnavailable(String msg, Throwable cause) {
    super(msg, cause);
  }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceUnavailableGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testServiceUnavailable_NoArguments() {
        // GIVEN - Initialize a ServiceUnavailable object without any arguments
        ServiceUnavailable exception = new ServiceUnavailable();
        // THEN - Assert that the exception message is null
        assertNull(exception.getMessage());
    }

    @Test
    void testServiceUnavailable_WithMessage() {
        // GIVEN - Initialize a ServiceUnavailable object with a message
        String message = "Service unavailable";
        ServiceUnavailable exception = new ServiceUnavailable(message);
        // THEN - Assert that the exception message is equal to the provided message
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testServiceUnavailable_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(cause);
        // THEN - Assert that the exception's cause is equal to the provided RuntimeException
        assertSame(cause, exception.getCause());
    }

    @Test
    void testServiceUnavailable_WithMessageAndCause() {
        // GIVEN - Initialize a RuntimeException as the cause and a message
        String message = "Service unavailable";
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(message, cause);
        // THEN - Assert that the exception message is equal to the provided message and the cause is equal to the provided RuntimeException
        assertEquals(message, exception.getMessage());
        assertSame(cause, exception.getCause());
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

2025-07-28 15:11:20.900 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:12:01.829 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 5746, outputTokenCount = 443, totalTokenCount = 6189 }
2025-07-28 15:12:01.829 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Done
2025-07-28 15:12:01.829 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceUnavailableGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testServiceUnavailable_NoArguments() {
        // GIVEN - Initialize a ServiceUnavailable object without any arguments
        ServiceUnavailable exception = new ServiceUnavailable();
        // THEN - Assert that the exception message is null
        assertNull(exception.getMessage());
    }

    @Test
    void testServiceUnavailable_WithMessage() {
        // GIVEN - Initialize a ServiceUnavailable object with a message
        String message = "Service unavailable";
        ServiceUnavailable exception = new ServiceUnavailable(message);
        // THEN - Assert that the exception message is equal to the provided message
        assertEquals(message, exception.getMessage());
    }

    @Test
    void testServiceUnavailable_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(cause);
        // THEN - Assert that the exception's cause is equal to the provided RuntimeException
        assertSame(cause, exception.getCause());
    }

    @Test
    void testServiceUnavailable_WithMessageAndCause() {
        // GIVEN - Initialize a RuntimeException as the cause and a message
        String message = "Service unavailable";
        RuntimeException cause = new RuntimeException("Internal server error");
        ServiceUnavailable exception = new ServiceUnavailable(message, cause);
        // THEN - Assert that the exception message is equal to the provided message and the cause is equal to the provided RuntimeException
        assertEquals(message, exception.getMessage());
        assertSame(cause, exception.getCause());
    }
}




2025-07-28 15:12:01.829 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Refining code...
2025-07-28 15:12:01.829 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.ServiceUnavailableGeneratedAiTests.java}] - Done
*/
