package com.walking.intensive.chapter1.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.walking.intensive.chapter1.task2.Task2.getFlatLocation;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class Task2Test {

    @ParameterizedTest
    @MethodSource("dataSource")
    void getFlatLocationTest(String expected, int floorAmount, int entranceAmount, int flatNumber) {
        String flatLocation = getFlatLocation(floorAmount, entranceAmount, flatNumber);
        assertEquals(expected, flatLocation);
    }

    static Stream<Arguments> dataSource() {
        return Stream.of(
                of("40 �� - 1 �������, 10 ����, ������ �� �����, ������", 10, 3, 40),
                of("41 �� - 2 �������, 1 ����, ����� �� �����, �����", 10, 3, 41),
                of("88 �� - 3 �������, 2 ����, ������ �� �����, ������", 10, 3, 88),
                of("5 �� - 1 �������, 2 ����, ����� �� �����, �����", 2, 2, 5),
                of("9 �� - 2 �������, 1 ����, ����� �� �����, �����", 2, 2, 9),
                of("����� �������� �� ����������", 10, 3, -1),
                of("����� �������� �� ����������", 2, 2, -1),
                of("����� �������� �� ����������", 10, 3, 121),
                of("����� �������� �� ����������", 2, 2, 17));
    }
}