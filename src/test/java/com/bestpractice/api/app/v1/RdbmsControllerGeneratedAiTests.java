package com.bestpractice.api.app.v1;

import org.mockito.Mockito;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.http.ResponseEntity;

package com.bestpractice.api.app.v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import com.bestpractice.api.domain.model.InfoRequest;
import com.bestpractice.api.domain.model.InfoResponse;
import com.bestpractice.api.domain.service.InfoServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

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
        List<InfoResponse> mockInfoResponses = new ArrayList<>();
        mockInfoResponses.add(new InfoResponse("id1", "title1", "description1"));
        Mockito.when(infoService.getInfos()).thenReturn(mockInfoResponses);

        // WHEN
        List<InfoResponse> actualInfoResponses = rdbmsController.getInfos();

        // THEN
        assertEquals(mockInfoResponses, actualInfoResponses);
    }

    @Test
    void testGetInfo() {
        // GIVEN
        String mockId = "id1";
        InfoResponse mockInfoResponse = new InfoResponse("id1", "title1", "description1");
        Mockito.when(infoService.getInfo(mockId)).thenReturn(mockInfoResponse);

        // WHEN
        InfoResponse actualInfoResponse = rdbmsController.getInfo(mockId);

        // THEN
        assertEquals(mockInfoResponse, actualInfoResponse);
    }

    @Test
    void testPostInfo() {
        // GIVEN
        InfoRequest mockInfoRequest = new InfoRequest();
        mockInfoRequest.setTitle("title1");
        mockInfoRequest.setDescription("description1");
        InfoResponse mockInfoResponse = new InfoResponse("id1", "title1", "description1");
        when(infoService.generateInfo(mockInfoRequest)).thenReturn(mockInfoResponse);

        // WHEN
        ResponseEntity<InfoResponse> actualResponseEntity = rdbmsController.postInfo(mockInfoRequest);

        // THEN
        assertEquals(201, actualResponseEntity.getStatusCodeValue());
        assertEquals(mockInfoResponse, actualResponseEntity.getBody());
    }

    @Test
    void testPutInfo() {
        // GIVEN
        String mockId = "id1";
        InfoRequest mockInfoRequest = new InfoRequest();
        mockInfoRequest.setTitle("title1");
        mockInfoRequest.setDescription("description1");
        InfoResponse mockInfoResponse = new InfoResponse("id1", "title1", "description1");
        when(infoService.updateInfo(mockId, mockInfoRequest)).thenReturn(mockInfoResponse);

        // WHEN
        InfoResponse actualInfoResponse = rdbmsController.putInfo(mockId, mockInfoRequest);

        // THEN
        assertEquals(mockInfoResponse, actualInfoResponse);
    }

    @Test
    void testDeleteInfo() {
        // GIVEN

        // WHEN
        Map<String, String> actualMap = rdbmsController.deleteInfo("id1");

        // THEN
        assertEquals("ok", actualMap.get("message"));
    }
}
