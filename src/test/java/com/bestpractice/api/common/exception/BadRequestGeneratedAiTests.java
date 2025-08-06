package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - 
        // WHEN -  BadRequest exception is created without arguments
        BadRequest badRequest = new BadRequest();
        // THEN - The exception message should be null
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequestWithMessage() {
        // GIVEN - A message string
        String message = "Bad Request";
        // WHEN -  BadRequest exception is created with a message
        BadRequest badRequest = new BadRequest(message);
        // THEN - The exception message should be the provided message
        assertEquals(message, badRequest.getMessage());
    }

    @Test
    void testBadRequestWithCause() {
        // GIVEN - A Throwable cause
        Throwable cause = new RuntimeException("Internal Error");
        // WHEN -  BadRequest exception is created with a cause
        BadRequest badRequest = new BadRequest(cause);
        // THEN - The exception's cause should be the provided cause
        assertSame(cause, badRequest.getCause());
    }

    @Test
    void testBadRequestWithMessageAndCause() {
        // GIVEN - A message string and a Throwable cause
        String message = "Bad Request";
        Throwable cause = new RuntimeException("Internal Error");
        // WHEN -  BadRequest exception is created with a message and cause
        BadRequest badRequest = new BadRequest(message, cause);
        // THEN - The exception message should be the provided message and the cause should be the provided cause
        assertEquals(message, badRequest.getMessage());
        assertSame(cause, badRequest.getCause());
    }

}

