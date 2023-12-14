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

    private static int[] sortByQuicksort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        
        int index = separation(array, left, right);
        quickSort(array, left, index - 1);
        quickSort(array, index + 1, right);
    }

    private static int separation(int[] array, int left, int right) {
        for (int i = left; i < right; i++) {
            if (array[i] < array[right]) {
                swap(array, left, i);
                left++;
            }
        }

        swap(array, left, right);
        return left;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}