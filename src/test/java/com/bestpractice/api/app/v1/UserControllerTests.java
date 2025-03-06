package com.bestpractice.api.app.v1;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {

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
        int num2 = 2;
        // WHEN they are multiplied
        int result = calculator.multiply(num1, num2);
        // THEN the product is 14
        assertEquals(14, result);
    }

    @Test
    void testDivide() {
        // GIVEN two numbers
        int num1 = 12;
        int num2 = 3;
        // WHEN they are divided
        int result = calculator.divide(num1, num2);
        // THEN the quotient is 4
        assertEquals(4, result);
    }

    @Test
    void testDivideByZero() {
        // GIVEN two numbers where the denominator is zero
        int num1 = 12;
        int num2 = 0;
        // WHEN divide is called with these numbers
        assertThrows(ArithmeticException.class, () -> calculator.divide(num1, num2));
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}