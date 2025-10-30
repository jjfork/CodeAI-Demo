package com.bestpractice.api.app.v1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.domain.model.InfoRequest;
import com.bestpractice.api.domain.model.InfoResponse;
import com.bestpractice.api.domain.service.InfoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RdbmsControllerGeneratedAiTests {

    @Mock
    private InfoServiceImpl infoService;

    @InjectMocks
    private RdbmsController controller;

    @BeforeEach
    void setUp() {
        reset(infoService);
    }

    @Test
    void testGetInfos() {
        // GIVEN
        InfoResponse response = new InfoResponse("123", "name", "value");
        when(infoService.getInfos()).thenReturn(List.of(response));

        // WHEN
        List<InfoResponse> result = controller.getInfos();

        // THEN
        assertNotNull(result);
        assertEquals(1, result.size());
        verify(infoService, times(1)).getInfos();
    }

    @Test
    void testGetInfo() {
        // GIVEN
        String id = "123";
        InfoResponse response = new InfoResponse(id, "name", "value");
        when(infoService.getInfo(id)).thenReturn(response);

        // WHEN
        InfoResponse result = controller.getInfo(id);

        // THEN
        assertNotNull(result);
        verify(infoService, times(1)).getInfo(id);
    }

    @Test
    void testGetInfoThrowsRuntimeException() {
        // GIVEN
        String id = "notfound";
        when(infoService.getInfo(id)).thenThrow(new RuntimeException("Not found"));

        // WHEN / THEN
        assertThrows(RuntimeException.class, () -> controller.getInfo(id));
        verify(infoService, times(1)).getInfo(id);
    }

    @Test
    void testPostInfo() throws URISyntaxException {
        // GIVEN
        InfoRequest request = new InfoRequest();
        InfoResponse response = new InfoResponse("123", "name", "value");
        when(infoService.generateInfo(request)).thenReturn(response);

        // WHEN
        ResponseEntity<InfoResponse> result = controller.postInfo(request);

        // THEN
        assertNotNull(result);
        assertEquals(201, result.getStatusCodeValue());
        assertEquals(new URI("/api/v1/infos/123"), result.getHeaders().getLocation());
        verify(infoService, times(1)).generateInfo(request);
    }

    @Test
    void testPostInfoThrowsURISyntaxException() throws URISyntaxException {
        // GIVEN
        InfoRequest request = new InfoRequest();
        InfoResponse response = new InfoResponse("id with space", "name", "value");
        when(infoService.generateInfo(request)).thenReturn(response);

        // WHEN / THEN
        assertThrows(URISyntaxException.class, () -> controller.postInfo(request));
        verify(infoService, times(1)).generateInfo(request);
    }

    @Test
    void testPutInfo() {
        // GIVEN
        String id = "123";
        InfoRequest request = new InfoRequest();
        InfoResponse response = new InfoResponse(id, "name", "value");
        when(infoService.updateInfo(id, request)).thenReturn(response);

        // WHEN
        InfoResponse result = controller.putInfo(id, request);

        // THEN
        assertNotNull(result);
        verify(infoService, times(1)).updateInfo(id, request);
    }

    @Test
    void testPutInfoThrowsRuntimeException() {
        // GIVEN
        String id = "123";
        InfoRequest request = new InfoRequest();
        when(infoService.updateInfo(id, request)).thenThrow(new RuntimeException("Update failed"));

        // WHEN / THEN
        assertThrows(RuntimeException.class, () -> controller.putInfo(id, request));
        verify(infoService, times(1)).updateInfo(id, request);
    }

    @Test
    void testDeleteInfo() {
        // GIVEN
        String id = "123";
        doNothing().when(infoService).deleteInfo(id);

        // WHEN
        Map<String, String> result = controller.deleteInfo(id);

        // THEN
        assertNotNull(result);
        assertEquals(Collections.singletonMap("message", "ok"), result);
        verify(infoService, times(1)).deleteInfo(id);
    }

    @Test
    void testDeleteInfoThrowsRuntimeException() {
        // GIVEN
        String id = "123";
        doThrow(new RuntimeException("Delete failed")).when(infoService).deleteInfo(id);

        // WHEN / THEN
        assertThrows(RuntimeException.class, () -> controller.deleteInfo(id));
        verify(infoService, times(1)).deleteInfo(id);
    }
}
