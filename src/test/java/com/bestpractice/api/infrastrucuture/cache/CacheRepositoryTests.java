package com.bestpractice.api.infrastrucuture.cache;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CacheRepositoryTests {

    private CacheRepository cacheRepository;

    @BeforeEach
    void setUp() {
        cacheRepository = new CacheRepository();
    }

    @Test
    void testSomething() {
        // GIVEN - Set up the initial state
        // WHEN - Call the method under test
        // THEN - Assert the expected outcome
    }
}
