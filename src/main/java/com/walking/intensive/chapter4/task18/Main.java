package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 4, 3};

        System.out.println(Arrays.toString(doCocktailSort(array)));
    }

    public static int[] doCocktailSort(int[] array) {


        for (int i = 0; i < Math.ceil((double) array.length / 2); i++) {

            int countSwap = 0;

            for (int j = i; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int maxValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = maxValue;
                    countSwap += 1;
                }
            }

            if (i != 0 && countSwap == 0) {
                break;
            }

            countSwap = 0;

            for (int j = array.length - 2 - i; j > i; j--) {

                if (array[j] < array[j - 1]) {
                    int minValue = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = minValue;
                    countSwap += 1;
                }
            }

            if (countSwap == 0) {
                break;
            }
        }

        return array;
    }
}