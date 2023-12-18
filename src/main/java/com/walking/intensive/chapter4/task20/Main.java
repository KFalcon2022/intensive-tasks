package com.walking.intensive.chapter4.task20;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 5, 7, 6, 45, 4, 31, 9, 8, 3, 2};
        int[] array3 = {54, 465, 12, 123, 88, 66, 44, 11};
        int[] array4 = {5, 4, 3};
        int[] array5 = {77, 88, 4, 11, 666, 444, 9999, 111, 1, 2, 3};
        int[] array6 = {64, 87, 12, 64, 8788, 212, 449, 1231, 45488, 774, 1};

        heapSort(array1);
        heapSort(array2);
        heapSort(array3);
        heapSort(array4);
        heapSort(array5);
        heapSort(array6);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array5));
        System.out.println(Arrays.toString(array6));
    }

    public static void heapSort(int[] array) {

        /*
        Если массив изначально не отсортирован возрастанию, то после приведения к куче и каждого дальнейшего
        восстановления он так и останется несортированным. Поэтому проверка перед сортировкой только одна, чтобы каждый
        раз не вызывать ее при рекурсии. Если она не пройдена - вызывается doHeapSort с перегрузкой и рекурсией
         */
        boolean isSorted = true;

        //int i = 0;

        for (int i = 0; i < array.length - 2 && isSorted; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
            }
        }
//        while (isSorted && i < array.length - 1) {
//            if (array[i] > array[i + 1])
//                isSorted = false;
//            i++;
//        }

        if (!isSorted) {
            buildHeap(array);
            heapSort(array, 0, array.length - 1);
        }
    }

    public static void heapSort(int[] array, int root, int rightBorder) {

        if (rightBorder == 0) {
            return;
        }
        swapElements(array, root, rightBorder);
        restoreHeap(array, root, rightBorder - 1);
        heapSort(array, root, rightBorder - 1);
    }

    public static void restoreHeap(int[] array, int root, int rightBorder) {

        int maxValueIndex = root;
        int leftChildIndex = 2 * root + 1;
        int rightChildIndex = 2 * root + 2;

        if (leftChildIndex <= rightBorder && array[leftChildIndex] > array[root]) {
            maxValueIndex = leftChildIndex;
        }

        if (rightChildIndex <= rightBorder && array[rightChildIndex] > array[maxValueIndex]) {
            maxValueIndex = rightChildIndex;
        }

        if (maxValueIndex != root) {
            swapElements(array, root, maxValueIndex);
            restoreHeap(array, maxValueIndex, rightBorder);
        }
    }

    public static void buildHeap(int[] array) {

        for (int i = array.length / 2 - 1; i >= 0; i--) {
            restoreHeap(array, i, array.length - 1);
        }
    }

    public static void swapElements(int[] array, int index1, int index2) {

        int tempValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempValue;
    }
}