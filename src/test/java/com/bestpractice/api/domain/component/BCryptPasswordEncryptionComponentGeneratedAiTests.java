package com.bestpractice.api.domain.component;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BCryptPasswordEncryptionComponentGeneratedAiTests {

    private BCryptPasswordEncryptionComponent encryptionComponent;

    @BeforeEach
    void setUp() {
        encryptionComponent = new BCryptPasswordEncryptionComponent();
    }

    @Test
    void givenRawPassword_whenEncodePassword_thenReturnEncryptedPassword() {
        // GIVEN: a raw password
        String rawPassword = "testPassword123";

        // WHEN: encoding the password
        String encryptedPassword = encryptionComponent.encodePassword(rawPassword);

        // THEN: the encrypted password should not be null and should not equal the raw password
        assertNotNull(encryptedPassword);
        assertNotEquals(rawPassword, encryptedPassword);
    }

    @Test
    void givenMatchingRawAndEncryptedPassword_whenMatchedPassword_thenReturnTrue() {
        // GIVEN: a raw password and its encrypted form
        String rawPassword = "securePass456";
        String encryptedPassword = encryptionComponent.encodePassword(rawPassword);

        // WHEN: checking if the raw password matches the encrypted password
        boolean matches = encryptionComponent.matchedPassword(rawPassword, encryptedPassword);

        // THEN: the match result should be true
        assertTrue(matches);
    }

    @Test
    void givenNonMatchingRawAndEncryptedPassword_whenMatchedPassword_thenReturnFalse() {
        // GIVEN: a raw password and an encrypted password from a different raw password
        String rawPassword = "passwordOne";
        String differentRawPassword = "passwordTwo";
        String encryptedPassword = encryptionComponent.encodePassword(differentRawPassword);

        // WHEN: checking if the raw password matches the encrypted password
        boolean matches = encryptionComponent.matchedPassword(rawPassword, encryptedPassword);

        // THEN: the match result should be false
        assertFalse(matches);
    }
}
