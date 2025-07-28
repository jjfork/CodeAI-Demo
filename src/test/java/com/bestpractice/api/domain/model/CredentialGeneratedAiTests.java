package com.bestpractice.api.domain.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CredentialGeneratedAiTests {

    private String token = "testToken";
    private String tokenType = "Bearer";
    private Date exp = new Date();
    private boolean isRefresh = true;
    private Credential credential;

    @BeforeEach
    void setUp() {
        credential = new Credential(token, tokenType, exp, isRefresh);
    }

    @Test
    void testGetToken() {
        // GIVEN - A Credential object has been created
        // WHEN - The getToken method is called on the credential object
        String actualToken = credential.getToken();
        // THEN - The returned token matches the expected token
        assertEquals(token, actualToken);
    }

    @Test
    void testGetTokenType() {
        // GIVEN - A Credential object has been created
        // WHEN - The getTokenType method is called on the credential object
        String actualTokenType = credential.getTokenType();
        // THEN - The returned token type matches the expected token type
        assertEquals(tokenType, actualTokenType);
    }

    @Test
    void testGetExp() {
        // GIVEN - A Credential object has been created
        // WHEN - The getExp method is called on the credential object
        Date actualExp = credential.getExp();
        // THEN - The returned expiration date matches the expected expiration date
        assertEquals(exp, actualExp);
    }

    @Test
    void testIsRefresh() {
        // GIVEN - A Credential object has been created
        // WHEN - The isRefresh method is called on the credential object
        boolean actualIsRefresh = credential.isRefresh();
        // THEN - The returned refresh status matches the expected refresh status
        assertTrue(actualIsRefresh);
    }
}
