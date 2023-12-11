package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {6, 4, 3, 5, 1, 8, 1, 3, 0};

        System.out.println(Arrays.toString(getBubbleSortedArray(array, array.length)));
    }

    static int[] getBubbleSortedArray(int[] array, int arrayLength) {
        boolean isSorted = true;

        for (int i = 0; i < arrayLength - 1; i++) {
            int nextIndex = i + 1;

            if (array[i] > array[nextIndex]) {

                int temp = array[i];
                array[i] = array[nextIndex];
                array[nextIndex] = temp;

                isSorted = false;
            }
        }

        if (isSorted) {
            return array;
        }

        return getBubbleSortedArray(array, arrayLength - 1);
    }
}