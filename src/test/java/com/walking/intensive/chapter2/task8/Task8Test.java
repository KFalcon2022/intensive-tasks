package com.walking.intensive.chapter2.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task8Test {

    @Test
    void getHappyTicketChanceTest() {
        assertEquals(0.055252, Task8.getHappyTicketChance());
    }
}