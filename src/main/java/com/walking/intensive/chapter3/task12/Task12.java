package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {

        String input = "110";

        System.out.println(Arrays.toString(getNumberOfMovements(input)));
    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {

        int n = baskets.length();
        int[] movements = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (baskets.charAt(j) == '1') {
                    movements[i] += Math.abs(i - j);
                }
            }
        }

        return movements;
    }
    }
