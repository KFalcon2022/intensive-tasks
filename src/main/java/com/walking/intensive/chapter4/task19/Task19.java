package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array = {232, 1, 432, 55, 6, 7, 453, 12, 2, 9, 5};

        System.out.println(Arrays.toString(sortByQuicksort(array)));
    }

    public static int[] sortByQuicksort(int[] array) {
        if (array != null && array.length > 1) {
            quickSort(array, 0, array.length - 1);
        }
        return array;
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = separation(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private static int separation(int[] array, int left, int right) {
        int min = array[left];
        int max = array[right];
        for (int i = left; i <= right; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        int pivotValue = (min + max) / 2;

        int i = left;
        int j = right;
        while (i <= j) {
            while (array[i] < pivotValue) i++;
            while (array[j] > pivotValue) j--;
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}