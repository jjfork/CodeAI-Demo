package com.bestpractice.api.common.property;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CredentialPropertyGeneratedAiTests {

    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testGetAndSetKey() {
        // GIVEN
        String expectedKey = "testKey";

        // WHEN
        credentialProperty.setKey(expectedKey);

        // THEN
        assertEquals(expectedKey, credentialProperty.getKey());
    }

    @Test
    void testGetAndSetProvider() {
        // GIVEN
        String expectedProvider = "testProvider";

        // WHEN
        credentialProperty.setProvider(expectedProvider);

        // THEN
        assertEquals(expectedProvider, credentialProperty.getProvider());
    }

    @Test
    void testGetAndSetSubject() {
        // GIVEN
        String expectedSubject = "testSubject";

        // WHEN
        credentialProperty.setSubject(expectedSubject);

        // THEN
        assertEquals(expectedSubject, credentialProperty.getSubject());
    }

    @Test
    void testGetAndSetAlg() {
        // GIVEN
        String expectedAlg = "HS256";

        // WHEN
        credentialProperty.setAlg(expectedAlg);

        // THEN
        assertEquals(expectedAlg, credentialProperty.getAlg());
    }

    @Test
    void testGetAndSetHmacSecret() {
        // GIVEN
        String expectedSecret = "secretValue";

        // WHEN
        credentialProperty.setHmacSecret(expectedSecret);

        // THEN
        assertEquals(expectedSecret, credentialProperty.getHmacSecret());
    }

    @Test
    void testGetAndSetExpiresHourStr() {
        // GIVEN
        String expectedExpires = "12";

        // WHEN
        credentialProperty.setExpiresHourStr(expectedExpires);

        // THEN
        assertEquals(expectedExpires, credentialProperty.getExpiresHourStr());
    }

    @Test
    void testConvertToIntExpiresWithValidNumber() {
        // GIVEN
        credentialProperty.setExpiresHourStr("24");

        // WHEN
        Integer result = credentialProperty.convertToIntExpires();

        // THEN
        assertNotNull(result);
        assertEquals(24, result);
    }

    @Test
    void testConvertToIntExpiresWithDash() {
        // GIVEN
        credentialProperty.setExpiresHourStr("-");

        // WHEN
        Integer result = credentialProperty.convertToIntExpires();

        // THEN
        assertNull(result);
    }

    @Test
    void testConvertToIntExpiresWithInvalidNumber() {
        // GIVEN
        credentialProperty.setExpiresHourStr("invalid");

        // WHEN
        Integer result = credentialProperty.convertToIntExpires();

        // THEN
        assertNull(result);
    }

    @Test
    void testConvertToIntExpiresWithNullValueThrowsNullPointerException() {
        // GIVEN
        credentialProperty.setExpiresHourStr(null);

        // WHEN & THEN
        assertThrows(NullPointerException.class, () -> credentialProperty.convertToIntExpires());
    }

    @Test
    void testConvertToIntExpiresHandlesNumberFormatExceptionGracefully() {
        // GIVEN
        credentialProperty.setExpiresHourStr("notANumber");

        // WHEN
        Integer result = credentialProperty.convertToIntExpires();

        // THEN
        assertNull(result);
    }

    @Test
    void testMultipleSettersAndGetters() {
        // GIVEN
        String key = "keyValue";
        String provider = "providerValue";
        String subject = "subjectValue";
        String alg = "algValue";
        String hmacSecret = "secretValue";
        String expiresHourStr = "48";

        // WHEN
        credentialProperty.setKey(key);
        credentialProperty.setProvider(provider);
        credentialProperty.setSubject(subject);
        credentialProperty.setAlg(alg);
        credentialProperty.setHmacSecret(hmacSecret);
        credentialProperty.setExpiresHourStr(expiresHourStr);

        // THEN
        assertEquals(key, credentialProperty.getKey());
        assertEquals(provider, credentialProperty.getProvider());
        assertEquals(subject, credentialProperty.getSubject());
        assertEquals(alg, credentialProperty.getAlg());
        assertEquals(hmacSecret, credentialProperty.getHmacSecret());
        assertEquals(expiresHourStr, credentialProperty.getExpiresHourStr());
        assertEquals(48, credentialProperty.convertToIntExpires());
    }

    @Test
    void testConvertToIntExpiresBoundaryValueZero() {
        // GIVEN
        credentialProperty.setExpiresHourStr("0");

        // WHEN
        Integer result = credentialProperty.convertToIntExpires();

        // THEN
        assertNotNull(result);
        assertEquals(0, result);
    }

    @Test
    void testConvertToIntExpiresBoundaryValueNegative() {
        // GIVEN
        credentialProperty.setExpiresHourStr("-5");

        // WHEN
        Integer result = credentialProperty.convertToIntExpires();

        // THEN
        assertNotNull(result);
        assertEquals(-5, result);
    }
}
