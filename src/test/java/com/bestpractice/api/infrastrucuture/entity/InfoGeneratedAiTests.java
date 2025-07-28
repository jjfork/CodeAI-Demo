package com.bestpractice.api.infrastrucuture.entity;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

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
    void testGettersSetters() {
        // GIVEN an Info object
        // WHEN setting values for id, title, and description
        info.setId("testId");
        info.setTitle("testTitle");
        info.setDescription("testDescription");
        // THEN the getters should return the set values
        assertEquals("testId", info.getId());
        assertEquals("testTitle", info.getTitle());
        assertEquals("testDescription", info.getDescription());
    }

}
