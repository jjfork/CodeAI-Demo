package com.bestpractice.api.app.v1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

class RdbmsControllerGeneratedAiTests {

    @InjectMocks
    private RdbmsController rdbmsController;

    @Mock
    private InfoServiceImpl infoService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetInfos() {
        // GIVEN
        when(infoService.getInfos()).thenReturn(List.of(new InfoResponse("id1", "title1", "description1")));
        // WHEN
        List<InfoResponse> infos = rdbmsController.getInfos();
        // THEN
        assertEquals(1, infos.size());
        assertEquals("id1", infos.get(0).getId());
    }

    @Test
    void testGetInfo() {
        // GIVEN
        when(infoService.getInfo("id1")).thenReturn(new InfoResponse("id1", "title1", "description1"));
        // WHEN
        InfoResponse info = rdbmsController.getInfo("id1");
        // THEN
        assertEquals("id1", info.getId());
    }

    @Test
    void testPostInfo() {
        // GIVEN
        InfoRequest req = new InfoRequest();
        req.setTitle("title");
        req.setDescription("description");
        when(infoService.generateInfo(req)).thenReturn(new InfoResponse("id1", "title", "description"));
        // WHEN
        ResponseEntity<InfoResponse> response = rdbmsController.postInfo(req);
        // THEN
        assertEquals(201, response.getStatusCodeValue());
        assertEquals("id1", response.getBody().getId());
    }

    @Test
    void testPutInfo() {
        // GIVEN
        when(infoService.updateInfo("id1", new InfoRequest())).thenReturn(new InfoResponse("id1", "title", "description"));
        // WHEN
        InfoResponse info = rdbmsController.putInfo("id1", new InfoRequest());
        // THEN
        assertEquals("id1", info.getId());
    }

    @Test
    void testDeleteInfo() {
        // GIVEN
        // WHEN
        Map<String, String> response = rdbmsController.deleteInfo("id1");
        // THEN
        assertEquals("ok", response.get("message"));
    }
}
