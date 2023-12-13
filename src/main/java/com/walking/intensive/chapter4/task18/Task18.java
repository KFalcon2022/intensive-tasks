package com.walking.intensive.chapter4.task18;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">Сортировка шейкером</a>
 */
public class Task18 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        array = sortByShaker(array);

        // Вывод отсортированного массива
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static int[] sortByShaker(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;

            // Проход слева направо
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Обмен элементов
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            // Если обменов не было, массив уже отсортирован
            if (!swapped) break;

            // Предполагаем, что обменов не будет
            swapped = false;

            // Проход справа налево
            for (int i = n - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    // Обмен элементов
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

        } while (swapped); // Повторяем, пока есть обмены

        return array;
    }
}