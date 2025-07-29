package com.bestpractice.api.domain.service;

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
import static org.junit.jupiter.api.Assertions.*;
import com.bestpractice.api.infrastrucuture.entity.Info;
import com.bestpractice.api.infrastrucuture.persistent.InfoPersistentRepository;

class InfoServiceImplGeneratedAiTests {

    @InjectMocks
    private InfoServiceImpl infoService;

    @Mock
    private InfoPersistentRepository infoRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetInfos() {
        // GIVEN
        List<Info> infos = new ArrayList<>();
        infos.add(new Info());
        infoRepository.findAll().thenReturn(infos);
        // WHEN
        List<InfoResponse> response = infoService.getInfos();
        // THEN
        assertEquals(1, response.size());
    }

    @Test
    void testGetInfo() {
        // GIVEN
        String id = "testId";
        Info info = new Info();
        infoRepository.findById(id).thenReturn(info);
        // WHEN
        InfoResponse response = infoService.getInfo(id);
        // THEN
        assertEquals("testId", response.getId());
    }

    @Test
    void testUpdateInfo() {
        // GIVEN
        String id = "testId";
        InfoRequest req = new InfoRequest();
        Info info = new Info();
        infoRepository.findById(id).thenReturn(info);
        // WHEN
        InfoResponse response = infoService.updateInfo(id, req);
        // THEN
        assertEquals("testId", response.getId());
    }

    @Test
    void testGenerateInfo() {
        // GIVEN
        InfoRequest request = new InfoRequest();
        Info info = new Info();
        infoRepository.insert(request.convert(this.infoRepository.newId())).thenReturn(info);
        // WHEN
        InfoResponse response = infoService.generateInfo(request);
        // THEN
        assertEquals("testId", response.getId());
    }

    @Test
    void testDeleteInfo() {
        // GIVEN
        String id = "testId";
        // WHEN
        infoService.deleteInfo(id);
        // THEN
        verify(infoRepository).removeById(id);
    }
}