package com.walking.intensive.chapter1.task5;

import org.junit.jupiter.api.Test;

import static com.walking.intensive.chapter1.task5.Task5.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task5Test {


    @Test
    void getAreaByHeronTest() {
        assertEquals(getAreaByHeron(1, 2, 3), 123);
    }

    @Test
    void getHeightsTest() {
        assertArrayEquals(getHeights(1, 2, 3), new double[]{1, 2, 3});
    }

    @Test
    void getMediansTest() {
        assertArrayEquals(getMedians(1, 2, 3), new double[]{1, 2, 3});
    }

    @Test
    void getBisectorsTest() {
        assertArrayEquals(getBisectors(1, 2, 3), new double[]{1, 2, 3});
    }

    @Test
    void getAnglesTest() {
        assertArrayEquals(getAngles(1, 2, 3), new double[]{1, 2, 3});
    }

    @Test
    void getInscribedCircleRadiusTest() {
        assertEquals(getInscribedCircleRadius(1, 2, 3), 123);
    }

    @Test
    void getCircumradiusTest() {
        assertEquals(getCircumradius(1, 2, 3), 123);
    }

    @Test
    void getAreaAdvancedTest() {
        assertEquals(getAreaAdvanced(1, 2, 3), 123);
    }
}