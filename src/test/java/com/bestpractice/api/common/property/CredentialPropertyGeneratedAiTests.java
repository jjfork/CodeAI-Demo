package com.bestpractice.api.common.property;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.MockitoExtension;
import org.junit.jupiter.api.extension.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@MockitoJUnitRunner
public class CredentialPropertyGeneratedAiTests {

    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testConvertToIntExpires_ValidHourStr() {
        // GIVEN: CredentialProperty object with a valid "expiresHourStr" value.
        credentialProperty.setExpiresHourStr("1");
        // WHEN: The convertToIntExpires() method is called.
        // THEN: The method returns the integer value 1.
        assertEquals(1, credentialProperty.convertToIntExpires());
    }

    @Test
    void testConvertToIntExpires_ValidHourStr_MultipleDigits() {
        // GIVEN: CredentialProperty object with a valid "expiresHourStr" value.
        credentialProperty.setExpiresHourStr("12");
        // WHEN: The convertToIntExpires() method is called.
        // THEN: The method returns the integer value 12.
        assertEquals(12, credentialProperty.convertToIntExpires());
    }

    @Test
    void testConvertToIntExpires_ValidHourStr_MultipleDigits_LargeNumber() {
        // GIVEN: CredentialProperty object with a valid "expiresHourStr" value.
        credentialProperty.setExpiresHourStr("123");
        // WHEN: The convertToIntExpires() method is called.
        // THEN: The method returns the integer value 123.
        assertEquals(123, credentialProperty.convertToIntExpires());
    }

    @Test
    void testConvertToIntExpires_ValidHourStr_LargeNumber_Max() {
        // GIVEN: CredentialProperty object with a valid "expiresHourStr" value.
        credentialProperty.setExpiresHourStr("9999");
        // WHEN: The convertToIntExpires() method is called.
        // THEN: The method returns the integer value 9999.
        assertEquals(9999, credentialProperty.convertToIntExpires());
    }

    @Test
    void testConvertToIntExpires_ValidHourStr_Negative() {
        // GIVEN: CredentialProperty object with a valid "expiresHourStr" value.
        credentialProperty.setExpiresHourStr("-1");
        // WHEN: The convertToIntExpires() method is called.
        // THEN: The method returns null.
        assertNull(credentialProperty.convertToIntExpires());
    }

    @Test
    void testConvertToIntExpires_InvalidHourStr() {
        // GIVEN: CredentialProperty object with an invalid "expiresHourStr" value.
        credentialProperty.setExpiresHourStr("abc");
        // WHEN: The convertToIntExpires() method is called.
        // THEN: The method returns null.
        assertNull(credentialProperty.convertToIntExpires());
    }

    @Test
    void testConvertToIntExpires_EmptyHourStr() {
        // GIVEN: CredentialProperty object with an empty "expiresHourStr" value.
        credentialProperty.setExpiresHourStr("");
        // WHEN: The convertToIntExpires() method is called.
        // THEN: The method returns null.
        assertNull(credentialProperty.convertToIntExpires());
    }

    @Test
    void testConvertToIntExpires_NullHourStr() {
        // GIVEN: CredentialProperty object with a null "expiresHourStr" value.
        credentialProperty.setExpiresHourStr(null);
        // WHEN: The convertToIntExpires() method is called.
        // THEN: The method returns null.
        assertNull(credentialProperty.convertToIntExpires());
    }

    @Test
    void testConvertToIntExpires_EmptyString() {
        // GIVEN: CredentialProperty object with an empty string "expiresHourStr" value.
        credentialProperty.setExpiresHourStr("-");
        // WHEN: The convertToIntExpires() method is called.
        // THEN: The method returns null.
        assertNull(credentialProperty.convertToIntExpires());
    }
}
