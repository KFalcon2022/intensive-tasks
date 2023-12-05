package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getNumberOfMovements("1001")));
    }


    static int[] getNumberOfMovements(String baskets) {
        int[] arr = new int[baskets.length()];
        int val = Integer.parseInt(baskets);
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = val % 10;
            val /= 10;
        }

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 1) {
                    result[i] += Math.abs(j - i);
                }
            }
        }
        return result;
    }
}