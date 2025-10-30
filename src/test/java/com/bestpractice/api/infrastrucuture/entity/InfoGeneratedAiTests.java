package com.bestpractice.api.infrastrucuture.entity;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InfoGeneratedAiTests {

    private Info info;

    @BeforeEach
    void setUp() {
        info = new Info();
    }

    @Test
    void givenIdValue_whenSetId_thenGetIdReturnsSameValue() {
        // GIVEN
        String expectedId = "12345";

        // WHEN
        info.setId(expectedId);

        // THEN
        assertEquals(expectedId, info.getId());
    }

    @Test
    void givenTitleValue_whenSetTitle_thenGetTitleReturnsSameValue() {
        // GIVEN
        String expectedTitle = "Sample Title";

        // WHEN
        info.setTitle(expectedTitle);

        // THEN
        assertEquals(expectedTitle, info.getTitle());
    }

    @Test
    void givenDescriptionValue_whenSetDescription_thenGetDescriptionReturnsSameValue() {
        // GIVEN
        String expectedDescription = "Sample Description";

        // WHEN
        info.setDescription(expectedDescription);

        // THEN
        assertEquals(expectedDescription, info.getDescription());
    }

    @Test
    void givenMultipleValues_whenSetAll_thenGetAllReturnSameValues() {
        // GIVEN
        String expectedId = "id-001";
        String expectedTitle = "Title Example";
        String expectedDescription = "Description Example";

        // WHEN
        info.setId(expectedId);
        info.setTitle(expectedTitle);
        info.setDescription(expectedDescription);

        // THEN
        assertEquals(expectedId, info.getId());
        assertEquals(expectedTitle, info.getTitle());
        assertEquals(expectedDescription, info.getDescription());
    }

    @Test
    void givenNullTitle_whenSetTitle_thenGetTitleReturnsNull() {
        // GIVEN
        String expectedTitle = null;

        // WHEN
        info.setTitle(expectedTitle);

        // THEN
        assertEquals(expectedTitle, info.getTitle());
    }

    @Test
    void givenNullDescription_whenSetDescription_thenGetDescriptionReturnsNull() {
        // GIVEN
        String expectedDescription = null;

        // WHEN
        info.setDescription(expectedDescription);

        // THEN
        assertEquals(expectedDescription, info.getDescription());
    }

    @Test
    void givenNullId_whenSetId_thenGetIdReturnsNull() {
        // GIVEN
        String expectedId = null;

        // WHEN
        info.setId(expectedId);

        // THEN
        assertEquals(expectedId, info.getId());
    }

    @Test
    void givenEmptyTitle_whenSetTitle_thenGetTitleReturnsEmptyString() {
        // GIVEN
        String expectedTitle = "";

        // WHEN
        info.setTitle(expectedTitle);

        // THEN
        assertEquals(expectedTitle, info.getTitle());
    }

    @Test
    void givenEmptyDescription_whenSetDescription_thenGetDescriptionReturnsEmptyString() {
        // GIVEN
        String expectedDescription = "";

        // WHEN
        info.setDescription(expectedDescription);

        // THEN
        assertEquals(expectedDescription, info.getDescription());
    }

    @Test
    void givenNullTitle_whenSetTitle_thenNoExceptionIsThrown() {
        // GIVEN
        String nullTitle = null;

        // WHEN
        info.setTitle(nullTitle);

        // THEN
        assertEquals(nullTitle, info.getTitle());
    }

    @Test
    void givenNullDescription_whenSetDescription_thenNoExceptionIsThrown() {
        // GIVEN
        String nullDescription = null;

        // WHEN
        info.setDescription(nullDescription);

        // THEN
        assertEquals(nullDescription, info.getDescription());
    }
}
