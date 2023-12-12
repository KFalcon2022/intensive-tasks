package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 3};
        int[] arr1= {1, 2};
        System.out.println(getSumSubarraysOddLength(arr));
        System.out.println(getSumSubarraysOddLength(arr1));

    }

    static int getSumSubarraysOddLength(int[] array) {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        int totalOddLength = 0;

        for (int i = 3; i <= array.length; i += 2) {
            totalOddLength += getSumArrayDiv(array, i);
        }

        return totalOddLength + sum;
    }

    public static int getSumArrayDiv(int[] array, int div) {
        int sumArrayDiv = 0;

        for (int i = 0; i <= array.length - div; i++) {
            for (int j = i; j < div + i; j++) {
                sumArrayDiv += array[j];
            }
        }

        return sumArrayDiv;
    }
}
