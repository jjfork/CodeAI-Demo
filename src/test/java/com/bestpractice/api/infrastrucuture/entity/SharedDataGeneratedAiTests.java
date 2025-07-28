package com.bestpractice.api.infrastrucuture.entity;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

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
    void testCreatedAtIsSetOnPrePersist() {
        // GIVEN - A new instance of SharedData is created.
        // WHEN - The onPrePersist method is called.
        sharedData.onPrePersist();
        // THEN - The createdAt field should not be null and have a value.
        assertNotNull(sharedData.getCreatedAt());
    }

    @Test
    void testGetCreatedAtReturnsValue() {
        // GIVEN - A new instance of SharedData is created with a set createdAt.
        Date expectedCreatedAt = new Date();
        sharedData.setCreatedAt(expectedCreatedAt);
        // WHEN - The getCreatedAt method is called.
        Date actualCreatedAt = sharedData.getCreatedAt();
        // THEN - The returned value should be equal to the set value.
        assertEquals(expectedCreatedAt, actualCreatedAt);
    }

}
