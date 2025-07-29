package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@ExtendWith(MongoTestExtension.class)
class MongoUserPersistentRepositoryGeneratedAiTests {

  private MongoUserPersistentRepository repository;
  private MongoClient mongoClient = new MongoClient();
  private MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

  @BeforeEach
  void setUp() {
    repository = new MongoUserPersistentRepository(mongoClient, mongoDatabase);
  }

  @Test
  void testNewId() {
    String id = repository.newId();
    assertNotNull(id);
    assertTrue(id.matches("^[0-9a-fA-F]{24}$"));
  }

  @Test
  void testFindByEmail() {
    // GIVEN a user with an email address.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    // WHEN the repository is called to find the user by email.
    User foundUser = repository.findByEmail("test@example.com");
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testFindById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to find the user by ID.
    User foundUser = repository.findById(userId);
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testInsert() {
    // GIVEN a new user.
    User newUser = new User("newId", "newUser", "new@example.com", "password");
    // WHEN the repository is called to insert the new user.
    User insertedUser = repository.insert(newUser);
    // THEN the inserted user should have an ID and match the provided data.
    assertNotNull(insertedUser.getId());
    assertEquals("newUser", insertedUser.getUsername());
    assertEquals("new@example.com", insertedUser.getEmail());
  }

  @Test
  void testReplace() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to replace the user with updated data.
    User updatedUser = new User(userId, "updatedUser", "updated@example.com", "newpassword");
    repository.replace(userId, updatedUser);
    // THEN the replaced user should match the updated data.
    User foundUser = repository.findById(userId);
    assertEquals("updatedUser", foundUser.getUsername());
    assertEquals("updated@example.com", foundUser.getEmail());
  }

  @Test
  void testRemoveById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to remove the user by ID.
    boolean removed = repository.removeById(userId);
    // THEN the user should be removed and the result should be true.
```java
package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@ExtendWith(MongoTestExtension.class)
class MongoUserPersistentRepositoryGeneratedAiTests {

  private MongoUserPersistentRepository repository;
  private MongoClient mongoClient = new MongoClient();
  private MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

  @BeforeEach
  void setUp() {
    repository = new MongoUserPersistentRepository(mongoClient, mongoDatabase);
  }

  @Test
  void testNewId() {
    String id = repository.newId();
    assertNotNull(id);
    assertTrue(id.matches("^[0-9a-fA-F]{24}$"));
  }

  @Test
  void testFindByEmail() {
    // GIVEN a user with an email address.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    // WHEN the repository is called to find the user by email.
    User foundUser = repository.findByEmail("test@example.com");
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testFindById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to find the user by ID.
    User foundUser = repository.findById(userId);
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testInsert() {
    // GIVEN a new user.
    User newUser = new User("newId", "newUser", "new@example.com", "password");
    // WHEN the repository is called to insert the new user.
    User insertedUser = repository.insert(newUser);
    // THEN the inserted user should have an ID and match the provided data.
    assertNotNull(insertedUser.getId());
    assertEquals("newUser", insertedUser.getUsername());
    assertEquals("new@example.com", insertedUser.getEmail());
  }

  @Test
  void testReplace() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to replace the user with updated data.
    User updatedUser = new User(userId, "updatedUser", "updated@example.com", "newpassword");
    repository.replace(userId, updatedUser);
    // THEN the replaced user should match the updated data.
    User foundUser = repository.findById(userId);
    assertEquals("updatedUser", foundUser.getUsername());
    assertEquals("updated@example.com", foundUser.getEmail());
  }

  @Test
  void testRemoveById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to remove the user by ID.
    boolean removed = repository.removeById(userId);
    // THEN the user should be removed and the result should be true.
```java
package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@ExtendWith(MongoTestExtension.class)
class MongoUserPersistentRepositoryGeneratedAiTests {

  private MongoUserPersistentRepository repository;
  private MongoClient mongoClient = new MongoClient();
  private MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

  @BeforeEach
  void setUp() {
    repository = new MongoUserPersistentRepository(mongoClient, mongoDatabase);
  }

  @Test
  void testNewId() {
    String id = repository.newId();
    assertNotNull(id);
    assertTrue(id.matches("^[0-9a-fA-F]{24}$"));
  }

