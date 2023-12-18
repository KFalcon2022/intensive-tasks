package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {13, 8, 6, 1, 0, -8, -9, 180, 75};
        System.out.println(Arrays.toString(getSortArrayByChoice(arr)));
    }

    static int[] getSortArrayByChoice(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i; j <= array.length - 1; j++) {

                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}