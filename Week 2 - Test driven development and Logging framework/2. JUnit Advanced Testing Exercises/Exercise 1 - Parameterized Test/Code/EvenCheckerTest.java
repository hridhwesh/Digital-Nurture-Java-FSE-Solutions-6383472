package com.example.junit_basics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class EvenCheckerTest {

    private final EvenChecker checker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEvenReturns1ForEvenNumbers(int number) {
        assertEquals(1, checker.isEven(number), number + " should return 1 (even)");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void testIsEvenReturns0ForOddNumbers(int number) {
        assertEquals(0, checker.isEven(number), number + " should return 0 (odd)");
    }
}