package com.walking.intensive.chapter4.task18;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Shaker-Sort.html">ссылка</a>
 */
public class Task18 {
    public static void main(String[] args) {

        int[] arr = {3, 0, -1, 4, 2, 5, -2};
        doShakerSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void doShakerSort(int[] inputArray) {
        if (inputArray.length > 1) {
            shakerSort(inputArray);
        }
    }

    public static void shakerSort(int[] inputArray) {
        int start = 0;
        int end = inputArray.length - 1;
        boolean isNotSorted = true;

        while (isNotSorted && start < end) {
            isNotSorted = false;

            for(int i = start; i < end; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    isNotSorted = true;
                    changeItem(inputArray, i, i + 1);
                }
            }
            end--;
            for(int i = end; i > start; i--) {
                if (inputArray[i - 1] > inputArray[i]) {
                    isNotSorted = true;
                    changeItem(inputArray, i, i - 1);
                }
            }
            start++;
        }
    }

    public static void changeItem(int[] inputArray, int indexA, int indexB) {
        int temp = inputArray[indexA];
        inputArray[indexA] = inputArray[indexB];
        inputArray[indexB] = temp;
    }
}
