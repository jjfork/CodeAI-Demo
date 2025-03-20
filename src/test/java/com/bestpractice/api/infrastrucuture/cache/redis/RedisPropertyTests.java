package com.bestpractice.api.infrastrucuture.cache.redis;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RedisPropertyTests {
    private RedisProperty redisProperty;

    @BeforeEach
    void setUp() {
        redisProperty = new RedisProperty();
    }

    @Test
    void testGetHost() {
        // GIVEN - Initialize the host property
        String expectedHost = "localhost";
        redisProperty.setHost(expectedHost);
        // WHEN - Get the host property
        String actualHost = redisProperty.getHost();
        // THEN - Assert that the actual host matches the expected host
        assertEquals(expectedHost, actualHost);
    }

    @Test
    void testSetHost() {
        // GIVEN - Initialize the host property
        String newHost = "127.0.0.1";
        // WHEN - Set the host property
        redisProperty.setHost(newHost);
        // THEN - Assert that the actual host matches the new host
        assertEquals(newHost, redisProperty.getHost());
    }

    @Test
    void testGetPort() {
        // GIVEN - Initialize the port property
        int expectedPort = 6379;
        redisProperty.setPort(expectedPort);
        // WHEN - Get the port property
        int actualPort = redisProperty.getPort();
        // THEN - Assert that the actual port matches the expected port
        assertEquals(expectedPort, actualPort);
    }

    @Test
    void testSetPort() {
        // GIVEN - Initialize the port property
        int newPort = 8080;
        // WHEN - Set the port property
        redisProperty.setPort(newPort);
        // THEN - Assert that the actual port matches the new port
        assertEquals(newPort, redisProperty.getPort());
    }

    @Test
    void testGetPassword() {
        // GIVEN - Initialize the password property
        String expectedPassword = "mysecretpassword";
        redisProperty.setPassword(expectedPassword);
        // WHEN - Get the password property
        String actualPassword = redisProperty.getPassword();
        // THEN - Assert that the actual password matches the expected password
        assertEquals(expectedPassword, actualPassword);
    }

    @Test
    void testSetPassword() {
        // GIVEN - Initialize the password property
        String newPassword = "newsecretpassword";
        // WHEN - Set the password property
        redisProperty.setPassword(newPassword);
        // THEN - Assert that the actual password matches the new password
        assertEquals(newPassword, redisProperty.getPassword());
    }
}
