package com.bestpractice.api.infrastrucuture.persistent.rdbms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class RdbmsInfoPersistentRepositoryGeneratedAiTests {
    private JdbcTemplate jdbcTemplate;
    private RdbmsInfoPersistentRepository repository;

    @BeforeEach
    void setUp() {
        jdbcTemplate = new JdbcTemplate();
        repository = new RdbmsInfoPersistentRepository(jdbcTemplate);
    }

    @Test
    void testNewId() {
        String id = repository.newId();
        assertNotNull(id);
        assertTrue(id.length() > 0);
    }

    @Test
    void testFindAll() {
        // GIVEN: A few infos in the database
        insertInfo("info1", "desc1");
        insertInfo("info2", "desc2");
        // WHEN: findAll is called
        List<Info> infos = repository.findAll();
        // THEN: The list should contain at least two infos
        assertTrue(infos.size() >= 2);
    }

    @Test
    void testFindById() {
        // GIVEN: An info in the database
        String id = insertInfo("info3", "desc3");
        // WHEN: findById is called with the inserted ID
        Info info = repository.findById(id);
        // THEN: The found info should match the inserted one
        assertEquals("info3", info.getTitle());
        assertEquals("desc3", info.getDescription());
    }

    @Test
    void testInsert() {
        // GIVEN: An info object to insert
        Info info = new Info();
        info.setId("new_info");
        info.setTitle("New Title");
        info.setDescription("New Description");
        // WHEN: insert is called with the info object
        Info insertedInfo = repository.insert(info);
        // THEN: The inserted info should have a valid ID and match the given values
        assertNotNull(insertedInfo.getId());
        assertEquals("New Title", insertedInfo.getTitle());
        assertEquals("New Description", insertedInfo.getDescription());
    }

    @Test
    void testReplace() {
        // GIVEN: An info in the database
        String id = insertInfo("existing_info", "existing_desc");
        // WHEN: replace is called with a modified title and description
        Info updatedInfo = new Info();
        updatedInfo.setId(id);
        updatedInfo.setTitle("Updated Title");
        updatedInfo.setDescription("Updated Description");
        repository.replace(id, updatedInfo);
        // THEN: The replaced info should have the updated values
        Info foundInfo = repository.findById(id);
        assertEquals("Updated Title", foundInfo.getTitle());
        assertEquals("Updated Description", foundInfo.getDescription());
    }

    @Test
    void testRemoveById() {
        // GIVEN: An info in the database
        String id = insertInfo("removable_info", "removable_desc");
        // WHEN: removeById is called with the ID
        boolean removed = repository.removeById(id);
        // THEN: The info should be removed successfully
        assertTrue(removed);
        assertNull(repository.findById(id));
    }

    private String insertInfo(String title, String description) {
        Info info = new Info();
        info.setTitle(title);
        info.setDescription(description);
        return repository.insert(info).getId();
    }
}