package com.bestpractice.api.infrastrucuture.entity;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.bestpractice.api.infrastrucuture.entity.SharedData;
import com.google.common.base.Preconditions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class InfoGeneratedAiTests {

    private Info info;

    @BeforeEach
    void setUp() {
        info = new Info();
    }

    @Test
    void testSetAndGetId() {
        // GIVEN: A new Info object
        // WHEN: The id is set to "123"
        // THEN: The id should be "123"
        info.setId("123");
        assertEquals("123", info.getId());
    }

    @Test
    void testSetAndGetTitle() {
        // GIVEN: A new Info object
        // WHEN: The title is set to "Example Title"
        // THEN: The title should be "Example Title"
        info.setTitle("Example Title");
        assertEquals("Example Title", info.getTitle());
    }

    @Test
    void testSetAndGetDescription() {
        // GIVEN: A new Info object
        // WHEN: The description is set to "This is a description"
        // THEN: The description should be "This is a description"
        info.setDescription("This is a description");
        assertEquals("This is a description", info.getDescription());
    }
}
