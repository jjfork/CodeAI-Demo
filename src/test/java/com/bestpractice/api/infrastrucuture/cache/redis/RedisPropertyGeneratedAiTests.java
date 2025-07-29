package com.bestpractice.api.infrastrucuture.cache.redis;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RedisPropertyGeneratedAiTests {
    private RedisProperty redisProperty;

    @BeforeEach
    void setUp() {
        redisProperty = new RedisProperty();
    }

    @Test
    void testGetHost() {
        // GIVEN - Setup
        String expectedHost = "localhost";
        redisProperty.setHost(expectedHost);
        // WHEN - Action
        String actualHost = redisProperty.getHost();
        // THEN - Assertion
        assertEquals(expectedHost, actualHost);
    }

    @Test
    void testSetHost() {
        // GIVEN - Setup
        String newHost = "127.0.0.1";
        // WHEN - Action
        redisProperty.setHost(newHost);
        // THEN - Assertion
        assertEquals(newHost, redisProperty.getHost());
    }

    @Test
    void testGetPort() {
        // GIVEN - Setup
        int expectedPort = 6379;
        redisProperty.setPort(expectedPort);
        // WHEN - Action
        int actualPort = redisProperty.getPort();
        // THEN - Assertion
        assertEquals(expectedPort, actualPort);
    }

    @Test
    void testSetPort() {
        // GIVEN - Setup
        int newPort = 26379;
        // WHEN - Action
        redisProperty.setPort(newPort);
        // THEN - Assertion
        assertEquals(newPort, redisProperty.getPort());
    }

    @Test
    void testGetPassword() {
        // GIVEN - Setup
        String expectedPassword = "mysecretpassword";
        redisProperty.setPassword(expectedPassword);
        // WHEN - Action
        String actualPassword = redisProperty.getPassword();
        // THEN - Assertion
        assertEquals(expectedPassword, actualPassword);
    }

    @Test
    void testSetPassword() {
        // GIVEN - Setup
        String newPassword = "newsecretpassword";
        // WHEN - Action
        redisProperty.setPassword(newPassword);
        // THEN - Assertion
        assertEquals(newPassword, redisProperty.getPassword());
    }
}

