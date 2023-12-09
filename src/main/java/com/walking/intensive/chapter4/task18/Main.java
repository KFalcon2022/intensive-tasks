package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 6, 5};

        System.out.println(Arrays.toString(doCocktailSort(array)));
    }

    public static int[] doCocktailSort(int[] array) {

        int length = array.length;

        for (int i = 0; i < length; i++) {
            int countMovesRight = 0;
            int countMovesLeft = 0;
            for (int j = i; j < length - 1; j++) {
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
            for (int k = length - 1 - i; k > 0; k--) {
                if (array[k] < array[k - 1]) {
                    int minValue = array[k];
                    array[k] = array[k - 1];
                    array[k - 1] = minValue;
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