package com.walking.intensive.chapter2.task7;

import org.junit.jupiter.api.Test;

import static com.walking.intensive.chapter2.task7.Task7.getFriendlyPair;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task7Test {

    @Test
    void getFriendlyPairTest() {
        assertEquals(0, getFriendlyPair(200));
        assertEquals(284, getFriendlyPair(497));
        assertEquals(6368, getFriendlyPair(10000));
    }
}