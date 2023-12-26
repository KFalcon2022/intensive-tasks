package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 4, 2, 0, 87, -6};
        System.out.println(Arrays.toString(sortBySelection(array)));

    }

    private static int[] sortBySelection(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = Integer.MAX_VALUE;
            int minValue = array[i];

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }

            if (array[i] > minValue) {
                array[minIndex] = array[i];
                array[i] = minValue;
            }
        }
        return array;
    }
}