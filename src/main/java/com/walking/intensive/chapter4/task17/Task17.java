package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByBubble(new int[]{4, 2, 1, 6, 8})));
    }

    private static int[] sortByBubble(int[] array) {
        if (array.length < 2) {
            return array;
        }

        boolean hasTransposition = true;
        int offset = 1;

        while (hasTransposition) {
            hasTransposition = false;

            for (int i = 0; i < array.length - offset; i++) {
                if (array[i] > array[i + 1]) {
                    hasTransposition = true;

                    int buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }

            offset++;
        }

        return array;
    }
}