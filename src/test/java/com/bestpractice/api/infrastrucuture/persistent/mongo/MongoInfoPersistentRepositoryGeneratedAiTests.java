package com.bestpractice.api.infrastrucuture.persistent.mongo;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.common.exception.InternalServerError;
import com.bestpractice.api.infrastrucuture.entity.Info;
import com.bestpractice.api.infrastrucuture.persistent.mongo.entity.MongoInfoEntity;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.model.ReplaceOptions;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MongoInfoPersistentRepositoryGeneratedAiTests {

    private MongoDatabase mongoDatabase;
    private MongoCollection<MongoInfoEntity> collection;
    private MongoInfoPersistentRepository repository;

    @BeforeEach
    public void setUp() {
        mongoDatabase = mock(MongoDatabase.class);
        collection = mock(MongoCollection.class);
        when(mongoDatabase.getCollection(anyString(), eq(MongoInfoEntity.class))).thenReturn(collection);
        repository = new MongoInfoPersistentRepository(mock(com.mongodb.client.MongoClient.class), mongoDatabase);
    }

    @Test
    public void testNewIdGeneratesObjectIdString() {
        // GIVEN
        // No special setup required

        // WHEN
        String id = repository.newId();

        // THEN
        assertNotNull(id);
        assertDoesNotThrow(() -> new ObjectId(id));
    }

    @Test
    public void testFindAllReturnsConvertedList() {
        // GIVEN
        MongoInfoEntity entity = mock(MongoInfoEntity.class);
        Info info = mock(Info.class);
        when(entity.convertTo()).thenReturn(info);
        FindIterable<MongoInfoEntity> iterable = mock(FindIterable.class);
        MongoCursor<MongoInfoEntity> cursor = mock(MongoCursor.class);
        when(cursor.hasNext()).thenReturn(true, false);
        when(cursor.next()).thenReturn(entity);
        when(iterable.iterator()).thenReturn(cursor);
        when(collection.find()).thenReturn(iterable);

        // WHEN
        List<Info> result = repository.findAll();

        // THEN
        assertEquals(1, result.size());
        assertSame(info, result.get(0));
    }

    @Test
    public void testFindByIdReturnsConvertedInfo() {
        // GIVEN
        String id = new ObjectId().toString();
        MongoInfoEntity entity = mock(MongoInfoEntity.class);
        Info info = mock(Info.class);
        when(entity.convertTo()).thenReturn(info);
        FindIterable<MongoInfoEntity> iterable = mock(FindIterable.class);
        when(iterable.first()).thenReturn(entity);
        when(collection.find(any(Bson.class))).thenReturn(iterable);

        // WHEN
        Info result = repository.findById(id);

        // THEN
        assertSame(info, result);
    }

    @Test
    public void testInsertInsertsEntity() {
        // GIVEN
        Info info = mock(Info.class);
        MongoInfoEntity entity = mock(MongoInfoEntity.class);
        try (var mockedStatic = mockStatic(MongoInfoEntity.class)) {
            mockedStatic.when(() -> MongoInfoEntity.convertFrom(info)).thenReturn(entity);

            // WHEN
            Info result = repository.insert(info);

            // THEN
            verify(collection).insertOne(entity);
            assertSame(info, result);
        }
    }

    @Test
    public void testReplaceUpdatesEntity() {
        // GIVEN
        Info info = mock(Info.class);
        MongoInfoEntity entity = mock(MongoInfoEntity.class);
        ObjectId objectId = new ObjectId();
        when(entity.getId()).thenReturn(objectId);
        try (var mockedStatic = mockStatic(MongoInfoEntity.class)) {
            mockedStatic.when(() -> MongoInfoEntity.convertFrom(info)).thenReturn(entity);
            UpdateResult updateResult = mock(UpdateResult.class);
            when(updateResult.wasAcknowledged()).thenReturn(true);
            when(collection.replaceOne(any(Bson.class), eq(entity), any(ReplaceOptions.class))).thenReturn(updateResult);

            // WHEN
            Info result = repository.replace(objectId.toString(), info);

            // THEN
            assertSame(info, result);
        }
    }

    @Test
    public void testRemoveByIdDeletesEntity() {
        // GIVEN
        String id = new ObjectId().toString();
        DeleteResult deleteResult = mock(DeleteResult.class);
        when(deleteResult.wasAcknowledged()).thenReturn(true);
        when(collection.deleteOne(any(Bson.class))).thenReturn(deleteResult);

        // WHEN
        boolean result = repository.removeById(id);

        // THEN
        assertTrue(result);
    }

    @Test
    public void testFindByIdThrowsInternalServerErrorOnException() {
        // GIVEN
        String id = new ObjectId().toString();
        when(collection.find(any(Bson.class))).thenThrow(new RuntimeException("DB error"));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> repository.findById(id));
    }
}