package com.walking.intensive.chapter4.task20;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Pyramid-Sort.html">Пирамидальная сортировка</a>
 */
public class Task20 {
    public static void main(String[] args) {
        int[] array = {12, 1, 9, 5, 6, 19, 8,4};
        sortByPyramid(array);
    }

    private static void sortByPyramid(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            changePlace(array, 0, i);
            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int n, int i) {
        int maxElement = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[maxElement]) {
            maxElement = left;
        }

        if (right < n && array[right] > array[maxElement]) {
            maxElement = right;
        }

        if (maxElement != i) {
            changePlace(array, i, maxElement);
            heapify(array, n, maxElement);
        }
    }
    public static void changePlace(int[] array, int firstPlace, int SecondPlace) {
        int temp = array[firstPlace];
        array[firstPlace] = array[SecondPlace];
        array[SecondPlace] = temp;
    }

}