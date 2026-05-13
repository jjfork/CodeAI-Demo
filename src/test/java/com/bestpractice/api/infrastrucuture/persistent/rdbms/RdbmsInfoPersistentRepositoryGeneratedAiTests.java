package com.bestpractice.api.infrastrucuture.persistent.rdbms;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.infrastrucuture.entity.Info;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ExtendWith(MockitoExtension.class)
class RdbmsInfoPersistentRepositoryGeneratedAiTests {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private RdbmsInfoPersistentRepository repository;

    @BeforeEach
    void setUp() {
        Mockito.reset(jdbcTemplate);
    }

    @Test
    void newId_ShouldReturnUniqueNonNullString() {
        // GIVEN
        // (no preconditions)

        // WHEN
        String id = repository.newId();

        // THEN
        Assertions.assertThat(id).isNotNull();
        Assertions.assertThat(UUID.fromString(id)).isNotNull();
    }
}