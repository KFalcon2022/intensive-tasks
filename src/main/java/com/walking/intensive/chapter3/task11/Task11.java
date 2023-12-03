package com.walking.intensive.chapter3.task11;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {

        int[] array = {1,4,2,5,3};

        System.out.println(getSumSubarraysOddLength(array));
    }

    /**
     * Подсчет суммы всех возможных подмассивов нечетной длины.
     *
     * @param array массив целых чисел
     * @return сумма всех нечетных подмассивов
     */
    static int getSumSubarraysOddLength(int[] array) {

        int[] frequency = new int[array.length];

        for (int i = 1; i <= array.length; i++) {

            int sequencesCountFromHere = (1 + (array.length - i) / 2);

            int countElementsBefore = i - 1;
            int countElementsAhead = array.length - i;

            int countElementsBeforeSameParity = countElementsBefore / 2;
            int sequencesCountFromPreviousElementSameParity = countElementsBeforeSameParity * sequencesCountFromHere;

            int countElementsBeforeAnotherParity = countElementsBefore - countElementsBeforeSameParity;
            int sequencesCountFromPreviousElementAnotherParity;
            if (countElementsAhead % 2 == 0) {
                sequencesCountFromPreviousElementAnotherParity = countElementsBeforeAnotherParity * (sequencesCountFromHere - 1);
            } else {
                sequencesCountFromPreviousElementAnotherParity = countElementsBeforeAnotherParity * sequencesCountFromHere;
            }
            frequency[i - 1] = sequencesCountFromHere + sequencesCountFromPreviousElementSameParity + sequencesCountFromPreviousElementAnotherParity;
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i] * frequency[i];
        }
        return result;
    }
}