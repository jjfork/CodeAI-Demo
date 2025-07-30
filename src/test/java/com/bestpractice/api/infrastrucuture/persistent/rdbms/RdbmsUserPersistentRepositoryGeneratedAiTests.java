package com.bestpractice.api.infrastrucuture.persistent.rdbms;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import com.bestpractice.api.infrastrucuture.persistent.rdbms.User; // Add this import
import com.bestpractice.api.infrastrucuture.persistent.rdbms.Conflict; // Add this import

class RdbmsUserPersistentRepositoryGeneratedAiTests {

    private JdbcTemplate jdbcTemplate;
    private RdbmsUserPersistentRepository repository;

    @BeforeEach
    void setUp() {
        jdbcTemplate = new JdbcTemplate();
        repository = new RdbmsUserPersistentRepository(jdbcTemplate);
    }

    @Test
    void testNewId() {
        String id = repository.newId();
        assertNotNull(id);
        assertTrue(id.length() > 0);
    }

    @Test
    void testFindByEmail_ExistingUser() {
        // GIVEN
        String email = UUID.randomUUID().toString() + "@example.com";
        String id = UUID.randomUUID().toString();
        repository.insert(new User(id, "testuser", email, "password"));

        // WHEN
        User user = repository.findByEmail(email);

        // THEN
        assertNotNull(user);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testFindByEmail_NonExistingUser() {
        // GIVEN
        String email = UUID.randomUUID().toString() + "@example.com";

        // WHEN
        User user = repository.findByEmail(email);

        // THEN
        assertNull(user);
    }

    @Test
    void testInsert_Success() {
        // GIVEN
        String id = UUID.randomUUID().toString();
        User user = new User(id, "testuser", "test@example.com", "password");

        // WHEN
        repository.insert(user);

        // THEN
        User retrievedUser = repository.findById(id);
        assertNotNull(retrievedUser);
        assertEquals("testuser", retrievedUser.getUsername());
    }

    @Test
    void testInsert_DuplicateEmail() {
        // GIVEN
        String email = UUID.randomUUID().toString() + "@example.com";
        repository.insert(new User(UUID.randomUUID().toString(), "testuser1", email, "password"));

        // WHEN
        assertThrows(Conflict.class, () -> repository.insert(new User(UUID.randomUUID().toString(), "testuser2", email, "password")));

        // THEN
    }


    @Test
    void testUpdate_Success() {
        // GIVEN
        String id = UUID.randomUUID().toString();
        User user = new User(id, "testuser", "test@example.com", "password");
        repository.insert(user);

        // WHEN
        user.setUsername("updatedUsername");
        repository.update(user);

        // THEN
        User retrievedUser = repository.findById(id);
        assertEquals("updatedUsername", retrievedUser.getUsername());
    }


    @Test
    void testDelete_Success() {
        // GIVEN
        String id = UUID.randomUUID().toString();
        repository.insert(new User(id, "testuser", "test@example.com", "password"));

        // WHEN
        repository.deleteById(id);

        // THEN
        User retrievedUser = repository.findById(id);
        assertNull(retrievedUser);
    }