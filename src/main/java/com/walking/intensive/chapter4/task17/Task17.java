package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        int[] array = new int[]{8, 2, 6, 8, 5, 35, 55, 6, 7, -1, 2, 2, 2, 3, -1, -7, 35, 0};

        System.out.println(Arrays.toString(sortByBubble(array)));
    }

    private static int[] sortByBubble(int[] array) {
        int buffer = 0;
        int counter;

        for (int i = 0; i < array.length; i++) {
            counter = 0;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                    counter++;
                }
            }

            if (counter == 0) {
                return array;
            }
        }

        return array;
    }
}