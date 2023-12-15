package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {

        int[] arr = {150, 2, 3, 3, 2, 1, -1, 12};
        System.out.println(Arrays.toString(sortByQuicksort(arr)));

    }

    private static int[] sortByQuicksort(int[] array) {

        int startIndex = 0;
        int endIndex = array.length - 1;
        sortingArray(array, startIndex, endIndex);
        return array;
    }

    private static void sortingArray(int[] array, int startIndex, int endIndex) {

        if (array.length < 2) {
            return;
        }

        if (startIndex >= endIndex) {
            return;
        }

        int minValue = array[startIndex];
        int maxValue = array[startIndex];

        for (int i = startIndex + 1; i <= endIndex; i++) {
            maxValue = Math.max(maxValue, array[i]);
            minValue = Math.min(minValue, array[i]);
        }

        int middleValue = (maxValue + minValue) / 2;

        int i = startIndex;
        int j = endIndex;

        while (i <= j) {

            while (array[i] < middleValue) {
                i++;
            }

            while (array[j] > middleValue) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (startIndex < j) sortingArray(array, startIndex, j);

        if (endIndex > i) sortingArray(array, i, endIndex);
    }
}

