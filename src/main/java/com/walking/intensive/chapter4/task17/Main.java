package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 2, 0, 81};
        System.out.println(Arrays.toString(getBubbleSortedArray(array)));
    }

    static int[] getBubbleSortedArray(int[] array) {

        int count;
        int tempArrayLength = array.length;

        do {
            count = 0;

            for (int i = 0; i < tempArrayLength - 1; i++) {

                int temp = array[i];

                if (array[i + 1] < array[i]) {
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }

            tempArrayLength--;

        } while (count != 0);

        return array;
    }
}