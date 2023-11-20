package com.walking.intensive.chapter1.task2;

import org.junit.jupiter.api.Test;
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
                of("1 подъезд, 10 этаж, справа от лифта, вправо", 10, 3, 40),
                of("2 подъезд, 1 этаж, слева от лифта, влево", 10, 3, 41),
                of("3 подъезд, 2 этаж, справа от лифта, вправо", 10, 3, 88),
                of("1 подъезд, 2 этаж, слева от лифта, влево", 2, 2, 5),
                of("2 подъезд, 1 этаж, слева от лифта, влево", 2, 2, 9),
                of("такой квартиры не существует", 10, 3, -1),
                of("такой квартиры не существует", 2, 2, -1),
                of("такой квартиры не существует", 10, 3, 121),
                of("такой квартиры не существует", 10, 3, 17));
    }
}