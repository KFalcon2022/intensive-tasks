package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {
        int[] result = new int[baskets.length()];

        for (int i = 0; i < baskets.length(); i++) {
            int steps = 0;
            for (int j = 0; j < baskets.length(); j++) {
                if (baskets.charAt(j) == '1') {
                    steps += Math.abs(j - i);
                }
            }
            result[i] = steps;
        }
        return result;
    }
}