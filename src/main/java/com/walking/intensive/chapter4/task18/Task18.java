package com.walking.intensive.chapter4.task18;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */

public class Task18 {
    public static void main(String[] args) {
        int[] array = {-1, 3, 6, 4, 5, 5, 20, -20, -1};

        int[] result = sortByShaker(array);
        for (int num : result)
            System.out.print(num + " ");
    }

    private static int[] sortByShaker(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int tmp;

        while (left != right) {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                }
            }
            left++;

        }

        return array;
    }
}