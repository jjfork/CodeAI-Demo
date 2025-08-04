package com.bestpractice.api.infrastrucuture.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SharedDataGeneratedAiTests {

    private SharedData sharedData;

    @BeforeEach
    void setUp() {
        sharedData = new SharedData();
    }

    @Test
    void testGetCreatedAt() {
        // GIVEN - A new instance of SharedData
        // WHEN - We call getCreatedAt()
        Date createdAt = sharedData.getCreatedAt();
        // THEN - The returned createdAt should not be null
        assertNotNull(createdAt);
    }

    @Test
    void testSetCreatedAt() {
        // GIVEN - A new Date object
        Date newCreatedAt = new Date();
        // WHEN - We set the createdAt using setCreatedAt()
        sharedData.setCreatedAt(newCreatedAt);
        // THEN - The set createdAt should be equal to the newCreatedAt
        assertEquals(newCreatedAt, sharedData.getCreatedAt());
    }

    @Test
    void testOnPrePersist() {
        // GIVEN - A new instance of SharedData
        // WHEN - We call onPrePersist()
        sharedData.onPrePersist();
        // THEN - The createdAt should not be null
        assertNotNull(sharedData.getCreatedAt());
    }
}