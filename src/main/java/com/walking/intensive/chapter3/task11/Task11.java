package com.walking.intensive.chapter3.task11;

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
     * @return сумма всех нечетныз подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {
        int arrayLength = array.length;
        int sum = 0;

            for (int i = 0; i < arrayLength; i++) {
                sum += array[i] * (((i + 1) * (arrayLength - i) + 1) / 2);
            }

        return sum;
    }
}