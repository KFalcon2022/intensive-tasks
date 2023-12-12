package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[20];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(shakerSort(testArray)));
    }

    static int[] shakerSort(int[] array) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex < lastIndex) {
            boolean notSorted = true;

            for (int i = firstIndex; i < lastIndex; i++) {
                if (array[i] > array[i + 1]) {
                    int temporaryValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temporaryValue;
                    notSorted = false;
                }
            }

            lastIndex--;

            for (int i = lastIndex; i > firstIndex; i--) {
                if (array[i - 1] > array[i]) {
                    int temporaryValue = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temporaryValue;
                    notSorted = false;
                }
            }

            if (notSorted) {
                break;
            }

            firstIndex++;
        }

        return array;
    }
}