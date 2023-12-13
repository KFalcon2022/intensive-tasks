package com.walking.intensive.chapter3.task12;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static com.walking.intensive.chapter3.task12.Task12.getNumberOfMovements;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task12Test {

    @ParameterizedTest
    @MethodSource("testDataSource")
    void testGetNumberOfMovements(String baskets, int[] expectedArray) {
        // when
        var result = getNumberOfMovements(baskets);

        // then
        assertEquals(baskets.length(), result.length);
        assertTrue(Arrays.equals(expectedArray, result));
    }

    static Stream<Arguments> testDataSource() {
        return Stream.of(
                Arguments.of("001011", new int[]{11, 8, 5, 4, 3, 4}),
                Arguments.of("110", new int[]{1, 1, 3}));
    }
}
