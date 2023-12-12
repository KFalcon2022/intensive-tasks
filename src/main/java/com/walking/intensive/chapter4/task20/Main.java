package com.walking.intensive.chapter4.task20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {111, 456, 5423, 11, 4353, 1, 3, 5, 6, 7, 53445, 77, 44};

        Main main = new Main();
        main.heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    public void heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            createHeap(array, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            createHeap(array, i, 0);
        }
    }

    private void createHeap(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            createHeap(array, n, largest);
        }
    }

}