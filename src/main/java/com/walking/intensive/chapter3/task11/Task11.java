package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] mass = {1, 4, 2, 5, 2, 3};
        System.out.println(getSumSubarraysOddLength(mass));
    }

    static int getSumSubarraysOddLength(int[] array) {
        int sumSubarrays = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = i; k < array.length; k++) {
                    sumSubarrays += (j % 2 == k % 2) ? array[i] : 0;
                }
            }
        }
        return sumSubarrays;
    }
}