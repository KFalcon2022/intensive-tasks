package com.walking.intensive.chapter4.task20;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Pyramid-Sort.html">Пирамидальная сортировка</a>
 */
public class Task20 {

    public static void main(String[] args) {
//        int[] testArray = new int[] {93, 95, 51, 29, 97, 51, 2, 90, 3, 44, 64};
        int[] testArray = new int[31];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(testArray));
        sortByPyramid(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    private static void sortByPyramid(int[] array) {
        //create heap for whole array
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            siftHeap(array, i, array.length);
        }

        //sort sub arrays
        for (int heapSize = array.length - 1; heapSize >= 1; heapSize--) {
            swapElements(array, 0, heapSize);
            siftHeap(array, 0, heapSize);
        }
    }

    static void siftHeap(int[] array, int parentIndex, int heapSize) {
        int leftChildIndex = parentIndex * 2 + 1;
        int rightChildIndex = parentIndex * 2 + 2;
        int maxValueIndex = -1;

        if (rightChildIndex < heapSize && array[leftChildIndex] < array[rightChildIndex]) {
            maxValueIndex = rightChildIndex;
        } else if (leftChildIndex < heapSize) {
            maxValueIndex = leftChildIndex;
        }

        if (maxValueIndex != -1 && array[parentIndex] < array[maxValueIndex]) {
            swapElements(array, parentIndex, maxValueIndex);

            if ((maxValueIndex * 2 + 1) < heapSize) {
                siftHeap(array, maxValueIndex, heapSize);
            }
        }
    }

    static void swapElements(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}