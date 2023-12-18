package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        int[] array = {9, 5, 8, 9, 12, 1, 36, 17, -5, 19, 180, 77, 0, 17, 143, 33};
        System.out.println(Arrays.toString(sortByShaker(array)));
    }

    private static int[] sortByShaker(int[] array) {
        int left = 0;
        int right = array.length - 1;
        boolean isChanged;
        do {
            isChanged = false;
            for (int i = right; i > left; i--) {
                if (array[i] <= array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isChanged = true;
                }
            }
            right--;

            for (int i = left; i <= right; i++) {
                if (array[i] >= array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isChanged = true;
                }
            }
            left++;
        }
        while (left < right || isChanged);

        return array;
    }
}