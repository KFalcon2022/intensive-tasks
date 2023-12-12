package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] initsArray = {10, 2, 11, 3, 1, 7, 24, 9};

        System.out.println(Arrays.toString(initsArray));
        sortSelection(initsArray);
        System.out.println(Arrays.toString(initsArray));
    }

    static void sortSelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = getMinIndex(array, i);
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    static int getMinIndex(int[] array, int index) {
        int min = Integer.MAX_VALUE;

        for (int i = index; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
}