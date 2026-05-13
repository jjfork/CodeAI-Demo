package com.bestpractice.api.domain.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CredentialGeneratedAiTests {

    private Credential credential;
    private final String token = "abc123";
    private final String tokenType = "Bearer";
    private final Date exp = new Date();
    private final boolean isRefresh = true;

    @BeforeEach
    void setUp() {
        credential = new Credential(token, tokenType, exp, isRefresh);
    }

    @Test
    void testGetToken() {
        // GIVEN a Credential instance initialized in setUp
        // WHEN getToken is called
        String result = credential.getToken();
        // THEN the returned token should match the initialized value
        assertThat(result).isEqualTo(token);
    }

    @Test
    void testGetTokenType() {
        // GIVEN a Credential instance initialized in setUp
        // WHEN getTokenType is called
        String result = credential.getTokenType();
        // THEN the returned token type should match the initialized value
        assertThat(result).isEqualTo(tokenType);
    }

    @Test
    void testGetExp() {
        // GIVEN a Credential instance initialized in setUp
        // WHEN getExp is called
        Date result = credential.getExp();
        // THEN the returned expiration date should be the same instance as initialized
        assertThat(result).isSameAs(exp);
    }

    @Test
    void testIsRefresh() {
        // GIVEN a Credential instance initialized in setUp
        // WHEN isRefresh is called
        boolean result = credential.isRefresh();
        // THEN the returned boolean should match the initialized value
        assertThat(result).isEqualTo(isRefresh);
    }
}
