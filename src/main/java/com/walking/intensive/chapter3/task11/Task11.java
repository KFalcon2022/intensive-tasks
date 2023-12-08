package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 5, 3};
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

        for (int i = 1; i <= array.length; i += 2) {

            for (int j = 0; j < array.length - i + 1; j++) {

                int[] tempArray = getSubArray(array, i, j);
                sum += getSumArray(tempArray);
            }
        }
        return sum;
    }

    static int[] getSubArray(int[] array, int length, int index) {

        int[] tempArray = new int[length];

        for (int i = 0; i < length; i++) {

            tempArray[i] = array[index];
            index++;
        }
        return tempArray;
    }

    static int getSumArray(int[] array) {

        int sum = 0;

        for (int cell: array) {
            sum+= cell;
        }
        return sum;
    }
}