package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Класс Task19 реализует алгоритм быстрой сортировки (Quicksort).
 * Алгоритм использует рекурсивное разделение массива на подмассивы вокруг опорных элементов.
 * Опорный элемент выбирается как среднее между максимальным и минимальным элементами подмассива.
 * Включает специальную обработку для массивов длиной два.
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array = {10, 7, 8000, 9000, 1, 5, 11, 10};
        sortByQuicksort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Реализует алгоритм быстрой сортировки (Quicksort).
     * Рекурсивно разделяет массив на подмассивы, сортируя их вокруг опорных элементов.
     * Особое внимание уделяется массивам длиной два.
     *
     * @param array Массив, который необходимо отсортировать.
     * @param begin Начальный индекс подмассива для сортировки.
     * @param end Конечный индекс подмассива для сортировки.
     */
    private static void sortByQuicksort(int[] array, int begin, int end) {
        if (begin < end) {
            if (end - begin == 1) {
                if (array[begin] > array[end]) {
                    swap(array, begin, end);
                }
            } else {
                int partitionIndex = partition(array, begin, end);
                sortByQuicksort(array, begin, partitionIndex - 1);
                sortByQuicksort(array, partitionIndex, end); // Обновлено для включения partitionIndex
            }
        }
    }

    /**
     * Разделяет массив на две части вокруг опорного элемента.
     * Элементы, меньшие опорного, перемещаются в левую часть,
     * а элементы, большие или равные опорному - в правую.
     * Опорный элемент выбирается как среднее значение между максимальным и минимальным элементами подмассива.
     *
     * @param array Массив для сортировки.
     * @param begin Начальный индекс подмассива.
     * @param end Конечный индекс подмассива.
     * @return Индекс, разделяющий массив на две части.
     */
    private static int partition(int[] array, int begin, int end) {
        int min = array[begin], max = array[begin];
        for (int i = begin + 1; i <= end; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int pivot = (max + min) / 2;

        int i = begin, j = end;
        while (i <= j) {
            while (array[i] < pivot) i++;
            while (array[j] > pivot) j--;
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    /**
     * Меняет местами два элемента в массиве.
     *
     * @param array Массив, в котором происходит обмен.
     * @param i Индекс первого элемента для обмена.
     * @param j Индекс второго элемента для обмена.
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}