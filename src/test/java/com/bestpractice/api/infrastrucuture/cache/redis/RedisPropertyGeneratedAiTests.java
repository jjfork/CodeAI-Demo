package com.bestpractice.api.infrastrucuture.cache.redis;

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

class RedisPropertyGeneratedAiTests {

    private RedisProperty redisProperty;

    @BeforeEach
    void setUp() {
        redisProperty = new RedisProperty();
    }

    @Test
    void testSetAndGetHostWithNull() {
        // GIVEN a null host value
        String host = null;

        // WHEN setting the host
        redisProperty.setHost(host);

        // THEN the host should be retrievable as null
        assertThat(redisProperty.getHost()).isNull();
    }

    @Test
    void testSetAndGetHostWithEmptyString() {
        // GIVEN an empty host string
        String host = "";

        // WHEN setting the host
        redisProperty.setHost(host);

        // THEN the host should be retrievable as empty string
        assertThat(redisProperty.getHost()).isEqualTo("");
    }

    @Test
    void testSetAndGetHostWithWhitespace() {
        // GIVEN a host string containing only whitespace
        String host = "   ";

        // WHEN setting the host
        redisProperty.setHost(host);

        // THEN the host should be retrievable as the whitespace string
        assertThat(redisProperty.getHost()).isEqualTo("   ");
    }

    @Test
    void testSetAndGetPasswordWithNull() {
        // GIVEN a null password value
        String password = null;

        // WHEN setting the password
        redisProperty.setPassword(password);

        // THEN the password should be retrievable as null
        assertThat(redisProperty.getPassword()).isNull();
    }

    @Test
    void testSetAndGetPasswordWithEmptyString() {
        // GIVEN an empty password string
        String password = "";

        // WHEN setting the password
        redisProperty.setPassword(password);

        // THEN the password should be retrievable as empty string
        assertThat(redisProperty.getPassword()).isEqualTo("");
    }

    @Test
    void testSetAndGetPasswordWithWhitespace() {
        // GIVEN a password string containing only whitespace
        String password = "   ";

        // WHEN setting the password
        redisProperty.setPassword(password);

        // THEN the password should be retrievable as the whitespace string
        assertThat(redisProperty.getPassword()).isEqualTo("   ");
    }

    @Test
    void testSetAndGetPortWithZero() {
        // GIVEN a port value of 0
        int port = 0;

        // WHEN setting the port
        redisProperty.setPort(port);

        // THEN the port should be retrievable as 0
        assertThat(redisProperty.getPort()).isEqualTo(0);
    }

    @Test
    void testSetAndGetPortWithOne() {
        // GIVEN a port value of 1
        int port = 1;

        // WHEN setting the port
        redisProperty.setPort(port);

        // THEN the port should be retrievable as 1
        assertThat(redisProperty.getPort()).isEqualTo(1);
    }
}
