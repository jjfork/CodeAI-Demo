package com.bestpractice.api.app;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppBeanTests {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        // GIVEN two numbers
        int num1 = 5;
        int num2 = 3;
        // WHEN they are added together
        int result = calculator.add(num1, num2);
        // THEN the sum is 8
        assertEquals(8, result);
    }

    @Test
    void testSubtract() {
        // GIVEN two numbers
        int num1 = 10;
        int num2 = 4;
        // WHEN they are subtracted
        int result = calculator.subtract(num1, num2);
        // THEN the difference is 6
        assertEquals(6, result);
    }

    @Test
    void testMultiply() {
        // GIVEN two numbers
        int num1 = 7;
        int num2 = 9;
        // WHEN they are multiplied
        int result = calculator.multiply(num1, num2);
        // THEN the product is 63
        assertEquals(63, result);
    }

    @Test
    void testDivide() {
        // GIVEN two numbers
        int num1 = 20;
        int num2 = 5;
        // WHEN they are divided
        int result = calculator.divide(num1, num2);
        // THEN the quotient is 4
        assertEquals(4, result);
    }
}