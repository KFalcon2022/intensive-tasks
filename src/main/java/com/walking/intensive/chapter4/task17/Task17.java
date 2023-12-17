package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        int[] inputArr = {5, 10, 1, 7, 3, 6, 20, 45, 2, 11, 4};
        System.out.println(Arrays.toString(sortByBubble(inputArr)));
    }

    private static int[] sortByBubble(int[] array) {
        boolean sort = false;
        int temp;

        while (!sort) {
            sort = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sort = false;
                }
            }
        }
        return array;
    }
}