package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 2, 4, 2, -1, 3, 2, -34, 25, 77, -13, 235, -2143, 534, 1346, -453, 1, 35, 678, 3, 7, -1};
        System.out.println(Arrays.toString(sortByShaker(arrayNumbers)));
    }

    private static int[] sortByShaker(int[] array) {
        int right = array.length;
        int left = 0;
        int elementRearrangement = 0;

        for (int i = left; i < right; i++) {
            for (int j = left + 1; j < right; j++) {
                int temp = array[j - 1];

                if (array[j - 1] > array[j]) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                    elementRearrangement++;
                }
            }
            right--;

            for (int j = right; j > left; j--) {
                int temp = array[j];

                if(array[j] < array[j - 1]){
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    elementRearrangement++;
                }
            }
            left++;

            if(elementRearrangement == 0){
                break;
            }

            elementRearrangement = 0;
        }

        return array;
    }
}