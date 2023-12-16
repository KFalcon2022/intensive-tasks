package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {

        int[] array = {-5, 8, 10, 125, -52, 0, 32, 28, 0, 36, -8, 5, 78, 25};
        int[] array1 = new int[0];

        System.out.println(Arrays.toString(sortByQuicksort(array)));
        System.out.println(Arrays.toString(sortByQuicksort(array1)));
    }

    private static int[] sortByQuicksort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    private static int[] sort(int[] array, int min, int max) {
        if (array.length == 0) {
            return array;
        }

        int middleElement = min + (max - min) / 2;
        int valueMiddleElement = array[middleElement];
        int i = min;
        int j = max;

        while (i <= j) {
            while (array[i] < valueMiddleElement) i++;
            while (array[j] > valueMiddleElement) j--;
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (min < j) {
            sort(array, min, j);
        }

        if (max > i) {
            sort(array, i, max);
        }

        return array;
    }
}