package com.walking.intensive.chapter4.task20;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Pyramid-Sort.html">Пирамидальная сортировка</a>
 */
public class Task20 {
    public static void main(String[] args) {
        int[] arr = {44, 22, 2, 3, 4, 15, 15, 122, 21, 1, 2, 3};
        System.out.println(Arrays.toString(sortByPyramid(arr)));
    }

    private static int[] sortByPyramid(int[] array) {
        heapSort(array);
        return array;
    }

    public static void heapSort(int[] array) {

        if (array.length == 0) {
            return;
        }

        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int length, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < length && array[left] > array[largest]) {
            largest = left;
        }

        if (right < length && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, length, largest);
        }
    }
}