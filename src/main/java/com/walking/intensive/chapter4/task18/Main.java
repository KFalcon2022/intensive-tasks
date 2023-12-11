package com.walking.intensive.chapter4.task18;

public class Main {
    public static void main(String[] args) {
        shakerSort(new int[]{4, 8, 6, 5, 7, 9, 3, 45, 6, 7, 8, 9});
    }

    public static void shakerSort(int[] array) {

        int count = 0;
        int left = 0;
        int right = array.length - 1;

        for (int i = 0; i < array.length-1; i++) {

            for (int j = left; j < right; j++) {
                if (array[j] > array[j + 1]) {
                    int maxValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = maxValue;
                    count++;
                }
            }

            right--;

            for (int j = right; j > left; j--) {
                if (array[j] < array[j - 1]) {
                    int minValue = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = minValue;
                    count++;
                }
            }

            left++;

            if (count == 0 || left >= right) {
                break;
            }
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
