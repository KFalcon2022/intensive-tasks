package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        int[] array = {0, 3, 1, 2, 35, -5, -73, 10};
        System.out.println(Arrays.toString(sortByShaker(array)));

    }

    private static int[] sortByShaker(int[] array) {
        int minLeft;
        int minRight;

        for (int k = 0; k < array.length; k++) {
            int counter = 0;

            for (int i = k; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    minLeft = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = minLeft;
                    counter++;
                }
            }

            for (int j = (array.length - 1) - k; j >= 1; j--) {

                if (array[j] < array[j - 1]) {
                    minRight = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = minRight;
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
