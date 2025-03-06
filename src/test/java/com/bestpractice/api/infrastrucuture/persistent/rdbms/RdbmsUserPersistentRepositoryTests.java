package com.bestpractice.api.infrastrucuture.persistent.rdbms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class RdbmsUserPersistentRepositoryTests {
    private UserPersistentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new RdbmsUserPersistentRepository(); 
    }

    @Test
    void testRemoveById() {
        // ... other test code ...

        repository.removeById("someId"); 

        Optional<User> user = repository.findById("someId");
        assertFalse(user.isPresent()); 
    }
}