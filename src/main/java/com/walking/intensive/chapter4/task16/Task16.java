package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {

    }

    private static int[] sortBySelection(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int currentMin = Integer.MAX_VALUE;
            int minPosition = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] <= currentMin) {
                    currentMin = array[j];
                    minPosition = j;
                }
            }
            array[minPosition] = array[i];
            array[i] = currentMin;
        }

        return array;
    }
}