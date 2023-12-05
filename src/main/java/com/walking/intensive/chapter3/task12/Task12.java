package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        String baskets = "101";
        System.out.println(Arrays.toString(getNumberOfMovements(baskets)));
    }

    static int[] getNumberOfMovements(String baskets) {
        int[] numbers = new int[baskets.length()];

        for (int i = 0; i < baskets.length(); i++) {
            for (int j = 0; j < baskets.length(); j++) {
                if(baskets.charAt(j) == '1'){
                    numbers[i] += Math.abs(j - i);
                }
            }
        }

        return numbers;
    }
}