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
        info.setId("testId");
        info.setTitle("testTitle");
        info.setDescription("testDescription");
    }

    @Test
    void testGetters() {
        // GIVEN - An instance of Info is created with values
        // WHEN - Getters are called for id, title, and description
        String actualId = info.getId();
        String actualTitle = info.getTitle();
        String actualDescription = info.getDescription();

        // THEN - The returned values match the set values
        assertEquals("testId", actualId);
        assertEquals("testTitle", actualTitle);
        assertEquals("testDescription", actualDescription);
    }
}
