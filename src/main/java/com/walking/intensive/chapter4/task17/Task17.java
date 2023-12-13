package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {

    }

    private static int[] sortByBubble(int[] array) {
        boolean isSorted = false;
        int buffer;

        while (!isSorted) {
            for (int i = array.length - 1; i > 0; i--) {
                int counter = 0;
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        buffer = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = buffer;
                        counter++;
                    }
                }
                if (counter == 0) {
                    isSorted = true;
                    break;
                }
            }
        }

        return array;
    }
}