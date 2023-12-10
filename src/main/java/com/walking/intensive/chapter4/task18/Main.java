package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {-2, 4, 6, 2, 9, 2, 0, 596, 1, 0, 1, 1, 1};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortArrayShaker(array)));
    }

    static int[] sortArrayShaker(int[] array) {
        int first = 0, last = array.length - 1; // Задаем границы неотсортированного массива

        for (int i = first; i < last; i++) {
            boolean isSorted = false;

            for (int j = first; j < last; j++) { // Делаем пузырьковую сортировку от первого элемента до последнего
                if (array[j] > array[j + 1]) {
                    int temp = array[j];

                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted) { // Если массив не сортировался, значит он отсортирован, возвращаем массив

                return array;
            }
            last--; // Если еще есть что сортировать, делаем несортированный массив меньше на последний (максимальный) элемент

            for (int j = last; j > first; j--) { // Теперь от последнего неотсортированного элемента двигаемся до первого
                if (array[j] < array[j - 1]) {
                    int temp = array[j];

                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted) { // Если массив на этом шаге не сортировался, значит мы добились цели

                return array;
            }
            first++; // Если есть что сортировать, сокращаем несортированный массив на первый (теперь минимальный) символ и начинаем с нового первого элемента
        }

        return array;
    }
}