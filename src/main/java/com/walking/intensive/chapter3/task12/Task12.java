package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNumberOfMovements("110")));
        System.out.println(Arrays.toString(getNumberOfMovements("112")));
    }

    static boolean isValidChar(char c) {
        return c != '0' && c != '1';
    }

    static int[] getNumberOfMovements(String baskets) {
        int[] minNum = new int[baskets.length()];

        for (int i = 0; i < baskets.length(); i++) { // по условиям задачи принимаем символ '0' || '1'
            if (isValidChar(baskets.charAt(i))) {
                return new int[]{0};
            }
        }

        for (int i = 0; i < baskets.length(); i++) {

            for (int j = 0; j < baskets.length(); j++) {
                if (baskets.charAt(j) == '1') {
                    minNum[i] += Math.abs(j - i);
                }
            }
        }

        return minNum;
    }
}