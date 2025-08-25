package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.bestpractice.api.infrastrucuture.entity.Info;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.junit.runners.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class InfoRequestGeneratedAiTests {

    private InfoRequest infoRequest;

    @BeforeEach
    void setUp() {
        infoRequest = new InfoRequest();
    }

    @Test
    void testConvert_validInput() {
        // GIVEN a new InfoRequest object
        // WHEN the convert method is called with "123" as the id
        // THEN the Info object should be created with title "testTitle" and description "testDescription" and id "123"
        Info info = infoRequest.convert("123");
        assertEquals("testTitle", info.getTitle());
        assertEquals("testDescription", info.getDescription());
        assertEquals("123", info.getId());
    }

    @Test
    void testConvert_emptyInput() {
        // GIVEN a new InfoRequest object with empty title and description
        // WHEN the convert method is called with "123" as the id
        // THEN the Info object should be created with title "" and description "" and id "123"
        Info info = infoRequest.convert("123");
        assertEquals("", info.getTitle());
        assertEquals("", info.getDescription());
        assertEquals("123", info.getId());
    }

    @Test
    void testsetTitle_validInput() {
        // GIVEN a new InfoRequest object with title "newTitle"
        // WHEN the set setTitle method is called with "newTitle"
        // THEN the title should be set to "newTitle"
        infoRequest.setTitle("newTitle");
        assertEquals("newTitle", infoRequest.getTitle());
    }

    @Test
    void testsetDescription_validInput() {
        // GIVEN a new InfoRequest object with description "newDescription"
        // WHEN the setDescription method is called with "newDescription"
        // THEN the description should be set to "newDescription"
        infoRequest.setDescription("newDescription");
        assertEquals("newDescription", infoRequest.getDescription());
    }
}
