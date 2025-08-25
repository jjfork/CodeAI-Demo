package com.bestpractice.api.infrastrucuture.persistent.rdbms;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.infrastrucuture.entity.User;
import com.bestpractice.api.infrastrucuture.persistent.UserPersistentRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.UUID;

public class RdbmsUserPersistentRepositoryGeneratedAiTests {

    private RdbmsUserPersistentRepository repository;
    private JdbcTemplate jdbcTemplateMock;

    @BeforeEach
    void setUp() {
        jdbcTemplateMock = Mockito.mock(JdbcTemplate.class);
        repository = new RdbmsUserPersistentRepository(jdbcTemplateMock);
    }

    @Test
    void newId_returnsValidUUID() {
        // GIVEN
        // WHEN
        String id = repository.newId();
        // THEN
        assert id != null;
    }

    @Test
    void findByEmail_returnsUserFromDatabase() {
        // GIVEN
        String email = "test@example.com";
        User user = new User();
        user.setEmail(email);
        user.setId(UUID.randomUUID().toString());
        user.setUsername("TestUser");

        Mockito.when(jdbcTemplateMock.queryForObject(Mockito.anyString(), Mockito.any(DataClassRowMapper.class), email))
                .thenReturn(user);

        // WHEN
        User foundUser = repository.findByEmail(email);

        // THEN
        assert foundUser != null;
        assert foundUser.getEmail().equals(email);
    }

    @Test
    void findById_returnsUserFromDatabase() {
        // GIVEN
        String id = UUID.randomUUID().toString();
        User user = new User();
        user.setId(id);
        user.setUsername("TestUser");
        user.setEmail("test@example.com");

        Mockito.when(jdbcTemplateMock.queryForObject(Mockito.anyString(), Mockito.any(DataClassRowMapper.class), id))
                .thenReturn(user);

        // WHEN
        User foundUser = repository.findById(id);

        // THEN
        assert foundUser != null;
        assert foundUser.getId().equals(id);
    }

    @Test
    void insert_insertsUserIntoDatabase() {
        // GIVEN
        User user = new User();
        user.setUsername("TestUser");
        user.setEmail("test@example.com");
        user.setPassword("password");

        // WHEN
        user = repository.insert(user);

        // THEN
        assert user != null;
        assert user.getId() != null;
    }

    @Test
    void replace_updatesUserInDatabase() {
        // GIVEN
        String id = UUID.randomUUID().toString();
        User user = new User();
        user.setUsername("TestUser");
        user.setEmail("test@example.com");
        user.setPassword("newPassword");

        // WHEN
        user = repository.replace(id, user);

        // THEN
        assert user != null;
        assert user.getId() != null;
    }

    @Test
    void removeById_removesUserFromDatabase() {
        // GIVEN
        String id = UUID.randomUUID().toString();
        Mockito.when(jdbcTemplateMock.update(Mockito.anyString(), Mockito.anyString())).thenReturn(1);

        // WHEN
        boolean removed = repository.removeById(id);

        // THEN
        assert removed;
    }
}
