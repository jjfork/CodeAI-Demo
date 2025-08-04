package com.bestpractice.api.infrastrucuture.persistent.local;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.bestpractice.api.infrastrucuture.persistent.User; 

public class LocalUserPersistentRepositoryGeneratedAiTests {

    private LocalUserPersistentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new LocalUserPersistentRepository();
    }

    @Test
    void testNewId() {
        String id = repository.newId();
        assertNotNull(id);
        assertTrue(id.length() > 0);
    }

    @Test
    void testFindByEmail_ExistingUser() {
        repository.insert(new User("1", "testuser", "test@example.com", "password"));
        User user = repository.findByEmail("test@example.com");
        assertNotNull(user);
        assertEquals("testuser", user.getUsername());
    }

    @Test
    void testFindByEmail_NonExistingUser() {
        User user = repository.findByEmail("nonexistent@example.com");
        assertNull(user);
    }

    @Test
    void testFindById_ExistingUser() {
        repository.insert(new User("2", "testuser2", "test2@example.com", "password"));
        User user = repository.findById("2");
        assertNotNull(user);
        assertEquals("testuser2", user.getUsername());
    }

    @Test
    void testFindById_NonExistingUser() {
        User user = repository.findById("nonexistentId");
        assertNull(user);
    }

    @Test
    void testInsert() {
        User newUser = new User("3", "testuser3", "test3@example.com", "password");
        User insertedUser = repository.insert(newUser);
        assertNotNull(insertedUser);
        assertEquals("testuser3", insertedUser.getUsername());
    }

    @Test
    void testReplace() {
        repository.insert(new User("4", "testuser4", "test4@example.com", "password"));
        String existingId = "4";
        User updatedUser = new User(existingId, "updated_testuser4", "updated_test4@example.com", "new_password");
        repository.replace(existingId, updatedUser);
        User retrievedUser = repository.findById(existingId);
        assertEquals("updated_testuser4", retrievedUser.getUsername());
    }

    @Test
    void testRemoveById() {
        repository.insert(new User("5", "testuser5", "test5@example.com", "password"));
        boolean removed = repository.removeById("5");
        assertTrue(removed);
        User user = repository.findById("5");
        assertNull(user);
    }

}