package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        int[] arrayNumbers = {9, 8, 7, 6, 5, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sortByShaker(arrayNumbers)));
    }

    private static int[] sortByShaker(int[] array) {
        int right = array.length;
        int left = 0;

        for (int i = left; i < right; i++) {
            boolean isElementRearrangement = false;
            boolean isElementRearrangementSecond = false;

            for (int j = left + 1; j < right; j++) {
                int temp = array[j - 1];

                if (array[j - 1] > array[j]) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                    isElementRearrangement = true;
                }
            }
            right--;

            for (int j = right; j > left; j--) {
                int temp = array[j];

                if (array[j] < array[j - 1]) {
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isElementRearrangementSecond = true;
                }
            }
            left++;

            if (!isElementRearrangement && !isElementRearrangementSecond){
                break;
            }
        }

        return array;
    }
}