package com.bestpractice.api.infrastrucuture.persistent.mongo;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.MockitoExtension;
import org.junit.jupiter.api.extension.MockitoJUnitRunner;
import org.junit.jupiter.api.extension.MockitoJUnitRunner;
import org.mockito.Mockito;

import com.bestpractice.api.common.exception.InternalServerError;
import com.bestpractice.api.infrastrucuture.entity.Info;
import com.bestpractice.api.infrastrucuture.persistent.mongo.entity.MongoInfoEntity;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
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

import org.junit.jupiter.api.extension.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@MockitoJUnitRunner
public class MongoInfoPersistentRepositoryGeneratedAiTests {

  private MongoInfoPersistentRepository repository;
  private MongoClient mongoClient;
  private MongoDatabase mongoDatabase;
  private MongoCollection<MongoInfoEntity> collection;

  @BeforeEach
  void setUp() {
    mongoClient = Mockito.mock(MongoClient.class);
    mongoDatabase = Mockito.mock(MongoDatabase.class);
    collection = Mockito.mock(MongoCollection.class);
    repository = new MongoInfoPersistentRepository(mongoClient, mongoDatabase);
  }

  @Test
  void newId_returns_valid_object_id() {
    // GIVEN: A new MongoInfoPersistentRepository instance is created.
    // WHEN: The newId() method is called.
    // THEN: The newId() method returns a valid ObjectId string.
    String result = repository.newId();
    assertNotNull(result);
    assertTrue(result.matches("\\d+"));
  }

  @Test
  void findAll_returns_list_of_info_entities() {
    // GIVEN: A MongoInfoPersistentRepository instance is created.
    // WHEN: The findAll() method is called.
    // THEN: The findAll() method returns a list of MongoInfoEntity objects.
    List<MongoInfoEntity> expected = new ArrayList<>();
    MongoInfoEntity entity1 = Mockito.mock(MongoInfoEntity.class);
    MongoInfoEntity entity2 = Mockito.mock(MongoInfoEntity.class);
    expected.add(entity1);
    expected.add(entity2);
    Mockito.when(collection.find()).thenReturn(FindIterable.fromIterable(expected));
    List<Info> actual = repository.findAll();
    assertEquals(actual.size(), expected.size());
    for (Info info : actual) {
      assertNotNull(info);
    }
  }

  @Test
  void findById_returns_info_entity_by_id() {
    // GIVEN: A MongoInfoPersistentRepository instance is created.
    // WHEN: The findById("some_id") method is called.
    // THEN: The findById() method returns the Info entity with the specified ID.
    String id = "some_id";
    MongoInfoEntity entity = Mockito.mock(MongoInfoEntity.class);
    Mockito.when(entity.getId()).thenReturn(id);
    Mockito.when(collection.find(Filters.and(Filters.eq("_id", new ObjectId(id)))).first()).thenReturn(entity);
    Info info = repository.findById(id);
    assertNotNull(info);
    assertEquals(info.getId(), id);
  }

  @Testjava
  void replace_replaces_info_entity_by_id_and_returns_info_entity() {
    // GIVEN: A MongoInfoPersistentRepository instance is created.
    // WHEN: The replace("some_id", info) method is called.
    // THEN: The replace() method replaces the info entity with the specified ID with the provided info entity and returns the same info entity.
    String id = "some_id";
    Info info = new Info("test", 123);
    MongoInfoEntity entity = Mockito.mock(MongoInfoEntity.class);
    Mockito.when(entity.getId()).thenReturn(id);
    Mockito.when(entity.convertTo()).thenReturn(info);
    Mockito.when(collection.replaceOne(Filters.and(Filters.eq("_id", new ObjectId(id)), Filters.and(Filters.eq("_id", new ObjectId(id)))) , entity, new ReplaceOptions().upsert(true))).thenReturn(UpdateResult.builder().wasAcknowledged(true).build());
    Info result = repository.replace(id, info);
    assertNotNull(result);
    assertEquals(result.getId(), id);
  }

  @Test
  void removeById_removes_info_entity_by_id_and_returns_acknowledgment() {
    // GIVEN: A MongoInfoPersistentRepository instance is created.
    // WHEN: The removeById("some_id") method is called.
    // THEN: The removeById() method removes the info entity with the specified ID from the database and returns true if the operation was acknowledged.
    String id = "some_id";
    MongoInfoEntity entity = Mockito.mock(MongoInfoEntity.class);
    Mockito.when(entity.getId()).thenReturn(id);
    Mockito.when(collection.deleteOne(Filters.and(Filters.eq("_id", new ObjectId(id)))))
            .thenReturn(DeleteResult.builder().wasAcknowledged(true).build());
    boolean result = repository.removeById(id);
    assertTrue(result);
  }
}