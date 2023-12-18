package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 5, -1, 0, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(sortByBubble(array)));
    }

    private static int[] sortByBubble(int[] array) {
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needSort = true;
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }
}