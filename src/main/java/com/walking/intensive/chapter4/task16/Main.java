package com.walking.intensive.chapter4.task16;

public class Main {
    public static void main(String[] args) {
        int[] array = {24, 17, 55, -19, 2008, 0, 2020, 67, 55};
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i + " ");
    }
}
    private static void bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // if no two elements were swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }
}