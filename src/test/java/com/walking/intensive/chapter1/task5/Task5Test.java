package com.walking.intensive.chapter1.task5;

import org.junit.jupiter.api.Test;

import static com.walking.intensive.chapter1.task5.Task5.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task5Test {

    @Test
    void getAreaByHeronTest() {
        assertEquals(30.0, getAreaByHeron(12, 13, 5));
        assertEquals(6.0, getAreaByHeron(3, 4, 5));
    }

    @Test
    void getHeightsTest() {
        assertArrayEquals(new double[]{4.615384615384615, 5.0, 12.0}, getHeights(12, 13, 5));
        assertArrayEquals(new double[]{2.4, 3.0, 4.0}, getHeights(3, 4, 5));
    }

    @Test
    void getMediansTest() {
        assertArrayEquals(new double[]{6.5, 7.810249675906654, 12.257650672131263}, getMedians(12, 13, 5));
        assertArrayEquals(new double[]{2.5, 3.605551275463989, 4.272001872658765}, getMedians(3, 4, 5));
    }

    @Test
    void getBisectorsTest() {
        assertArrayEquals(new double[]{4.991341984846218, 6.009252125773315, 12.237646832622683}, getBisectors(12, 13, 5));
        assertArrayEquals(new double[]{2.4243661069253055, 3.3541019662496847, 4.216370213557839}, getBisectors(3, 4, 5));
    }

    @Test
    void getAnglesTest() {
        assertArrayEquals(new double[]{22.61986494804042, 67.38013505195957, 90.0}, getAngles(12, 13, 5));
        assertArrayEquals(new double[]{36.86989764584401, 53.13010235415599, 90.0}, getAngles(3, 4, 5));
    }

    @Test
    void getInscribedCircleRadiusTest() {
        assertEquals(2.0, getInscribedCircleRadius(12, 13, 5));
        assertEquals(1.0, getInscribedCircleRadius(3, 4, 5));
    }

    @Test
    void getCircumradiusTest() {
        assertEquals(6.5, getCircumradius(12, 13, 5));
        assertEquals(2.5, getCircumradius(3, 4, 5));
    }

    @Test
    void getAreaAdvancedTest() {
        assertEquals(30.0, getAreaAdvanced(12, 13, 5), 1e-10);
        assertEquals(6.0, getAreaAdvanced(3, 4, 5), 1e-10);
    }
}