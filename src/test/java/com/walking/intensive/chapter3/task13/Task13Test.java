package com.walking.intensive.chapter3.task13;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.walking.intensive.chapter3.task13.Task13.getCountSteps;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link Task13}.
 */
public class Task13Test {

    @ParameterizedTest
    @MethodSource("testDataSource")
    void testGetCountSteps(int[] plants, int wateringCanVolume, int expectedCountOfSteps) {
        // when
        var result = getCountSteps(plants, wateringCanVolume);

        // then
        assertEquals(expectedCountOfSteps, result);
    }

    static Stream<Arguments> testDataSource() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 4, 2, 3}, 4, 30),
                Arguments.of(new int[]{2, 2, 3, 3}, 5, 14),
                Arguments.of(new int[]{7, 7, 7, 7, 7, 7, 7}, 8, 49));
    }
}
