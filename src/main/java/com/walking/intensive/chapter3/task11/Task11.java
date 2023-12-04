package com.walking.intensive.chapter3.task11;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] array = new int[] {1,4,2,5,3};
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
        int maxLength;

        if (array.length % 2 == 0) {
            maxLength = array.length - 1;
        } else {
            maxLength = array.length;
        }

        for (int l = 1; l <= maxLength; l = l + 2) {
            for (int i = 0; i <= array.length - l; i++) {
                for (int k = 0; k < l; k++) {
                    sum += array[i + k];
                }
            }
        }
        return sum;
    }
}

/*        for (int l = 1; l <= maxLength; l = l + 2) { // Проходим подмассивы разной длины
            int[] subArray = new int[l];
            for (int i = 0; i <= array.length - l; i++) {  // Определяем нач. элемент подмассива
                for (int k = 0; k < l; k++) { // Заполняем подмассив
                    subArray[k] = array[i + k];
                    sum += array[i + k];
                }
                System.out.println(Arrays.toString(subArray));
            }
        }*/
