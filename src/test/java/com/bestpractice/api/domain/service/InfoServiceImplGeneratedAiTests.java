package com.bestpractice.api.domain.service;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Extension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
class InfoServiceImplGeneratedAiTests {

    private InfoPersistentRepository infoRepository;
    private InfoServiceImpl infoService;

    @BeforeEach
    void setUp() {
        infoRepository = mock(InfoPersistentRepository.class);
        infoService = new InfoServiceImpl(infoRepository);
    }

    @Test
    @DisplayName("Get all infos - Successful retrieval")
    void getInfos_SuccessfulRetrieval() {
        // GIVEN
        List<Info> expectedInfos = new ArrayList<>();
        expectedInfos.add(new Info(1L, "Title 1", "Description 1"));
        expectedInfos.add(new Info(2L, "Title 2", "Description 2"));
        Mockito.doReturn(expectedInfos).when(infoRepository).findAll();
        // WHEN
        List<InfoResponse> actualResponses = infoService.getInfos();
        // THEN
        assertEquals(2, actualResponses.size());
        assertEquals("Title 1", actualResponses.get(0).getTitle());
        assertEquals("Description 1", actualResponses.get(0).getDescription());
        assertEquals("Title 2", actualResponses.get(1).getTitle());
        assertEquals("Description 2", actualResponses.get(1).getDescription());
    }

    @Test
    @DisplayName("Get Info - Successful retrieval")
    void getInfo_SuccessfulRetrieval() {
        // GIVEN
        Info expectedInfo = new Info(1L, "Title 1", "Description 1");
        Mockito.doReturn(expectedInfo).when(infoRepository).findById("1");
        // WHEN
        InfoResponse actualResponse = infoService.getInfo("1");
        // THEN
        assertEquals("1", actualResponse.getId());
        assertEquals("Title 1", actualResponse.getTitle());
        assertEquals("Description 1", actualResponse.getDescription());
    }

    @Test
    @DisplayName("Update Info - Successful update")
    void updateInfo_SuccessfulUpdate() {
        // GIVEN
        Info existingInfo = new Info(1L, "Title 1", "Description 1");
        Mockito.doReturn(existingInfo).when(infoRepository).findById("1");
        InfoRequest request = new InfoRequest("New Title", "New Description");
        // WHEN
        InfoResponse actualResponse = infoService.updateInfo("1", request);
        // THEN
        assertEquals("1", actualResponse.getId());
        assertEquals("New Title", actualResponse.getTitle());
        assertEquals("New Description", actualResponse.getDescription());
    }

    @Test
    @DisplayName("Generate Info - Successful generation")
    void generateInfo_SuccessfulGeneration() {
        // GIVEN
        InfoRequest request = new InfoRequest("New Title", "New Description");
        Mockito.doReturn(new Info(null, "New Title", "New Description")).when(infoRepository).insert(any());
        // WHEN
        InfoResponse actualResponse = infoService.generateInfo(request);
        // THEN
        assertEquals("New Title", actualResponse.getTitle());
        assertEquals("New Description", actualResponse.getDescription());
    }

    @Test
    @DisplayName("Delete Info - Successful deletion")
    void deleteInfo_SuccessfulDeletion() {
        // GIVEN
        Mockito.doNothing().when(infoRepository).removeById("1");
        // WHEN
        infoService.deleteInfo("1");
        // THEN
        // No assertions are made here as the deletion is an action, not a state to verify.
    }
}