package com.walking.intensive.chapter4.task16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(selectionSort(new int[]{5,8,5,9,1,3})));
    }

    public static int[] selectionSort(int[] array) {

        if (array.length == 0) {
            return array;
        }

        int minPos = 0;

        while (minPos < array.length) {

            int curMinPos = minPos;
            int minValue = array[curMinPos];

            for (int i = minPos; i < array.length; i++) {
                if (minValue > array[i]) {
                    curMinPos = i;
                    minValue = array[i];
                }
            }

            array[curMinPos] = array[minPos];
            array[minPos] = minValue;
            minPos++;
        }

        return array;
    }

}