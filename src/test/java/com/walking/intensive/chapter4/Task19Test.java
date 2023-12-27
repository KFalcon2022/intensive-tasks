package com.walking.intensive.chapter4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.walking.intensive.chapter4.task19.Task19.sortByQuicksort;
import static com.walking.intensive.chapter4.task19.Task19.genRandomArray;
import static com.walking.intensive.chapter4.task19.Task19.isSorted;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task19Test {
    @ParameterizedTest
    @MethodSource("testDataSource")
    void testSortByQuicksort(int[] array) {
        // when
        var result = isSorted(sortByQuicksort(array));

        // then
        assertTrue(result);
    }

    static Stream<Arguments> testDataSource() {
        // case 1
        int[] one = genRandomArray();

        // case 2
        int[] two = genRandomArray();

        // case 3
        int[] three = new int[]{0};

        return Stream.of(
                Arguments.of(one),
                Arguments.of(two),
                Arguments.of(three)
        );
    }
}
