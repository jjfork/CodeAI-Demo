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