package com.walking.intensive.chapter4.task16;

public class Main {
    public static void main(String[] args) {
        sortArray(new int[]{1, 3, 7, 6, 7, 2, 8});
    }

    public static void sortArray(int[] unSortedArray) {
        for (int i = 0; i < unSortedArray.length; i++) {

            int min = unSortedArray[i];
            int minPlace = i;

            for (int j = i + 1; j < unSortedArray.length; j++) {
                if (unSortedArray[j] < min) {
                    minPlace = j;
                    min = unSortedArray[j];
                }
            }

            unSortedArray[minPlace] = unSortedArray[i];
            unSortedArray[i] = min;
            System.out.print(unSortedArray[i]);
        }
    }
}