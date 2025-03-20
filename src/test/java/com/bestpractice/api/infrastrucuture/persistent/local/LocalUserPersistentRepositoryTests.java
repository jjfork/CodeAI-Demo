package com.bestpractice.api.infrastrucuture.persistent.local;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

@ExtendWith(MockitoExtension.class)
public class LocalUserPersistentRepositoryTests {

    private UserPersistentRepository repository;

    @BeforeEach
    void setUp() {
        repository = Mockito.mock(UserPersistentRepository.class);
    }

    @Test
    void testRemoveById() {
        Mockito.when(repository.removeById("someId")).thenReturn(true);
        boolean result = repository.removeById("someId");
        Assertions.assertTrue(result);
    }
}