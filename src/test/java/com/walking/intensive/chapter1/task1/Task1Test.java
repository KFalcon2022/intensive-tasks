package com.walking.intensive.chapter1.task1;

import org.junit.jupiter.api.Test;

import static com.walking.intensive.chapter1.task1.Task1.getAgeString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {

    @Test
    void getAgeStringTest() {
         assertEquals(getAgeString(0), "Вам 0 лет");
         assertEquals(getAgeString(1), "Вам 1 год");
         assertEquals(getAgeString(2), "Вам 2 года");
         assertEquals(getAgeString(4), "Вам 4 года");
         assertEquals(getAgeString(5), "Вам 5 лет");
         assertEquals(getAgeString(8), "Вам 8 лет");
         assertEquals(getAgeString(10), "Вам 10 лет");
         assertEquals(getAgeString(21), "Вам 21 год");
         assertEquals(getAgeString(22), "Вам 22 года");
         assertEquals(getAgeString(23), "Вам 23 года");
         assertEquals(getAgeString(100), "Вам 100 лет");
         assertEquals(getAgeString(101), "Вам 101 год");
         assertEquals(getAgeString(103), "Вам 103 года");
         assertEquals(getAgeString(127), "Вам 127 лет");
    }

}