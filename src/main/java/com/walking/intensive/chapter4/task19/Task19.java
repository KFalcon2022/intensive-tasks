package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array = {-1, 4, 56, 3, 87, 3, 32, 11, -56, 24, 2, 6, 4, 23, 1111, 1, 5, -1, 2};
        int[] array2 = {-1, 4, 56, 3, 8, 2};
        int[] array3 = {-1, 56, 4};

        System.out.println(Arrays.toString(sortByQuicksort(array)));
        System.out.println(Arrays.toString(sortByQuicksort(array2)));
        System.out.println(Arrays.toString(sortByQuicksort(array3)));
    }

    private static int[] sortByQuicksort(int[] array) {
        quickSort(array, 0, array.length - 1);

        return array;
    }

    private static int[] quickSort(int[] array, int left, int right) {
        if (right <= left) {
            return array;
        }

        int pivotPoint = getPivotPoint(array, left, right);

        int i = left;
        int j = right;

        while (i <= j) {

            while (array[i] < pivotPoint) {
                i++;
            }

            while (array[j] > pivotPoint) {
                j--;
            }

            if (i <= j) {
                int buffer = array[i];

                array[i] = array[j];
                array[j] = buffer;

                i++;
                j--;
            }
        }

        quickSort(array, left, i - 1);
        quickSort(array, i, right);

        return array;
    }

    public static int getPivotPoint(int[] array, int left, int right) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(array[i], min);
        }

        return (max + min) / 2;
    }
}