package com.walking.intensive.chapter4.task16;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = {4, 6, 12, 5, 4, 6, -1, -10};

        int[] result = sortBySelection(array);
        for (int num : result)
            System.out.print(num + " ");
    }

    private static int[] sortBySelection(int[] array) {
        int tmp; // tmp - переменная для переинициализации
        int indexOfMinNumber;

        for (int i = 0; i < array.length; i++) {
            indexOfMinNumber = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[indexOfMinNumber] > array[j]) {
                    indexOfMinNumber = j;       // запоминаем индекс переменной, где на данный момент содержится минимальное значение
                }
            }

            tmp = array[i];
            array[i] = array[indexOfMinNumber];
            array[indexOfMinNumber] = tmp;

        }

        return array;
    }
}