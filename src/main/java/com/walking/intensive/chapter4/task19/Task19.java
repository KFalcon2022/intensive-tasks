package com.walking.intensive.chapter4.task19;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Quicksort.html">Быстрая сортировка - Quicksort</a>
 */
public class Task19 {
    public static void main(String[] args) {
        int[] nums = new int[]{7, 5, 34, 25, 6, 11, 0, 4, 55, 65, 29, 24};

        System.out.println(Arrays.toString(nums));

        qSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    public static void qSort(int[] nums, int left, int right) {
        if (left < right) {

            int pavot = getPavot(nums, left, right);

            qSort(nums, left, pavot - 1);
            qSort(nums, pavot, right);
        }
    }

    public static int getPavot(int[] nums, int left, int rigth) {
        int leftIndex = left;
        int rightIndex = rigth;

        int pavot = nums[left + (rigth - left) / 2];

        while (leftIndex <= rightIndex) {

            while (nums[leftIndex] < pavot) {
                leftIndex++;
            }

            while (nums[rightIndex] > pavot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(nums, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }

    public static void swap(int[] nums, int leftInd, int rightInd) {
        int temp = nums[leftInd];
        nums[leftInd] = nums[rightInd];
        nums[rightInd] = temp;
    }
}