package com.bestpractice.api.infrastrucuture.persistent.mongo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.bestpractice.api.infrastrucuture.entity.Info;
import com.bestpractice.api.infrastrucuture.persistent.InfoPersistentRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MongoInfoPersistentRepositoryGeneratedAiTests {
    @InjectMocks
    private MongoInfoPersistentRepository repository;

    @Mock
    private MongoClient mongoClient;

    @Mock
    private MongoDatabase mongoDatabase;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        // GIVEN
        List<Info> expectedInfos = new ArrayList<>();
        expectedInfos.add(new Info());
        when(mongoDatabase.getCollection(MongoInfoPersistentRepository.COLLECTION_NAME, MongoInfoEntity.class)).thenReturn(null);
        // WHEN
        List<Info> actualInfos = repository.findAll();
        // THEN
        assertEquals(expectedInfos, actualInfos);
    }

    @Test
    void testFindById() {
        // GIVEN
        String id = "testId";
        Info expectedInfo = new Info();
        when(mongoDatabase.getCollection(MongoInfoPersistentRepository.COLLECTION_NAME, MongoInfoEntity.class)).thenReturn(null);
        // WHEN
        Info actualInfo = repository.findById(id);
        // THEN
        assertEquals(expectedInfo, actualInfo);
    }

    @Test
    void testInsert() {
        // GIVEN
        Info info = new Info();
        // WHEN
        Info actualInfo = repository.insert(info);
        // THEN
        assertEquals(info, actualInfo);
    }

    @Test
    void testReplace() {
        // GIVEN
        String id = "testId";
        Info info = new Info();
        when(mongoDatabase.getCollection(MongoInfoPersistentRepository.COLLECTION_NAME, MongoInfoEntity.class)).thenReturn(null);
        // WHEN
        Info actualInfo = repository.replace(id, info);
        // THEN
        assertEquals(info, actualInfo);
    }

    @Test
    void testRemoveById() {
        // GIVEN
        String id = "testId";
        // WHEN
        boolean removed = repository.removeById(id);
        // THEN
        assertTrue(removed);
    }
}

