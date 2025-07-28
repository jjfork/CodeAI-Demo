package com.bestpractice.api.infrastrucuture.persistent.mongo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.bestpractice.api.infrastrucuture.entity.User;
import com.bestpractice.api.infrastrucuture.persistent.mongo.entity.MongoUserEntity;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MongoUserPersistentRepositoryGeneratedAiTests {
  @Mock
  MongoClient mongoClient;
  @Mock
  MongoDatabase mongoDatabase;
  @Mock
  MongoCollection<MongoUserEntity> collection;

  @InjectMocks
  MongoUserPersistentRepository repository;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    when(mongoClient.getDatabase("testDatabase")).thenReturn(mongoDatabase);
    when(mongoDatabase.getCollection("users", MongoUserEntity.class)).thenReturn(collection);
  }

  @Test
  void testNewId() {
    String id = repository.newId();
    assertNotNull(id);
  }

  @Test
  void testFindByEmail() {
    MongoUserEntity userEntity = new MongoUserEntity("testId", "testUsername", "testEmail", "testPassword");
    when(collection.find(Filters.and(Filters.eq("email", "testEmail"))).first()).thenReturn(userEntity);
    User user = repository.findByEmail("testEmail");
    assertEquals("testUsername", user.getUsername());
  }

  @Test
  void testFindById() {
    MongoUserEntity userEntity = new MongoUserEntity("testId", "testUsername", "testEmail", "testPassword");
    when(collection.find(Filters.and(Filters.eq("_id", new ObjectId("testId")))).first()).thenReturn(userEntity);
    User user = repository.findById("testId");
    assertEquals("testUsername", user.getUsername());
  }

  @Test
  void testInsert() {
    User user = new User("testId", "testUsername", "testEmail", "testPassword");
    MongoUserEntity userEntity = MongoUserEntity.convertFrom(user);
    when(collection.insertOne(userEntity)).thenReturn(null);
    repository.insert(user);
  }

  @Test
  void testReplace() {
    User user = new User("testId", "testUsername", "testEmail", "testPassword");
    MongoUserEntity userEntity = MongoUserEntity.convertFrom(user);
    when(collection.replaceOne(Filters.and(Filters.eq("_id", userEntity.getId())), userEntity, new ReplaceOptions().upsert(true))).thenReturn(null);
    repository.replace("testId", user);
  }

  @Test
  void testRemoveById() {
    boolean result = repository.removeById("testId");
    assertTrue(result);
  }
}