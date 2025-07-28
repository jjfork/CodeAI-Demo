package com.bestpractice.api.common.property;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialPropertyGeneratedAiTests {

    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testConvertToIntExpires_ValidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("24");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertEquals(24, expiresHours);
    }

    @Test
    void testConvertToIntExpires_NullInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_InvalidInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("abc");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }

    @Test
    void testConvertToIntExpires_MinusInput() {
        // GIVEN
        credentialProperty.setExpiresHourStr("-");
        // WHEN
        Integer expiresHours = credentialProperty.convertToIntExpires();
        // THEN
        assertNull(expiresHours);
    }



}
