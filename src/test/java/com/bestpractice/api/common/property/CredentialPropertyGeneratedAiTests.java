package com.bestpractice.api.common.property;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CredentialPropertyGeneratedAiTests {

    private CredentialProperty credentialProperty;

    @BeforeEach
    void setUp() {
        credentialProperty = new CredentialProperty();
    }

    @Test
    void testGettersAndSetters() {
        // GIVEN
        String key = "myKey";
        String provider = "myProvider";
        String subject = "mySubject";
        String alg = "HS256";
        String hmacSecret = "secret";
        String expiresHourStr = "10";

        // WHEN
        credentialProperty.setKey(key);
        credentialProperty.setProvider(provider);
        credentialProperty.setSubject(subject);
        credentialProperty.setAlg(alg);
        credentialProperty.setHmacSecret(hmacSecret);
        credentialProperty.setExpiresHourStr(expiresHourStr);

        // THEN
        assertThat(credentialProperty.getKey()).isEqualTo(key);
        assertThat(credentialProperty.getProvider()).isEqualTo(provider);
        assertThat(credentialProperty.getSubject()).isEqualTo(subject);
        assertThat(credentialProperty.getAlg()).isEqualTo(alg);
        assertThat(credentialProperty.getHmacSecret()).isEqualTo(hmacSecret);
        assertThat(credentialProperty.getExpiresHourStr()).isEqualTo(expiresHourStr);
    }

    @Test
    void testConvertToIntExpiresWithValidNumber() {
        // GIVEN
        credentialProperty.setExpiresHourStr("5");

        // WHEN
        Integer result = credentialProperty.convertToIntExpires();

        // THEN
        assertThat(result).isEqualTo(5);
    }

    @Test
    void testConvertToIntExpiresWithDash() {
        // GIVEN
        credentialProperty.setExpiresHourStr("-");

        // WHEN
        Integer result = credentialProperty.convertToIntExpires();

        // THEN
        assertThat(result).isNull();
    }
