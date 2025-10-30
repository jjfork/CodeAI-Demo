package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import com.bestpractice.api.infrastrucuture.entity.Info;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class InfoRequestGeneratedAiTests {

    private InfoRequest infoRequest;

    @BeforeEach
    void setUp() {
        infoRequest = new InfoRequest();
    }

    @Test
    void testGetAndSetTitle() {
        // GIVEN
        String expectedTitle = "Sample Title";

        // WHEN
        infoRequest.setTitle(expectedTitle);
        String actualTitle = infoRequest.getTitle();

        // THEN
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    void testGetAndSetDescription() {
        // GIVEN
        String expectedDescription = "Sample Description";

        // WHEN
        infoRequest.setDescription(expectedDescription);
        String actualDescription = infoRequest.getDescription();

        // THEN
        assertEquals(expectedDescription, actualDescription);
    }

    @Test
    void testConvertCreatesInfoWithCorrectValues() {
        // GIVEN
        String id = "123";
        String title = "Test Title";
        String description = "Test Description";
        infoRequest.setTitle(title);
        infoRequest.setDescription(description);

        // WHEN
        Info info = infoRequest.convert(id);

        // THEN
        assertNotNull(info);
        assertEquals(id, info.getId());
        assertEquals(title, info.getTitle());
        assertEquals(description, info.getDescription());
    }

    @Test
    void testConvertWithNullValues() {
        // GIVEN
        String id = "456";
        infoRequest.setTitle(null);
        infoRequest.setDescription(null);

        // WHEN
        Info info = infoRequest.convert(id);

        // THEN
        assertNotNull(info);
        assertEquals(id, info.getId());
        assertNull(info.getTitle());
        assertNull(info.getDescription());
    }

    @Test
    void testConvertWithNullId() {
        // GIVEN
        String title = "Some Title";
        String description = "Some Description";
        infoRequest.setTitle(title);
        infoRequest.setDescription(description);

        // WHEN
        Info info = infoRequest.convert(null);

        // THEN
        assertNotNull(info);
        assertNull(info.getId());
        assertEquals(title, info.getTitle());
        assertEquals(description, info.getDescription());
    }

    @Test
    void testConvertDoesNotThrowExceptionWhenAllFieldsNull() {
        // GIVEN
        infoRequest.setTitle(null);
        infoRequest.setDescription(null);

        // WHEN
        Info info = null;
        try {
            info = infoRequest.convert(null);
        } catch (Exception e) {
            throw new AssertionError("convert() should not throw an exception when fields are null", e);
        }

        // THEN
        assertNotNull(info);
        assertNull(info.getId());
        assertNull(info.getTitle());
        assertNull(info.getDescription());
    }

    @Test
    void testConvertThrowsExceptionIfOverriddenToFail() {
        // GIVEN
        InfoRequest faultyRequest = new InfoRequest() {
            @Override
            public Info convert(String id) {
                throw new RuntimeException("Simulated failure");
            }
        };

        // WHEN & THEN
        assertThrows(RuntimeException.class, () -> faultyRequest.convert("id123"));
    }

    @Test
    void testConvertWithEmptyStrings() {
        // GIVEN
        String id = "";
        String title = "";
        String description = "";
        infoRequest.setTitle(title);
        infoRequest.setDescription(description);

        // WHEN
        Info info = infoRequest.convert(id);

        // THEN
        assertNotNull(info);
        assertEquals(id, info.getId());
        assertEquals(title, info.getTitle());
        assertEquals(description, info.getDescription());
    }

    @Test
    void testConvertWithSpecialCharacters() {
        // GIVEN
        String id = "@!#";
        String title = "Title*&^%";
        String description = "Desc)(*&^%$";
        infoRequest.setTitle(title);
        infoRequest.setDescription(description);

        // WHEN
        Info info = infoRequest.convert(id);

        // THEN
        assertNotNull(info);
        assertEquals(id, info.getId());
        assertEquals(title, info.getTitle());
        assertEquals(description, info.getDescription());
    }
}
