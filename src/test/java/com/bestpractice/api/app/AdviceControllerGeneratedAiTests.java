package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN - 
        // WHEN -  
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}


/*
2025-08-04 09:38:42.944 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:36)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-08-04 09:38:42.951 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generating code...
2025-08-04 09:38:42.951 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Using prompt:

There is an error in the previously generated test class.

>> ERROR:

[ERROR] COMPILATION ERROR :
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[29,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[40,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[51,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[62,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[73,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[84,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[95,9] cannot find symbol
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project demo-code-ai: Compilation failure: Compilation failure:
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[29,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[40,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[51,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[62,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[73,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[84,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[95,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
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

2025-08-04 09:38:42.951 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-04 09:39:24.890 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3924, outputTokenCount = 683, totalTokenCount = 4607 }
2025-08-04 09:39:24.891 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:39:24.891 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}



```



2025-08-04 09:39:24.891 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Refining code...
2025-08-04 09:39:24.893 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:39:32.820 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-08-04 09:39:32.820 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generating code...
2025-08-04 09:39:32.820 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add the `ErrorResponse` class to your project.
]

In this code:

package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}


# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-08-04 09:39:32.820 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-04 09:40:26.321 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 5513, outputTokenCount = 682, totalTokenCount = 6195 }
2025-08-04 09:40:26.322 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:40:26.322 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}



```
2025-08-04 09:40:26.322 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Refining code...
2025-08-04 09:40:26.323 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:40:30.474 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-08-04 09:40:30.474 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generating code...
2025-08-04 09:40:30.474 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add the `ErrorResponse` class to your project.
]

In this code:

package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}


# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-08-04 09:40:30.474 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-04 09:41:20.446 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 7101, outputTokenCount = 682, totalTokenCount = 7783 }
2025-08-04 09:41:20.446 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:41:20.446 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}



```
2025-08-04 09:41:20.446 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Refining code...
2025-08-04 09:41:20.446 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:41:24.753 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-08-04 09:41:24.753 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generating code...
2025-08-04 09:41:24.753 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add the `ErrorResponse` class to your project.
]

In this code:

package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}


# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-08-04 09:41:24.753 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-04 09:42:29.299 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 7955, outputTokenCount = 682, totalTokenCount = 8637 }
2025-08-04 09:42:29.299 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:42:29.299 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}



```
2025-08-04 09:42:29.299 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Refining code...
2025-08-04 09:42:29.300 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 13:21:54.972 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-08-04 13:21:54.972 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:34)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-08-04 13:21:54.972 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generating code...
2025-08-04 13:21:54.972 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.BadRequest;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.common.exception.Forbidden;
import com.bestpractice.api.common.exception.NotFound;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class AdviceController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BadRequest.class)
    public ErrorResponse badRequest() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(400);
        res.setError("Bad request");
        res.setMessage("Bad request parameter");
        return res;
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnAuthorized.class)
    public ErrorResponse unAuthorized() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(401);
        res.setError("Unauthorized");
        res.setMessage("Incorrect authentication info");
        return res;
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(Forbidden.class)
    public ErrorResponse forbidden() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(403);
        res.setError("Forbidden");
        res.setMessage("Not allowed");
        return res;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public ErrorResponse notFound01() {
        return shareNotFound();
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFound.class)
    public ErrorResponse notFound02() {
        return shareNotFound();
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(Conflict.class)
    public ErrorResponse conflict() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(409);
        res.setError("Conflict");
        res.setMessage("Already exist data");
        return res;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponse serverError(Exception e)   {
        e.printStackTrace();
        ErrorResponse res = new ErrorResponse();
        res.setStatus(500);
        res.setError("Internal server error");
        res.setMessage("Internal server error");
        return res;
    }

    private ErrorResponse shareNotFound() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(404);
        res.setError("Not found");
        res.setMessage("Not found path");
        return res;
    }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}

/*
2025-08-04 09:38:42.944 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:36)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-08-04 09:38:42.951 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generating code...
2025-08-04 09:38:42.951 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Using prompt:

There is an error in the previously generated test class.

>> ERROR:

[ERROR] COMPILATION ERROR :
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[29,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[40,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[51,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[62,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[73,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[84,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[95,9] cannot find symbol
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project demo-code-ai: Compilation failure: Compilation failure:
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[29,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[40,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[51,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[62,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[73,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[84,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[95,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
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

2025-08-04 09:38:42.951 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-04 09:39:24.890 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 3924, outputTokenCount = 683, totalTokenCount = 4607 }
2025-08-04 09:39:24.891 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:39:24.891 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}



```



2025-08-04 09:39:24.891 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Refining code...
2025-08-04 09:39:24.893 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:39:32.820 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-08-04 09:39:32.820 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generating code...
2025-08-04 09:39:32.820 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add the `ErrorResponse` class to your project.
]

In this code:

package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}


# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-08-04 09:39:32.820 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-04 09:40:26.321 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 5513, outputTokenCount = 682, totalTokenCount = 6195 }
2025-08-04 09:40:26.322 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:40:26.322 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}



```
2025-08-04 09:40:26.322 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Refining code...
2025-08-04 09:40:26.323 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:40:30.474 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-08-04 09:40:30.474 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generating code...
2025-08-04 09:40:30.474 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add the `ErrorResponse` class to your project.
]

In this code:

package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}


# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-08-04 09:40:30.474 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-04 09:41:20.446 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 7101, outputTokenCount = 682, totalTokenCount = 7783 }
2025-08-04 09:41:20.446 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:41:20.446 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}



```
2025-08-04 09:41:20.446 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Refining code...
2025-08-04 09:41:20.446 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:41:24.753 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:33)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt with explanation how to fix issue...
2025-08-04 09:41:24.753 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generating code...
2025-08-04 09:41:24.753 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Using prompt:

There is this issue with code and how to fix it, provide only code, no other explanations:

Optional[Add the `ErrorResponse` class to your project.
]

In this code:

package com.bestpractice.api.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}


# Instructions:
1. Focus on the specific error given.
2. Ensure that the corrected code passes and assertions are valid.
3. Keep unrelated parts of the test unchanged.
4. Follow existing project standards, including naming and formatting.
5. Give output as a plain text

2025-08-04 09:41:24.753 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generate code iteration # 1
2025-08-04 09:42:29.299 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 7955, outputTokenCount = 682, totalTokenCount = 8637 }
2025-08-04 09:42:29.299 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 09:42:29.299 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generated code:
```java
package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdviceControllerGeneratedAiTests {

    private AdviceController adviceController;

    @BeforeEach
    void setUp() {
        adviceController = new AdviceController();
    }

    @Test
    void testBadRequest() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.badRequest();
        // THEN -
        assertEquals(400, errorResponse.getStatus());
        assertEquals("Bad request", errorResponse.getError());
        assertEquals("Bad request parameter", errorResponse.getMessage());
    }

    @Test
    void testUnAuthorized() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.unAuthorized();
        // THEN -
        assertEquals(401, errorResponse.getStatus());
        assertEquals("Unauthorized", errorResponse.getError());
        assertEquals("Incorrect authentication info", errorResponse.getMessage());
    }

    @Test
    void testForbidden() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.forbidden();
        // THEN -
        assertEquals(403, errorResponse.getStatus());
        assertEquals("Forbidden", errorResponse.getError());
        assertEquals("Not allowed", errorResponse.getMessage());
    }

    @Test
    void testNotFound01() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound01();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testNotFound02() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.notFound02();
        // THEN -
        assertEquals(404, errorResponse.getStatus());
        assertEquals("Not found", errorResponse.getError());
        assertEquals("Not found path", errorResponse.getMessage());
    }

    @Test
    void testConflict() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.conflict();
        // THEN -
        assertEquals(409, errorResponse.getStatus());
        assertEquals("Conflict", errorResponse.getError());
        assertEquals("Already exist data", errorResponse.getMessage());
    }

    @Test
    void testServerError() {
        // GIVEN -
        // WHEN -
        ErrorResponse errorResponse = adviceController.serverError(new Exception());
        // THEN -
        assertEquals(500, errorResponse.getStatus());
        assertEquals("Internal server error", errorResponse.getError());
        assertEquals("Internal server error", errorResponse.getMessage());
    }

}



```
2025-08-04 09:42:29.299 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Refining code...
2025-08-04 09:42:29.300 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
*/

