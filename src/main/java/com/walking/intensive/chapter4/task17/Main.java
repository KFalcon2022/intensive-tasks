package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 6, 2, 9, 2, 1, 0, 1, 1, 1};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortArrayBubble(array)));
    }

    static int[] sortArrayBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = false; // Сортировался ли массив на это шаге?

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) { // Если левый элемент больше правого
                    int temp = array[j + 1]; // Временно запоминаем меньший

                    array[j + 1] = array[j]; // Правому присваиваем большее значение
                    array[j] = temp; // Левому присваиваем меньшее
                    isSorted = true; // Ставим флаг, что массив сортировался на этом проходе
                }
            }
            if (!isSorted) { // Если массив не сортировался на этом шаге, значит он уже отсортирован

                return array;
            }
        }

        return array;
    }
}