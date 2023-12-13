package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 122, 1112, 1, 2, 3, 4, 5, 122, 1112};
        System.out.println(Arrays.toString(sortByShaker(arr)));
    }

    private static int[] sortByShaker(int[] array) {

        boolean continueSorting = true;
        int maxCheckedIndex = array.length - 1;
        int minCheckedIndex = 0;
        int temp;

        while (continueSorting) {

            continueSorting = false;

            for (int i = minCheckedIndex; i < maxCheckedIndex; i++) {

                if (array[i] > array[i + 1]) {

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    continueSorting = true;
                }
            }
            maxCheckedIndex--;

            for (int j = maxCheckedIndex; j > minCheckedIndex; j--) {

                if (array[j] < array[j - 1]) {

                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    continueSorting = true;
                }
            }
            minCheckedIndex++;
        }
        return array;
    }
}

