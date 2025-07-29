package com.bestpractice.api.domain.component;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BCryptPasswordEncryptionComponentGeneratedAiTests {

    @Autowired
    private BCryptPasswordEncryptionComponent bCryptPasswordEncryptionComponent;

    @BeforeEach
    void setUp() {
    }

    @Test
    void givenRawPassword_whenEncodePassword_thenReturnEncodedPassword() {
        String rawPassword = "password123";
        String encodedPassword = bCryptPasswordEncryptionComponent.encodePassword(rawPassword);
        assertNotNull(encodedPassword);
        assertTrue(encodedPassword.length() > 0);
    }

    @Test
    void givenRawPasswordAndEncodedPassword_whenMatchedPassword_thenReturnTrue() {
        String rawPassword = "password123";
        String encodedPassword = bCryptPasswordEncryptionComponent.encodePassword(rawPassword);
        boolean isMatch = bCryptPasswordEncryptionComponent.matchedPassword(rawPassword, encodedPassword);
        assertTrue(isMatch);
    }

    @Test
    void givenIncorrectRawPasswordAndEncodedPassword_whenMatchedPassword_thenReturnFalse() {
        String rawPassword = "wrongpassword";
        String encodedPassword = bCryptPasswordEncryptionComponent.encodePassword("password123");
        boolean isMatch = bCryptPasswordEncryptionComponent.matchedPassword(rawPassword, encodedPassword);
        assertFalse(isMatch);
    }
}