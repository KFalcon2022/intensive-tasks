package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByShaker(new int[]{44, 55, 12, 42, 94, 18, 6, 67})));
    }

    private static int[] sortByShaker(int[] array) {
        if (array.length < 2) {
            return array;
        }

        boolean hasTransposition = true;

        int offsetStart = 0;
        int offsetEnd = 1;

        while (hasTransposition) {
            hasTransposition = false;

            for (int i = offsetStart; i < array.length - offsetEnd; i++) {
                if (array[i] > array[i + 1]) {
                    hasTransposition = true;

                    int buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
            offsetEnd++;

            for (int i = array.length - offsetEnd; i > offsetStart; i--) {
                if (array[i - 1] > array[i]) {
                    hasTransposition = true;

                    int buffer = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buffer;
                }
            }
            offsetStart++;
        }

        return array;
    }
}