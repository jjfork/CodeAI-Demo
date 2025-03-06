package com.bestpractice.api.infrastrucuture.persistent.local;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LocalUserPersistentRepositoryTests {
    static class User {
        private String id;
        private String name;

        public User(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    @Test
    void testSave() {
        // ... other test code ...
        LocalUserPersistentRepository repository = mock(LocalUserPersistentRepository.class);
        User user = new User("testId", "testName");
        repository.save(user);
        verify(repository, times(1)).save(user);
    }

    @Test
    void testFindById() {
        // ... other test code ...
        LocalUserPersistentRepository repository = mock(LocalUserPersistentRepository.class);
        when(repository.findById("testId")).thenReturn(Optional.of(new User("testId", "testName")));
        Optional<User> foundUser = repository.findById("testId");
        assertTrue(foundUser.isPresent());
        assertEquals("testId", foundUser.get().getId());
    }

    @Test
    void testReplace() {
        // ... other test code ...
        LocalUserPersistentRepository repository = mock(LocalUserPersistentRepository.class);
        User newUser = new User("testId", "newName");
        repository.replace(newUser);
        verify(repository, times(1)).replace(newUser);
    }

    @Test
    void testRemoveById() {
        // ... other test code ...
        LocalUserPersistentRepository repository = mock(LocalUserPersistentRepository.class);
        repository.removeById("testId");
        verify(repository, times(1)).removeById("testId");
    }

}