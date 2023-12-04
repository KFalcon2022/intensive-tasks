package com.walking.intensive.chapter3.task14;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static com.walking.intensive.chapter3.task14.Task14.getCountOfPoints;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for {@link Task14}.
 */
public class Task14Test {

    @ParameterizedTest
    @MethodSource("testDataSource")
    void testGetCountOfPoints(int[][] points, int[][] queries, int[] expectedCountOfPoints) {
        // when
        var result = getCountOfPoints(points, queries);

        // then
        assertEquals(queries.length, result.length);
        assertTrue(Arrays.equals(expectedCountOfPoints, result));
    }

    static Stream<Arguments> testDataSource() {
        // case 1
        int[][] points_1 = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries_1 = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};
        int[] answer_1 = {3, 2, 2};

        // case 2
        int[][] points_2 = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        int[][] queries_2 = {{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}};
        int[] answer_2 = {2, 3, 2, 4};

        return Stream.of(
                Arguments.of(points_1, queries_1, answer_1),
                Arguments.of(points_2, queries_2, answer_2)
        );
    }
}
