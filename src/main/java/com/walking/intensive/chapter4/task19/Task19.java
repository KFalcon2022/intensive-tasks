package com.walking.intensive.chapter4.task19;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        // Создание и инициализация массива
        int[] array = {10, 7, 8, 9, 1, 5, -100, 1000};
        // Вызов метода быстрой сортировки
        sortByQuicksort(array, 0, array.length - 1);
        // Вывод отсортированного массива
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // Метод быстрой сортировки
    private static void sortByQuicksort(int[] array, int begin, int end) {
        // Проверка условия для рекурсии
        if (begin < end) {
            // Вычисление индекса разделения
            int partitionIndex = partition(array, begin, end);
            // Рекурсивный вызов для левой части массива
            sortByQuicksort(array, begin, partitionIndex - 1);
            // Рекурсивный вызов для правой части массива
            sortByQuicksort(array, partitionIndex + 1, end);
        }
    }

    // Метод для разделения массива
    private static int partition(int[] array, int begin, int end) {
        // Нахождение минимального и максимального элементов в массиве
        int min = array[begin], max = array[begin];
        for (int i = begin + 1; i <= end; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        // Вычисление опорного элемента как среднее между max и min
        int pivot = (max + min) / 2;
        // Инициализация указателей
        int i = begin, j = end;
        // Цикл разделения
        while (i <= j) {
            // Перемещение указателей
            while (array[i] < pivot) i++;
            while (array[j] > pivot) j--;
            // Обмен элементов
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // Возвращение индекса разделения
        return i;
    }
}