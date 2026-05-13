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
import com.bestpractice.api.infrastrucuture.entity.Info;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LocalInfoPersistentRepositoryGeneratedAiTests {

    private LocalInfoPersistentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new LocalInfoPersistentRepository();
    }

    @Test
    void testNewIdReturnsUniqueNonNull() {
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
    void testInsertAddsInfoAndFindByIdRetrieves() {
        // GIVEN
        Info info = new Info();
        info.setId("123");
        info.setTitle("Title");
        info.setDescription("Description");
        // WHEN
        Info inserted = repository.insert(info);
        Info retrieved = repository.findById("123");
        // THEN
        assertThat(inserted).isSameAs(info);
        assertThat(retrieved).isNotNull();
        assertThat(retrieved.getId()).isEqualTo("123");
        assertThat(retrieved.getTitle()).isEqualTo("Title");
        assertThat(retrieved.getDescription()).isEqualTo("Description");
    }

    @Test
    void testFindAllReturnsAllInserted() {
        // GIVEN
        Info info1 = new Info();
        info1.setId("1");
        info1.setTitle("One");
        info1.setDescription("First");
        Info info2 = new Info();
        info2.setId("2");
        info2.setTitle("Two");
        info2.setDescription("Second");
        repository.insert(info1);
        repository.insert(info2);
        // WHEN
        List<Info> all = repository.findAll();
        // THEN
        assertThat(all).hasSize(2);
        assertThat(all).containsExactly(info1, info2);
    }
