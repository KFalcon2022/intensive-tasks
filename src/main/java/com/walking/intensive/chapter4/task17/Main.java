package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[20];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(bubbleSort(testArray)));
    }

    static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int countSorted = 0;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temporaryValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporaryValue;
                    countSorted++;
                }
            }

            if (countSorted == 0) {
                break;
            }
        }

        return array;
    }
}