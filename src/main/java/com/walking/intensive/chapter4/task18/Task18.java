package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        int[] array = {-1, 4, 56, 3, 56, 87, 3, 0, 0, 3, -56, Integer.MAX_VALUE, 2};
        int[] array2 = {-1, 4, 56, 3};
        int[] array3 = {-1, 56, 4};

        System.out.println(Arrays.toString(sortByShaker(array)));
        System.out.println(Arrays.toString(sortByShaker(array2)));
        System.out.println(Arrays.toString(sortByShaker(array3)));
    }

    private static int[] sortByShaker(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            boolean isArrayChanged = false;

            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int buffer = array[j];

                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                    isArrayChanged = true;
                }
            }

            if (!isArrayChanged) {
                return array;
            }

            isArrayChanged = false;

            for (int j = array.length - i - 2; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int buffer = array[j];

                    array[j] = array[j - 1];
                    array[j - 1] = buffer;
                    isArrayChanged = true;
                }
            }

            if (!isArrayChanged) {
                return array;
            }
        }

        return array;
    }
}