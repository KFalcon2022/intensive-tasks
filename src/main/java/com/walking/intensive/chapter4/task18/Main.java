package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 10, 7, 1, 4, 16, 3, 0, 8, 12, 17, 6};

        System.out.println(Arrays.toString(getShakerSortedArray(array, array.length, 0)));
    }

    static int[] getShakerSortedArray(int[] array, int arrayLength, int lastIndexForMinValueCheck) {
        boolean isSorted = true;

        for (int i = lastIndexForMinValueCheck; i < arrayLength - 1; i++) {
            int nextIndex = i + 1;

            if (array[i] > array[nextIndex]) {
                int temp = array[i];
                array[i] = array[nextIndex];
                array[nextIndex] = temp;

                isSorted = false;
            }
        }

        for (int i = arrayLength - 2; i > lastIndexForMinValueCheck; i--) {
            int previousIndex = i - 1;

            if (array[i] < array[previousIndex]) {
                int temp = array[i];
                array[i] = array[previousIndex];
                array[previousIndex] = temp;

                isSorted = false;
            }
        }

        if (isSorted) {
            return array;
        }

        return getShakerSortedArray(array, arrayLength - 1, lastIndexForMinValueCheck + 1);
    }
}