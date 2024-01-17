package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 13, -4, 2, 0, 8, Integer.MAX_VALUE, 4, 6, 12, 34, 64, 2, 4, 7, 8};

        System.out.println(Arrays.toString(sortBySelection(array)));
    }

    private static int[] sortBySelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            int buffer = array[i];

            for (int j = i; j < array.length; j++) {
                if (array[j] <= min) {
                    min = array[j];
                    index = j;
                }
            }

            array[i] = array[index];
            array[index] = buffer;
        }

        return array;
    }
}