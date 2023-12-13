package com.walking.intensive.chapter4.task19;

public class Main {
    public static void main(String[] args) {
        int[] array = {17, 14, 1};
        quickSort(array, 0, array.length - 1);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int center = separation(array, left, right);

            quickSort(array, left, center - 1);
            quickSort(array, center + 1, right);
        }
    }

    private static int separation(int[] array, int left, int right) {

        int middle = left + (right - left) / 2;
        int separator = (findMaxValue(array, left, right) + findMinValue(array, left, right)) / 2;

        changePlace(array, middle, right);

        int i = (left - 1);
        for (int j = left; j < right; j++) {
            if (array[j] < separator) {
                i++;
                changePlace(array, i, j);
            }
        }
        changePlace(array, i + 1, right);

        return i + 1;
    }

    public static void changePlace(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int findMaxValue(int[] array, int left, int right) {
        int maxValue = array[left];
        for (int j = left; j < right; j++) {
            if (array[j] > maxValue) {
                maxValue = array[j];
            }
        }

        return maxValue;
    }

    public static int findMinValue(int[] array, int left, int right) {
        int minValue = array[left];
        for (int j = left; j < right; j++) {
            if (array[j] < minValue) {
                minValue = array[j];
            }
        }

        return minValue;
    }
}