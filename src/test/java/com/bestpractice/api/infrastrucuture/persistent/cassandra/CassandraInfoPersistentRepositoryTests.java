package com.bestpractice.api.infrastrucuture.entity;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

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
        String id = "testId";
        info.setId(id);
        assertEquals(id, info.getId());
    }

    @Test
    void testSetId() {
        String id = "testId";
        info.setId(id);
        assertEquals(id, info.getId());
    }

    @Test
    void testGetTitle() {
        String title = "testTitle";
        info.setTitle(title);
        assertEquals(title, info.getTitle());
    }

    @Test
    void testSetTitle() {
        String title = "testTitle";
        info.setTitle(title);
        assertEquals(title, info.getTitle());
    }

    @Test
    void testGetDescription() {
        String description = "testDescription";
        info.setDescription(description);
        assertEquals(description, info.getDescription());
    }

    @Test
    void testSetDescription() {
        String description = "testDescription";
        info.setDescription(description);
        assertEquals(description, info.getDescription());
    }
}