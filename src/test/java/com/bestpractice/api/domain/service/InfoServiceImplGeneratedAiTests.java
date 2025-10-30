package com.bestpractice.api.domain.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.bestpractice.api.common.exception.BadRequest;
import com.bestpractice.api.common.exception.Conflict;
import com.bestpractice.api.common.exception.InternalServerError;
import com.bestpractice.api.domain.model.InfoRequest;
import com.bestpractice.api.domain.model.InfoResponse;
import com.bestpractice.api.infrastrucuture.entity.Info;
import com.bestpractice.api.infrastrucuture.persistent.InfoPersistentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class InfoServiceImplGeneratedAiTests {

    @Mock
    private InfoPersistentRepository infoRepository;

    @InjectMocks
    private InfoServiceImpl infoService;

    private Info createInfo(String id, String title, String description) {
        Info info = new Info();
        info.setId(id);
        info.setTitle(title);
        info.setDescription(description);
        return info;
    }

    @Test
    void getInfos_shouldReturnListOfInfoResponses_whenRepositoryReturnsData() {
        // GIVEN
        Info info1 = createInfo("1", "Title1", "Desc1");
        Info info2 = createInfo("2", "Title2", "Desc2");
        when(infoRepository.findAll()).thenReturn(Arrays.asList(info1, info2));

        // WHEN
        List<InfoResponse> result = infoService.getInfos();

        // THEN
        assertEquals(2, result.size());
        assertEquals("Title1", result.get(0).getTitle());
        assertEquals("Title2", result.get(1).getTitle());
    }

    @Test
    void getInfos_shouldThrowInternalServerError_whenRepositoryThrowsException() {
        // GIVEN
        when(infoRepository.findAll()).thenThrow(new RuntimeException("DB error"));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> infoService.getInfos());
    }

    @Test
    void getInfo_shouldReturnInfoResponse_whenRepositoryReturnsData() {
        // GIVEN
        Info info = createInfo("1", "Title1", "Desc1");
        when(infoRepository.findById("1")).thenReturn(info);

        // WHEN
        InfoResponse result = infoService.getInfo("1");

        // THEN
        assertEquals("1", result.getId());
        assertEquals("Title1", result.getTitle());
        assertEquals("Desc1", result.getDescription());
    }

    @Test
    void getInfo_shouldThrowInternalServerError_whenRepositoryThrowsException() {
        // GIVEN
        when(infoRepository.findById("1")).thenThrow(new RuntimeException("DB error"));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> infoService.getInfo("1"));
    }

    @Test
    void updateInfo_shouldUpdateAndReturnInfoResponse_whenValidRequest() {
        // GIVEN
        Info existingInfo = createInfo("1", "OldTitle", "OldDesc");
        InfoRequest request = mock(InfoRequest.class);
        Info updatedInfo = createInfo("1", "NewTitle", "NewDesc");
        when(infoRepository.findById("1")).thenReturn(existingInfo);
        when(request.convert("1")).thenReturn(updatedInfo);
        when(infoRepository.insert(updatedInfo)).thenReturn(updatedInfo);

        // WHEN
        InfoResponse result = infoService.updateInfo("1", request);

        // THEN
        assertEquals("NewTitle", result.getTitle());
        assertEquals("NewDesc", result.getDescription());
    }

    @Test
    void updateInfo_shouldThrowBadRequest_whenFindByIdThrowsException() {
        // GIVEN
        InfoRequest request = mock(InfoRequest.class);
        when(infoRepository.findById("1")).thenThrow(new RuntimeException("DB error"));

        // WHEN & THEN
        assertThrows(BadRequest.class, () -> infoService.updateInfo("1", request));
    }

    @Test
    void updateInfo_shouldThrowInternalServerError_whenInsertThrowsException() {
        // GIVEN
        Info existingInfo = createInfo("1", "OldTitle", "OldDesc");
        InfoRequest request = mock(InfoRequest.class);
        Info updatedInfo = createInfo("1", "NewTitle", "NewDesc");
        when(infoRepository.findById("1")).thenReturn(existingInfo);
        when(request.convert("1")).thenReturn(updatedInfo);
        when(infoRepository.insert(updatedInfo)).thenThrow(new RuntimeException("DB error"));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> infoService.updateInfo("1", request));
    }

    @Test
    void generateInfo_shouldReturnInfoResponse_whenInsertSucceeds() {
        // GIVEN
        InfoRequest request = mock(InfoRequest.class);
        Info newInfo = createInfo("1", "Title1", "Desc1");
        when(infoRepository.newId()).thenReturn("1");
        when(request.convert("1")).thenReturn(newInfo);
        when(infoRepository.insert(newInfo)).thenReturn(newInfo);

        // WHEN
        InfoResponse result = infoService.generateInfo(request);

        // THEN
        assertEquals("1", result.getId());
        assertEquals("Title1", result.getTitle());
    }

    @Test
    void generateInfo_shouldThrowConflict_whenRepositoryThrowsConflict() {
        // GIVEN
        InfoRequest request = mock(InfoRequest.class);
        Info newInfo = createInfo("1", "Title1", "Desc1");
        when(infoRepository.newId()).thenReturn("1");
        when(request.convert("1")).thenReturn(newInfo);
        when(infoRepository.insert(newInfo)).thenThrow(new Conflict());

        // WHEN & THEN
        assertThrows(Conflict.class, () -> infoService.generateInfo(request));
    }

    @Test
    void generateInfo_shouldThrowInternalServerError_whenRepositoryThrowsOtherException() {
        // GIVEN
        InfoRequest request = mock(InfoRequest.class);
        Info newInfo = createInfo("1", "Title1", "Desc1");
        when(infoRepository.newId()).thenReturn("1");
        when(request.convert("1")).thenReturn(newInfo);
        when(infoRepository.insert(newInfo)).thenThrow(new RuntimeException("DB error"));

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> infoService.generateInfo(request));
    }

    @Test
    void deleteInfo_shouldCallRemoveById_whenValidId() {
        // GIVEN
        doNothing().when(infoRepository).removeById("1");

        // WHEN
        infoService.deleteInfo("1");

        // THEN
        verify(infoRepository, times(1)).removeById("1");
    }

    @Test
    void deleteInfo_shouldThrowInternalServerError_whenRepositoryThrowsException() {
        // GIVEN
        doThrow(new RuntimeException("DB error")).when(infoRepository).removeById("1");

        // WHEN & THEN
        assertThrows(InternalServerError.class, () -> infoService.deleteInfo("1"));
    }
}