  @Test
  void testFindByEmail() {
    // GIVEN a user with an email address.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    // WHEN the repository is called to find the user by email.
    User foundUser = repository.findByEmail("test@example.com");
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testFindById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to find the user by ID.
    User foundUser = repository.findById(userId);
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testInsert() {
    // GIVEN a new user.
    User newUser = new User("newId", "newUser", "new@example.com", "password");
    // WHEN the repository is called to insert the new user.
    User insertedUser = repository.insert(newUser);
    // THEN the inserted user should have an ID and match the provided data.
    assertNotNull(insertedUser.getId());
    assertEquals("newUser", insertedUser.getUsername());
    assertEquals("new@example.com", insertedUser.getEmail());
  }

  @Test
  void testReplace() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to replace the user with updated data.
    User updatedUser = new User(userId, "updatedUser", "updated@example.com", "newpassword");
    repository.replace(userId, updatedUser);
    // THEN the replaced user should match the updated data.
    User foundUser = repository.findById(userId);
    assertEquals("updatedUser", foundUser.getUsername());
    assertEquals("updated@example.com", foundUser.getEmail());
  }

  @Test
  void testRemoveById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to remove the user by ID.
    boolean removed = repository.removeById(userId);
    // THEN the user should be removed and the result should be true.
```java
package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@ExtendWith(MongoTestExtension.class)
class MongoUserPersistentRepositoryGeneratedAiTests {

  private MongoUserPersistentRepository repository;
  private MongoClient mongoClient = new MongoClient();
  private MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

  @BeforeEach
  void setUp() {
    repository = new MongoUserPersistentRepository(mongoClient, mongoDatabase);
  }

  @Test
  void testNewId() {
    String id = repository.newId();
    assertNotNull(id);
    assertTrue(id.matches("^[0-9a-fA-F]{24}$"));
  }

  @Test
  void testFindByEmail() {
    // GIVEN a user with an email address.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    // WHEN the repository is called to find the user by email.
    User foundUser = repository.findByEmail("test@example.com");
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testFindById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to find the user by ID.
    User foundUser = repository.findById(userId);
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testInsert() {
    // GIVEN a new user.
    User newUser = new User("newId", "newUser", "new@example.com", "password");
    // WHEN the repository is called to insert the new user.
    User insertedUser = repository.insert(newUser);
    // THEN the inserted user should have an ID and match the provided data.
    assertNotNull(insertedUser.getId());
    assertEquals("newUser", insertedUser.getUsername());
    assertEquals("new@example.com", insertedUser.getEmail());
  }

  @Test
  void testReplace() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to replace the user with updated data.
    User updatedUser = new User(userId, "updatedUser", "updated@example.com", "newpassword");
    repository.replace(userId, updatedUser);
    // THEN the replaced user should match the updated data.
    User foundUser = repository.findById(userId);
    assertEquals("updatedUser", foundUser.getUsername());
    assertEquals("updated@example.com", foundUser.getEmail());
  }

  @Test
  void testRemoveById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to remove the user by ID.
    boolean removed = repository.removeById(userId);
    // THEN the user should be removed and the result should be true.
```java
package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@ExtendWith(MongoTestExtension.class)
class MongoUserPersistentRepositoryGeneratedAiTests {

  private MongoUserPersistentRepository repository;
  private MongoClient mongoClient = new MongoClient();
  private MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

  @BeforeEach
  void setUp() {
    repository = new MongoUserPersistentRepository(mongoClient, mongoDatabase);
  }

  @Test
  void testNewId() {
    String id = repository.newId();
    assertNotNull(id);
    assertTrue(id.matches("^[0-9a-fA-F]{24}$"));
  }

  @Test
  void testFindByEmail() {
    // GIVEN a user with an email address.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    // WHEN the repository is called to find the user by email.
    User foundUser = repository.findByEmail("test@example.com");
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testFindById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to find the user by ID.
    User foundUser = repository.findById(userId);
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testInsert() {
    // GIVEN a new user.
    User newUser = new User("newId", "newUser", "new@example.com", "password");
    // WHEN the repository is called to insert the new user.
    User insertedUser = repository.insert(newUser);
    // THEN the inserted user should have an ID and match the provided data.
    assertNotNull(insertedUser.getId());
    assertEquals("newUser", insertedUser.getUsername());
    assertEquals("new@example.com", insertedUser.getEmail());
  }

  @Test
  void testReplace() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to replace the user with updated data.
    User updatedUser = new User(userId, "updatedUser", "updated@example.com", "newpassword");
    repository.replace(userId, updatedUser);
    // THEN the replaced user should match the updated data.
    User foundUser = repository.findById(userId);
    assertEquals("updatedUser", foundUser.getUsername());
    assertEquals("updated@example.com", foundUser.getEmail());
  }

