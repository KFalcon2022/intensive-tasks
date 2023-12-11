package com.walking.intensive.chapter3.task11;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Subarray.html">Подмассив</a>
 */
public class Task11 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] arr1= {1,2};
        System.out.println(getSumSubarraysOddLength(arr));
        System.out.println(getSumSubarraysOddLength(arr1));

    }

    static int getSumSubarraysOddLength(int[] array) {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        int totalOddLength = 0;

        if (array.length >= 4) {
            for (int i = 3; i < array.length; i = i + 2) {
                    totalOddLength += getSum(array, i);
                }
            }

        if (array.length % 2 != 0){
            sum = sum * 2;
        }

        return totalOddLength + sum;
    }

    public static int getSum(int[] array, int div){

        int sum = 0;

            for (int i = 0; i < array.length - div + 1; i++) {
                int total = 0;
                for (int j = i; j < div + i; j++) {
                    total = total + array[j];
                }
                sum += total;
            }

            return sum;
        }
    }
