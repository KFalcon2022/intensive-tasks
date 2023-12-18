package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 4, 2, 3, -1, 100};
        System.out.println(Arrays.toString(sortBySelection(array)));

    }

    private static int[] sortBySelection(int[] array) {
        int counter = 0;
        while (counter < array.length) {
            int temp;
            for (int i = counter; i < array.length; i++) {
                if (array[i] < array[counter]) {
                    temp = array[counter];
                    array[counter] = array[i];
                    array[i] = temp;
                }
            }
            counter++;
        }

        return array;
    }
}