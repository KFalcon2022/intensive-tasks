package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 15, 8, 7, -2};
        System.out.println(Arrays.toString(sortByShaker(arr)));
    }

    private static int[] sortByShaker(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            for (int i = right; i > left; i--) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
            left++;

            for (int i = left; i < right; i++) {

                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;
        }

        return array;
    }
}