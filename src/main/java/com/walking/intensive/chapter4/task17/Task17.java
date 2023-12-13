package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {

        int[] arr = {1, 90, 34, 12, 134, 0, -1, 122, 45, 17};

        System.out.println(Arrays.toString(sortByBubble(arr)));
    }

    private static int[] sortByBubble(int[] array) {

        boolean continueSorting = true;
        int maxCheckedIndex = array.length -1;

        while (continueSorting) {

            continueSorting = false;

            for (int i = 0; i < maxCheckedIndex; i++) {

                if (array[i] > array[i + 1]) {

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    continueSorting = true;
                }
            }
            maxCheckedIndex--;
        }
        return array;
    }
}