package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {

        int[] array = {1, 4, 2, 5, 3};
        System.out.println(getSumSubarraysOddLength(array));
    }

    static int getSumSubarraysOddLength(int[] array) {
        int sum = 0;

        for (int i = 1; i <= array.length; i++) {
            if (i % 2 != 0) {
                sum += getSumIndex(i, array);
            }
        }

        return sum;
    }

    static int getSumIndex(int index, int[] array) {
        int sum = 0;

        for (int i = 0; (i + index) <= array.length; i++) {
            for (int j = 0; j < index; j++) {
                sum += array[i + j];
            }
        }

        return sum;
    }
}