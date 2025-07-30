package com.bestpractice.api.domain.model;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoRequestGeneratedAiTests {

    private InfoRequest infoRequest;

    @BeforeEach
    void setUp() {
        infoRequest = new InfoRequest();
    }

    @Test
    void testConvert_ValidInput() {
        // GIVEN
        String id = "testId";
        infoRequest.setTitle("Test Title");
        infoRequest.setDescription("Test Description");
        // WHEN
        com.bestpractice.api.infrastrucuture.entity.Info info = infoRequest.convert(id); 
        // THEN
        assertEquals(id, info.getId());
        assertEquals("Test Title", info.getTitle());
        assertEquals("Test Description", info.getDescription());
    }

    @Test
    void testConvert_NullTitle() {
        // GIVEN
        String id = "testId";
        infoRequest.setTitle(null); 
        infoRequest.setDescription("Test Description");
        // WHEN
        com.bestpractice.api.infrastrucuture.entity.Info info = infoRequest.convert(id); 
        // THEN
        assertNull(info.getTitle());
    }

    @Test
    void testConvert_NullDescription() {
        // GIVEN
        String id = "testId";
        infoRequest.setTitle("Test Title");
        infoRequest.setDescription(null);
        // WHEN
        com.bestpractice.api.infrastrucuture.entity.Info info = infoRequest.convert(id); 
        // THEN
        assertNull(info.getDescription());
    }

}
