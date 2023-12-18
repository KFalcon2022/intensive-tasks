package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 2, 0, 81, -18, 0, 33, 17};
        System.out.println(Arrays.toString(getBubbleSortedArray(array)));
    }

    static int[] getBubbleSortedArray(int[] array) {

        boolean count = true;
        int tempArrayLength = array.length;

        while (count) {
            count = false;

            for (int i = 0; i < tempArrayLength - 1; i++) {

                int temp = array[i];

                if (array[i + 1] < array[i]) {
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count = true;
                }
            }
            tempArrayLength--;
        }
        return array;
    }
}