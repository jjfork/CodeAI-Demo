package com.bestpractice.api.infrastrucuture.entity;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SharedDataTests {

    private SharedData sharedData;

    @BeforeEach
    void setUp() {
        sharedData = new SharedData();
    }

    @Test
    void testGetCreatedAt_ReturnsInitialValue() {
        // GIVEN - A new instance of SharedData is created.
        // WHEN - The createdAt property is accessed.
        Date createdAt = sharedData.getCreatedAt();
        // THEN - The returned createdAt value should be null.
        assertNull(createdAt);
    }

    @Test
    void testOnPrePersist_SetsCreatedAt() {
        // GIVEN - A new instance of SharedData is created.
        // WHEN - The onPrePersist method is called.
        sharedData.onPrePersist();
        // THEN - The createdAt property should be set to a non-null value.
        assertNotNull(sharedData.getCreatedAt());
    }

}
