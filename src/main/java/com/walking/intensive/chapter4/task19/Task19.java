package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array = {12, 56, 2, 73, 8, 4, 9, 10, 2, 91, 56};

        System.out.println(Arrays.toString(sortByQuicksort(array)));
    }

    static int[] sortByQuicksort(int[] array) {
        return getQuickSortedArray(array, 0, array.length - 1);
    }

    static int[] getQuickSortedArray(int[] array, int firstSortingIndex, int lastSortingIndex) {
        if (firstSortingIndex - lastSortingIndex >= 0) {
            return array;
        }

        if (lastSortingIndex - firstSortingIndex == 1) {
            if (array[firstSortingIndex] > array[lastSortingIndex]) {
                swapElements(array, firstSortingIndex, lastSortingIndex);
            }

            return array;
        }

        if (isSorted(array, firstSortingIndex, lastSortingIndex)) {
            return array;
        }

        int pivotValue = getPivotValue(array, firstSortingIndex, lastSortingIndex);

        int i = firstSortingIndex;
        int j = lastSortingIndex;
        while (i < j) {
            if (array[i] > pivotValue &&
                    array[j] <= pivotValue) {
                swapElements(array, i, j);
                i++;
                j--;
            }

            if (array[i] >= pivotValue && array[j] > pivotValue) {
                j--;
            }

            if (array[i] <= pivotValue && array[j] <= pivotValue) {
                i++;
            }

            if (array[i] <= pivotValue && array[j] > pivotValue) {
                i++;
                j--;
            }
        }

        int pivotIndex = getPivotIndex(array, firstSortingIndex, lastSortingIndex, pivotValue);
        getQuickSortedArray(array, firstSortingIndex, pivotIndex);
        getQuickSortedArray(array, pivotIndex + 1, lastSortingIndex);

        return array;
    }

    static int getPivotValue(int[] array, int firstSortingIndex, int lastSortingIndex) {
        int minValue = array[firstSortingIndex];
        int maxValue = array[firstSortingIndex];

        for (int i = firstSortingIndex + 1; i <= lastSortingIndex; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return (minValue + maxValue) / 2;
    }

    static int getPivotIndex(int[] array, int firstSortingIndex, int lastSortingIndex, int pivotValue) {
        int pivotIndex = firstSortingIndex - 1;

        for (int i = firstSortingIndex; i <= lastSortingIndex; i++) {
            if (array[i] <= pivotValue) {
                pivotIndex++;
            }
        }

        return pivotIndex;
    }

    static void swapElements(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    static boolean isSorted(int[] array, int firstSortingIndex, int lastSortingIndex) {
        for (int i = firstSortingIndex; i < lastSortingIndex; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}