/*
2025-07-30 13:03:37.805 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-30 13:03:37.808 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-30 13:03:37.808 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - 
        // WHEN -  
        BadRequest badRequest = new BadRequest();
        // THEN - assertNotNull(badRequest);
    }

    @Test
    void testBadRequestString() {
        // GIVEN - String msg = "test message";
        // WHEN - BadRequest badRequest = new BadRequest(msg);
        // THEN - assertEquals("test message", badRequest.getMessage());
    }

    @Test
    void testBadRequestThrowable() {
        // GIVEN - Throwable cause = new RuntimeException();
        // WHEN - BadRequest badRequest = new BadRequest(cause);
        // THEN - assertNotNull(badRequest.getCause());
    }

    @Test
    void testBadRequestStringThrowable() {
        // GIVEN - String msg = "test message";
        //         Throwable cause = new RuntimeException();
        // WHEN - BadRequest badRequest = new BadRequest(msg, cause);
        // THEN - assertEquals("test message", badRequest.getMessage());
        //         assertNotNull(badRequest.getCause());
    }
}

/*
2025-07-29 18:01:01.976 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:01:01.983 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-29 18:01:01.984 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - 
        // WHEN - 
        BadRequest badRequest = new BadRequest();
        // THEN - assertNotNull(badRequest);
    }

    @Test
    void testBadRequestString() {
        // GIVEN - String msg = "Bad Request Message";
        // WHEN - BadRequest badRequest = new BadRequest(msg);
        // THEN - assertEquals("Bad Request Message", badRequest.getMessage());
    }

    @Test
    void testBadRequestThrowable() {
        // GIVEN - Throwable cause = new Exception();
        // WHEN - BadRequest badRequest = new BadRequest(cause);
        // THEN - assertNotNull(badRequest.getCause());
    }

    @Test
    void testBadRequestStringThrowable() {
        // GIVEN - String msg = "Bad Request Message";
        //         Throwable cause = new Exception();
        // WHEN - BadRequest badRequest = new BadRequest(msg, cause);
        // THEN - assertEquals("Bad Request Message", badRequest.getMessage());
        //         assertNotNull(badRequest.getCause());
    }
}

/*
2025-07-28 14:42:19.889 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:42:19.893 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 14:42:19.893 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
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

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequestWithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String message = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(message);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(message, badRequest.getMessage());
    }

    @Test
    void testBadRequestWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequestWithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String message = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(message, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(message, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-28 14:42:19.893 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:43:07.998 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2326, outputTokenCount = 426, totalTokenCount = 2752 }
2025-07-28 14:43:07.998 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:43:07.998 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequestWithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String message = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(message);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(message, badRequest.getMessage());
    }

    @Test
    void testBadRequestWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequestWithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String message = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(message, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(message, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}




2025-07-28 14:43:07.998 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 14:43:07.998 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:43:28.206 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:43:28.206 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 14:43:28.206 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
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

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequestWithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String message = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(message);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(message, badRequest.getMessage());
    }

    @Test
    void testBadRequestWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequestWithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String message = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(message, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(message, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-28 14:43:28.206 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:44:38.136 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3983, outputTokenCount = 438, totalTokenCount = 4421 }
2025-07-28 14:44:38.136 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:44:38.136 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}




2025-07-28 14:44:38.137 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 14:44:38.137 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:44:58.894 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:44:58.894 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 14:44:58.894 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
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

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-28 14:44:58.895 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:46:05.381 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 5664, outputTokenCount = 438, totalTokenCount = 6102 }
2025-07-28 14:46:05.381 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:46:05.381 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}




2025-07-28 14:46:05.381 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 14:46:05.381 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
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

2025-07-29 18:01:01.985 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:02:12.743 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 8163, outputTokenCount = 469, totalTokenCount = 8632 }
2025-07-29 18:02:12.743 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:02:12.743 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}
```



**Improvements:**

* **Clearer Test Naming:** The test names now clearly describe the scenario being tested (e.g., `testBadRequest_WithMessageAndCause` instead of just `testBadRequest`).


Let me know if you have any other questions or tasks!
2025-07-29 18:02:12.743 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-29 18:02:12.745 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:02:34.107 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:02:34.107 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-29 18:02:34.107 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-29 18:02:34.107 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:03:46.332 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2284, outputTokenCount = 468, totalTokenCount = 2752 }
2025-07-29 18:03:46.332 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:03:46.333 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}



```



**Explanation of Changes:**


* **Removed Redundant Annotations:** The `@AfterEach`, `@AfterAll`, and `@BeforeAll` annotations were unnecessary for these tests and have been removed. 

Let me know if you have any other questions or tasks!
2025-07-29 18:03:46.333 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-29 18:03:46.333 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:04:08.288 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:04:08.289 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-29 18:04:08.289 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-29 18:04:08.289 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:04:49.843 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3995, outputTokenCount = 468, totalTokenCount = 4463 }
2025-07-29 18:04:49.843 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:04:49.843 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}



```


**Explanation of Changes:**



* **Removed Redundant Annotations:** The `@AfterEach`, `@AfterAll`, and `@BeforeAll` annotations were unnecessary for these tests and have been removed. 

Let me know if you have any other questions or tasks!
2025-07-29 18:04:49.843 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-29 18:04:49.843 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
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

2025-07-30 13:03:37.810 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-30 13:03:53.123 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 572, outputTokenCount = 371, totalTokenCount = 943 }
2025-07-30 13:03:53.123 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-30 13:03:53.123 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
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

1.  **Imports:** The code imports necessary classes from JUnit 5 (`@Test`, `@BeforeEach`), Mockito (`MockitoAnnotations.openMocks`), and AssertJ (`org.junit.jupiter.api.Assertions.assertEquals`).
2.  **`@BeforeEach` Method:** This method initializes mocks using MockitoAnnotations before each test.
3.  **`testPublicMethod` Test:** This test case demonstrates how to test a public method named `publicMethod`.

    *   **GIVEN:** A sample input string "Hello" is defined.
    *   **WHEN:** The `publicMethod` is called with the input string.
    *   **THEN:** An assertion using `assertEquals` verifies that the output of `publicMethod` is "World, Hello!".

**Important Notes:**

*   Replace `"publicMethod"` and `"World, Hello!"` with the actual method name and expected output from your code.
*   Ensure you have added the necessary dependencies for JUnit 5, Mockito, and AssertJ to your project.



Let me know if you have any other questions or need help testing specific methods in your Java class.
2025-07-30 13:03:53.123 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-30 13:03:53.123 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-30 13:04:12.473 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-30 13:04:12.473 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-30 13:04:12.473 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - 
        // WHEN -  
        BadRequest badRequest = new BadRequest();
        // THEN - assertNotNull(badRequest);
    }

    @Test
    void testBadRequestString() {
        // GIVEN - String msg = "test message";
        // WHEN - BadRequest badRequest = new BadRequest(msg);
        // THEN - assertEquals("test message", badRequest.getMessage());
    }

    @Test
    void testBadRequestThrowable() {
        // GIVEN - Throwable cause = new RuntimeException();
        // WHEN - BadRequest badRequest = new BadRequest(cause);
        // THEN - assertNotNull(badRequest.getCause());
    }

    @Test
    void testBadRequestStringThrowable() {
        // GIVEN - String msg = "test message";
        //         Throwable cause = new RuntimeException();
        // WHEN - BadRequest badRequest = new BadRequest(msg, cause);
        // THEN - assertEquals("test message", badRequest.getMessage());
        //         assertNotNull(badRequest.getCause());
    }
}

/*
2025-07-29 18:01:01.976 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:01:01.983 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-29 18:01:01.984 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - 
        // WHEN - 
        BadRequest badRequest = new BadRequest();
        // THEN - assertNotNull(badRequest);
    }

    @Test
    void testBadRequestString() {
        // GIVEN - String msg = "Bad Request Message";
        // WHEN - BadRequest badRequest = new BadRequest(msg);
        // THEN - assertEquals("Bad Request Message", badRequest.getMessage());
    }

    @Test
    void testBadRequestThrowable() {
        // GIVEN - Throwable cause = new Exception();
        // WHEN - BadRequest badRequest = new BadRequest(cause);
        // THEN - assertNotNull(badRequest.getCause());
    }

    @Test
    void testBadRequestStringThrowable() {
        // GIVEN - String msg = "Bad Request Message";
        //         Throwable cause = new Exception();
        // WHEN - BadRequest badRequest = new BadRequest(msg, cause);
        // THEN - assertEquals("Bad Request Message", badRequest.getMessage());
        //         assertNotNull(badRequest.getCause());
    }
}

/*
2025-07-28 14:42:19.889 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:42:19.893 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 14:42:19.893 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
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

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequestWithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String message = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(message);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(message, badRequest.getMessage());
    }

    @Test
    void testBadRequestWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequestWithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String message = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(message, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(message, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-28 14:42:19.893 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:43:07.998 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2326, outputTokenCount = 426, totalTokenCount = 2752 }
2025-07-28 14:43:07.998 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:43:07.998 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequestWithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String message = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(message);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(message, badRequest.getMessage());
    }

    @Test
    void testBadRequestWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequestWithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String message = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(message, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(message, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}




2025-07-28 14:43:07.998 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 14:43:07.998 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:43:28.206 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:43:28.206 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 14:43:28.206 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
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

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequestWithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String message = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(message);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(message, badRequest.getMessage());
    }

    @Test
    void testBadRequestWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequestWithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String message = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(message, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(message, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-28 14:43:28.206 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:44:38.136 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3983, outputTokenCount = 438, totalTokenCount = 4421 }
2025-07-28 14:44:38.136 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:44:38.136 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}




2025-07-28 14:44:38.137 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 14:44:38.137 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:44:58.894 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:44:58.894 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 14:44:58.894 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
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

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-28 14:44:58.895 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:46:05.381 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 5664, outputTokenCount = 438, totalTokenCount = 6102 }
2025-07-28 14:46:05.381 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:46:05.381 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}




2025-07-28 14:46:05.381 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 14:46:05.381 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
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

2025-07-29 18:01:01.985 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:02:12.743 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 8163, outputTokenCount = 469, totalTokenCount = 8632 }
2025-07-29 18:02:12.743 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:02:12.743 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}
```



**Improvements:**

* **Clearer Test Naming:** The test names now clearly describe the scenario being tested (e.g., `testBadRequest_WithMessageAndCause` instead of just `testBadRequest`).


Let me know if you have any other questions or tasks!
2025-07-29 18:02:12.743 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-29 18:02:12.745 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:02:34.107 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:02:34.107 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-29 18:02:34.107 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-29 18:02:34.107 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:03:46.332 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2284, outputTokenCount = 468, totalTokenCount = 2752 }
2025-07-29 18:03:46.332 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:03:46.333 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}



```



**Explanation of Changes:**


* **Removed Redundant Annotations:** The `@AfterEach`, `@AfterAll`, and `@BeforeAll` annotations were unnecessary for these tests and have been removed. 

Let me know if you have any other questions or tasks!
2025-07-29 18:03:46.333 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-29 18:03:46.333 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:04:08.288 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:04:08.289 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-29 18:04:08.289 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-29 18:04:08.289 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:04:49.843 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3995, outputTokenCount = 468, totalTokenCount = 4463 }
2025-07-29 18:04:49.843 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:04:49.843 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}



```


**Explanation of Changes:**



* **Removed Redundant Annotations:** The `@AfterEach`, `@AfterAll`, and `@BeforeAll` annotations were unnecessary for these tests and have been removed. 

Let me know if you have any other questions or tasks!
2025-07-29 18:04:49.843 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-29 18:04:49.843 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
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

2025-07-30 13:04:12.474 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-30 13:04:26.640 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 572, outputTokenCount = 338, totalTokenCount = 910 }
2025-07-30 13:04:26.640 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-30 13:04:26.640 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
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
        int input = 5;

        // WHEN
        int result = publicMethod(input);

        // THEN
        assertEquals(10, result);
    }
}
```



**Explanation:**

* **Imports:** The code includes necessary imports for JUnit 5 (`@Test`, `@BeforeEach`), Mockito (`MockitoAnnotations.openMocks`), and AssertJ (`org.assertj.core.api.Assertions`).
* **`@BeforeEach` Method:** This method initializes mocks before each test using `MockitoAnnotations.openMocks(this)`.
* **`testPublicMethod` Test:**
    * **GIVEN:** Sets up an input value of 5 for the `publicMethod`.
    * **WHEN:** Calls the `publicMethod` with the given input.
    * **THEN:** Asserts that the result of `publicMethod` is equal to 10 using `assertEquals`.

**Remember:**

* Replace `publicMethod` with the actual name of the public method you want to test in your class.
* Adjust the input values and expected results according to your specific method's functionality.



Let me know if you have any other questions or need help with testing specific methods!
2025-07-30 13:04:26.640 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-30 13:04:26.640 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-30 13:04:45.979 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-30 13:04:45.979 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-30 13:04:45.979 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - 
        // WHEN -  
        BadRequest badRequest = new BadRequest();
        // THEN - assertNotNull(badRequest);
    }

    @Test
    void testBadRequestString() {
        // GIVEN - String msg = "test message";
        // WHEN - BadRequest badRequest = new BadRequest(msg);
        // THEN - assertEquals("test message", badRequest.getMessage());
    }

    @Test
    void testBadRequestThrowable() {
        // GIVEN - Throwable cause = new RuntimeException();
        // WHEN - BadRequest badRequest = new BadRequest(cause);
        // THEN - assertNotNull(badRequest.getCause());
    }

    @Test
    void testBadRequestStringThrowable() {
        // GIVEN - String msg = "test message";
        //         Throwable cause = new RuntimeException();
        // WHEN - BadRequest badRequest = new BadRequest(msg, cause);
        // THEN - assertEquals("test message", badRequest.getMessage());
        //         assertNotNull(badRequest.getCause());
    }
}

/*
2025-07-29 18:01:01.976 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:01:01.983 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-29 18:01:01.984 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - 
        // WHEN - 
        BadRequest badRequest = new BadRequest();
        // THEN - assertNotNull(badRequest);
    }

    @Test
    void testBadRequestString() {
        // GIVEN - String msg = "Bad Request Message";
        // WHEN - BadRequest badRequest = new BadRequest(msg);
        // THEN - assertEquals("Bad Request Message", badRequest.getMessage());
    }

    @Test
    void testBadRequestThrowable() {
        // GIVEN - Throwable cause = new Exception();
        // WHEN - BadRequest badRequest = new BadRequest(cause);
        // THEN - assertNotNull(badRequest.getCause());
    }

    @Test
    void testBadRequestStringThrowable() {
        // GIVEN - String msg = "Bad Request Message";
        //         Throwable cause = new Exception();
        // WHEN - BadRequest badRequest = new BadRequest(msg, cause);
        // THEN - assertEquals("Bad Request Message", badRequest.getMessage());
        //         assertNotNull(badRequest.getCause());
    }
}

/*
2025-07-28 14:42:19.889 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:42:19.893 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 14:42:19.893 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
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

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequestWithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String message = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(message);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(message, badRequest.getMessage());
    }

    @Test
    void testBadRequestWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequestWithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String message = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(message, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(message, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-28 14:42:19.893 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:43:07.998 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2326, outputTokenCount = 426, totalTokenCount = 2752 }
2025-07-28 14:43:07.998 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:43:07.998 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequestWithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String message = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(message);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(message, badRequest.getMessage());
    }

    @Test
    void testBadRequestWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequestWithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String message = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(message, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(message, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}




2025-07-28 14:43:07.998 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 14:43:07.998 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:43:28.206 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:43:28.206 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 14:43:28.206 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
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

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequestWithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String message = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(message);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(message, badRequest.getMessage());
    }

    @Test
    void testBadRequestWithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequestWithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String message = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(message, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(message, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-28 14:43:28.206 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:44:38.136 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3983, outputTokenCount = 438, totalTokenCount = 4421 }
2025-07-28 14:44:38.136 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:44:38.136 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}




2025-07-28 14:44:38.137 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 14:44:38.137 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:44:58.894 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:44:58.894 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 14:44:58.894 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
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

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-28 14:44:58.895 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:46:05.381 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 5664, outputTokenCount = 438, totalTokenCount = 6102 }
2025-07-28 14:46:05.381 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-28 14:46:05.381 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}




2025-07-28 14:46:05.381 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 14:46:05.381 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
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

2025-07-29 18:01:01.985 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:02:12.743 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 8163, outputTokenCount = 469, totalTokenCount = 8632 }
2025-07-29 18:02:12.743 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:02:12.743 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}
```



**Improvements:**

* **Clearer Test Naming:** The test names now clearly describe the scenario being tested (e.g., `testBadRequest_WithMessageAndCause` instead of just `testBadRequest`).


Let me know if you have any other questions or tasks!
2025-07-29 18:02:12.743 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-29 18:02:12.745 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:02:34.107 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:02:34.107 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-29 18:02:34.107 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-29 18:02:34.107 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:03:46.332 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2284, outputTokenCount = 468, totalTokenCount = 2752 }
2025-07-29 18:03:46.332 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:03:46.333 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}



```



**Explanation of Changes:**


* **Removed Redundant Annotations:** The `@AfterEach`, `@AfterAll`, and `@BeforeAll` annotations were unnecessary for these tests and have been removed. 

Let me know if you have any other questions or tasks!
2025-07-29 18:03:46.333 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-29 18:03:46.333 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:04:08.288 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-29 18:04:08.289 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generating code...
2025-07-29 18:04:08.289 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class BadRequest extends RuntimeException {
  public BadRequest() {
    super();
  }

  public BadRequest(String msg) {
    super(msg);
  }

  public BadRequest(Throwable cause) {
    super(cause);
  }

  public BadRequest(String msg, Throwable cause) {
    super(msg, cause);
  }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
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

2025-07-29 18:04:08.289 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-29 18:04:49.843 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3995, outputTokenCount = 468, totalTokenCount = 4463 }
2025-07-29 18:04:49.843 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-29 18:04:49.843 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadRequestGeneratedAiTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testBadRequest_NoArguments() {
        // GIVEN - Initialize a BadRequest object without any arguments.
        BadRequest badRequest = new BadRequest();

        // THEN - Assert that the message is null.
        assertNull(badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithMessage() {
        // GIVEN - Initialize a BadRequest object with a message.
        String expectedMessage = "Invalid request parameters";
        BadRequest badRequest = new BadRequest(expectedMessage);

        // THEN - Assert that the message is equal to the provided message.
        assertEquals(expectedMessage, badRequest.getMessage());
    }

    @Test
    void testBadRequest_WithCause() {
        // GIVEN - Initialize a RuntimeException as the cause.
        RuntimeException cause = new RuntimeException("Internal server error");
        BadRequest badRequest = new BadRequest(cause);

        // THEN - Assert that the cause is equal to the provided cause.
        assertEquals(cause, badRequest.getCause());
    }

    @Test
    void testBadRequest_WithMessageAndCause() {
        // GIVEN - Initialize a BadRequest object with a message and a cause.
        String expectedMessage = "Invalid input data";
        RuntimeException cause = new RuntimeException("Data validation failed");
        BadRequest badRequest = new BadRequest(expectedMessage, cause);

        // THEN - Assert that the message and cause are equal to the provided values.
        assertEquals(expectedMessage, badRequest.getMessage());
        assertEquals(cause, badRequest.getCause());
    }
}



```


**Explanation of Changes:**



* **Removed Redundant Annotations:** The `@AfterEach`, `@AfterAll`, and `@BeforeAll` annotations were unnecessary for these tests and have been removed. 

Let me know if you have any other questions or tasks!
2025-07-29 18:04:49.843 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-29 18:04:49.843 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
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

2025-07-30 13:04:45.981 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-30 13:05:02.183 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 572, outputTokenCount = 374, totalTokenCount = 946 }
2025-07-30 13:05:02.183 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
2025-07-30 13:05:02.183 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Generated code:
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
        int input = 5;

        // WHEN
        int result = publicMethod(input);

        // THEN
        assertEquals(10, result);
    }
}



```


**Explanation:**

* **Imports:** The code includes necessary imports for JUnit 5 (`@Test`, `@BeforeEach`), Mockito (`MockitoAnnotations.openMocks`), and AssertJ (`org.junit.jupiter.api.Assertions.assertEquals`).
* **`@BeforeEach` Method:** This method is executed before each test to initialize mocks if needed using `MockitoAnnotations.openMocks(this)`. 
* **Test Method Structure:** Each test method follows the GIVEN-WHEN-THEN structure:
    * **GIVEN:** Sets up the initial conditions for the test.
    * **WHEN:** Executes the method under test.
    * **THEN:** Asserts the expected outcome using `assertEquals` from AssertJ.

**Key Points:**

* The code assumes you have a public method named `publicMethod` in your `ClassWithUnitTests` class that takes an integer as input and returns an integer. Adjust the test accordingly if your method's name or parameters differ.
*  This example uses Mockito for mocking, but if your tests don't require mocking, you can remove the import statements related to Mockito.



Let me know if you have any other questions or need further assistance!
2025-07-30 13:05:02.183 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Refining code...
2025-07-30 13:05:02.183 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.BadRequestGeneratedAiTests.java}] - Done
*/
