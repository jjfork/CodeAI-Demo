package com.bestpractice.api.infrastrucuture.persistent.mongo;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.common.exception.InternalServerError;
import com.bestpractice.api.infrastrucuture.entity.User;
import com.bestpractice.api.infrastrucuture.persistent.mongo.entity.MongoUserEntity;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.ReplaceOptions;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MongoUserPersistentRepositoryGeneratedAiTests {

    private MongoDatabase mongoDatabase;
    private MongoCollection<MongoUserEntity> collection;
    private MongoUserPersistentRepository repository;

    @BeforeEach
    void setUp() {
        mongoDatabase = mock(MongoDatabase.class);
        collection = mock(MongoCollection.class);
        when(mongoDatabase.getCollection("users", MongoUserEntity.class)).thenReturn(collection);
        repository = new MongoUserPersistentRepository(mock(com.mongodb.client.MongoClient.class), mongoDatabase);
    }

    @Test
    void testNewIdGeneratesValidObjectIdString() {
        // GIVEN - repository initialized

        // WHEN - generating new id
        String id = repository.newId();

        // THEN - id should be a valid ObjectId string
        assertNotNull(id);
        assertDoesNotThrow(() -> new ObjectId(id));
    }

    @Test
    void testFindByEmailReturnsUser() {
        // GIVEN
        String email = "test@example.com";
        MongoUserEntity entity = mock(MongoUserEntity.class);
        User expectedUser = new User();
        when(entity.convertTo()).thenReturn(expectedUser);
        FindIterable<MongoUserEntity> iterable = mock(FindIterable.class);
        when(iterable.first()).thenReturn(entity);
        when(collection.find(any(Bson.class))).thenReturn(iterable);

        // WHEN
        User result = repository.findByEmail(email);

        // THEN
        assertEquals(expectedUser, result);
    }

    @Test
    void testFindByEmailThrowsInternalServerErrorOnException() {
        // GIVEN
        when(collection.find(any(Bson.class))).thenThrow(new RuntimeException("DB error"));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> repository.findByEmail("test@example.com"));
    }

    @Test
    void testFindByIdReturnsUser() {
        // GIVEN
        String id = new ObjectId().toString();
        MongoUserEntity entity = mock(MongoUserEntity.class);
        User expectedUser = new User();
        when(entity.convertTo()).thenReturn(expectedUser);
        FindIterable<MongoUserEntity> iterable = mock(FindIterable.class);
        when(iterable.first()).thenReturn(entity);
        when(collection.find(any(Bson.class))).thenReturn(iterable);

        // WHEN
        User result = repository.findById(id);

        // THEN
        assertEquals(expectedUser, result);
    }

    @Test
    void testFindByIdThrowsInternalServerErrorOnException() {
        // GIVEN
        when(collection.find(any(Bson.class))).thenThrow(new RuntimeException("DB error"));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> repository.findById(new ObjectId().toString()));
    }

    @Test
    void testInsertSuccess() {
        // GIVEN
        User user = new User();
        doNothing().when(collection).insertOne(any(MongoUserEntity.class));

        // WHEN
        User result = repository.insert(user);

        // THEN
        assertEquals(user, result);
    }

    @Test
    void testInsertThrowsInternalServerErrorOnException() {
        // GIVEN
        User user = new User();
        doThrow(new RuntimeException("Insert error")).when(collection).insertOne(any(MongoUserEntity.class));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> repository.insert(user));
    }

    @Test
    void testReplaceSuccess() {
        // GIVEN
        User user = new User();
        MongoUserEntity entity = MongoUserEntity.convertFrom(user);
        UpdateResult updateResult = mock(UpdateResult.class);
        when(updateResult.wasAcknowledged()).thenReturn(true);
        when(collection.replaceOne(any(Bson.class), any(MongoUserEntity.class), any(ReplaceOptions.class))).thenReturn(updateResult);

        // WHEN
        User result = repository.replace(entity.getId().toString(), user);

        // THEN
        assertEquals(user, result);
    }

    @Test
    void testReplaceThrowsInternalServerErrorOnException() {
        // GIVEN
        User user = new User();
        doThrow(new RuntimeException("Replace error")).when(collection).replaceOne(any(Bson.class), any(MongoUserEntity.class), any(ReplaceOptions.class));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> repository.replace(new ObjectId().toString(), user));
    }

    @Test
    void testRemoveByIdSuccess() {
        // GIVEN
        DeleteResult deleteResult = mock(DeleteResult.class);
        when(deleteResult.wasAcknowledged()).thenReturn(true);
        when(collection.deleteOne(any(Bson.class))).thenReturn(deleteResult);

        // WHEN
        boolean result = repository.removeById(new ObjectId().toString());

        // THEN
        assertTrue(result);
    }

    @Test
    void testRemoveByIdThrowsInternalServerErrorOnException() {
        // GIVEN
        when(collection.deleteOne(any(Bson.class))).thenThrow(new RuntimeException("Delete error"));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> repository.removeById(new ObjectId().toString()));
    }
}
