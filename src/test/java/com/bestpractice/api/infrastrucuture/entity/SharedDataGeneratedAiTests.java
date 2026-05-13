package com.bestpractice.api.infrastrucuture.entity;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.time.temporal.ChronoUnit;

public class SharedDataGeneratedAiTests {

    private SharedData sharedData;

    @BeforeEach
    void setUp() {
        sharedData = new SharedData();
    }

    @Test
    void testCreatedAtInitiallyNull() {
        // GIVEN a new SharedData instance
        // WHEN retrieving createdAt
        Date createdAt = sharedData.getCreatedAt();
        // THEN createdAt should be null
        assertThat(createdAt).isNull();
    }

    @Test
    void testOnPrePersistSetsCreatedAt() {
        // GIVEN a new SharedData instance
        // WHEN onPrePersist is called
        sharedData.onPrePersist();
        // THEN createdAt should be set to a recent timestamp
        Date createdAt = sharedData.getCreatedAt();
        assertThat(createdAt).isNotNull();
        Date now = new Date();
        assertThat(createdAt).isCloseTo(now, within(1, ChronoUnit.SECONDS));
    }

    @Test
    void testSetCreatedAtSetsValue() {
        // GIVEN a new SharedData instance
        Date customDate = new Date(0L); // epoch
        // WHEN setCreatedAt is called with customDate
        sharedData.setCreatedAt(customDate);
        // THEN getCreatedAt should return the same customDate
        Date retrieved = sharedData.getCreatedAt();
        assertThat(retrieved).isEqualTo(customDate);
    }
}