package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {

        int[] array = {1, 8, 3, 9, 10, -50, 9, 105, 30};
        int[] array2 = {1, 8, 9, 10, 105};
        int[] array3 = {100, 50, 30, 10, 0, -20, -50};

        System.out.println(Arrays.toString(sortByShaker(array)));
        System.out.println(Arrays.toString(sortByShaker(array2)));
        System.out.println(Arrays.toString(sortByShaker(array3)));
    }

    private static int[] sortByShaker(int[] array) {
        boolean isSorted = false;

        for (int i = 0; !isSorted; i++) {
            int temp;
            isSorted = true;

            for (int j = i; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    isSorted = false;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            if (isSorted) {
                return array;
            }

            isSorted = true;

            for (int j = array.length - 1 - i; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    isSorted = false;
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        return array;
    }
}