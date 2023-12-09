package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(doBubbleSort(array)));
    }

    public static int[] doBubbleSort(int[] array) {

        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int maxValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = maxValue;
                }
            }
        }

        return array;
    }
}