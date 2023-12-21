package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        int[] testArray = {1, 29, 5, 62, 23, -8, 0, 14, 27, 12, 11, 8, 4, 8, 6};
        System.out.println(Arrays.toString(sortByQuicksort(testArray)));
    }

    private static int[] sortByQuicksort(int[] array) {
        int indexLeftElement = 0;
        int indexRightElement = array.length - 1;

        sort(array, indexLeftElement, indexRightElement);

        return array;
    }

    private static void sort(int[] array, int indexLeftElement, int indexRightElement) {
        if (indexRightElement - indexLeftElement < 1) {
            return;
        }

        int i = indexLeftElement;
        int j = indexRightElement;
        int supportElement = getSupportElement(array, i, j);

        while (i <= j) {
            while (array[i] < supportElement) {
                i++;
            }

            while (array[j] > supportElement) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j--;
                i++;
            }
        }

        sort(array, indexLeftElement, j);
        sort(array, i, indexRightElement);
    }

    private static int getSupportElement(int[] array, int indexLeftElement, int indexRightElement) {
        int maxValue = array[indexRightElement];
        int minValue = array[indexRightElement];

        for (int i = indexLeftElement; i < indexRightElement; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }

            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return (maxValue + minValue) / 2;
    }
}