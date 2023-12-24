package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = {4, 6, 12, 5, 4, 6, -1, -10};

        System.out.println(Arrays.toString(sortBySelection(array)));
    }

    private static int[] sortBySelection(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int indexMinNumber = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[indexMinNumber] > array[j]) {
                    indexMinNumber = j;       // запоминаем индекс переменной, где на данный момент содержится минимальное значение
                }
            }

            int tmp = array[i];
            array[i] = array[indexMinNumber];
            array[indexMinNumber] = tmp;

        }

        return array;
    }
}