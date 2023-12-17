package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array = {232, 1, 432, 55, 6, 7, 453, 12, 2,  9, 5};

        System.out.println(Arrays.toString(sortByQuicksort(array)));
    }

    public static int[] sortByQuicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
        return array;
    }

    private static void quicksort(int[] array, int left, int right) {
        if (left < right) {
            int pivotValue = findPivot(array, left, right);
            int partitionIndex = separation(array, left, right, pivotValue);

            quicksort(array, left, partitionIndex - 1);
            quicksort(array, partitionIndex, right);
        }
    }

    private static int findPivot(int[] array, int left, int right) {
        int max = array[left];
        int min = array[left];

        for (int i = left + 1; i <= right; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return (max + min) / 2;
    }

    private static int separation(int[] array, int left, int right, int pivotValue) {
        int i = left, j = right;

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

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
