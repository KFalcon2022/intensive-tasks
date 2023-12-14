package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = {9, 44, 52345, 3, 56, 1, 54, 11, 43, 2, 4, 5, 99};

        sortBySelection(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] sortBySelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int miniIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[miniIndex]) {
                    miniIndex = j;
                }
            }
            int temp = array[miniIndex];
            array[miniIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}