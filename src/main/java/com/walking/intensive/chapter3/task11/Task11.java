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
        int n = array.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            // Общее количество подмассивов с элементом arr[i]
            int totalSubarrays = (i + 1) * (n - i);

            // Количество подмассивов нечетной длины с элементом arr[i]
            int oddSubarrays = (totalSubarrays + 1) / 2;

            // Добавляем вклад этого элемента в общую сумму
            totalSum += array[i] * oddSubarrays;
        }

        return totalSum;
    }
}