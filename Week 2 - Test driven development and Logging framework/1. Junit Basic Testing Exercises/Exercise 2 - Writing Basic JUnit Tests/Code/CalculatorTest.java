package com.example.junit_basics;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.sub(4, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(21, calc.mul(3, 7));
    }

    @Test
    public void testDivision() {
        assertEquals(4, calc.div(12, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroThrowsException() {
        calc.div(10, 0);
    }
}
