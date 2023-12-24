package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 1, -1, 0, 18, -1};

        System.out.println(Arrays.toString(sortByBubble(array)));
    }

    private static int[] sortByBubble(int[] array) {

        for (int i = array.length; i > 1; i--) {
            boolean isSwitchNums = false;     // если хотя бы 1 раз произошла перестановка чисел, то true
            for (int j = 1; j < i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    isSwitchNums = true;
                }
            }
            if (!isSwitchNums){
                break;
            }
        }

        return array;
    }
}