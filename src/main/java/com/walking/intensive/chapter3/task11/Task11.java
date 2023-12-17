package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 12};
        System.out.println(getSumSubarraysOddLength(array));
    }

    /**
     * Подсчет суммы всех возможных подмассивов нечетной длины.
     *
     * @param array массив целых чисел
     * @return сумма всех нечетныз подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {

        int sumSubarraysOddLength = 0;

        for (int i = 1; i <= array.length; i += 2) {

            for (int j = 0; j < array.length; j++) {

                if (j + i > array.length) {
                    break;
                }

                for (int k = 0; k < i; k++) {

                    if (j + k >= array.length) {
                        break;
                    }

                    sumSubarraysOddLength += array[j + k];
                    }
                }
            }

        return sumSubarraysOddLength;
    }
}
