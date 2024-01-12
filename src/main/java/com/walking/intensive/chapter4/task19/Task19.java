package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array = {10, 1, -1, 3, 2, 5, 8, -45, 59, -56, 26, 73, 89};
        System.out.println(Arrays.toString(sortByQuicksort(array)));
    }

    public static int[] sortByQuicksort(int[] unsortedArray) {

        quickSort(unsortedArray, 0, unsortedArray.length - 1);

        return unsortedArray;
    }

    public static void quickSort(int[] array, int left, int right) {

        if ((right - left) == 0) {
            return;
        }

        if ((right - left) == 1) {
            if (array[left] > array[right]) {
                swap(array, left, right);
                return;
            }
            return;
        }

        int divideIndex = partition(array, left, right);

        quickSort(array, left, divideIndex - 1);
        quickSort(array, divideIndex, right);
    }


    public static int partition(int[] array, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;
        int pivot = getPivot(array, leftIndex, rightIndex);

        while (leftIndex < rightIndex) {

            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(array, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int getPivot(int[] array, int left, int right) {
        int tmpMax = Integer.MIN_VALUE;
        int tmpMin = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {
            tmpMax = Math.max(tmpMax, array[i]);
            tmpMin = Math.min(tmpMin, array[i]);
        }
        return (tmpMax + tmpMin) / 2;
    }
}
