package com.walking.intensive.chapter4.task17;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 1, -1, 0, 18, -1};

        int[] result = sortByBubble(array);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] sortByBubble(int[] array) {
        int tmp;

        for (int i = array.length; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (array[j] < array[j - 1]) {
                    tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }

        return array;
    }
}