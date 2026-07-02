package com.bestpractice.api.domain.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class InfoResponseGeneratedAiTests {

    private InfoResponse infoResponse;

    @BeforeEach
    void setUp() {
        infoResponse = new InfoResponse("1", "Title", "Description");
    }

    @Test
    void testGetIdReturnsCorrectValue() {
        // GIVEN
        String expectedId = "1";
        // WHEN
        String actualId = infoResponse.getId();
        // THEN
        assertThat(actualId).isEqualTo(expectedId);
    }

    @Test
    void testGetTitleReturnsCorrectValue() {
        // GIVEN
        String expectedTitle = "Title";
        // WHEN
        String actualTitle = infoResponse.getTitle();
        // THEN
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @Test
    void testGetDescriptionReturnsCorrectValue() {
        // GIVEN
        String expectedDescription = "Description";
        // WHEN
        String actualDescription = infoResponse.getDescription();
        // THEN
        assertThat(actualDescription).isEqualTo(expectedDescription);
    }

    @Test
    void testConstructorWithNullValues() {
        // GIVEN
        // WHEN
        InfoResponse nullInfo = new InfoResponse(null, null, null);
        // THEN
        assertThat(nullInfo.getId()).isNull();
        assertThat(nullInfo.getTitle()).isNull();
        assertThat(nullInfo.getDescription()).isNull();
    }
}