  @Test
  void testRemoveById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to remove the user by ID.
    boolean removed = repository.removeById(userId);
    // THEN the user should be removed and the result should be true.
```java
package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@ExtendWith(MongoTestExtension.class)
class MongoUserPersistentRepositoryGeneratedAiTests {

  private MongoUserPersistentRepository repository;
  private MongoClient mongoClient = new MongoClient();
  private MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

  @BeforeEach
  void setUp() {
    repository = new MongoUserPersistentRepository(mongoClient, mongoDatabase);
  }

  @Test
  void testNewId() {
    String id = repository.newId();
    assertNotNull(id);
    assertTrue(id.matches("^[0-9a-fA-F]{24}$"));
  }

  @Test
  void testFindByEmail() {
    // GIVEN a user with an email address.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    // WHEN the repository is called to find the user by email.
    User foundUser = repository.findByEmail("test@example.com");
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testFindById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to find the user by ID.
    User foundUser = repository.findById(userId);
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testInsert() {
    // GIVEN a new user.
    User newUser = new User("newId", "newUser", "new@example.com", "password");
    // WHEN the repository is called to insert the new user.
    User insertedUser = repository.insert(newUser);
    // THEN the inserted user should have an ID and match the provided data.
    assertNotNull(insertedUser.getId());
    assertEquals("newUser", insertedUser.getUsername());
    assertEquals("new@example.com", insertedUser.getEmail());
  }

  @Test
  void testReplace() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to replace the user with updated data.
    User updatedUser = new User(userId, "updatedUser", "updated@example.com", "newpassword");
    repository.replace(userId, updatedUser);
    // THEN the replaced user should match the updated data.
    User foundUser = repository.findById(userId);
    assertEquals("updatedUser", foundUser.getUsername());
    assertEquals("updated@example.com", foundUser.getEmail());
  }

  @Test
  void testRemoveById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to remove the user by ID.
    boolean removed = repository.removeById(userId);
    // THEN the user should be removed and the result should be true.
```java
package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@ExtendWith(MongoTestExtension.class)
class MongoUserPersistentRepositoryGeneratedAiTests {

  private MongoUserPersistentRepository repository;
  private MongoClient mongoClient = new MongoClient();
  private MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

  @BeforeEach
  void setUp() {
    repository = new MongoUserPersistentRepository(mongoClient, mongoDatabase);
  }

  @Test
  void testNewId() {
    String id = repository.newId();
    assertNotNull(id);
    assertTrue(id.matches("^[0-9a-fA-F]{24}$"));
  }

  @Test
  void testFindByEmail() {
    // GIVEN a user with an email address.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    // WHEN the repository is called to find the user by email.
    User foundUser = repository.findByEmail("test@example.com");
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testFindById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to find the user by ID.
    User foundUser = repository.findById(userId);
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testInsert() {
    // GIVEN a new user.
    User newUser = new User("newId", "newUser", "new@example.com", "password");
    // WHEN the repository is called to insert the new user.
    User insertedUser = repository.insert(newUser);
    // THEN the inserted user should have an ID and match the provided data.
    assertNotNull(insertedUser.getId());
    assertEquals("newUser", insertedUser.getUsername());
    assertEquals("new@example.com", insertedUser.getEmail());
  }

  @Test
  void testReplace() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to replace the user with updated data.
    User updatedUser = new User(userId, "updatedUser", "updated@example.com", "newpassword");
    repository.replace(userId, updatedUser);
    // THEN the replaced user should match the updated data.
    User foundUser = repository.findById(userId);
    assertEquals("updatedUser", foundUser.getUsername());
    assertEquals("updated@example.com", foundUser.getEmail());
  }

  @Test
  void testRemoveById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to remove the user by ID.
    boolean removed = repository.removeById(userId);
    // THEN the user should be removed and the result should be true.
```java
package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@ExtendWith(MongoTestExtension.class)
class MongoUserPersistentRepositoryGeneratedAiTests {

  private MongoUserPersistentRepository repository;
  private MongoClient mongoClient = new MongoClient();
  private MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

  @BeforeEach
  void setUp() {
    repository = new MongoUserPersistentRepository(mongoClient, mongoDatabase);
  }

  @Test
  void testNewId() {
    String id = repository.newId();
    assertNotNull(id);
    assertTrue(id.matches("^[0-9a-fA-F]{24}$"));
  }

  @Test
  void testFindByEmail() {
    // GIVEN a user with an email address.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    // WHEN the repository is called to find the user by email.
    User foundUser = repository.findByEmail("test@example.com");
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testFindById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to find the user by ID.
    User foundUser = repository.findById(userId);
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testInsert() {
    // GIVEN a new user.
    User newUser = new User("newId", "newUser", "new@example.com", "password");
    // WHEN the repository is called to insert the new user.
    User insertedUser = repository.insert(newUser);
    // THEN the inserted user should have an ID and match the provided data.
    assertNotNull(insertedUser.getId());
    assertEquals("newUser", insertedUser.getUsername());
    assertEquals("new@example.com", insertedUser.getEmail());
  }

  @Test
  void testReplace() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to replace the user with updated data.
    User updatedUser = new User(userId, "updatedUser", "updated@example.com", "newpassword");
    repository.replace(userId, updatedUser);
    // THEN the replaced user should match the updated data.
    User foundUser = repository.findById(userId);
    assertEquals("updatedUser", foundUser.getUsername());
    assertEquals("updated@example.com", foundUser.getEmail());
  }

  @Test
  void testRemoveById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to remove the user by ID.
    boolean removed = repository.removeById(userId);
    // THEN the user should be removed and the result should be true.
```java
package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@ExtendWith(MongoTestExtension.class)
class MongoUserPersistentRepositoryGeneratedAiTests {

