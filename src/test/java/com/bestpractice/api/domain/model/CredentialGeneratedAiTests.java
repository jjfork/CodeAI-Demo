package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CredentialGeneratedAiTests {

    private Credential credential;

    @BeforeEach
    void setUp() {
        credential = new Credential("token", "Bearer", new java.util.Date(), false);
    }

    @Test
    void test getToken() {
        // GIVEN a new Credential object
        // WHEN the getToken() method is called
        // THEN the token string ("token") should be returned.
        assertEquals("token", credential.getToken());
    }

    @Test
    void testGetTokenType() {
        // GIVEN a new Credential object
        // WHEN the getTokenType() method is called
        // THEN the tokenType string ("Bearer") should be returned.
        assertEquals("Bearer", credential.getTokenType());
    }

    @Test
    void testGetExp() {
        // GIVEN a new Credential object
        // WHEN the getExp() method is called
        // THEN the Date object should be returned.
        assertEquals(new java.util.Date(), credential.getExp());
    }

    @Test
    void testIsRefresh() {
        // GIVEN a new Credential object
        // WHEN the isRefresh() method is called
        // THEN the boolean value (false) should be returned.
        assertEquals(false, credential.isRefresh());
    }
}
