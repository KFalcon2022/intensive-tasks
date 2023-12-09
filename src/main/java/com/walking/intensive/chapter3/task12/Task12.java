package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        String baskets = "110";

        System.out.println(Arrays.toString(getNumberOfMovements(baskets)));
    }

    static int[] getNumberOfMovements(String baskets) {
        int[] answer = new int[baskets.length()];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < baskets.length(); j++) {
                if(baskets.charAt(j) == '1') {
                    answer[i] += Math.abs(i - j); // Если в корзинки j есть мячик, то добавляем количество операций, нужных для перемещения мячика из j в i
                }
            }
        }

        return answer;
    }
}