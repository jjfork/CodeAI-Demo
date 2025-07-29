package com.bestpractice.api.domain;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder; 

import static org.junit.jupiter.api.Assertions.*;

class DomainBeanGeneratedAiTests {

    private AnnotationConfigApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DomainBean.class);
    }

    @Test
    void testPasswordEncoder() {
        // GIVEN - The application context is initialized with the DomainBean configuration.
        // WHEN - The passwordEncoder bean is retrieved from the context.
        PasswordEncoder encoder = context.getBean(BCryptPasswordEncoder.class);
        // THEN - The returned object should not be null.
        assertNotNull(encoder);

    }
}
