package com.bestpractice.api.app;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import com.bestpractice.api.app.ErrorResponse; 

@ExtendWith(MyExtension.class)
public class AdviceControllerTests {
    @Test
    void testHandleException() {
        assertThrows(RuntimeException.class, () -> {});
    }
}
