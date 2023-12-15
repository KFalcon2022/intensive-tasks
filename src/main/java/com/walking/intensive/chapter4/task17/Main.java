package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] initsArray = {1, 5, 4, -7, -1, 3, 2, 0};

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