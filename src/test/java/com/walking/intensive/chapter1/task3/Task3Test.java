package com.walking.intensive.chapter1.task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.walking.intensive.chapter1.task3.Task3.isLeap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class Task3Test {

    @ParameterizedTest
    @MethodSource("dataSource")
    void isLeapTest(boolean expected, int year) {
        assertEquals(expected, isLeap(year));
    }

    static Stream<Arguments> dataSource() {
        return Stream.of(
                of(true, 1600),
                of(false, 1700),
                of(false, 1800),
                of(false, 1900),
                of(true, 2000),
                of(true, 2020),
                of(false, 2021),
                of(false, 2022),
                of(false, 2023),
                of(true, 2024),
                of(false, 2100),
                of(true, 2400)
        );
    }
}