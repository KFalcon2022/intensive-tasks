package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array = {95, 18, -17, 17, 55, 17, 16, 5, 48, 47, 65, 33, -95, 23, 6, 1};
        System.out.println(Arrays.toString(sortByQuicksort(array)));

    }

    private static int[] sortByQuicksort(int[] array) {
        getSortByQuicksort(array, 0, array.length - 1);
        return array;
    }

    private static void getSortByQuicksort(int[] array, int left, int right) {
        int i = left;
        int j = right;

        if (right - left <= 1) {
            if (array[i] > array[j]) {
                swapValues(array, left, right);
            }
            return;
        }

        int minValue = array[i];
        int maxValue = array[i];

        for (int k = i; k <= j; k++) {
            minValue = Math.min(minValue, array[k]);
            maxValue = Math.max(maxValue, array[k]);
        }

        int propElement = (minValue + maxValue) / 2;

        while (i <= j) {
            while (array[i] < propElement) {
                i++;
            }
            while (array[j] > propElement) {
                j--;
            }
            if (i <= j) {
                swapValues(array, i, j);
                i++;
                j--;
            }
        }

        if (left < j) {
            getSortByQuicksort(array, left, j);
        }
        if (i < right) {
            getSortByQuicksort(array, i, right);
        }
    }

    private static int[] swapValues(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}