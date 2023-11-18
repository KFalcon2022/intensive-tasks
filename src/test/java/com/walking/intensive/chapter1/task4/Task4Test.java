package com.walking.intensive.chapter1.task4;

import org.junit.jupiter.api.Test;

import static com.walking.intensive.chapter1.task4.Task4.solveQuadraticEquation;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task4Test {

    @Test
    void solveQuadraticEquationTest() {
        assertEquals(solveQuadraticEquation(1, 2, 3), "Количество решений: 2. Корни: -4;4");
        assertEquals(solveQuadraticEquation(1, 2, 3), "Количество решений: 1. Корень: 0");
    }
}