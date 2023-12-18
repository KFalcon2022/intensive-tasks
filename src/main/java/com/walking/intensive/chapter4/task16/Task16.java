package main.java.com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1, 7, 0,42,42,645,73,14,0,9};
        System.out.println(Arrays.toString(sortBySelection(array)));
    }

    private static int[] sortBySelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexMinElement = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMinElement]) {
                    indexMinElement = j;
                }
            }
            int tempValue = array[indexMinElement];
            array[indexMinElement] = array[i];
            array[i] = tempValue;
        }
        return array;
    }
}