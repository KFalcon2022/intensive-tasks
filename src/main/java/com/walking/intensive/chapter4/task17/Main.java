package com.walking.intensive.chapter4.task17;

public class Main {
    public static void main(String[] args) {
        bubbleSort(new int[]{1, 2, 3, 4, 1, 7});
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int count = 0;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int max = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = max;
                    count++;
                }
            }

            if (count == 0) {
                break;
            }
        }
        for (int j : array) {
            System.out.print(j);
        }
    }
}