package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        int [] testArray= {5,-2,8,13,12,12,-10,0,14,3};
        System.out.println(Arrays.toString(sortByBubble(testArray)));
    }

    private static int[] sortByBubble(int[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean change = false;

            for (int j = 0; j < array.length-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    change = true;
                }
            }

            if (!change) {
                break;
            }
        }

        return array;
    }
}