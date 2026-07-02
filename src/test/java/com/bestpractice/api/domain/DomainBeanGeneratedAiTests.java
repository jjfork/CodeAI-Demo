package com.bestpractice.api.domain;

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
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import static org.assertj.core.api.Assertions.assertThat;

class DomainBeanGeneratedAiTests {

    private DomainBean domainBean;

    @BeforeEach
    void setUp() {
        domainBean = new DomainBean();
    }

    @Test
    void testPasswordEncoderBeanCreation() {
        // GIVEN
        // WHEN
        PasswordEncoder encoder = domainBean.passwordEncoder();
        // THEN
        assertThat(encoder).isNotNull();
        assertThat(encoder).isInstanceOf(BCryptPasswordEncoder.class);
    }

    @Test
    void testPasswordEncoderEncodesAndMatches() {
        // GIVEN
        PasswordEncoder encoder = domainBean.passwordEncoder();
        String rawPassword = "SecurePass123!";
        // WHEN
        String encodedPassword = encoder.encode(rawPassword);
        // THEN
        assertThat(encodedPassword).isNotEqualTo(rawPassword);
        assertThat(encoder.matches(rawPassword, encodedPassword)).isTrue();
    }

    @Test
    void testPasswordEncoderReturnsNewInstanceEachCall() {
        // GIVEN
        // WHEN
        PasswordEncoder first = domainBean.passwordEncoder();
        PasswordEncoder second = domainBean.passwordEncoder();
        // THEN
        assertThat(first).isNotSameAs(second);
    }
