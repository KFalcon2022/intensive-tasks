package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 3, 2, 5, 4};
        System.out.println(Arrays.toString(doSelectionSort(array)));

    }

    public static int[] doSelectionSort(int[] array) {

        int length = array.length;

        for (int i = 0; i < length; i++) {
            int minValue = array[i];
            int minValueIndex = i;
            for (int j = i; j < length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minValueIndex = j;
                }
            }
            array[minValueIndex] = array[i];
            array[i] = minValue;
        }

        return array;
    }
}