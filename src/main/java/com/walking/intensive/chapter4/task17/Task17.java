package com.walking.intensive.chapter4.task17;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Bubble-Sort.html">ссылка</a>
 */
public class Task17 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 2, 5, 3};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] inputArray) {
        boolean isSorted = false;
        int indexCount = inputArray.length - 1;

        while (!isSorted) {
            for(int i = 0; i < indexCount; i++) {
                isSorted = true;
                if (inputArray[i] >= inputArray[i + 1]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                    isSorted = false;
                }
            }
            indexCount--;
        }
    }
}