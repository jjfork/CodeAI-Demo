package com.bestpractice.api.domain.component;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BCryptPasswordEncryptionComponentGeneratedAiTests {

    @Autowired
    private BCryptPasswordEncryptionComponent encryptionComponent;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testEncodePassword() {
        // GIVEN a raw password
        String rawPassword = "password123";
        // WHEN the password is encoded
        String encodedPassword = encryptionComponent.encodePassword(rawPassword);
        // THEN the encoded password should not be null
        assertNotNull(encodedPassword);
    }

    @Test
    void testMatchedPassword() {
        // GIVEN a raw password and its encoded version
        String rawPassword = "password123";
        String encodedPassword = encryptionComponent.encodePassword(rawPassword);
        // WHEN the password is matched
        boolean isMatch = encryptionComponent.matchedPassword(rawPassword, encodedPassword);
        // THEN the match should be true
        assertTrue(isMatch);
    }
}