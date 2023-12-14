package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 2};
        System.out.println(Arrays.toString(sortByQuicksort(arr, 0, arr.length - 1)));
    }

    private static int[] sortByQuicksort(int[] array, int left, int right) {
        if (array.length < 2 || left >= right) {
            return array;
        } else {
            int base = array[right];
            int i = left - 1;

            for (int j = left; j < right; j++) {
                if (array[j] <= base) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[i + 1];
            array[i + 1] = array[right];
            array[right] = temp;
            sortByQuicksort(array, left, i);
            sortByQuicksort(array, i + 1, right);
        }
        return array;
    }
}