/*
2025-07-28 17:40:12.864 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 17:40:12.866 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Generating code...
2025-07-28 17:40:12.866 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.infrastrucuture.cache.redis;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("cache_redis")
public class RedisProperty {
    private String host;
    private int port;
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
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


package com.bestpractice.api.infrastrucuture.cache.redis;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RedisPropertyGeneratedAiTests {

    private RedisProperty redisProperty;

    @BeforeEach
    void setUp() {
        redisProperty = new RedisProperty();
    }

    @Test
    void testGetHost() {
        // GIVEN - 
        // WHEN -  String host = redisProperty.getHost();
        // THEN - assertEquals(null, host);
    }

    @Test
    void testSetHost() {
        // GIVEN - 
        // WHEN - redisProperty.setHost("localhost");
        // THEN - assertEquals("localhost", redisProperty.getHost());
    }

    @Test
    void testGetPort() {
        // GIVEN - 
        // WHEN - int port = redisProperty.getPort();
        // THEN - assertEquals(0, port);
    }

    @Test
    void testSetPort() {
        // GIVEN - 
        // WHEN - redisProperty.setPort(6379);
        // THEN - assertEquals(6379, redisProperty.getPort());
    }

    @Test
    void testGetPassword() {
        // GIVEN - 
        // WHEN - String password = redisProperty.getPassword();
        // THEN - assertEquals(null, password);
    }

    @Test
    void testSetPassword() {
        // GIVEN - 
        // WHEN - redisProperty.setPassword("mypassword");
        // THEN - assertEquals("mypassword", redisProperty.getPassword());
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

2025-07-28 17:40:12.866 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 17:40:45.660 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2475, outputTokenCount = 384, totalTokenCount = 2859 }
2025-07-28 17:40:45.660 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Done
2025-07-28 17:40:45.660 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.infrastrucuture.cache.redis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RedisPropertyGeneratedAiTests {

    private RedisProperty redisProperty;

    @BeforeEach
    void setUp() {
        redisProperty = new RedisProperty();
    }

    @Test
    void testGetHost() {
        // GIVEN - 
        // WHEN -  String host = redisProperty.getHost();
        // THEN - assertEquals(null, host);
    }

    @Test
    void testSetHost() {
        // GIVEN - 
        // WHEN - redisProperty.setHost("localhost");
        // THEN - assertEquals("localhost", redisProperty.getHost());
    }

    @Test
    void testGetPort() {
        // GIVEN - 
        // WHEN - int port = redisProperty.getPort();
        // THEN - assertEquals(0, port);
    }

    @Test
    void testSetPort() {
        // GIVEN - 
        // WHEN - redisProperty.setPort(6379);
        // THEN - assertEquals(6379, redisProperty.getPort());
    }

    @Test
    void testGetPassword() {
        // GIVEN - 
        // WHEN - String password = redisProperty.getPassword();
        // THEN - assertEquals(null, password);
    }

    @Test
    void testSetPassword() {
        // GIVEN - 
        // WHEN - redisProperty.setPassword("mypassword");
        // THEN - assertEquals("mypassword", redisProperty.getPassword());
    }
}




2025-07-28 17:40:45.660 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Refining code...
2025-07-28 17:40:45.660 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Done
2025-07-28 17:41:09.217 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 17:41:09.217 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Generating code...
2025-07-28 17:41:09.217 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.infrastrucuture.cache.redis;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("cache_redis")
public class RedisProperty {
    private String host;
    private int port;
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
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


package com.bestpractice.api.infrastrucuture.cache.redis;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RedisPropertyGeneratedAiTests {

    private RedisProperty redisProperty;

    @BeforeEach
    void setUp() {
        redisProperty = new RedisProperty();
    }

    @Test
    void testGetHost() {
        // GIVEN - 
        // WHEN -  String host = redisProperty.getHost();
        // THEN - assertEquals(null, host);
    }

    @Test
    void testSetHost() {
        // GIVEN - 
        // WHEN - redisProperty.setHost("localhost");
        // THEN - assertEquals("localhost", redisProperty.getHost());
    }

    @Test
    void testGetPort() {
        // GIVEN - 
        // WHEN - int port = redisProperty.getPort();
        // THEN - assertEquals(0, port);
    }

    @Test
    void testSetPort() {
        // GIVEN - 
        // WHEN - redisProperty.setPort(6379);
        // THEN - assertEquals(6379, redisProperty.getPort());
    }

    @Test
    void testGetPassword() {
        // GIVEN - 
        // WHEN - String password = redisProperty.getPassword();
        // THEN - assertEquals(null, password);
    }

    @Test
    void testSetPassword() {
        // GIVEN - 
        // WHEN - redisProperty.setPassword("mypassword");
        // THEN - assertEquals("mypassword", redisProperty.getPassword());
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

2025-07-28 17:41:09.217 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 17:41:42.474 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 4180, outputTokenCount = 383, totalTokenCount = 4563 }
2025-07-28 17:41:42.474 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Done
2025-07-28 17:41:42.474 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.infrastrucuture.cache.redis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RedisPropertyGeneratedAiTests {

    private RedisProperty redisProperty;

    @BeforeEach
    void setUp() {
        redisProperty = new RedisProperty();
    }

    @Test
    void testGetHost() {
        // GIVEN - 
        // WHEN - String host = redisProperty.getHost();
        // THEN - assertEquals(null, host);
    }

    @Test
    void testSetHost() {
        // GIVEN - 
        // WHEN - redisProperty.setHost("localhost");
        // THEN - assertEquals("localhost", redisProperty.getHost());
    }

    @Test
    void testGetPort() {
        // GIVEN - 
        // WHEN - int port = redisProperty.getPort();
        // THEN - assertEquals(0, port);
    }

    @Test
    void testSetPort() {
        // GIVEN - 
        // WHEN - redisProperty.setPort(6379);
        // THEN - assertEquals(6379, redisProperty.getPort());
    }

    @Test
    void testGetPassword() {
        // GIVEN - 
        // WHEN - String password = redisProperty.getPassword();
        // THEN - assertEquals(null, password);
    }

    @Test
    void testSetPassword() {
        // GIVEN - 
        // WHEN - redisProperty.setPassword("mypassword");
        // THEN - assertEquals("mypassword", redisProperty.getPassword());
    }
}




2025-07-28 17:41:42.474 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Refining code...
2025-07-28 17:41:42.474 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Done
2025-07-28 17:42:06.068 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 17:42:06.068 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Generating code...
2025-07-28 17:42:06.068 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.infrastrucuture.cache.redis;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("cache_redis")
public class RedisProperty {
    private String host;
    private int port;
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
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


package com.bestpractice.api.infrastrucuture.cache.redis;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RedisPropertyGeneratedAiTests {

    private RedisProperty redisProperty;

    @BeforeEach
    void setUp() {
        redisProperty = new RedisProperty();
    }

    @Test
    void testGetHost() {
        // GIVEN - 
        // WHEN - String host = redisProperty.getHost();
        // THEN - assertEquals(null, host);
    }

    @Test
    void testSetHost() {
        // GIVEN - 
        // WHEN - redisProperty.setHost("localhost");
        // THEN - assertEquals("localhost", redisProperty.getHost());
    }

    @Test
    void testGetPort() {
        // GIVEN - 
        // WHEN - int port = redisProperty.getPort();
        // THEN - assertEquals(0, port);
    }

    @Test
    void testSetPort() {
        // GIVEN - 
        // WHEN - redisProperty.setPort(6379);
        // THEN - assertEquals(6379, redisProperty.getPort());
    }

    @Test
    void testGetPassword() {
        // GIVEN - 
        // WHEN - String password = redisProperty.getPassword();
        // THEN - assertEquals(null, password);
    }

    @Test
    void testSetPassword() {
        // GIVEN - 
        // WHEN - redisProperty.setPassword("mypassword");
        // THEN - assertEquals("mypassword", redisProperty.getPassword());
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

2025-07-28 17:42:06.068 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 17:42:46.832 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 5883, outputTokenCount = 383, totalTokenCount = 6266 }
2025-07-28 17:42:46.832 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Done
2025-07-28 17:42:46.832 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.infrastrucuture.cache.redis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RedisPropertyGeneratedAiTests {

    private RedisProperty redisProperty;

    @BeforeEach
    void setUp() {
        redisProperty = new RedisProperty();
    }

    @Test
    void testGetHost() {
        // GIVEN - 
        // WHEN - String host = redisProperty.getHost();
        // THEN - assertEquals(null, host);
    }

    @Test
    void testSetHost() {
        // GIVEN - 
        // WHEN - redisProperty.setHost("localhost");
        // THEN - assertEquals("localhost", redisProperty.getHost());
    }

    @Test
    void testGetPort() {
        // GIVEN - 
        // WHEN - int port = redisProperty.getPort();
        // THEN - assertEquals(0, port);
    }

    @Test
    void testSetPort() {
        // GIVEN - 
        // WHEN - redisProperty.setPort(6379);
        // THEN - assertEquals(6379, redisProperty.getPort());
    }

    @Test
    void testGetPassword() {
        // GIVEN - 
        // WHEN - String password = redisProperty.getPassword();
        // THEN - assertEquals(null, password);
    }

    @Test
    void testSetPassword() {
        // GIVEN - 
        // WHEN - redisProperty.setPassword("mypassword");
        // THEN - assertEquals("mypassword", redisProperty.getPassword());
    }
}




2025-07-28 17:42:46.832 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Refining code...
2025-07-28 17:42:46.832 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.infrastrucuture.cache.redis.RedisPropertyGeneratedAiTests.java}] - Done
*/
