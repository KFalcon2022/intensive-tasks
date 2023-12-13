package com.walking.intensive.chapter4.task16;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11}; // Пример массива
        array = sortBySelection(array);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static int[] sortBySelection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Обмен элементов
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}