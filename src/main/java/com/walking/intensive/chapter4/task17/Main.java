package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] initsArray = {23, 16, 7, -13, -1, -66, 2, 0, 0, 1, 1, -1};

        System.out.println(Arrays.toString(initsArray));
        bubbleSearch(initsArray);
        System.out.println(Arrays.toString(initsArray));
    }

    static void bubbleSearch(int[] array) {
        for (int i = array.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                int temp = array[j - 1];

                if (array[j - 1] > array[j]) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}