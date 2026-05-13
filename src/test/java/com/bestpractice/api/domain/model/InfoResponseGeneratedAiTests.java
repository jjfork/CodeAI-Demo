package com.bestpractice.api.domain.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class InfoResponseGeneratedAiTests {

    private InfoResponse defaultInfoResponse;

    @BeforeEach
    void setUp() {
        defaultInfoResponse = new InfoResponse("1", "Sample Title", "Sample Description");
    }

    @Test
    void testGettersReturnProvidedValues() {
        // GIVEN
        InfoResponse info = defaultInfoResponse;

        // WHEN
        String id = info.getId();
        String title = info.getTitle();
        String description = info.getDescription();

        // THEN
        assertThat(id).isEqualTo("1");
        assertThat(title).isEqualTo("Sample Title");
        assertThat(description).isEqualTo("Sample Description");
    }

    @Test
    void testConstructorHandlesNullValues() {
        // GIVEN
        InfoResponse info = new InfoResponse(null, null, null);

        // WHEN
        String id = info.getId();
        String title = info.getTitle();
        String description = info.getDescription();

        // THEN
        assertThat(id).isNull();
        assertThat(title).isNull();
        assertThat(description).isNull();
    }
}
