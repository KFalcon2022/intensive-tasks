package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {13, 8, 6, 1, 0, -8};
        System.out.println(Arrays.toString(bubleSort(arr)));
    }

    static int[] bubleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int nextValue = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = nextValue;
                }
            }
        }

        return array;
    }
}