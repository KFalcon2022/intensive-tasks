package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array = {16, 12, 12, 28, 6, 28, -6, 1, 3, 38};
        System.out.println(Arrays.toString(sortByQuicksort(array)));
    }

    private static int[] sortByQuicksort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        quicksort(array, left, right);
        return array;
    }

    private static int middle(int[] array, int left, int right) {
        int middle = left + (right - left) / 2;
        int pivot = array[middle];
        swap(array, middle, right);
        int i = (left - 1);

        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, right);
        return i + 1;
    }

    private static void quicksort(int[] array, int left, int right) {
        if (left < right) {
            int middle = middle(array, left, right);
            quicksort(array, left, middle - 1);
            quicksort(array, middle + 1, right);
        }
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }


}