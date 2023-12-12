package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {4, 3, 2, 1, 8, 7, 6, 5};

        System.out.println(Arrays.toString(doCocktailSort(array)));
    }

    public static int[] doCocktailSort(int[] array) {

        for (int i = 0; i < Math.ceil((double) array.length / 2); i++) {

            int countMovesRight = 0;
            int countMovesLeft = 0;

            for (int j = i; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int maxValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = maxValue;
                    countMovesRight += 1;
                }
            }

            if (i != 0 && countMovesLeft == 0 && countMovesRight == 0) {
                break;
            }

            for (int j = array.length - 1 - i; j > i; j--) {

                if (array[j] < array[j - 1]) {
                    int minValue = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = minValue;
                    countMovesLeft += 1;
                }
            }

            if (countMovesLeft == 0 && countMovesRight == 0) {
                break;
            }
        }

        return array;
    }
}