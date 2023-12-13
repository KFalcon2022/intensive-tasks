package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = {-100, -180, -8, 2, 0, 4, 5, 9, 700, 25, 0};

        System.out.println(Arrays.toString(sortBySelection(array)));
    }

    private static int[] sortBySelection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int numMinElement = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    numMinElement = j;
                }
            }
            array[numMinElement] = array[i];
            array[i] = min;
        }

        return array;
    }
}