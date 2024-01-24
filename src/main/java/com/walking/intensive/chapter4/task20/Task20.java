package com.walking.intensive.chapter4.task20;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Pyramid-Sort.html">Пирамидальная сортировка</a>
 */
public class Task20 {
    public static void main(String[] args) {
        int[] array = {-1, 4, 56, 3, 87, 3, 32, 11, -56, 24};
        int[] array2 = {-1, 4, 56, 3, 8, 2};
        int[] array3 = {-1, 56, 4};

        System.out.println(Arrays.toString(sortByPyramid(array)));
        System.out.println(Arrays.toString(sortByPyramid(array2)));
        System.out.println(Arrays.toString(sortByPyramid(array3)));
    }

    private static int[] sortByPyramid(int[] array) {
        recoverHeap(array, array.length);
        return array;
    }

    private static int[] recoverHeap(int[] array, int length) {
        if (length == 2) {
            if (array[0] > array[1]) {
                int buffer = array[0];

                array[0] = array[1];
                array[1] = buffer;

                return array;
            }
        }

        if (length < 2) {
            return array;
        }

        for (int i = 0; i <= length / 2 - 1; i++) {
            if (array[2 * i + 1] > array[i]) {
                int buffer = array[i];

                array[i] = array[2 * i + 1];
                array[2 * i + 1] = buffer;

                i = -1;
            } else if (2 * i + 2 < length) {
                if (array[2 * i + 2] > array[i]) {
                    int buffer = array[i];

                    array[i] = array[2 * i + 2];
                    array[2 * i + 2] = buffer;
                    i = -1;
                }
            }
        }

        int buffer = array[0];

        array[0] = array[length - 1];
        array[length - 1] = buffer;

        recoverHeap(array, length - 1);

        return array;
    }
}