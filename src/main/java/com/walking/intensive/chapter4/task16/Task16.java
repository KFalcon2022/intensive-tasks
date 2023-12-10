package com.walking.intensive.chapter4.task16;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/%D0%A1hoicee-Sort.html">ссылка</a>
 */
public class Task16 {
    public static void main(String[] args) {

        int[] arr;
        arr = new int[]{0, 2, 7, 1, 3, 4, 18, 5, 16, 6, 20, 19, 21, 17};
        doChoiceSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void doChoiceSort(int[] inputArray) {
        if (inputArray.length >= 1 && !isSorted(inputArray)) {
            choiceSort(inputArray);
        }
    }

    static void choiceSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            int minIndex = getMinIndex(inputArray, i);
            changeItemArray(inputArray, i, minIndex);
        }
    }

    public static int getMinIndex(int[] inputArray, int startPosition) {
        int minItem = 2147483647;
        int minIndex = -1;
        for (int i = startPosition; i < inputArray.length; i++) {
            if (minItem > inputArray[i]) {
                minIndex = i;
                minItem = inputArray[i];
            }
        }

        return minIndex;
    }

    public static void changeItemArray(int[] inputArray, int targetIndex, int minIndex) {
        int temp = inputArray[targetIndex];
        inputArray[targetIndex] = inputArray[minIndex];
        inputArray[minIndex] = temp;
    }

    public static boolean isSorted(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] > inputArray[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
