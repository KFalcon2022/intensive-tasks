package com.walking.intensive.chapter4.task18;

public class Main {
    public static void main(String[] args) {
        shakerSort(new int[]{1, 2, 3, 4, 6, 5, 7, 8, 9, 10});
    }

    public static void shakerSort(int[] array) {


        int left = 0;
        int right = array.length - 1;

        for (int i = 0; i < array.length - 1 || left >= right; i++) {
            int count = 0;

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

            if (count == 0) {
                break;
            }
        }
    }
}
