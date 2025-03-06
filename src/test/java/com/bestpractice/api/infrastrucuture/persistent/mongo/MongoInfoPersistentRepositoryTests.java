package com.bestpractice.api.infrastrucuture.persistent;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class InfoPersistentRepositoryTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testNewId() {
        // GIVEN - 
        String newId = infoPersistentRepository.newId();
        // THEN - assertNotNull(newId);
    }

    @Test
    void testFindAll() {
        // GIVEN - 
        List<Info> all = infoPersistentRepository.findAll();
        // THEN - assertTrue(all.size() > 0);
    }

    @Test
    void testFindById() {
        // GIVEN - String id = "someId";
        Info found = infoPersistentRepository.findById(id);
        // THEN - assertNotNull(found);
    }

    @Test
    void testInsert() {
        // GIVEN - Info info = new Info();
        Info inserted = infoPersistentRepository.insert(info);
        // THEN - assertNotNull(inserted);
    }

    @Test
    void testReplace() {
        // GIVEN - String id = "someId";
        // Info info = new Info();
        Info replaced = infoPersistentRepository.replace(id, info);
        // THEN - assertNotNull(replaced);
    }

    @Test
    void testRemoveById() {
        // GIVEN - String id = "someId";
        boolean removed = infoPersistentRepository.removeById(id);
        // THEN - assertTrue(removed);
    }


}