package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {

        int[] array = {1, 4, 2, 5, 3};

        System.out.println("Output: " + getSumSubarraysOddLength(array));
    }

    /**
     * Подсчет суммы всех возможных подмассивов нечетной длины.
     *
     * @param array массив целых чисел
     * @return сумма всех нечетныз подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {

        int sum =0;
        int n = array.length;

        for (int i = 0; i <n ; i++) {

            for (int j = i; j <n ; j+=2) {

                for (int k = i; k <=j ; k++) {

                    sum += array[k];
                }
            }
        }

        return sum;
    }
}