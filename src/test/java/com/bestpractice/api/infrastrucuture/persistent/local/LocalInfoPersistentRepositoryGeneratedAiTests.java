package com.bestpractice.api.infrastrucuture.persistent.local;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

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
        assertEquals(0, infos.size());
    }

    @Test
    void testInsertAndFindAll() {
        Info info = new Info();
        info.setId("testId");
        info.setTitle("testTitle");
        info.setDescription("testDescription");
        repository.insert(info);
        List<Info> infos = repository.findAll();
        assertEquals(1, infos.size());
        assertEquals(info, infos.get(0));
    }

    @Test
    void testFindByIdNonexistent() {
        String id = "nonExistentId";
        Info info = repository.findById(id);
        assertNull(info);
    }

    @Test
    void testFindByIdExisting() {
        Info info = new Info();
        info.setId("testId");
        info.setTitle("testTitle");
        info.setDescription("testDescription");
        repository.insert(info);
        Info foundInfo = repository.findById("testId");
        assertEquals(info, foundInfo);
    }

    @Test
    void testReplace() {
        Info info1 = new Info();
        info1.setId("testId");
        info1.setTitle("testTitle1");
        info1.setDescription("testDescription1");
        repository.insert(info1);
        Info info2 = new Info();
        info2.setId("testId");
        info2.setTitle("testTitle2");
        info2.setDescription("testDescription2");
        repository.replace("testId", info2);
        Info foundInfo = repository.findById("testId");
        assertEquals(info2, foundInfo);
    }

    @Test
    void testRemoveByIdNonexistent() {
        String id = "nonExistentId";
        boolean removed = repository.removeById(id);
        assertTrue(removed);
    }

    @Test
    void testRemoveByIdExisting() {
        Info info = new Info();
        info.setId("testId");
        info.setTitle("testTitle");
        info.setDescription("testDescription");
        repository.insert(info);
        boolean removed = repository.removeById("testId");
        assertTrue(removed);
        assertNull(repository.findById("testId"));
    }
}