package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {5, 2, 3, 4, 1};
        cocktailSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void cocktailSort(int[] array) {

        for (int i = 0; i < Math.ceil((double) array.length / 2); i++) {

            boolean isSorted = true;

            for (int j = i; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int maxValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = maxValue;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }

            isSorted = true;
            for (int j = array.length - 2 - i; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int minValue = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = minValue;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }
}