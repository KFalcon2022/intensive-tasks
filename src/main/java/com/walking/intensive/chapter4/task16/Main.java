package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {5,4,1,2,3};
        System.out.println(Arrays.toString(doSelectionSort(array)));
    }

    public static int[] doSelectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int minValue = array[i];
            int minValueIndex = i;

            for (int j = i; j < array.length; j++) {

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