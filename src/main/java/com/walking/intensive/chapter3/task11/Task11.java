package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] massive = {1, 4, 2, 5, 3};

        System.out.println(getSumSubarraysOddLength(massive));
    }

    static int getSumSubarraysOddLength(int[] array) {
        int sumSubarraysOddLength = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j += 2) {
                for (int k = i; k <= j; k++) {
                    sumSubarraysOddLength += array[k];
                }
            }
        }

        return sumSubarraysOddLength;
    }
}