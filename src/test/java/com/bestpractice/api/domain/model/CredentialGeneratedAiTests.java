package com.bestpractice.api.domain.model;

import static org.assertj.core.api.Assertions.assertThat;
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
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void getToken_returnsToken() {
        // GIVEN
        // WHEN
        String result = credential.getToken();
        // THEN
        assertEquals(token, result);
    }

    @Test
    void getTokenType_returnsTokenType() {
        // GIVEN
        // WHEN
        String result = credential.getTokenType();
        // THEN
        assertEquals(tokenType, result);
    }

    @Test
    void getExp_returnsExp() {
        // GIVEN
        // WHEN
        Date result = credential.getExp();
        // THEN
        assertEquals(exp, result);
    }

    @Test
    void isRefresh_returnsTrueWhenTrue() {
        // GIVEN
        // WHEN
        boolean result = credential.isRefresh();
        // THEN
        assertEquals(isRefresh, result);
    }
}
