package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        int[] array = {0, 5, 2, 1, 5, -1, 8, -2};
        System.out.println(Arrays.toString(sortByBubble(array)));
    }

    private static int[] sortByBubble(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            boolean isSort = false;
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int bubble = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = bubble;
                    isSort = true;
                }
            }
            if(!isSort) {
                return array;
            }
        }
        return array;
    }
}