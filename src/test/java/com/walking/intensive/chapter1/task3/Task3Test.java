package com.walking.intensive.chapter1.task3;

import org.junit.jupiter.api.Test;

import static com.walking.intensive.chapter1.task3.Task3.isLeap;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task3Test {

    @Test
    void isLeapTest() {
        assertFalse(isLeap(2023));
        assertTrue(isLeap(2024));
        assertFalse(isLeap(2025));
        assertFalse(isLeap(2026));
        assertFalse(isLeap(2027));
        assertTrue(isLeap(2028));
    }
}