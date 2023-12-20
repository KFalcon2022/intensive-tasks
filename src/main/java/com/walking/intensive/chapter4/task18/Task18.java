package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        //int[] array = {5, 10, 7, 1, 4, 16, 3, 0, 8, 12, 17, 6};
        int[] array = {1, 2, 5, 3};

        System.out.println(Arrays.toString(sortByShaker(array)));
    }

    private static int[] sortByShaker(int[] array) {
        return getShakerSortedArray(array, array.length, 0);
    }

    static int[] getShakerSortedArray(int[] array, int arrayLength, int lastMinValueCheckIndex) {
        boolean isSortedMax = true;
        boolean isSortedMin = true;

        for (int i = lastMinValueCheckIndex; i < arrayLength - 1; i++) {
            int nextIndex = i + 1;

            if (array[i] > array[nextIndex]) {
                int temp = array[i];
                array[i] = array[nextIndex];
                array[nextIndex] = temp;

                isSortedMax = false;
            }
        }

        if (isSortedMax) {
            return array;
        }

        for (int i = arrayLength - 2; i > lastMinValueCheckIndex; i--) {
            int previousIndex = i - 1;

            if (array[i] < array[previousIndex]) {
                int temp = array[i];
                array[i] = array[previousIndex];
                array[previousIndex] = temp;

                isSortedMin = false;
            }
        }

        if (isSortedMin) {
            return array;
        }

        return getShakerSortedArray(array, arrayLength - 1, lastMinValueCheckIndex + 1);
    }
}
