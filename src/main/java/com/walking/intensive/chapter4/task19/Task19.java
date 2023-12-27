package com.walking.intensive.chapter4.task19;

import java.util.Arrays;
import java.util.Random;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        int[] data = genRandomArray();

        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(sortByQuicksort(data)));
        System.out.println(isSorted(data));
    }

    public static int[] sortByQuicksort(int[] array) {
        sort(array, 0, array.length - 1);

        return array;
    }

    private static void sort(int[] array, int left, int right) {
        if (right - left < 1) {
            return;
        }

        int supportValue = getSupportValue(array, left, right);
        int i = left, j = right;

        do {
            while (array[i] < supportValue) {
                i++;
            }

            while (array[j] > supportValue) {
                j--;
            }

            if (i <= j) {
                swap(array, i, j);

                i++;
                j--;
            }

        } while (i <= j);

        if (left < i) {
            sort(array, left, j);
        }

        if (j < right) {
            sort(array, i, right);
        }
    }

    private static void swap(int[] array, int source, int target) {
        int buffer = array[source];
        array[source] = array[target];
        array[target] = buffer;
    }

    private static int getSupportValue(int[] array, int start, int end) {
        int min = array[start], max = array[start];

        for (int i = start; i < end; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }

        return (max + min) / 2;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    public static int[] genRandomArray() {
        int size = 1000;
        Random r = new Random();
        int[] integers = new int[r.nextInt(size) + 1];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = r.nextInt(size) + 1;
        }

        return integers;
    }


}

