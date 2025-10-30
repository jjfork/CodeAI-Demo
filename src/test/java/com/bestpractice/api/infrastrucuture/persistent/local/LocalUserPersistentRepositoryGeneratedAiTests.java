package com.bestpractice.api.infrastrucuture.persistent.local;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.infrastrucuture.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class LocalUserPersistentRepositoryGeneratedAiTests {

    private LocalUserPersistentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new LocalUserPersistentRepository();
    }

    @Test
    void givenNothing_whenNewId_thenReturnsNonNullUniqueId() {
        // GIVEN - nothing

        // WHEN
        String id1 = repository.newId();
        String id2 = repository.newId();

        // THEN
        assertNotNull(id1);
        assertNotNull(id2);
        assertNotEquals(id1, id2);
    }

    @Test
    void givenExistingUser_whenFindByEmail_thenReturnsUser() {
        // GIVEN
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setEmail("test@example.com");
        repository.insert(user);

        // WHEN
        User found = repository.findByEmail("test@example.com");

        // THEN
        assertNotNull(found);
        assertEquals(user.getEmail(), found.getEmail());
    }

    @Test
    void givenNonExistingEmail_whenFindByEmail_thenReturnsNull() {
        // GIVEN - no users

        // WHEN
        User found = repository.findByEmail("notfound@example.com");

        // THEN
        assertNull(found);
    }

    @Test
    void givenNullEmail_whenFindByEmail_thenReturnsNull() {
        // GIVEN
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setEmail(null);
        repository.insert(user);

        // WHEN
        User found = repository.findByEmail(null);

        // THEN
        assertNull(found);
    }

    @Test
    void givenExistingUser_whenFindById_thenReturnsUser() {
        // GIVEN
        User user = new User();
        user.setId("123");
        user.setEmail("id@example.com");
        repository.insert(user);

        // WHEN
        User found = repository.findById("123");

        // THEN
        assertNotNull(found);
        assertEquals("123", found.getId());
    }

    @Test
    void givenNonExistingId_whenFindById_thenReturnsNull() {
        // GIVEN - no users

        // WHEN
        User found = repository.findById("nonexistent");

        // THEN
        assertNull(found);
    }

    @Test
    void givenNullId_whenFindById_thenReturnsNull() {
        // GIVEN
        User user = new User();
        user.setId(null);
        user.setEmail("nullid@example.com");
        repository.insert(user);

        // WHEN
        User found = repository.findById(null);

        // THEN
        assertNull(found);
    }

    @Test
    void givenUser_whenInsert_thenUserIsStored() {
        // GIVEN
        User user = new User();
        user.setId("insertId");
        user.setEmail("insert@example.com");

        // WHEN
        User inserted = repository.insert(user);

        // THEN
        assertEquals(user, inserted);
        assertEquals(user, repository.findById("insertId"));
    }

    @Test
    void givenExistingUser_whenReplace_thenUserIsUpdated() {
        // GIVEN
        User oldUser = new User();
        oldUser.setId("replaceId");
        oldUser.setEmail("old@example.com");
        repository.insert(oldUser);

        User newUser = new User();
        newUser.setId("replaceId");
        newUser.setEmail("new@example.com");

        // WHEN
        repository.replace("replaceId", newUser);

        // THEN
        User found = repository.findById("replaceId");
        assertNotNull(found);
        assertEquals("new@example.com", found.getEmail());
    }

    @Test
    void givenNonExistingUser_whenReplace_thenThrowsException() {
        // GIVEN
        User user = new User();
        user.setId("nonexistent");
        user.setEmail("no@example.com");

        // WHEN / THEN
        assertThrows(RuntimeException.class, () -> repository.replace("nonexistent", user));
    }

    @Test
    void givenNullId_whenReplace_thenThrowsException() {
        // GIVEN
        User existingUser = new User();
        existingUser.setId("existingId");
        existingUser.setEmail("existing@example.com");
        repository.insert(existingUser);

        User newUser = new User();
        newUser.setId("existingId");
        newUser.setEmail("updated@example.com");

        // WHEN / THEN
        assertThrows(RuntimeException.class, () -> repository.replace(null, newUser));
    }

    @Test
    void givenExistingUser_whenRemoveById_thenUserIsRemoved() {
        // GIVEN
        User user = new User();
        user.setId("removeId");
        user.setEmail("remove@example.com");
        repository.insert(user);

        // WHEN
        boolean result = repository.removeById("removeId");

        // THEN
        assertTrue(result);
        assertNull(repository.findById("removeId"));
    }

    @Test
    void givenNonExistingUser_whenRemoveById_thenReturnsTrue() {
        // GIVEN - no users

        // WHEN
        boolean result = repository.removeById("nonexistent");

        // THEN
        assertTrue(result);
    }

    @Test
    void givenNullId_whenRemoveById_thenReturnsTrue() {
        // GIVEN - no users

        // WHEN
        boolean result = repository.removeById(null);

        // THEN
        assertTrue(result);
    }
}
