package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {13, 8, 6, 1, 0, -8};
        System.out.println(Arrays.toString(getSortArrayByChoice(arr)));
    }

    static int[] getSortArrayByChoice(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int temp = array[i];

            for (int j = i; j < array.length; j++) {

                int minValueIndex = getMinValueIndex(array, j);

                if (array[minValueIndex] <= array[i]) {
                    array[i] = array[minValueIndex];
                    array[minValueIndex] = temp;
                }
            }
        }
        return array;
    }

    static int getMinValueIndex(int[] arr, int index) {

        int minValue = arr[index];
        int minValueIndex = 0;

        for (int i = index; i < arr.length; i++) {

            if (arr[i] <= minValue) {
                minValue = arr[i];
                minValueIndex = i;
            }

            index++;
        }
        return minValueIndex;
    }
}