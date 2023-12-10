package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {6, 7, 8, 9, 1, 2, 3, 4, 5, 14, 10, 19, 11, 18, 12, 17, 13, 16, 15};
        System.out.println(Arrays.toString(array));

        doQuicksort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void doQuicksort(int[] array, int leftIndex, int rightIndex) {

        if (leftIndex >= rightIndex) {
            return;
        }

        int maxValue = array[leftIndex];
        int minValue = array[leftIndex];

        for (int i = leftIndex; i <= rightIndex; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        int pivotValue = (maxValue + minValue) / 2;

        int i = leftIndex;
        int j = rightIndex;

        while (i <= j) {
            while (array[i] < pivotValue) {
                i++;
            }
            while (array[j] > pivotValue) {
                j--;
            }
            if (i <= j) {
                swapValues(array, i, j);
                i++;
                j--;
            }
        }
        if (leftIndex < j) {
            doQuicksort(array, leftIndex, j);
        }
        if (rightIndex > i) {
            doQuicksort(array, i, rightIndex);
        }
    }

    public static void swapValues(int[] array, int leftValueIndex, int rightValueIndex) {

        int tempValue = array[leftValueIndex];
        array[leftValueIndex] = array[rightValueIndex];
        array[rightValueIndex] = tempValue;
    }
}