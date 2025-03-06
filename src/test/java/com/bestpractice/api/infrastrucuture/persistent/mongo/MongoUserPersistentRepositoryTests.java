package com.bestpractice.api.infrastrucuture.persistent.mongo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.bestpractice.api.infrastrucuture.persistent.User; 


public class MongoUserPersistentRepositoryTests {

    @BeforeEach
    void setUp() {
        // Setup any necessary resources for the tests
    }

    @Test
    void testNewUser() {
        User user = new User();
        assertNotNull(user);
    }
}
