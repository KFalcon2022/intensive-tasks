package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 5, 2, 3, 1, 2, 3, 10, 6, 8};

        System.out.println(Arrays.toString(getSelectionSortedArray(array)));
    }

    static int[] getSelectionSortedArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minValueIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minValueIndex]) {
                    minValueIndex = j;
                }
            }

            if (minValueIndex != i) {
                int temp = array[i];
                array[i] = array[minValueIndex];
                array[minValueIndex] = temp;
            }
        }

        return array;
    }
}