package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] b = {1, 4, 2, 5, 3};
        System.out.println(getSumSubarraysOddLength(b));
    }

    /**
     * Подсчет суммы всех возможных подмассивов нечетной длины.
     *
     * @param array массив целых чисел
     * @return сумма всех нечетныз подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {
        int sum = 0;

        for (int i = 1; i <= array.length; i++) {
            if (i % 2 == 1) {
                sum += getAllSumSubArraysFixedLength(array, i);
            }
        }

        return sum;
    }

    static int getAllSumSubArraysFixedLength(int[] arr, int k) {
        int sum = 0;

        for (int i = 0; i + k <= arr.length; i++) {
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
        }

        return sum;
    }
}