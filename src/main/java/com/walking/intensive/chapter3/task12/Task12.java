package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {

        String str = "00100";
        System.out.println(Arrays.toString(getNumberOfMovements(str)));

    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {
        int[] input = getArray(baskets);
        int[] result = new int[baskets.length()];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[j] > 0 && j != i) {
                    result[i] += input[j] * Math.abs(j - i);
                }
            }
        }
        return result;
    }

    static int[] getArray(String baskets) {
        int[] array = new int[baskets.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(baskets.charAt(i)));
        }
        return array;
    }
}