package com.walking.intensive.chapter4.task19;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    // Основной метод, который инициирует процесс сортировки массива
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5, -100, 1000};
        sortByQuicksort(array, 0, array.length - 1);
        // Вывод отсортированного массива
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // Метод, реализующий алгоритм быстрой сортировки
    private static void sortByQuicksort(int[] array, int begin, int end) {
        if (begin < end) {
            // Вычисление индекса разделения
            int partitionIndex = partition(array, begin, end);

            // Рекурсивный вызов сортировки для подмассивов
            sortByQuicksort(array, begin, partitionIndex - 1);
            sortByQuicksort(array, partitionIndex + 1, end);
        }
    }

    // Метод для разделения массива
    private static int partition(int[] array, int begin, int end) {
        // Выбор опорного элемента
        int pivot = array[end];
        int i = (begin - 1);

        // Перемещение элементов меньше опорного влево, больше - вправо
        for (int j = begin; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                // Обмен элементов
                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        // Помещение опорного элемента на правильное место
        int swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;

        // Возвращение индекса опорного элемента
        return i + 1;
    }
}