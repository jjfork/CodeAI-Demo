package com.bestpractice.api.common.property;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CredentialPropertyTests {
    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testConvertToIntExpires_ValidInput() {
        // GIVEN a valid expiresHourStr value
        credentialProperty.setExpiresHourStr("12");
        // WHEN convertToIntExpires is called
        Integer result = credentialProperty.convertToIntExpires();
        // THEN the result should be 12
        assertEquals(12, result);
    }

    @Test
    void testConvertToIntExpires_NullInput() {
        // GIVEN an expiresHourStr value of "-"
        credentialProperty.setExpiresHourStr("-");
        // WHEN convertToIntExpires is called
        Integer result = credentialProperty.convertToIntExpires();
        // THEN the result should be null
        assertNull(result);
    }

    @Test
    void testConvertToIntExpires_InvalidInput() {
        // GIVEN an invalid expiresHourStr value "abc"
        credentialProperty.setExpiresHourStr("abc");
        // WHEN convertToIntExpires is called
        Integer result = credentialProperty.convertToIntExpires();
        // THEN the result should be null
        assertNull(result);
    }
}
