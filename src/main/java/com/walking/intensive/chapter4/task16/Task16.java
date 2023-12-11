package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] testArray = new int[20];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(selectionSort(testArray)));
    }

    static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValueIndex = getMinIndex(array, i);
            int minValue = array[minValueIndex];
            array[minValueIndex] = array[i];
            array[i] = minValue;
        }

        return array;
    }

    static int getMinIndex(int[] array, int firstIndex) {
        int minElement = array[firstIndex];
        int minIndex = firstIndex;

        for (int i = firstIndex; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}