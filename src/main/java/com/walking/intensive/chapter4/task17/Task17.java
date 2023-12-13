package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {

        int[] arr = {1, 90, 34, 12, 0, -1, 122, 45, 17};

        System.out.println(Arrays.toString(sortByBubble(arr)));
    }

    private static int[] sortByBubble(int[] array) {

        boolean continueSorting = true;

        while (continueSorting) {

            continueSorting = false;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    continueSorting = true;
                }
            }
        }
        return array;
    }
}