package com.walking.intensive.chapter3.task11;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int[] array = new int[scanner.nextInt()];

        System.out.println("Введите положительные значения элементов: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            if (array[i] < 1) {
                while (array[i] < 1) {
                    System.out.print("Введите положительное значения элемента: ");
                    array[i] = scanner.nextInt();
                }
            }
        }
        scanner.close();

        System.out.println("Cумма всех возможных подмассивов нечетной длины равна: " + getSumSubarraysOddLength(array));
    }

    /**
     * Подсчет суммы всех возможных подмассивов нечетной длины.
     *
     * @param array массив целых чисел
     * @return сумма всех нечетныз подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {
        int sumSubarraysOddLength = 0;
        for (int i = 0; i < array.length; i++) {
            sumSubarraysOddLength += array[i] * (((i + 1) * (array.length - i) + 1) / 2);
        }
        return sumSubarraysOddLength;
    }
}