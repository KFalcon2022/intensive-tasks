package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortBySelection(new int[]{1, 0})));
    }

    private static int[] sortBySelection(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int minIndex = 0;
        int currentIndex = 0;

        while (currentIndex < array.length) {
            int minValue = array[currentIndex];

            for (int i = currentIndex + 1; i < array.length; i++) {
                if (minValue > array[i]) {
                    minValue = array[i];
                    minIndex = i;
                }
            }

            if (minIndex > currentIndex) {
                array[minIndex] = array[currentIndex];
                array[currentIndex] = minValue;
            }

            currentIndex++;
        }

        return array;
    }
}