package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">Сортировка выбором</a>
 */
public class Task16 {
    public static void main(String[] args) {
        int[] inputArr = {5, 7, 4, 10, 1, 2, 8};
        System.out.println(Arrays.toString(sortBySelection(inputArr)));
    }

    private static int[] sortBySelection(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[min] > array[j]){
                    min = j;
                }
            }
            if (min != i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }

        }

        //return new int[]{};
        return array;
    }
}