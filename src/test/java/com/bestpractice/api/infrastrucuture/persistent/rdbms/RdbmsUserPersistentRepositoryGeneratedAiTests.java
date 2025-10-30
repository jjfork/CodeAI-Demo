package com.bestpractice.api.infrastrucuture.persistent.rdbms;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.infrastrucuture.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

public class RdbmsUserPersistentRepositoryGeneratedAiTests {

    private JdbcTemplate jdbcTemplate;
    private RdbmsUserPersistentRepository repository;

    @BeforeEach
    void setUp() {
        jdbcTemplate = mock(JdbcTemplate.class);
        repository = new RdbmsUserPersistentRepository(jdbcTemplate);
    }

    @Test
    void testNewIdGeneratesUUID() {
        // GIVEN - no preconditions

        // WHEN
        String id = repository.newId();

        // THEN
        assertNotNull(id);
        assertDoesNotThrow(() -> java.util.UUID.fromString(id));
    }

    @Test
    void testFindByEmailReturnsUser() {
        // GIVEN
        User expectedUser = new User("id1", "username", "email@example.com", "password");
        when(jdbcTemplate.queryForObject(anyString(), any(DataClassRowMapper.class), eq("email@example.com")))
                .thenReturn(expectedUser);

        // WHEN
        User actualUser = repository.findByEmail("email@example.com");

        // THEN
        assertEquals(expectedUser, actualUser);
    }

    @Test
    void testFindByEmailThrowsRuntimeException() {
        // GIVEN
        when(jdbcTemplate.queryForObject(anyString(), any(DataClassRowMapper.class), eq("missing@example.com")))
                .thenThrow(new RuntimeException("User not found"));

        // WHEN & THEN
        assertThrows(RuntimeException.class, () -> repository.findByEmail("missing@example.com"));
    }

    @Test
    void testFindByIdReturnsUser() {
        // GIVEN
        User expectedUser = new User("id1", "username", "email@example.com", "password");
        when(jdbcTemplate.queryForObject(anyString(), any(DataClassRowMapper.class), eq("id1")))
                .thenReturn(expectedUser);

        // WHEN
        User actualUser = repository.findById("id1");

        // THEN
        assertEquals(expectedUser, actualUser);
    }

    @Test
    void testFindByIdThrowsRuntimeException() {
        // GIVEN
        when(jdbcTemplate.queryForObject(anyString(), any(DataClassRowMapper.class), eq("missingId")))
                .thenThrow(new RuntimeException("User not found"));

        // WHEN & THEN
        assertThrows(RuntimeException.class, () -> repository.findById("missingId"));
    }

    @Test
    void testInsertUserSuccessfully() {
        // GIVEN
        User user = new User("id1", "username", "email@example.com", "password");
        when(jdbcTemplate.update(anyString(), any(), any(), any(), any())).thenReturn(1);

        // WHEN
        User result = repository.insert(user);

        // THEN
        assertEquals(user, result);
    }

    @Test
    void testInsertUserThrowsConflictOnDuplicateKey() {
        // GIVEN
        User user = new User("id1", "username", "email@example.com", "password");
        when(jdbcTemplate.update(anyString(), any(), any(), any(), any()))
                .thenThrow(new DuplicateKeyException("duplicate"));

        // WHEN & THEN
        assertThrows(Conflict.class, () -> repository.insert(user));
    }

    @Test
    void testReplaceUserSuccessfully() {
        // GIVEN
        User user = new User("id1", "newUsername", "newEmail@example.com", "newPassword");
        when(jdbcTemplate.update(anyString(), any(), any(), any(), any())).thenReturn(1);

        // WHEN
        User result = repository.replace("id1", user);

        // THEN
        assertEquals(user, result);
    }

    @Test
    void testReplaceUserThrowsRuntimeException() {
        // GIVEN
        User user = new User("id1", "newUsername", "newEmail@example.com", "newPassword");
        when(jdbcTemplate.update(anyString(), any(), any(), any(), any()))
                .thenThrow(new RuntimeException("update failed"));

        // WHEN & THEN
        assertThrows(RuntimeException.class, () -> repository.replace("id1", user));
    }

    @Test
    void testRemoveByIdReturnsTrueOnSuccess() {
        // GIVEN
        when(jdbcTemplate.update(anyString(), eq("id1"))).thenReturn(1);

        // WHEN
        boolean result = repository.removeById("id1");

        // THEN
        assertTrue(result);
    }

    @Test
    void testRemoveByIdReturnsFalseOnException() {
        // GIVEN
        when(jdbcTemplate.update(anyString(), eq("id1"))).thenThrow(new RuntimeException("error"));

        // WHEN
        boolean result = repository.removeById("id1");

        // THEN
        assertFalse(result);
    }
}
