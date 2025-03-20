package com.bestpractice.api.infrastrucuture.entity;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class InfoTests {

    private Info info;

    @BeforeEach
    void setUp() {
        info = new Info();
    }

    @Test
    void testGetId() {
        // GIVEN - An Info object
        // WHEN - The getId method is called
        String id = info.getId();
        // THEN - The returned ID should be null
        assertNull(id);
    }

    @Test
    void testSetId() {
        // GIVEN - An Info object
        // WHEN - setId is called with a value
        info.setId("testId");
        // THEN - The ID should be set correctly
        assertEquals("testId", info.getId());
    }

    @Test
    void testGetTitle() {
        // GIVEN - An Info object
        // WHEN - The getTitle method is called
        String title = info.getTitle();
        // THEN - The returned title should be null
        assertNull(title);
    }

    @Test
    void testSetTitle() {
        // GIVEN - An Info object
        // WHEN - setTitle is called with a value
        info.setTitle("testTitle");
        // THEN - The title should be set correctly
        assertEquals("testTitle", info.getTitle());
    }

    @Test
    void testGetDescription() {
        // GIVEN - An Info object
        // WHEN - The getDescription method is called
        String description = info.getDescription();
        // THEN - The returned description should be null
        assertNull(description);
    }

    @Test
    void testSetDescription() {
        // GIVEN - An Info object
        // WHEN - setDescription is called with a value
        info.setDescription("testDescription");
        // THEN - The description should be set correctly
        assertEquals("testDescription", info.getDescription());
    }
}