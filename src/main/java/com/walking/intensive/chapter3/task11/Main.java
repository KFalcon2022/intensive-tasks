package com.walking.intensive.chapter3.task11;

public class Main {
    public static void main(String[] args) {

        System.out.println(getSumSubarraysOddLength(new int[]{1, 4, 2, 5, 3}));
        System.out.println(getSumSubarraysOddLength(new int[]{10, 11, 12}));
        System.out.println(getSumSubarraysOddLength(new int[]{1, 2}));

    }

    /**
     * Подсчет суммы всех возможных подмассивов нечетной длины.
     *
     * @param array массив целых чисел
     * @return сумма всех нечетныз подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {

        int sum = 0;

        for (int subLenght = 1; subLenght <= array.length; subLenght += 2) { //i - длина подмассива, по которому собираем сумму

            int i = 0; //указатель на начало подмассива
            int j = i + subLenght - 1; //указатель на конец подмассива

            while (j < array.length) {
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                }
                i++;
                j++;
            }
        }

        return sum;
    }
}