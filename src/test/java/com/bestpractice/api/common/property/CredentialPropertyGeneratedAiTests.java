package com.bestpractice.api.common.property;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CredentialPropertyGeneratedAiTests {

    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testConvertToIntExpires_ValidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("12");
        // WHEN
        Integer result = credentialProperty.convertToIntExpires();
        // THEN
        assertEquals(12, result);
    }

    @Test
    void testConvertToIntExpires_NullInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("");
        // WHEN
        Integer result = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(result);
    }

    @Test
    void testConvertToIntExpires_InvalidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("abc");
        // WHEN
        Integer result = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(result);
    }

    @Test
    void testConvertToIntExpires_MinusInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("-");
        // WHEN
        Integer result = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(result);
    }
}

/*
2025-07-28 15:15:16.592 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:15:16.595 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Generating code...
2025-07-28 15:15:16.595 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "credentials")
public class CredentialProperty {
    private String key;
    private String provider;
    private String subject;
    private String alg;
    private String hmacSecret;
    private String expiresHourStr;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public String getHmacSecret() {
        return hmacSecret;
    }

    public void setHmacSecret(String hmacSecret) {
        this.hmacSecret = hmacSecret;
    }

    public String getExpiresHourStr() {
        return expiresHourStr;
    }

    public void setExpiresHourStr(String expiresHourStr) {
        this.expiresHourStr = expiresHourStr;
    }

    public Integer convertToIntExpires() {
        if (this.expiresHourStr.equals("-")) {
            return null;
        }

        try{
            return Integer.parseInt(this.expiresHourStr);
        }
        catch (NumberFormatException ignore) {
            return null;
        }
    }
}

>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.property;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CredentialPropertyGeneratedAiTests {

    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testConvertToIntExpires_ValidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("24");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertEquals(24, expiresHours);
    }

    @Test
    void testConvertToIntExpires_NullInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_InvalidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("abc");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_MinusInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("-");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
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

2025-07-28 15:15:16.595 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:15:46.802 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 2898, outputTokenCount = 343, totalTokenCount = 3241 }
2025-07-28 15:15:46.802 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Done
2025-07-28 15:15:46.802 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.property;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialPropertyGeneratedAiTests {

    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testConvertToIntExpires_ValidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("24");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertEquals(24, expiresHours);
    }

    @Test
    void testConvertToIntExpires_NullInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_InvalidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("abc");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_MinusInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("-");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }



}





2025-07-28 15:15:46.802 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Refining code...
2025-07-28 15:15:46.802 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Done
2025-07-28 15:16:10.635 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:16:10.635 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Generating code...
2025-07-28 15:16:10.635 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "credentials")
public class CredentialProperty {
    private String key;
    private String provider;
    private String subject;
    private String alg;
    private String hmacSecret;
    private String expiresHourStr;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public String getHmacSecret() {
        return hmacSecret;
    }

    public void setHmacSecret(String hmacSecret) {
        this.hmacSecret = hmacSecret;
    }

    public String getExpiresHourStr() {
        return expiresHourStr;
    }

    public void setExpiresHourStr(String expiresHourStr) {
        this.expiresHourStr = expiresHourStr;
    }

    public Integer convertToIntExpires() {
        if (this.expiresHourStr.equals("-")) {
            return null;
        }

        try{
            return Integer.parseInt(this.expiresHourStr);
        }
        catch (NumberFormatException ignore) {
            return null;
        }
    }
}

>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.property;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialPropertyGeneratedAiTests {

    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testConvertToIntExpires_ValidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("24");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertEquals(24, expiresHours);
    }

    @Test
    void testConvertToIntExpires_NullInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_InvalidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("abc");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_MinusInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("-");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
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

2025-07-28 15:16:10.635 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:16:43.315 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 4781, outputTokenCount = 343, totalTokenCount = 5124 }
2025-07-28 15:16:43.315 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Done
2025-07-28 15:16:43.315 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.property;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialPropertyGeneratedAiTests {

    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testConvertToIntExpires_ValidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("24");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertEquals(24, expiresHours);
    }

    @Test
    void testConvertToIntExpires_NullInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_InvalidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("abc");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_MinusInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("-");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }



}





2025-07-28 15:16:43.315 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Refining code...
2025-07-28 15:16:43.315 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Done
2025-07-28 15:17:07.106 INFO [main] [io.github.adamw7.testing.generator.prompt.ImproveUnitTestsPromptProvider.getPromptMessages(ImproveUnitTestsPromptProvider.java:32)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Building a prompt for improving unit tests generation...
2025-07-28 15:17:07.108 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Generating code...
2025-07-28 15:17:07.108 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Using prompt:

>> INPUT JAVA here you can find original code of CLASS:

package com.bestpractice.api.common.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "credentials")
public class CredentialProperty {
    private String key;
    private String provider;
    private String subject;
    private String alg;
    private String hmacSecret;
    private String expiresHourStr;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public String getHmacSecret() {
        return hmacSecret;
    }

    public void setHmacSecret(String hmacSecret) {
        this.hmacSecret = hmacSecret;
    }

    public String getExpiresHourStr() {
        return expiresHourStr;
    }

    public void setExpiresHourStr(String expiresHourStr) {
        this.expiresHourStr = expiresHourStr;
    }

    public Integer convertToIntExpires() {
        if (this.expiresHourStr.equals("-")) {
            return null;
        }

        try{
            return Integer.parseInt(this.expiresHourStr);
        }
        catch (NumberFormatException ignore) {
            return null;
        }
    }
}

>> TASK: Below is the class with the originally generated tests, please review the following test class, fix any compilation error, improve the tests,
 and suggest corrections that could enhance their quality. If there are any logical errors or issues with the tests themselves, please address them.


package com.bestpractice.api.common.property;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialPropertyGeneratedAiTests {

    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testConvertToIntExpires_ValidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("24");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertEquals(24, expiresHours);
    }

    @Test
    void testConvertToIntExpires_NullInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_InvalidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("abc");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_MinusInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("-");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
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

2025-07-28 15:17:07.108 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Generate code iteration # 1
2025-07-28 15:17:43.335 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - TokenUsage { inputTokenCount = 6664, outputTokenCount = 343, totalTokenCount = 7007 }
2025-07-28 15:17:43.335 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Done
2025-07-28 15:17:43.335 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Generated code:
package com.bestpractice.api.common.property;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialPropertyGeneratedAiTests {

    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testConvertToIntExpires_ValidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("24");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertEquals(24, expiresHours);
    }

    @Test
    void testConvertToIntExpires_NullInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_InvalidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("abc");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_MinusInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("-");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }



}





2025-07-28 15:17:43.335 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Refining code...
2025-07-28 15:17:43.335 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.common.property.CredentialPropertyGeneratedAiTests.java}] - Done
*/
