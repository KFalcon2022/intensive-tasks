package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 4, 2, 5, 3};

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
        int lengthOfMinSubbarray = 1;

        while (array.length / lengthOfMinSubbarray != 0) {

            for (int i = 0; i <= array.length - lengthOfMinSubbarray; i++) {

                for (int j = i; j < i + lengthOfMinSubbarray; j++) {
                    sumSubarraysOddLength += array[j];
                }
            }

            lengthOfMinSubbarray += 2;
        }
        return sumSubarraysOddLength;
    }
}