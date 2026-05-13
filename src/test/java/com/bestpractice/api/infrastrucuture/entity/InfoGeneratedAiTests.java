package com.bestpractice.api.infrastrucuture.entity;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

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
import java.util.Date;

public class InfoGeneratedAiTests {

    private Info info;

    @BeforeEach
    public void setUp() {
        info = new Info();
    }

    @Test
    public void testSetAndGetId() {
        // GIVEN
        String expectedId = "12345";

        // WHEN
        info.setId(expectedId);

        // THEN
        assertThat(info.getId()).isEqualTo(expectedId);
    }

    @Test
    public void testSetAndGetTitle() {
        // GIVEN
        String expectedTitle = "Sample Title";

        // WHEN
        info.setTitle(expectedTitle);

        // THEN
        assertThat(info.getTitle()).isEqualTo(expectedTitle);
    }

    @Test
    public void testSetAndGetDescription() {
        // GIVEN
        String expectedDescription = "Sample Description";

        // WHEN
        info.setDescription(expectedDescription);

        // THEN
        assertThat(info.getDescription()).isEqualTo(expectedDescription);
    }

    @Test
    public void testOnPrePersistSetsCreatedAt() {
        // GIVEN
        // No pre-existing createdAt value

        // WHEN
        info.onPrePersist();

        // THEN
        Date createdAt = info.getCreatedAt();
        assertThat(createdAt).isNotNull();
        // The createdAt should be close to the current time
        assertThat(createdAt.getTime()).isCloseTo(System.currentTimeMillis(), within(1000));
    }
}