package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 5, 3, 6};
        System.out.println(getSumSubarraysOddLength(array));
    }

    static int getSumSubarraysOddLength(int[] array) {
        int lengthArray = array.length;
        int result = 0;

        for (int i = 0; i < lengthArray; i++) {
            int lengthSubarrays = i + 1;

            while (lengthSubarrays <= lengthArray) {
                for (int j = i; j < lengthSubarrays; j++) {
                    result += array[j];
                }

                lengthSubarrays += 2;
            }
        }

        return result;
    }
}