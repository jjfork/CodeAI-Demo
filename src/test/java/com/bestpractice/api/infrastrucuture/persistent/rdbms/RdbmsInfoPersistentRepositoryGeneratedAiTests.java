package com.bestpractice.api.infrastrucuture.persistent.rdbms;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.infrastrucuture.entity.Info;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

public class RdbmsInfoPersistentRepositoryGeneratedAiTests {

    private JdbcTemplate jdbcTemplate;
    private RdbmsInfoPersistentRepository repository;

    @BeforeEach
    void setUp() {
        jdbcTemplate = Mockito.mock(JdbcTemplate.class);
        repository = new RdbmsInfoPersistentRepository(jdbcTemplate);
    }

    @Test
    void testNewIdGeneratesUUID() {
        // GIVEN - repository initialized

        // WHEN - calling newId
        String id = repository.newId();

        // THEN - id should be a valid UUID
        assertDoesNotThrow(() -> UUID.fromString(id));
    }

    @Test
    void testFindAllReturnsList() {
        // GIVEN
        Info info1 = new Info();
        info1.setId("1");
        info1.setTitle("Title1");
        info1.setDescription("Desc1");
        List<Info> expectedList = Arrays.asList(info1);
        when(jdbcTemplate.query(anyString(), any(BeanPropertyRowMapper.class))).thenReturn(expectedList);

        // WHEN
        List<Info> result = repository.findAll();

        // THEN
        assertEquals(expectedList, result);
        assertEquals(1, result.size());
    }

    @Test
    void testFindByIdReturnsInfo() {
        // GIVEN
        Info info = new Info();
        info.setId("123");
        info.setTitle("Title");
        info.setDescription("Desc");
        when(jdbcTemplate.queryForObject(anyString(), any(DataClassRowMapper.class), eq("123"))).thenReturn(info);

        // WHEN
        Info result = repository.findById("123");

        // THEN
        assertEquals(info, result);
        assertEquals("123", result.getId());
    }

    @Test
    void testInsertSuccess() {
        // GIVEN
        Info info = new Info();
        info.setId("id1");
        info.setTitle("Title");
        info.setDescription("Desc");
        when(jdbcTemplate.update(any(), any(GeneratedKeyHolder.class))).thenReturn(1);

        // WHEN
        Info result = repository.insert(info);

        // THEN
        assertEquals(info, result);
    }

    @Test
    void testInsertDuplicateKeyThrowsConflict() {
        // GIVEN
        Info info = new Info();
        info.setId("id1");
        info.setTitle("Title");
        info.setDescription("Desc");
        when(jdbcTemplate.update(any(), any(GeneratedKeyHolder.class))).thenThrow(new DuplicateKeyException("duplicate"));

        // WHEN & THEN
        assertThrows(Conflict.class, () -> repository.insert(info));
    }

    @Test
    void testReplaceUpdatesInfo() {
        // GIVEN
        Info info = new Info();
        info.setTitle("NewTitle");
        info.setDescription("NewDesc");
        when(jdbcTemplate.update(anyString(), any(Object.class), any(Object.class), any(Object.class))).thenReturn(1);

        // WHEN
        Info result = repository.replace("id1", info);

        // THEN
        assertEquals(info, result);
    }

    @Test
    void testRemoveByIdSuccess() {
        // GIVEN
        when(jdbcTemplate.update(anyString(), any(Object.class))).thenReturn(1);

        // WHEN
        boolean result = repository.removeById("id1");

        // THEN
        assertTrue(result);
    }

    @Test
    void testRemoveByIdFailure() {
        // GIVEN
        when(jdbcTemplate.update(anyString(), any(Object.class))).thenThrow(new RuntimeException("error"));

        // WHEN
        boolean result = repository.removeById("id1");

        // THEN
        assertFalse(result);
    }
}
