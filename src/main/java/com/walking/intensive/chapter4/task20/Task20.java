package com.walking.intensive.chapter4.task20;

import java.util.Arrays;
import java.util.Random;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Pyramid-Sort.html">Пирамидальная сортировка</a>
 */
public class Task20 {
    public static void main(String[] args) {
        int[] array = genRandomArray();
        sortByPyramid(array);
        System.out.println(Arrays.toString(array));
        System.out.println(isSorted(array));
    }

    private static void sortByPyramid(int[] array) {
        for (int i = array.length; i > 1; i--) {
            sift(array, i, 0);
            swap(array, i - 1, 0);
        }
    }

    private static void sift(int[] array, int size, int deep) {
        int nodes = (size / 2) - 1;

        while (nodes >= deep) {
            int maxValueIndex = 2 * nodes + 1;

            if (maxValueIndex + 1 < size) {
                maxValueIndex = array[maxValueIndex] < array[maxValueIndex + 1] ? maxValueIndex + 1 : maxValueIndex;
            }

            if (array[nodes] < array[maxValueIndex]) {
                swap(array, nodes, maxValueIndex);
                sift(array, size, nodes);
            }

            nodes--;
        }
    }

    private static void swap(int[] array, int source, int target) {
        int buffer = array[source];
        array[source] = array[target];
        array[target] = buffer;
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