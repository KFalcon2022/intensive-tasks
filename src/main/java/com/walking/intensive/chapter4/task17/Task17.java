package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 2, 1, 0, -1, 46};
        System.out.println(Arrays.toString(sortByBubble(array)));

    }

    private static int[] sortByBubble(int[] array) {
        int minValue;
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    minValue = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = minValue;
                    counter++;
                }
            }
            if (counter == 0) {
                break;
            }
        }
        return array;
    }
}
