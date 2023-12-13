package com.walking.intensive.chapter3.task15;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.walking.intensive.chapter3.task15.Task15.getMaxFloors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link Task15}.
 */
public class Task15Test {

    @ParameterizedTest
    @MethodSource("testDataSource")
    void testGetMaxFloors(int[][] city, int expectedCountOfFloors) {
        // when
        var result = getMaxFloors(city);

        // then
        assertEquals(expectedCountOfFloors, result);
    }

    static Stream<Arguments> testDataSource() {
        // case 1
        int[][] city1 = {{2, 1}, {1, 3}};

        // case 2
        int[][] city2 = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};

        return Stream.of(
                Arguments.of(city1, 2),
                Arguments.of(city2, 35)
        );
    }
}
