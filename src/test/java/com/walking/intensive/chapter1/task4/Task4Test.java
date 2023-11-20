package com.walking.intensive.chapter1.task4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.walking.intensive.chapter1.task4.Task4.solveQuadraticEquation;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class Task4Test {

    @ParameterizedTest
    @MethodSource("dataSource")
    void solveQuadraticEquationTest(String expected, double a, double b, double c) {
        assertEquals(expected, solveQuadraticEquation(a, b, c));
    }

    static Stream<Arguments> dataSource() {
        return Stream.of(
                of("Решений бесконечно", 0, 0, 0),
                of("Решений нет", 0, 0, 5),
                of("1 решение x = 2", 0, 1, 2),
                of("1 решение x = 0", 1, 0, 0),
                of("Решений нет", 1, 0, 1),
                of("2 решения x = 1 и x = -1", 1, 0, -1)
        );
    }
}