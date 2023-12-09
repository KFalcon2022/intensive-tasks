package com.walking.intensive.chapter3.task11;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] test = {1, 4, 2, 5, 3};
        int[] test2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getSumSubarraysOddLength(test));
        System.out.println(getSumSubarraysOddLength(test2));
    }

    /**
     * Подсчет суммы всех возможных подмассивов нечетной длины.
     *
     * @param array массив целых чисел
     * @return сумма всех нечетныз подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length; j >= i; j--) {
                if ((j - i) % 2 == 1) {
                    sum += sumOddArray(Arrays.copyOfRange(array, i, j));
                }
            }
        }
        return sum;
    }

    static int sumOddArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}