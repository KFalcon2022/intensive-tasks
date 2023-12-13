package com.walking.intensive.chapter4.task17;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        int[] array = {24, 17, 55, -19, 2008, 0, 2020, 67, 55};
        array = sortByBubble(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static int[] sortByBubble(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // поменять местами элементы
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // если ни один из двух элементов не был заменен внутренним циклом, то прерываем
            if (!swapped)
                break;
        }
        return array;
    }
}