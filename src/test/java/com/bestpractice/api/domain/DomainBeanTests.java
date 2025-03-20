package com.bestpractice.api.domain;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class DomainBeanTests {
    @Autowired
    private DomainBean domainBean;

    @Test
    void testPasswordEncoder() {
        // GIVEN - The DomainBean is initialized.
        // WHEN - The passwordEncoder bean is retrieved.
        PasswordEncoder encoder = domainBean.getPasswordEncoder();
        // THEN - The encoder should not be null.
        assertNotNull(encoder);
    }
}
