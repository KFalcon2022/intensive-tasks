package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] initsArray = {4, 3, 2, 1, -1, -2, 56, 3, 14, 654, -23, -21, -1, 325, 2};

        System.out.println(Arrays.toString(initsArray));
        bubbleSort(initsArray);
        System.out.println(Arrays.toString(initsArray));
    }

    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isElementRearrangement = false;

            for (int j = 1; j < array.length - i; j++) {
                int temp = array[j - 1];

                if (array[j - 1] > array[j]) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                    isElementRearrangement = true;
                }
            }

            if (!isElementRearrangement) {
                break;
            }
        }
    }
}