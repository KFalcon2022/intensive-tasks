package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        int[] testArray = {1, 5, 62, 23, -8, 0, 14, 12, 11, 8, 8, 6};
        System.out.println(Arrays.toString(sortByShaker(testArray)));
    }

    private static int[] sortByShaker(int[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean change = false;
            int lengthSortedArray = array.length - i;

            for (int j = 0; j < lengthSortedArray; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    change = true;
                }
            }

            for (int j = lengthSortedArray - 1; j >= i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    change = true;
                }
            }

            if (!change) {
                break;
            }
        }

        return array;
    }
}