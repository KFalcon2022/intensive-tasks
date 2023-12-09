package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {5, 1, 2, 3, 4};

        System.out.println(Arrays.toString(doBubbleSort(array)));
    }

    public static int[] doBubbleSort(int[] array) {

        int length = array.length;

        for (int i = 0; i < length; i++) {

            int countMoves = 0;

            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int maxValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = maxValue;
                    countMoves += 1;
                }
            }
            if (countMoves == 0) {
                break;
            }
        }

        return array;
    }
}