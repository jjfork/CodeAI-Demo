package com.bestpractice.api.infrastrucuture.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoGeneratedAiTests {

    private Info info;

    @BeforeEach
    void setUp() {
        info = new Info();
    }

    @Test
    void testId() {
        // GIVEN an Info object
        // WHEN setting the id to "testId"
        info.setId("testId");
        // THEN the getId() method should return "testId"
        assertEquals("testId", info.getId());
    }

    @Test
    void testTitle() {
        // GIVEN an Info object
        // WHEN setting the title to "testTitle"
        info.setTitle("testTitle");
        // THEN the getTitle() method should return "testTitle"
        assertEquals("testTitle", info.getTitle());
    }

    @Test
    void testDescription() {
        // GIVEN an Info object
        // WHEN setting the description to "testDescription"
        info.setDescription("testDescription");
        // THEN the getDescription() method should return "testDescription"
        assertEquals("testDescription", info.getDescription());
    }
}
