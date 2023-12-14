package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        int[] array = {22, 13, 56, 432, 55, 12, 1, 5, 8};

        System.out.println(Arrays.toString(sortByShaker(array)));
    }

    private static int[] sortByShaker(int[] array) {
        int left = 0;
        int right = array.length - 1;
        boolean swapped;

        do {
            swapped = false;

            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            right--;

            if (!swapped) {
                break;
            }
            swapped = false;

            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    swapped = true;
                }
            }
            left++;

        } while (swapped);

        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}