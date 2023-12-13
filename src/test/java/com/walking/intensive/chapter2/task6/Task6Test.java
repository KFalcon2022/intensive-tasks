package com.walking.intensive.chapter2.task6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.walking.intensive.chapter2.task6.Task6.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class Task6Test {

    @ParameterizedTest
    @MethodSource("nocData")
    void getNocTest(int expected, int m, int n) {
        int noc = getNoc(m, n);
        assertEquals(expected, noc);
    }

    @ParameterizedTest
    @MethodSource("nodData")
    void getNodTest(int expected, int m, int n) {
        int nod = getNod(m, n);
        assertEquals(expected, nod);
    }

    @ParameterizedTest
    @MethodSource("nodData")
    void getNodByEuclideanAlgorithmTest(int expected, int m, int n) {
        int nod = getNodByEuclideanAlgorithm(m, n);
        assertEquals(expected, nod);
    }


    static Stream<Arguments> nocData() {
        return Stream.of(
                of(75, 15, 25),
                of(24, 6, 8),
                of(35, 7, 5),
                of(25, 25, 25),
                of(24, 12, 24)
        );
    }

    static Stream<Arguments> nodData() {
        return Stream.of(
                of(1, 5, 7),
                of(2, 6, 8),
                of(1, 1, 25),
                of(6, 12, 6),
                of(2, 2, 2)
        );
    }
}