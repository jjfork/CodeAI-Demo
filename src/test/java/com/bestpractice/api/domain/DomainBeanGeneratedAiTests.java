package com.bestpractice.api.domain;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DomainBeanGeneratedAiTests {
    private DomainBean domainBean;

    @BeforeEach
    void setUp() {
        domainBean = new DomainBean();
    }

    @Test
    void testPasswordEncoder() {
        // GIVEN - The DomainBean instance is initialized.
        // WHEN - The passwordEncoder method is called.
        BCryptPasswordEncoder encoder = domainBean.passwordEncoder();
        // THEN - An instance of BCryptPasswordEncoder is returned.
        assertEquals(BCryptPasswordEncoder.class, encoder.getClass());
    }
}