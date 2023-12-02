package com.walking.intensive.chapter3.task11;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {

    }

    /**
     * Подсчет суммы всех возможных подмассивов нечетной длины.
     *
     * @param array массив целых чисел
     * @return сумма всех нечетных подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {
        int sum = 0;

        for (int i = 1; i <= array.length; i += 2) {
            for (int j = 0; j + i <= array.length; j++) {
                for (int k = j; k < i + j; k++) {
                    System.out.print(array[k]);
                    sum += array[k];
                }
            }
        }

        return sum;
    }
}