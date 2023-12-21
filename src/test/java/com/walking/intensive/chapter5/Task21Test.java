package com.walking.intensive.chapter5;

import com.walking.intensive.chapter5.task21.Parallelepiped;
import com.walking.intensive.chapter5.task21.Sphere;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.walking.intensive.chapter5.task21.Task21.intersectionSphereParallelepiped;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task21Test {

    @ParameterizedTest
    @MethodSource("testDataSource")
    void testIntersectionSphereParallelepiped(Parallelepiped par, Sphere sph, boolean isBool) {
        // when
        var result = intersectionSphereParallelepiped(par, sph);

        // then
        assertEquals(result, isBool);

    }

    static Stream<Arguments> testDataSource() {
        return Stream.of(
                Arguments.of(new Parallelepiped(1, 1, 1, 3, 3, 3), new Sphere(5, 5, 5, 1), false),
                Arguments.of(new Parallelepiped(1, 1, 1, 3, 3, 3), new Sphere(1, 1, 0, 1), true),
                Arguments.of(new Parallelepiped(1, 1, 1, 3, 3, 3), new Sphere(3, 3, 2, 2), true));
    }
}
