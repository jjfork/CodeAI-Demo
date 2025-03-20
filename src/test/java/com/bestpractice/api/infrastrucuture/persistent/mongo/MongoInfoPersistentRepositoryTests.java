package com.bestpractice.api.infrastrucuture.persistent.mongo;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MongoInfoPersistentRepositoryTests {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testSave() {
        // GIVEN
        MongoInfoEntity mongoInfoEntity = new MongoInfoEntity();
        mongoInfoEntity.setTitle("Test Title");
        mongoInfoEntity.setDescription("Test Description");

        // WHEN
        MongoInfoPersistentRepository repository = new MongoInfoPersistentRepository(null, null); // Add constructor parameters
        repository.save(mongoInfoEntity);

        // THEN
        assertNotNull(mongoInfoEntity.getId());
    }
}