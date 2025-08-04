package com.bestpractice.api.domain.service;

    @Test

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
    void testGenerateInfo() {
        // GIVEN
        InfoRequest request = new InfoRequest("title", "description");
        when(infoRepository.insert(request.convert("id1"))).thenReturn(new Info("id1", "title", "description"));

        // WHEN
        InfoResponse infoResponse = infoService.generateInfo(request);

        // THEN
        assertEquals("id1", infoResponse.getId());
        assertEquals("title", infoResponse.getTitle());
        assertEquals("description", infoResponse.getDescription());
    }
