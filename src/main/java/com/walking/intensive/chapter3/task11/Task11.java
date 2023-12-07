package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        System.out.println(getSumSubarraysOddLength(new int[]{1, 4, 2, 5, 3}));
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
            int sumOfSubArrays = 0;

            for (int j = i; j < array.length; j++) {
                sumOfSubArrays += array[j];
                if ((j - i + 1) % 2 != 0) {
                    sum += sumOfSubArrays;
                }
            }
        }
        return sum;
    }
}