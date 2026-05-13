package com.bestpractice.api.infrastrucuture.persistent.local;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bestpractice.api.infrastrucuture.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LocalUserPersistentRepositoryGeneratedAiTests {

    private LocalUserPersistentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new LocalUserPersistentRepository();
    }

    @Test
    void newId_ShouldReturnNonNullUniqueId() {
        // GIVEN
        // WHEN
        String id1 = repository.newId();
        String id2 = repository.newId();
        // THEN
        assertThat(id1).isNotNull();
        assertThat(id2).isNotNull();
        assertThat(id1).isNotEqualTo(id2);
    }

    @Test
    void insert_ShouldAddUserAndReturnSameInstance() {
        // GIVEN
        User user = new User(UUID.randomUUID().toString(), "john", "john@example.com", "pass");
        // WHEN
        User inserted = repository.insert(user);
        // THEN
        assertThat(inserted).isSameAs(user);
        assertThat(repository.findById(user.getId())).isSameAs(user);
    }

    @Test
    void findById_ShouldReturnInsertedUser() {
        // GIVEN
        User user = new User(UUID.randomUUID().toString(), "alice", "alice@example.com", "secret");
        repository.insert(user);
        // WHEN
        User found = repository.findById(user.getId());
        // THEN
        assertThat(found).isSameAs(user);
    }

    @Test
    void findById_ShouldReturnNullWhenNotFound() {
        // GIVEN
        String nonExistingId = UUID.randomUUID().toString();
        // WHEN
        User found = repository.findById(nonExistingId);
        // THEN
        assertThat(found).isNull();
    }

    @Test
    void findByEmail_ShouldReturnInsertedUser() {
        // GIVEN
        User user = new User(UUID.randomUUID().toString(), "bob", "bob@example.com", "pwd");
        repository.insert(user);
        // WHEN
        User found = repository.findByEmail(user.getEmail());
        // THEN
        assertThat(found).isSameAs(user);
    }

    @Test
    void findByEmail_ShouldReturnNullWhenNotFound() {
        // GIVEN
        String nonExistingEmail = "noone@example.com";
        // WHEN
        User found = repository.findByEmail(nonExistingEmail);
        // THEN
        assertThat(found).isNull();
    }

    @Test
    void replace_ShouldUpdateExistingUser() {
        // GIVEN
        User original = new User(UUID.randomUUID().toString(), "old", "old@example.com", "oldpwd");
        repository.insert(original);
        User updated = new User(original.getId(), "new", "new@example.com", "newpwd");
        // WHEN
        repository.replace(original.getId(), updated);
        // THEN
        User found = repository.findById(original.getId());
        assertThat(found).isSameAs(updated);
    }

    @Test
    void replace_ShouldThrowWhenIdNotFound() {
        // GIVEN
        String nonExistingId = UUID.randomUUID().toString();
        User user = new User(nonExistingId, "x", "x@example.com", "xpwd");
        // WHEN & THEN
        assertThrows(RuntimeException.class, () -> repository.replace(nonExistingId, user));
    }
