package com.walking.intensive.chapter4.task20;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Pyramid-Sort.html">Пирамидальная сортировка</a>
 */
public class Task20 {
    public static void main(String[] args) {
        int[] testArray = {1, 29, 5, 62, 23, -8, 0, 14, 27, 12, 11, 8, 4, 8, 6};

        System.out.println(Arrays.toString(sortByPyramid(testArray)));
    }

    private static int[] sortByPyramid(int[] array) {
        sort(array, array.length);

        return array;
    }

    private static void sort(int[] array, int arrayLength) {
        if (arrayLength <= 1) {
            return;
        }

        int nodeElement = arrayLength / 2 - 1;

        for (int i = nodeElement; i >= 0; i--) {
            siftingHeap(array, i, arrayLength);
        }

        int lastIndex = arrayLength - 1;
        int temp = array[lastIndex];
        array[lastIndex] = array[0];
        array[0] = temp;

        sort(array, lastIndex);
    }

    private static void siftingHeap(int[] array, int nodeElement, int arrayLength) {
        int leftDescendant = nodeElement * 2 + 1;
        int rightDescendant = nodeElement * 2 + 2;
        int indexMaxValue = nodeElement;

        if (leftDescendant < arrayLength && array[leftDescendant] > array[indexMaxValue]) {
            indexMaxValue = leftDescendant;
        }

        if (rightDescendant < arrayLength && array[rightDescendant] > array[indexMaxValue]) {
            indexMaxValue = rightDescendant;
        }

        if (indexMaxValue != nodeElement) {
            int temp = array[nodeElement];
            array[nodeElement] = array[indexMaxValue];
            array[indexMaxValue] = temp;

            siftingHeap(array, indexMaxValue, arrayLength);
        }
    }
}