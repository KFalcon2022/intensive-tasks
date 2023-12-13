package com.walking.intensive.chapter4.task16;

public class Main {
    public static void main(String[] args) {
        sortArray(new int[]{1, 3, 7, 6, 7, 2, 8});
    }

    public static void sortArray(int[] unSortedArray) {
        for (int i = 0; i < unSortedArray.length - 1; i++) {

            int minValue = unSortedArray[i];
            int minValueIndex = i;

            for (int j = i + 1; j < unSortedArray.length; j++) {
                if (unSortedArray[j] < minValue) {
                    minValueIndex = j;
                    minValue = unSortedArray[j];
                }
            }

            unSortedArray[minValueIndex] = unSortedArray[i];
            unSortedArray[i] = minValue;
            System.out.print(unSortedArray[i]);
        }
    }
}