package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[30];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 1000);
        }

        System.out.println(Arrays.toString(testArray));
        quickSort(testArray, 0, testArray.length - 1);
        System.out.println(Arrays.toString(testArray));
    }

    static void quickSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }

        int i = leftIndex;
        int j = rightIndex;
        int pivotValue = getPivotValue(array, leftIndex, rightIndex);

        while (i <= j) {
            while (array[i] < pivotValue) {
                i++;
            }

            while (array[j] > pivotValue) {
                j--;
            }

            if (i <= j) {
                swapElements(array, i, j);
                i++;
                j--;
            }
        }

        quickSort(array, leftIndex, j);
        quickSort(array, i, rightIndex);
    }

    static void swapElements(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    static int getPivotValue(int[] array, int leftIndex, int rightIndex) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = leftIndex; i <= rightIndex; i++) {
            min = (array[i] < min) ? array[i] : min;
            max = (array[i] > max) ? array[i] : max;
        }

        return (max + min) / 2;
    }
}