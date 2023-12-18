package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] arr = {11, 10, 34, 56, 1, 2, 3, 58};
        System.out.println(Arrays.toString(sortBySelection(arr)));
    }

    private static int[] sortBySelection(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int minValueIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[minValueIndex]) {
                    minValueIndex = j;
                }
            }

            if (i != minValueIndex) {
                int temp = array[i];
                array[i] = array[minValueIndex];
                array[minValueIndex] = temp;
            }
        }
        return array;
    }
}