package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 5, 3, 5};
        System.out.println(getSumSubarraysOddLength(array));

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
            if (i % 2 != 0) {
                sum += getIndexSum(i, array);
            }
        }
        return sum;
    }

    static int getIndexSum(int iterationIndex, int[] array) {
        int sum = 0;

        for (int i = 0; i + iterationIndex <= array.length; i++) {
            for (int j = 0; j < iterationIndex; j++) {
                sum += array[i + j];
            }
        }
        return sum;
    }
}