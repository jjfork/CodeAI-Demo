package com.bestpractice.api.app.v1;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
class RdbmsControllerGeneratedAiTests {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() throws Exception {
        // Add database setup or connection verification here if needed
    }

    @Test
    void testGetInfos() throws Exception {
        mockMvc.perform(get("/api/v1/infos"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void testGetInfo() throws Exception {
        mockMvc.perform(get("/api/v1/infos/123"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void testPostInfo() throws Exception {
        mockMvc.perform(post("/api/v1/infos")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\":\"test\",\"description\":\"test\"}"))
                .andExpect(status().isCreated())
                .andExpect(header().string("Location", "/api/v1/infos/"));
    }

    @Test
    void testPutInfo() throws Exception {
        mockMvc.perform(put("/api/v1/infos/123")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\":\"updated\",\"description\":\"updated\"}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void testDeleteInfo() throws Exception {
        mockMvc.perform(delete("/api/v1/infos/123"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }


}
