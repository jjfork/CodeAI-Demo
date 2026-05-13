package com.bestpractice.api.infrastrucuture;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;

import com.bestpractice.api.infrastrucuture.entity.Info;
import com.bestpractice.api.infrastrucuture.persistent.local.LocalInfoPersistentRepository;

@ExtendWith(MockitoExtension.class)
public class InfrastructureBeanGeneratedAiTests {

    private LocalInfoPersistentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new LocalInfoPersistentRepository();
    }

    @Test
    void testNewIdReturnsNonNullAndUnique() {
        // GIVEN
        // WHEN
        String id1 = repository.newId();
        String id2 = repository.newId();
        // THEN
        assertThat(id1).isNotNull();
        assertThat(id2).isNotNull();
        assertThat(id1).isNotEqualTo(id2);
    }
