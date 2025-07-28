package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InfoResponseGeneratedAiTests {
    private String id = "testId";
    private String title = "testTitle";
    private String description = "testDescription";
    private InfoResponse infoResponse;

    @BeforeEach
    void setUp() {
        infoResponse = new InfoResponse(id, title, description);
    }

    @Test
    void testGetId() {
        // GIVEN - An instance of InfoResponse is created.
        // WHEN - The getId method is called on the InfoResponse object.
        String returnedId = infoResponse.getId();
        // THEN - The returned ID should match the provided ID.
        assertEquals(id, returnedId);
    }

    @Test
    void testGetTitle() {
        // GIVEN - An instance of InfoResponse is created.
        // WHEN - The getTitle method is called on the InfoResponse object.
        String returnedTitle = infoResponse.getTitle();
        // THEN - The returned title should match the provided title.
        assertEquals(title, returnedTitle);
    }

    @Test
    void testGetDescription() {
        // GIVEN - An instance of InfoResponse is created.
        // WHEN - The getDescription method is called on the InfoResponse object.
        String returnedDescription = infoResponse.getDescription();
        // THEN - The returned description should match the provided description.
        assertEquals(description, returnedDescription);
    }
}
