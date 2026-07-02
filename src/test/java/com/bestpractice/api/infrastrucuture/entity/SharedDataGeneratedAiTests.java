package com.bestpractice.api.infrastrucuture.entity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SharedDataGeneratedAiTests {

    private SharedData sharedData;

    @BeforeEach
    void setUp() {
        sharedData = new SharedData();
    }

    @Test
    void testOnPrePersistSetsCreatedAt() {
        // GIVEN
        Date beforePersist = new Date();

        // WHEN
        sharedData.onPrePersist();

        // THEN
        Date createdAt = sharedData.getCreatedAt();
        assertNotNull(createdAt);
        assertTrue(createdAt.getTime() >= beforePersist.getTime());
    }

    @Test
    void testGetCreatedAtReturnsValue() {
        // GIVEN
        Date expectedDate = new Date();
        sharedData.setCreatedAt(expectedDate);

        // WHEN
        Date actualDate = sharedData.getCreatedAt();

        // THEN
        assertEquals(expectedDate, actualDate);
    }

    @Test
    void testSetCreatedAtWithNull() {
        // GIVEN
        // WHEN
        sharedData.setCreatedAt(null);

        // THEN
        assertNull(sharedData.getCreatedAt());
    }
}
