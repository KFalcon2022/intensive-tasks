package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        cocktailSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void cocktailSort(int[] array) {

        boolean isSorted = false;

        for (int i = 0; i < Math.ceil((double) array.length / 2) && !isSorted; i++) {
            int countMoves = 0;

            for (int j = i; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int maxValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = maxValue;
                    countMoves += 1;
                }
            }
            if (countMoves == 0) {
                isSorted = true;
            }

            countMoves = 0;
            for (int j = array.length - 2 - i; j > i && !isSorted; j--) {
                if (array[j] < array[j - 1]) {
                    int minValue = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = minValue;
                    countMoves += 1;
                }
            }
            if (countMoves == 0) {
                isSorted = true;
            }
        }
    }
}