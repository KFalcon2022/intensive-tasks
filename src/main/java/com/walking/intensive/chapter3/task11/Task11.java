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
        int arrayCore = (array.length / 2) - 2;
        int coreMultiplier = array.length % 2 != 0 ? arrayCore + 1 : arrayCore;

        for (int i = 0; i < array.length; i++) {
            sum += (array[i] * 2);
            if (i == 0 || i == array.length - 1) {
                sum += array[i] * coreMultiplier;
            } else if (i == 1 || i == array.length - 2) {
                sum += (array[i] * 2 * coreMultiplier);
            } else {
                sum += (array[i] * 3 * coreMultiplier);
            }
        }

        return sum;
    }
}
