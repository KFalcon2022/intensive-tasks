package com.walking.intensive.chapter3.task11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.walking.intensive.chapter3.task11.Task11.getSumSubarraysOddLength;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task11Test {

    @ParameterizedTest
    @MethodSource("testDataSource")
    void testGetSumSubarraysOddLength(int[] array, int expectedSum) {
        // when
        var result = getSumSubarraysOddLength(array);

        // then
        assertEquals(expectedSum, result);
    }

    static Stream<Arguments> testDataSource() {
        return Stream.of(
                Arguments.of(new int[]{10, 11, 12}, 66),
                Arguments.of(new int[]{1, 2}, 3),
                Arguments.of(new int[]{1, 4, 2, 5, 3}, 58));
    }
}
