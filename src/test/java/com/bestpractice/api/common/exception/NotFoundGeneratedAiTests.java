package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    // GIVEN - 
    // WHEN - 
    NotFound notFound = new NotFound();
    // THEN - assertNotNull(notFound);
  }

  @Test
  void testNotFoundString() {
    // GIVEN - String msg = "Resource not found";
    // WHEN - NotFound notFound = new NotFound(msg);
    // THEN - assertEquals("Resource not found", notFound.getMessage());
  }

  @Test
  void testNotFoundThrowable() {
    // GIVEN - Throwable cause = new RuntimeException();
    // WHEN - NotFound notFound = new NotFound(cause);
    // THEN - assertEquals(cause, notFound.getCause());
  }

  @Test
  void testNotFoundStringThrowable() {
    // GIVEN - String msg = "Resource not found";
    //         Throwable cause = new RuntimeException();
    // WHEN - NotFound notFound = new NotFound(msg, cause);
    // THEN - assertEquals("Resource not found", notFound.getMessage());
    //       assertEquals(cause, notFound.getCause());
  }
}

/*
2025-07-28 12:08:41.595 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:36)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-07-28 12:08:41.599 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generating code...
2025-07-28 12:08:41.599 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Using prompt:

There is an error in the previously generated test class.

>> ERROR:

[ERROR] COMPILATION ERROR : 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,40] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,61] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,30] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,71] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,31] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,74] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,52] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,117] ';' expected
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project demo-code-ai: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,40] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,61] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,30] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,71] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,31] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,74] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,52] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,117] ';' expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException


# TASK: Correct the error in the test class.

# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.

2025-07-28 12:08:41.599 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 12:09:51.341 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2459, outputTokenCount = 259, totalTokenCount = 2718 }
2025-07-28 12:09:51.341 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:09:51.341 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}




2025-07-28 12:09:51.341 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Refining code...
2025-07-28 12:09:51.341 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:10:35.967 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-07-28 12:10:35.967 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generating code...
2025-07-28 12:10:35.967 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add semicolons at the end of each line that is missing them. 
]

In this code:

package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}


# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-07-28 12:10:35.967 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 12:11:01.619 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3182, outputTokenCount = 348, totalTokenCount = 3530 }
2025-07-28 12:11:01.619 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:11:01.619 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}




2025-07-28 12:11:01.619 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Refining code...
2025-07-28 12:11:01.619 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:11:05.307 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-07-28 12:11:05.307 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generating code...
2025-07-28 12:11:05.307 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add semicolons at the end of each line that is missing them. 
]

In this code:

package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}

# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-07-28 12:11:05.307 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 12:12:12.367 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3994, outputTokenCount = 348, totalTokenCount = 4342 }
2025-07-28 12:12:12.369 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:12:12.369 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}




2025-07-28 12:12:12.369 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Refining code...
2025-07-28 12:12:12.369 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:12:15.697 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-07-28 12:12:15.697 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generating code...
2025-07-28 12:12:15.697 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add semicolons at the end of each line that is missing them. 
]

In this code:

package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}

# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-07-28 12:12:15.697 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 12:13:23.013 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 4806, outputTokenCount = 348, totalTokenCount = 5154 }
2025-07-28 12:13:23.013 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:13:23.013 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}




2025-07-28 12:13:23.013 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Refining code...
2025-07-28 12:13:23.015 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 14:55:45.407 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:55:45.407 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:34)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-07-28 14:55:45.407 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generating code...
2025-07-28 14:55:45.407 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class NotFound extends RuntimeException {
  public NotFound() {
    super();
  }

  public NotFound(String msg) {
    super(msg);
  }

  public NotFound(Throwable cause) {
    super(cause);
  }

  public NotFound(String msg, Throwable cause) {
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

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}
/*
2025-07-28 12:08:41.595 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:36)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-07-28 12:08:41.599 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generating code...
2025-07-28 12:08:41.599 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Using prompt:

There is an error in the previously generated test class.

>> ERROR:

[ERROR] COMPILATION ERROR : 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,40] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,61] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,30] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,71] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,31] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,74] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,52] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,117] ';' expected
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project demo-code-ai: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,40] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,61] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,30] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,71] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,31] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,74] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,52] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,117] ';' expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException


# TASK: Correct the error in the test class.

# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.

2025-07-28 12:08:41.599 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 12:09:51.341 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2459, outputTokenCount = 259, totalTokenCount = 2718 }
2025-07-28 12:09:51.341 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:09:51.341 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}




2025-07-28 12:09:51.341 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Refining code...
2025-07-28 12:09:51.341 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:10:35.967 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-07-28 12:10:35.967 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generating code...
2025-07-28 12:10:35.967 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add semicolons at the end of each line that is missing them. 
]

In this code:

package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}


# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-07-28 12:10:35.967 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 12:11:01.619 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3182, outputTokenCount = 348, totalTokenCount = 3530 }
2025-07-28 12:11:01.619 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:11:01.619 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}




2025-07-28 12:11:01.619 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Refining code...
2025-07-28 12:11:01.619 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:11:05.307 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-07-28 12:11:05.307 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generating code...
2025-07-28 12:11:05.307 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add semicolons at the end of each line that is missing them. 
]

In this code:

package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}

# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-07-28 12:11:05.307 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 12:12:12.367 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3994, outputTokenCount = 348, totalTokenCount = 4342 }
2025-07-28 12:12:12.369 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:12:12.369 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}




2025-07-28 12:12:12.369 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Refining code...
2025-07-28 12:12:12.369 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:12:15.697 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-07-28 12:12:15.697 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generating code...
2025-07-28 12:12:15.697 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add semicolons at the end of each line that is missing them. 
]

In this code:

package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}

# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-07-28 12:12:15.697 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 12:13:23.013 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 4806, outputTokenCount = 348, totalTokenCount = 5154 }
2025-07-28 12:13:23.013 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 12:13:23.013 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {

  @BeforeEach
  void setUp() {
  }

  @Test
  void testNotFound() {
    GIVEN("A new instance of NotFound") WHEN(new NotFound()) THEN(assertNotNull(it));
  }

  @Test
  void testNotFoundMessage() {
    GIVEN("A message string") WHEN(new NotFound("Resource not found")) THEN(assertEquals("Resource not found", it.getMessage()));
  }

  @Test
  void testNotFoundCause() {
    GIVEN("A Throwable cause") WHEN(new NotFound(new RuntimeException())) THEN(assertNotNull(it.getCause()));
  }

  @Test
  void testNotFoundMessageAndCause() {
    GIVEN("A message string and a Throwable cause") WHEN(new NotFound("Resource not found", new RuntimeException())) THEN(assertEquals("Resource not found", it.getMessage()) && assertNotNull(it.getCause()));
  }
}




2025-07-28 12:13:23.013 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Refining code...
2025-07-28 12:13:23.015 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
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

Correct the following error:

[ERROR] COMPILATION ERROR : 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,40] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,61] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,30] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,71] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,31] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,74] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,52] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,117] ';' expected
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project demo-code-ai: Compilation failure: Compilation failure: 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,40] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[22,61] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,30] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[27,71] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,31] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[32,74] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,52] ';' expected
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/common/exception/NotFoundGeneratedAiTests.java:[37,117] ';' expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException


# REQUIREMENTS:
1. Respond with the corrected class code.
2. Do not provide explanations or comments.

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-07-28 14:55:45.407 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:55:53.445 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2135, outputTokenCount = 99, totalTokenCount = 2234 }
2025-07-28 14:55:53.445 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 14:55:53.445 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generated code:
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor() {
        NotFound exception = new NotFound("Resource not found");
        assertEquals("Resource not found", exception.getMessage());
    }
}



2025-07-28 14:55:53.445 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Refining code...
2025-07-28 14:55:53.445 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 14:56:14.507 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:56:14.507 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generating code...
2025-07-28 14:56:14.507 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class NotFound extends RuntimeException {
  public NotFound() {
    super();
  }

  public NotFound(String msg) {
    super(msg);
  }

  public NotFound(Throwable cause) {
    super(cause);
  }

  public NotFound(String msg, Throwable cause) {
    super(msg, cause);
  }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor() {
        NotFound exception = new NotFound("Resource not found");
        assertEquals("Resource not found", exception.getMessage());
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

2025-07-28 14:56:14.507 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:56:43.629 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3161, outputTokenCount = 146, totalTokenCount = 3307 }
2025-07-28 14:56:43.629 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 14:56:43.629 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NotFoundGeneratedAiTests {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor_WithMessage() {
        NotFound exception = new NotFound("Resource not found");
        assertEquals("Resource not found", exception.getMessage());
    }

    @Test
    void testConstructor_WithoutMessage() {
        NotFound exception = new NotFound();
        assertNotNull(exception.getMessage());
    }
}




2025-07-28 14:56:43.629 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Refining code...
2025-07-28 14:56:43.629 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 14:57:02.872 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 14:57:02.874 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generating code...
2025-07-28 14:57:02.874 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.exception;

public class NotFound extends RuntimeException {
  public NotFound() {
    super();
  }

  public NotFound(String msg) {
    super(msg);
  }

  public NotFound(Throwable cause) {
    super(cause);
  }

  public NotFound(String msg, Throwable cause) {
    super(msg, cause);
  }

}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotFoundGeneratedAiTests {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor() {
        NotFound exception = new NotFound("Resource not found");
        assertEquals("Resource not found", exception.getMessage());
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

2025-07-28 14:57:02.874 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 14:57:18.614 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 4234, outputTokenCount = 146, totalTokenCount = 4380 }
2025-07-28 14:57:18.614 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
2025-07-28 14:57:18.614 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NotFoundGeneratedAiTests {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor_WithMessage() {
        NotFound exception = new NotFound("Resource not found");
        assertEquals("Resource not found", exception.getMessage());
    }

    @Test
    void testConstructor_WithoutMessage() {
        NotFound exception = new NotFound();
        assertNotNull(exception.getMessage());
    }
}




2025-07-28 14:57:18.614 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Refining code...
2025-07-28 14:57:18.614 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.exception.NotFoundGeneratedAiTests.java}] - Done
*/
