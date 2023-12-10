package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {

        int[] arr = {1,4,2,5,3,1,1};
        int[] arr1= {1,2};
        System.out.println(getSumSubarraysOddLength(arr));
        System.out.println(getSumSubarraysOddLength(arr1));

    }

    static int getSumSubarraysOddLength(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }

        int total = 0;

        if (array.length >= 4) {

            for (int i = 0; i < array.length - 2; i++) {
                int totalOddLength = 0;
                for (int j = i; j < 3 + i; j++) {
                    totalOddLength = totalOddLength + array[j];
                }
                total = total + totalOddLength;
            }
        }

        if (array.length % 2 != 0){
            sum = sum * 2;
        }

        return total + sum;
    }
}