  private MongoUserPersistentRepository repository;
  private MongoClient mongoClient = new MongoClient();
  private MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

  @BeforeEach
  void setUp() {
    repository = new MongoUserPersistentRepository(mongoClient, mongoDatabase);
  }

  @Test
  void testNewId() {
    String id = repository.newId();
    assertNotNull(id);
    assertTrue(id.matches("^[0-9a-fA-F]{24}$"));
  }

  @Test
  void testFindByEmail() {
    // GIVEN a user with an email address.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    // WHEN the repository is called to find the user by email.
    User foundUser = repository.findByEmail("test@example.com");
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testFindById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to find the user by ID.
    User foundUser = repository.findById(userId);
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testInsert() {
    // GIVEN a new user.
    User newUser = new User("newId", "newUser", "new@example.com", "password");
    // WHEN the repository is called to insert the new user.
    User insertedUser = repository.insert(newUser);
    // THEN the inserted user should have an ID and match the provided data.
    assertNotNull(insertedUser.getId());
    assertEquals("newUser", insertedUser.getUsername());
    assertEquals("new@example.com", insertedUser.getEmail());
  }

  @Test
  void testReplace() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to replace the user with updated data.
    User updatedUser = new User(userId, "updatedUser", "updated@example.com", "newpassword");
    repository.replace(userId, updatedUser);
    // THEN the replaced user should match the updated data.
    User foundUser = repository.findById(userId);
    assertEquals("updatedUser", foundUser.getUsername());
    assertEquals("updated@example.com", foundUser.getEmail());
  }

  @Test
  void testRemoveById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to remove the user by ID.
    boolean removed = repository.removeById(userId);
    // THEN the user should be removed and the result should be true.
```java
package com.bestpractice.api.infrastrucuture.persistent.mongo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@ExtendWith(MongoTestExtension.class)
class MongoUserPersistentRepositoryGeneratedAiTests {

  private MongoUserPersistentRepository repository;
  private MongoClient mongoClient = new MongoClient();
  private MongoDatabase mongoDatabase = mongoClient.getDatabase("test");

  @BeforeEach
  void setUp() {
    repository = new MongoUserPersistentRepository(mongoClient, mongoDatabase);
  }

  @Test
  void testNewId() {
    String id = repository.newId();
    assertNotNull(id);
    assertTrue(id.matches("^[0-9a-fA-F]{24}$"));
  }

  @Test
  void testFindByEmail() {
    // GIVEN a user with an email address.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    // WHEN the repository is called to find the user by email.
    User foundUser = repository.findByEmail("test@example.com");
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testFindById() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to find the user by ID.
    User foundUser = repository.findById(userId);
    // THEN the found user should match the inserted user.
    assertNotNull(foundUser);
    assertEquals("testUser", foundUser.getUsername());
    assertEquals("test@example.com", foundUser.getEmail());
  }

  @Test
  void testInsert() {
    // GIVEN a new user.
    User newUser = new User("newId", "newUser", "new@example.com", "password");
    // WHEN the repository is called to insert the new user.
    User insertedUser = repository.insert(newUser);
    // THEN the inserted user should have an ID and match the provided data.
    assertNotNull(insertedUser.getId());
    assertEquals("newUser", insertedUser.getUsername());
    assertEquals("new@example.com", insertedUser.getEmail());
  }

  @Test
  void testReplace() {
    // GIVEN a user with an ID.
    MongoUserEntity userEntity = new MongoUserEntity(new ObjectId(), "testUser", "test@example.com", "password");
    repository.insert(userEntity.convertTo());
    String userId = userEntity.getId().toString();
    // WHEN the repository is called to replace the user with updated data.
    User updatedUser = new User(userId, "updatedUser", "updated@example.com", "newpassword");
    repository.replace(userId, updatedUser);
    // THEN the replaced user should match the updated data.
    User foundUser = repository.findById(userId);
    assertEquals("updatedUser", foundUser.getUsername());
    assertEquals("updated@example.com", foundUser.getEmail());
  }