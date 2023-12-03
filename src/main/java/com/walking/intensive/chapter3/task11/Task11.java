package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 4, 2, 5, 3};

        System.out.print("The sum of all odd subarray is = ");           //на кириллице выводит �����
        System.out.println(getSumSubarraysOddLength(arrayNumbers));
    }

    static int getSumSubarraysOddLength(int[] array) {
        int sum = 0;

        for (int i = 0; i <= array.length; i++) {
            if (i % 2 != 0) {
                sum += splitArray(i, array);
            }
        }

        return sum;
    }

    static int splitArray(int index, int[] array) {
        int sum = 0;

        if (index == 1) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            return sum;
        }

        if (index < array.length) {                         //если индекс меньше длины массива, то мы найдем доп. количества итераций суммирования
            int iteration = array.length - index;

            for (int i = 0; i < iteration + 1; i++) {       //+1
                for (int j = i; j < index + i; j++) {
                    sum += array[j];
                }
            }

        } else {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }

        return sum;
    }
}