/*
2025-08-04 12:22:43.530 INFO [main] [io.github.adamw7.testing.generator.prompt.UnitTestingPromptProvider.getPromptMessages(UnitTestingPromptProvider.java:42)] [{conversationName=com.bestpractice.api.infrastrucuture.persistent.mongo.MongoInfoPersistentRepository.java}] - Building a prompt for unit tests generation...
2025-08-04 12:22:43.534 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:62)] [{conversationName=com.bestpractice.api.infrastrucuture.persistent.mongo.MongoInfoPersistentRepository.java}] - Generating code...
2025-08-04 12:22:43.534 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.printPromptMessages(CodeGenerator.java:107)] [{conversationName=com.bestpractice.api.infrastrucuture.persistent.mongo.MongoInfoPersistentRepository.java}] - Using prompt:

>> INPUT JAVA CLASS:

package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.bestpractice.api.common.exception.InternalServerError;
import com.bestpractice.api.infrastrucuture.entity.Info;
import com.bestpractice.api.infrastrucuture.persistent.InfoPersistentRepository;
import com.bestpractice.api.infrastrucuture.persistent.mongo.entity.MongoInfoEntity;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.ReplaceOptions;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class MongoInfoPersistentRepository implements InfoPersistentRepository {

  private static final String COLLECTION_NAME = "infos";
  private final MongoClient mongoClient;
  private final MongoDatabase mongoDatabase;
  private final MongoCollection<MongoInfoEntity> collection;

  public MongoInfoPersistentRepository(MongoClient mongoClient, MongoDatabase mongoDatabase) {
    this.mongoClient = mongoClient;
    this.mongoDatabase = mongoDatabase;
    this.collection = this.mongoDatabase.getCollection(COLLECTION_NAME, MongoInfoEntity.class);
  }

  @Override
  public String newId() {
    return new ObjectId().toString();
  }

  @Override
  public List<Info> findAll() {
    FindIterable<MongoInfoEntity> find = this.collection.find();

    List<Info> data = new ArrayList<>();
    try (MongoCursor<MongoInfoEntity> iterator = find.iterator()) {
      while (iterator.hasNext()) {
        MongoInfoEntity next = iterator.next();
        data.add(next.convertTo());
      }
    } catch (Exception ex) {
      throw new InternalServerError("Failed to get data of range from database", ex);
    }
    return data;
  }

  @Override
  public Info findById(String id) {
    Bson filter = Filters.and(
        Filters.eq("_id", new ObjectId(id)));

    try {
      return Objects.requireNonNull(this.collection.find(filter).first()).convertTo();
    } catch (Exception ex) {
      throw new InternalServerError("Failed to get detail from database", ex);
    }
  }

  @Override
  public Info insert(Info info) {
    try {
      this.collection.insertOne(MongoInfoEntity.convertFrom(info));
      return info;
    } catch (Exception ex) {
      throw new InternalServerError("Failed to insert", ex);
    }
  }

  @Override
  public Info replace(String id, Info info) {
    MongoInfoEntity mongoInfoEntity = MongoInfoEntity.convertFrom(info);
    Bson filter = Filters.and(
        Filters.eq("_id", mongoInfoEntity.getId()));

    try {
      ReplaceOptions opts = new ReplaceOptions().upsert(true);
      UpdateResult result = this.collection.replaceOne(filter, mongoInfoEntity, opts);
      if (!result.wasAcknowledged()) {
        throw new RuntimeException("Failed to get Acknowledged on replace operation");
      }
      return info;
    } catch (Exception ex) {
      throw new InternalServerError("Failed to insert", ex);
    }
  }

  @Override
  public boolean removeById(String id) {
    ObjectId objectId = new ObjectId(id);
    Bson filter = Filters.and(
        Filters.eq("_id", objectId));
    try {
      DeleteResult result = this.collection.deleteOne(filter);
      return result.wasAcknowledged();
    } catch (Exception ex) {
      throw new InternalServerError("Failed to delete", ex);
    }
  }
}


# Notes for Code Understanding:
1. Focus on public and protected methods.
2. Consider handling edge cases and exceptions.
3. Ensure usage of idiomatic JAVA code practices.

>> ADDITIONAL CONTEXT:
Class MongoInfoPersistentRepository.java uses classes Info.java and InfoPersistentRepository.java and InternalServerError.java and
here is the source code of them so it may help you but I do not need unit tests for them
here is the source code of class Info.java:
package com.bestpractice.api.infrastrucuture.entity;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class Info extends SharedData {

    @Column(name = "id")
    private String id;

    @NotNull
    @Column(nullable = false, name = "title")
    private String title;

    @NotNull
    @Column(nullable = false, name = "description")
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

and code of class InfoPersistentRepository.java:
package com.bestpractice.api.infrastrucuture.persistent;

import com.bestpractice.api.infrastrucuture.entity.Info;
import java.util.List;
import org.springframework.context.annotation.Profile;

@Profile("!test")
public interface InfoPersistentRepository {
  String newId();

  List<Info> findAll();

  Info findById(String id);

  Info insert(Info info);

  Info replace(String id, Info info);

  boolean removeById(String id);
}

and code of class InternalServerError.java:
package com.bestpractice.api.common.exception;

public class InternalServerError extends RuntimeException {
  public InternalServerError() {
    super();
  }

  public InternalServerError(String msg) {
    super(msg);
  }

  public InternalServerError(Throwable cause) {
    super(cause);
  }

  public InternalServerError(String msg, Throwable cause) {
    super(msg, cause);
  }

}

Please take into consideration that class Info.java uses SharedData.java class and here is the source code of it so it may help you but I do not need unit tests for it
here is the source code of class SharedData.java:
package com.bestpractice.api.infrastrucuture.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class SharedData {
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false, name = "created_at")
    private Date createdAt;

    @PrePersist
    public void onPrePersist() {
        setCreatedAt(new Date());
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

As well as class InfoPersistentRepository.java uses Info.java class and here is the source code of it so it may help you but I do not need unit tests for it
here is the source code of class Info.java:
package com.bestpractice.api.infrastrucuture.entity;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class Info extends SharedData {

    @Column(name = "id")
    private String id;

    @NotNull
    @Column(nullable = false, name = "title")
    private String title;

    @NotNull
    @Column(nullable = false, name = "description")
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

As well as class InternalServerError.java uses here is the source code of it so it may help you but I do not need unit tests for it
>> TASK: Generate unit tests

>> REQUIREMENTS:

1. The response must contain fully functional test code.
2. The response must be in plain text (no code block formatting like '''java ''').
3. Place the generated tests in the SAME PACKAGE as the input JAVA class.
4. Follow this naming convention for the test class: use the original class name and append "GeneratedAiTests".
- Do not add another "s" if the class name already ends with "s".
- Do not append "Tests" if the class name ends with "x", "ch", "sh", or "ss".
Example: `HelloAction` becomes `HelloActionGeneratedAiTests`.
5. Use JUNIT5 for the test framework, UNKNOWN & UNKNOWN for mocking, and UNKNOWN for assertions.
6. Exclude `DisplayName` annotations.
7. Include necessary imports for annotations like `@ExtendWith`.
8. Ensure each test method has at least one assertion.
9. Avoid generating tests for private methods—focus only on public and protected methods.
10. Ensure any modified state in the test is reset before each test with a `@BeforeEach` method.
11. Tests should be independent; no test should rely on the result of another.
12. If no mocks are needed, skip importing mock-related libraries.
13. Organize the test methods using the GIVEN WHEN THEN structure. Each test should begin with a GIVEN section that sets up the necessary preconditions or context, followed by a WHEN section that describes the action being tested, and concluding with a THEN section that specifies the expected outcome. Include comments for each section to clearly indicate their purpose.

# Additional Best Practices:
1. Ensure that tests are concise, maintainable, and meaningful.
2. Prioritize real-world usage scenarios in the tests.
3. As given other classes for CONTEXT, use methods from other classes correctly

# SECURITY REQUIREMENTS:
1. Security Requirements are applicable to the all files, including those that are not security-sensitive
2. If you encounter code that handles security-critical operations, mark it as security-sensitive in the generated code.
3. Don't include any secrets, passwords, API keys, tokens, actual connection strings, authentication details, environment-specific configurations, sensitive configuration values, or personal and sensitive information in the generated code.

2025-08-04 12:22:43.534 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.generateTillEnd(CodeGenerator.java:111)] [{conversationName=com.bestpractice.api.infrastrucuture.persistent.mongo.MongoInfoPersistentRepository.java}] - Generate code iteration # 1
2025-08-04 12:24:37.179 DEBUG [main] [io.github.adamw7.orchestrator.ai.langchain.LangChainAiService.generate(LangChainAiService.java:45)] [{conversationName=com.bestpractice.api.infrastrucuture.persistent.mongo.MongoInfoPersistentRepository.java}] - TokenUsage { inputTokenCount = 2697, outputTokenCount = 683, totalTokenCount = 3380 }
2025-08-04 12:24:37.179 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:80)] [{conversationName=com.bestpractice.api.infrastrucuture.persistent.mongo.MongoInfoPersistentRepository.java}] - Done
2025-08-04 12:24:37.179 DEBUG [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:82)] [{conversationName=com.bestpractice.api.infrastrucuture.persistent.mongo.MongoInfoPersistentRepository.java}] - Generated code:
package com.bestpractice.api.infrastrucuture.persistent.mongo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.bestpractice.api.infrastrucuture.entity.Info;
import com.bestpractice.api.infrastrucuture.persistent.InfoPersistentRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MongoInfoPersistentRepositoryGeneratedAiTests {
    @InjectMocks
    private MongoInfoPersistentRepository repository;

    @Mock
    private MongoClient mongoClient;

    @Mock
    private MongoDatabase mongoDatabase;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        // GIVEN
        List<Info> expectedInfos = new ArrayList<>();
        expectedInfos.add(new Info());
        when(mongoDatabase.getCollection(MongoInfoPersistentRepository.COLLECTION_NAME, MongoInfoEntity.class)).thenReturn(null);
        // WHEN
        List<Info> actualInfos = repository.findAll();
        // THEN
        assertEquals(expectedInfos, actualInfos);
    }

    @Test
    void testFindById() {
        // GIVEN
        String id = "testId";
        Info expectedInfo = new Info();
        when(mongoDatabase.getCollection(MongoInfoPersistentRepository.COLLECTION_NAME, MongoInfoEntity.class)).thenReturn(null);
        // WHEN
        Info actualInfo = repository.findById(id);
        // THEN
        assertEquals(expectedInfo, actualInfo);
    }

    @Test
    void testInsert() {
        // GIVEN
        Info info = new Info();
        // WHEN
        Info actualInfo = repository.insert(info);
        // THEN
        assertEquals(info, actualInfo);
    }

    @Test
    void testReplace() {
        // GIVEN
        String id = "testId";
        Info info = new Info();
        when(mongoDatabase.getCollection(MongoInfoPersistentRepository.COLLECTION_NAME, MongoInfoEntity.class)).thenReturn(null);
        // WHEN
        Info actualInfo = repository.replace(id, info);
        // THEN
        assertEquals(info, actualInfo);
    }

    @Test
    void testRemoveById() {
        // GIVEN
        String id = "testId";
        // WHEN
        boolean removed = repository.removeById(id);
        // THEN
        assertTrue(removed);
    }
}




2025-08-04 12:24:37.179 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:83)] [{conversationName=com.bestpractice.api.infrastrucuture.persistent.mongo.MongoInfoPersistentRepository.java}] - Refining code...
2025-08-04 12:24:37.179 INFO [main] [io.github.adamw7.orchestrator.generator.CodeGenerator.create(CodeGenerator.java:85)] [{conversationName=com.bestpractice.api.infrastrucuture.persistent.mongo.MongoInfoPersistentRepository.java}] - Done

 */