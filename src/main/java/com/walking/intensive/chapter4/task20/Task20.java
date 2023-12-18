package com.walking.intensive.chapter4.task20;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Pyramid-Sort.html">Пирамидальная сортировка</a>
 */
public class Task20 {
    public static void main(String[] args) {
        int[] array = {16, 12, 12, 28, 6, 28, -6, 1, 3, 38};
        System.out.println(Arrays.toString(sortByPyramid(array)));
    }

    private static int[] sortByPyramid(int[] array) {
        int length = array.length;
        for (int layer = length / 2 - 1; layer >= 0; layer--) {
            heapify(array, length, layer);
        }
        for (int layer = length - 1; layer >= 0; layer--) {
            swap(array, 0, layer);
            heapify(array, layer, 0);
        }

        return array;
    }

    static void heapify(int[] array, int length, int layer) {
        int max = layer;
        int left = 2 * layer + 1;
        int right = 2 * layer + 2;

        if (left < length && array[left] > array[max]) {
            max = left;
        }
        if (right < length && array[right] > array[max]) {
            max = right;
        }
        if (max != layer) {
            swap(array, layer, max);
            heapify(array, length, max);
        }
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }
}