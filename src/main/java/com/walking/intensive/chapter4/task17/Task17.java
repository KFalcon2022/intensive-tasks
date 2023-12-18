package main.java.com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">Сортировка пузырьком</a>
 */
public class Task17 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1, 7, 0,42,42,645,73,14,0,1000};
        System.out.println(Arrays.toString(sortByBubble(array)));
    }

    private static int[] sortByBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                   int tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }
        }
        return array;
    }
}