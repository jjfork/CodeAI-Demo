package com.bestpractice.api.infrastrucuture.entity;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
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
        // GIVEN - A new instance of SharedData is created.
        // WHEN - The createdAt property is accessed using the getter method.
        Date actualCreatedAt = sharedData.getCreatedAt();
        // THEN - The returned createdAt value should not be null and should represent the current date and time.
        assertTrue(actualCreatedAt.after(new Date(0)));
    }

    @Test
    void testSetCreatedAt() {
        // GIVEN - A new instance of SharedData is created.
        // WHEN - A specific date is set as the createdAt property using the setter method.
        Date newCreatedAt = new Date();
        sharedData.setCreatedAt(newCreatedAt);
        // THEN - The set createdAt value should be equal to the provided date.
        assertEquals(newCreatedAt, sharedData.getCreatedAt());
    }

    @Test
    void testOnPrePersist() {
        // GIVEN - A new instance of SharedData is created.
        // WHEN - The onPrePersist method is called.
        sharedData.onPrePersist();
        // THEN - The createdAt property should be set to the current date and time.
        assertTrue(sharedData.getCreatedAt().after(new Date(0)));
    }

}