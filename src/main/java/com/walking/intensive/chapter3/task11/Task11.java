package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        System.out.print(getSumSubarraysOddLength(new int[]{1, 4, 2, 5, 3}));
    }

    /**
     * Подсчет суммы всех возможных подмассивов нечетной длины.
     *
     * @param array массив целых чисел
     * @return сумма всех нечетныз подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int[] cuttedArray = new int[array.length - i];
            int k = 0;
            for (int j = i; j < array.length; j++) {
                cuttedArray[k] = array[j];
                k++;
                if (k > cuttedArray.length) {
                    break;
                }
            }
            result+=get(cuttedArray);
        }

        return result;
    }

    public static int get(int[] array) {
        int result = 0;
        for (int j = 1; j < array.length + 1; j++) {

            for (int i = 0; i < j; i++) {
                result += array[i];
            }
            j++;
        }
        return result;
    }
}