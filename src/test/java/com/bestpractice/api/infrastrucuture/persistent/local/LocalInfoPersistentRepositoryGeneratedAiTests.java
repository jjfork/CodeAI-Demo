package com.bestpractice.api.infrastrucuture.persistent.local;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import com.bestpractice.api.infrastrucuture.entity.Info; 

public class LocalInfoPersistentRepositoryGeneratedAiTests {

    private LocalInfoPersistentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new LocalInfoPersistentRepository();
    }

    @Test
    void testNewId() {
        String id = repository.newId();
        assertNotNull(id);
        assertTrue(id.length() > 0);
    }

    @Test
    void testFindAllEmpty() {
        List<Info> infos = repository.findAll();
        assertTrue(infos.isEmpty());
    }

    @Test
    void testFindByIdNonexistent() {
        String id = "nonexistent";
        Info info = repository.findById(id);
        assertNull(info);
    }

    @Test
    void testInsert() {
        Info info = new Info();
        info.setId("testId");
        info.setTitle("testTitle");
        info.setDescription("testDescription");
        Info insertedInfo = repository.insert(info);
        assertNotNull(insertedInfo);
        assertEquals(info.getId(), insertedInfo.getId());
        assertEquals(info.getTitle(), insertedInfo.getTitle());
        assertEquals(info.getDescription(), insertedInfo.getDescription());
    }

    @Test
    void testReplace() {
        Info existingInfo = new Info();
        existingInfo.setId("existingId");
        existingInfo.setTitle("existingTitle");
        existingInfo.setDescription("existingDescription");
        repository.insert(existingInfo);
        Info updatedInfo = new Info();
        updatedInfo.setId("existingId");
        updatedInfo.setTitle("updatedTitle");
        updatedInfo.setDescription("updatedDescription");
        repository.replace("existingId", updatedInfo);
        Info retrievedInfo = repository.findById("existingId");
        assertEquals(retrievedInfo.getTitle(), updatedInfo.getTitle());
        assertEquals(retrievedInfo.getDescription(), updatedInfo.getDescription());
    }

    @Test
    void testRemoveById() {
        Info info = new Info();
        info.setId("removeId");
        repository.insert(info);
        boolean removed = repository.removeById("removeId");
        assertTrue(removed);
        assertNull(repository.findById("removeId"));
    }

}