/*
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
        [ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[29,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[40,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[51,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[62,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[73,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[84,9] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[95,9] cannot find symbol
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project demo-code-ai: Compilation failure: Compilation failure:
        [ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[29,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[40,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[51,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[62,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[73,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[84,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[95,9] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
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

        2025-08-04 13:21:54.974 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generate code iteration # 1
        2025-08-04 13:22:16.503 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2206, outputTokenCount = 326, totalTokenCount = 2532 }
2025-08-04 13:22:16.505 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 13:22:16.505 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generated code:
        import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.*;

class AdviceControllerGeneratedAiTests {
    @InjectMocks
    AdviceController adviceController;
    @Mock
    ErrorResponse errorResponse;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetAdvice_ValidInput_ReturnsResponseEntityOkWithAdvice() {
        String input = "test";
        when(adviceController.getAdvice(input)).thenReturn("This is some advice");
        ResponseEntity<String> response = adviceController.getAdvice(input);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("This is some advice");
    }

    @Test
    void testGetAdvice_InvalidInput_ReturnsResponseEntityBadRequestWithErrorResponse() {
        String input = "test";
        when(adviceController.getAdvice(input)).thenReturn(null);
        ResponseEntity<ErrorResponse> response = adviceController.getAdvice(input);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody()).isNotNull();
    }
}




2025-08-04 13:22:16.505 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Refining code...
        2025-08-04 13:22:16.505 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 13:22:26.876 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
        2025-08-04 13:22:26.876 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:34)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
        2025-08-04 13:22:26.876 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generating code...
        2025-08-04 13:22:26.876 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Using prompt:

        >> INPUT JAVA here you can find original code of CLASS:

        package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.BadRequest;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.common.exception.Forbidden;
import com.bestpractice.api.common.exception.NotFound;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
        import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class AdviceController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BadRequest.class)
    public ErrorResponse badRequest() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(400);
        res.setError("Bad request");
        res.setMessage("Bad request parameter");
        return res;
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnAuthorized.class)
    public ErrorResponse unAuthorized() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(401);
        res.setError("Unauthorized");
        res.setMessage("Incorrect authentication info");
        return res;
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(Forbidden.class)
    public ErrorResponse forbidden() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(403);
        res.setError("Forbidden");
        res.setMessage("Not allowed");
        return res;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public ErrorResponse notFound01() {
        return shareNotFound();
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFound.class)
    public ErrorResponse notFound02() {
        return shareNotFound();
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(Conflict.class)
    public ErrorResponse conflict() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(409);
        res.setError("Conflict");
        res.setMessage("Already exist data");
        return res;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponse serverError(Exception e)   {
        e.printStackTrace();
        ErrorResponse res = new ErrorResponse();
        res.setStatus(500);
        res.setError("Internal server error");
        res.setMessage("Internal server error");
        return res;
    }

    private ErrorResponse shareNotFound() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(404);
        res.setError("Not found");
        res.setMessage("Not found path");
        return res;
    }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


        package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.*;

class AdviceControllerGeneratedAiTests {
    @InjectMocks
    AdviceController adviceController;
    @Mock
    ErrorResponse errorResponse;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetAdvice_ValidInput_ReturnsResponseEntityOkWithAdvice() {
        String input = "test";
        when(adviceController.getAdvice(input)).thenReturn("This is some advice");
        ResponseEntity<String> response = adviceController.getAdvice(input);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("This is some advice");
    }

    @Test
    void testGetAdvice_InvalidInput_ReturnsResponseEntityBadRequestWithErrorResponse() {
        String input = "test";
        when(adviceController.getAdvice(input)).thenReturn(null);
        ResponseEntity<ErrorResponse> response = adviceController.getAdvice(input);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody()).isNotNull();
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

Correct the following error:

        [ERROR] COMPILATION ERROR :
        [ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[22,5] cannot find symbol
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project demo-code-ai: Compilation failure
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[22,5] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
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

        2025-08-04 13:22:26.876 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generate code iteration # 1
        2025-08-04 13:23:15.774 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 4746, outputTokenCount = 341, totalTokenCount = 5087 }
2025-08-04 13:23:15.776 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 13:23:15.776 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generated code:
        import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import com.bestpractice.api.common.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.*;

class AdviceControllerGeneratedAiTests {
    @InjectMocks
    AdviceController adviceController;
    @Mock
    ErrorResponse errorResponse;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetAdvice_ValidInput_ReturnsResponseEntityOkWithAdvice() {
        String input = "test";
        when(adviceController.getAdvice(input)).thenReturn("This is some advice");
        ResponseEntity<String> response = adviceController.getAdvice(input);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("This is some advice");
    }

    @Test
    void testGetAdvice_InvalidInput_ReturnsResponseEntityBadRequestWithErrorResponse() {
        String input = "test";
        when(adviceController.getAdvice(input)).thenReturn(null);
        ResponseEntity<ErrorResponse> response = adviceController.getAdvice(input);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody()).isNotNull();
    }
}




2025-08-04 13:23:15.776 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Refining code...
        2025-08-04 13:23:15.776 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 13:23:26.725 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
        2025-08-04 13:23:26.725 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:34)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
        2025-08-04 13:23:26.726 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generating code...
        2025-08-04 13:23:26.726 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Using prompt:

        >> INPUT JAVA here you can find original code of CLASS:

        package com.bestpractice.api.app;

import com.bestpractice.api.common.exception.BadRequest;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.common.exception.Forbidden;
import com.bestpractice.api.common.exception.NotFound;
import com.bestpractice.api.common.exception.UnAuthorized;
import com.bestpractice.api.domain.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
        import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class AdviceController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BadRequest.class)
    public ErrorResponse badRequest() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(400);
        res.setError("Bad request");
        res.setMessage("Bad request parameter");
        return res;
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnAuthorized.class)
    public ErrorResponse unAuthorized() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(401);
        res.setError("Unauthorized");
        res.setMessage("Incorrect authentication info");
        return res;
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(Forbidden.class)
    public ErrorResponse forbidden() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(403);
        res.setError("Forbidden");
        res.setMessage("Not allowed");
        return res;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public ErrorResponse notFound01() {
        return shareNotFound();
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFound.class)
    public ErrorResponse notFound02() {
        return shareNotFound();
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(Conflict.class)
    public ErrorResponse conflict() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(409);
        res.setError("Conflict");
        res.setMessage("Already exist data");
        return res;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponse serverError(Exception e)   {
        e.printStackTrace();
        ErrorResponse res = new ErrorResponse();
        res.setStatus(500);
        res.setError("Internal server error");
        res.setMessage("Internal server error");
        return res;
    }

    private ErrorResponse shareNotFound() {
        ErrorResponse res = new ErrorResponse();
        res.setStatus(404);
        res.setError("Not found");
        res.setMessage("Not found path");
        return res;
    }
}


>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


        package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import com.bestpractice.api.common.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.*;

class AdviceControllerGeneratedAiTests {
    @InjectMocks
    AdviceController adviceController;
    @Mock
    ErrorResponse errorResponse;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetAdvice_ValidInput_ReturnsResponseEntityOkWithAdvice() {
        String input = "test";
        when(adviceController.getAdvice(input)).thenReturn("This is some advice");
        ResponseEntity<String> response = adviceController.getAdvice(input);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("This is some advice");
    }

    @Test
    void testGetAdvice_InvalidInput_ReturnsResponseEntityBadRequestWithErrorResponse() {
        String input = "test";
        when(adviceController.getAdvice(input)).thenReturn(null);
        ResponseEntity<ErrorResponse> response = adviceController.getAdvice(input);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody()).isNotNull();
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

Correct the following error:

        [ERROR] COMPILATION ERROR :
        [ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[14,45] cannot find symbol
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[23,5] cannot find symbol
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project demo-code-ai: Compilation failure: Compilation failure:
        [ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[14,45] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: package com.bestpractice.api.common.exception
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-12407096898664445545/src/test/java/com/bestpractice/api/app/AdviceControllerGeneratedAiTests.java:[23,5] cannot find symbol
[ERROR]   symbol:   class ErrorResponse
[ERROR]   location: class com.bestpractice.api.app.AdviceControllerGeneratedAiTests
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

        2025-08-04 13:23:26.726 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generate code iteration # 1
        2025-08-04 13:24:33.780 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 7509, outputTokenCount = 363, totalTokenCount = 7872 }
2025-08-04 13:24:33.780 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done
2025-08-04 13:24:33.781 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Generated code:
        import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import com.bestpractice.api.common.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.*;

class AdviceControllerGeneratedAiTests {
    @InjectMocks
    AdviceController adviceController;
    @Mock
    com.bestpractice.api.common.exception.ErrorResponse errorResponse;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testGetAdvice_ValidInput_ReturnsResponseEntityOkWithAdvice() {
        String input = "test";
        when(adviceController.getAdvice(input)).thenReturn("This is some advice");
        ResponseEntity<String> response = adviceController.getAdvice(input);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo("This is some advice");
    }

    @Test
    void testGetAdvice_InvalidInput_ReturnsResponseEntityBadRequestWithErrorResponse() {
        String input = "test";
        when(adviceController.getAdvice(input)).thenReturn(null);
        ResponseEntity<com.bestpractice.api.common.exception.ErrorResponse> response = adviceController.getAdvice(input);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody()).isNotNull();
    }
}




2025-08-04 13:24:33.781 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Refining code...
        2025-08-04 13:24:33.781 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.app.AdviceControllerGeneratedAiTests.java}] - Done

 */