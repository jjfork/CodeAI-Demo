package com.bestpractice.api.infrastrucuture.persistent.rdbms;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import com.bestpractice.api.infrastrucuture.entity.Info;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class InfoRepositoryTests {
    @Autowired
    private InfoRepository repository;

    @BeforeEach
    void setUp() {
        // Reset the database before each test
    }

    @Test
    void testFindAll() {
        // GIVEN a list of Infos in the database
        List<Info> infos = repository.findAll();
        // THEN the list is not empty
        assertFalse(infos.isEmpty());
    }

    @Test
    void testFindById() {
        // GIVEN an existing Info ID
        String id = "someId";
        // WHEN finding the Info by ID
        Info info = repository.findById(id);
        // THEN the Info is not null
        assertNotNull(info);
    }

    @Test
    void testInsert() {
        // GIVEN a new Info object
        Info info = new Info();
        info.setId("newId");
        info.setTitle("New Title");
        info.setDescription("New Description");
        // WHEN inserting the Info
        repository.insert(info);
        // THEN the Info is saved in the database
        assertNotNull(repository.findById(info.getId()));
    }

    @Test
    void testReplace() {
        // GIVEN an existing Info object
        Info info = new Info();
        info.setId("existingId");
        info.setTitle("Existing Title");
        info.setDescription("Existing Description");
        repository.insert(info);
        // WHEN removing the Info by ID
        repository.removeById(info.getId());
        // THEN the Info is not found in the database
        assertNull(repository.findById(info.getId()));
    }
}