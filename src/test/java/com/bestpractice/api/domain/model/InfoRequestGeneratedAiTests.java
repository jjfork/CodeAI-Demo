package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class InfoRequestGeneratedAiTests {

    private InfoRequest infoRequest;

    @BeforeEach
    void setUp() {
        infoRequest = new InfoRequest();
    }

    @Test
    void testConvert() {
        // GIVEN
        String id = "testId";
        infoRequest.setTitle("Test Title");
        infoRequest.setDescription("Test Description");
        // WHEN
        com.bestpractice.api.infrastrucuture.entity.Info info = infoRequest.convert(id);
        // THEN
        assertEquals(id, info.getId());
        assertEquals("Test Title", info.getTitle());
        assertEquals("Test Description", info.getDescription());
    }
}

/*
2025-07-28 12:40:36.049 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:36)] [{conversationName=com.bestpractice.api.domain.model.InfoRequestGeneratedAiTests.java}] - Building a prompt for fixing unit tests issue...
2025-07-28 12:40:36.052 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.domain.model.InfoRequestGeneratedAiTests.java}] - Generating code...
2025-07-28 12:40:36.052 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.domain.model.InfoRequestGeneratedAiTests.java}] - Using prompt:

There is an error in the previously generated test class.

>> ERROR:

[ERROR] COMPILATION ERROR : 
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/domain/model/InfoRequestGeneratedAiTests.java:[30,9] cannot find symbol
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile (default-testCompile) on project demo-code-ai: Compilation failure
[ERROR] /C:/Users/j_4k/AppData/Local/Temp/codeai-test-1778445329474813855/src/test/java/com/bestpractice/api/domain/model/InfoRequestGeneratedAiTests.java:[30,9] cannot find symbol
[ERROR]   symbol:   class Info
[ERROR]   location: class com.bestpractice.api.domain.model.InfoRequestGeneratedAiTests
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

2025-07-28 12:40:36.052 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.domain.model.InfoRequestGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 12:40:49.891 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.domain.model.InfoRequestGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2010, outputTokenCount = 204, totalTokenCount = 2214 }
2025-07-28 12:40:49.891 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.domain.model.InfoRequestGeneratedAiTests.java}] - Done
2025-07-28 12:40:49.891 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.domain.model.InfoRequestGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class InfoRequestGeneratedAiTests {

    private InfoRequest infoRequest;

    @BeforeEach
    void setUp() {
        infoRequest = new InfoRequest();
    }

    @Test
    void testConvert() {
        // GIVEN
        String id = "testId";
        infoRequest.setTitle("Test Title");
        infoRequest.setDescription("Test Description");
        // WHEN
        com.bestpractice.api.infrastrucuture.entity.Info info = infoRequest.convert(id);
        // THEN
        assertEquals(id, info.getId());
        assertEquals("Test Title", info.getTitle());
        assertEquals("Test Description", info.getDescription());
    }
}




2025-07-28 12:40:49.891 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.domain.model.InfoRequestGeneratedAiTests.java}] - Refining code...
2025-07-28 12:40:49.891 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.domain.model.InfoRequestGeneratedAiTests.java}] - Done
*/
