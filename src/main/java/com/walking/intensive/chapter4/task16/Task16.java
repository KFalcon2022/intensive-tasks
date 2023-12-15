package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] testArray = {1, 4, 5, 6, 8, 45, 23, 11, 42, -5, 0};
        System.out.println(Arrays.toString(sortBySelection(testArray)));
    }

    private static int[] sortBySelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexMinValue = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] <= array[indexMinValue]) {
                    indexMinValue = j;
                }
            }

            int temp = array[i];
            array[i] = array[indexMinValue];
            array[indexMinValue] = temp;
        }

        return array;
    }
}