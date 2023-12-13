package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] arr = {0, 5, -2, 10, 7, -5};
        System.out.println(Arrays.toString(sortBySelection(arr)));
    }

    private static int[] sortBySelection(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    pos = j;
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }

        return array;
    }
}