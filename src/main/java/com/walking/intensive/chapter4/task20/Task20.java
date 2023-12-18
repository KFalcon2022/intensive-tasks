package com.walking.intensive.chapter4.task20;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Pyramid-Sort.html">Пирамидальная сортировка</a>
 */
public class Task20 {
    public static void main(String[] args) {
        int[] array = {7, 73, 38, 3, 8, 80, 5, 1, 23};

        System.out.println(Arrays.toString(sortByPyramid(array)));
}

    private static int[] sortByPyramid(int[] array) {
        return getPyramidSortedArray(array, array.length);
    }

    static int[] getPyramidSortedArray(int[] array, int arrayLength) {
        if (arrayLength <= 1) {
            return array;
        }

        if(isSorted(array, arrayLength)){
            return array;
        }

        while (isNotHeap(array, arrayLength)) {

            for (int i = 0; i < arrayLength / 2; i++) {
                int firstDescendantIndex = 2 * i + 1;
                int secondDescendantIndex = 2 * i + 2;

                if (firstDescendantIndex < arrayLength &&
                        secondDescendantIndex >= arrayLength &&
                        array[i] < array[firstDescendantIndex]) {

                    swapElements(array, i, firstDescendantIndex);
                }

                if (secondDescendantIndex < arrayLength &&
                        array[i] < Math.max(array[firstDescendantIndex], array[secondDescendantIndex])) {

                        if (array[firstDescendantIndex] >= array[secondDescendantIndex]) {
                            swapElements(array, i, firstDescendantIndex);
                        } else {
                            swapElements(array, i, secondDescendantIndex);
                        }
                }
            }
        }

        swapElements(array, 0, arrayLength - 1);

        return getPyramidSortedArray(array, arrayLength - 1);
    }

    static boolean isNotHeap(int[] array, int arrayLength) {

        for (int i = 0; i < arrayLength / 2; i++) {
            int firstDescendantIndex = 2 * i + 1;
            int secondDescendantIndex = 2 * i + 2;

            if (firstDescendantIndex < arrayLength && secondDescendantIndex >= arrayLength) {
                if (array[i] < array[firstDescendantIndex]) {
                    return true;
                }
            }

            if (secondDescendantIndex < arrayLength) {
                if (array[i] < Math.max(array[firstDescendantIndex], array[secondDescendantIndex])) {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean isSorted(int[] array, int arrayLength) {
        for (int i = 0; i < arrayLength - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    static void swapElements(int[] array, int firstElementIndex, int secondElementIndex) {
        int temp = array[firstElementIndex];
        array[firstElementIndex] = array[secondElementIndex];
        array[secondElementIndex] = temp;
    }
}