package com.bestpractice.api.app.v1;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import com.bestpractice.api.domain.model.InfoRequest;
import com.bestpractice.api.domain.model.InfoResponse;
import com.bestpractice.api.domain.service.InfoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
class RdbmsControllerGeneratedAiTests {

    @Mock
    private InfoServiceImpl infoService;

    @InjectMocks
    private RdbmsController controller;

    @BeforeEach
    void setUp() {
        Mockito.reset(infoService);
    }

    @Test
    void testGetInfos() {
        // GIVEN
        InfoResponse resp1 = new InfoResponse("1", "Title1", "Desc1");
        InfoResponse resp2 = new InfoResponse("2", "Title2", "Desc2");
        List<InfoResponse> mockList = List.of(resp1, resp2);
        when(infoService.getInfos()).thenReturn(mockList);

        // WHEN
        List<InfoResponse> result = controller.getInfos();

        // THEN
        assertThat(result).isEqualTo(mockList);
        verify(infoService, times(1)).getInfos();
    }
