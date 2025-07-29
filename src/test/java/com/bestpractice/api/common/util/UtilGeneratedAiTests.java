package com.bestpractice.api.common.util;

    @Test

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
    void testGetSpringProfileActive() {
        // GIVEN - No specific setup needed
        // WHEN - Call the getSpringProfileActive method
        String activeProfile = Util.getSpringProfileActive();
        // THEN - Assert that the returned string is not null and has a value
        assert activeProfile != null && !activeProfile.isEmpty(); 
    }
