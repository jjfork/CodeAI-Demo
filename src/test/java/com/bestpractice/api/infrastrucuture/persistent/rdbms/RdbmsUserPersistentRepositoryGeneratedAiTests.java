package com.bestpractice.api.infrastrucuture.persistent.rdbms;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.infrastrucuture.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;


@ExtendWith(MockitoExtension.class)
class RdbmsUserPersistentRepositoryGeneratedAiTests {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private RdbmsUserPersistentRepository repository;

    @BeforeEach
    void setUp() {
        reset(jdbcTemplate);
    }

    @Test
    void newId_ShouldReturnUuidString() {
        // GIVEN
        // (no setup required)

        // WHEN
        String id = repository.newId();

        // THEN
        assertThat(id).isNotNull();
        assertThat(id).matches("^[0-9a-fA-F-]{36}$");
    }

    @Test
    void findByEmail_ShouldReturnUser_WhenUserExists() {
        // GIVEN
        String email = "user@example.com";
        User expected = new User("1", "john", email, "pass");
        when(jdbcTemplate.queryForObject(anyString(), any(), eq(email))).thenReturn(expected);

        // WHEN
        User actual = repository.findByEmail(email);

        // THEN
        assertThat(actual).isEqualTo(expected);
        verify(jdbcTemplate).queryForObject(anyString(), any(), eq(email));
    }

    @Test
    void findById_ShouldReturnUser_WhenUserExists() {
        // GIVEN
        String id = "1";
        User expected = new User(id, "john", "john@example.com", "pass");
        when(jdbcTemplate.queryForObject(anyString(), any(), eq(id))).thenReturn(expected);

        // WHEN
        User actual = repository.findById(id);

        // THEN
        assertThat(actual).isEqualTo(expected);
        verify(jdbcTemplate).queryForObject(anyString(), any(), eq(id));
    }

    @Test
    void insert_ShouldPersistUser_WhenNoDuplicate() {
        // GIVEN
        User user = new User("1", "john", "john@example.com", "pass");
        when(jdbcTemplate.update(anyString(), any(), any(), any(), any())).thenReturn(1);

        // WHEN
        User result = repository.insert(user);

        // THEN
        assertThat(result).isSameAs(user);
        verify(jdbcTemplate).update(anyString(), eq(user.getId()), eq(user.getUsername()), eq(user.getEmail()), eq(user.getPassword()));
    }}}