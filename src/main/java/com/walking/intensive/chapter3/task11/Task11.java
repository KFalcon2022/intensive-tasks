package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(getSumSubarraysOddLength(arr));
    }

    /**
     * Подсчет суммы всех возможных подмассивов нечетной длины.
     *
     * @param array массив целых чисел
     * @return сумма всех нечетныз подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {
        int sum = 0;
        int count = 0;


        while (count < array.length) {
            for (int i = 0; i < array.length - count; i++) {
                for (int j = 0 + i; j <= count + i; j++) {
                    sum += array[j];
                }
            }
            count += 2;
        }

        return sum;
    }
}
