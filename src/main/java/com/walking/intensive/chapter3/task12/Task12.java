package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNumberOfMovements("110")));
    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {

        int[] basketsArray = new int[baskets.length()];
        int[] movementsNumber = new int[basketsArray.length];

        for (int i = 0; i < basketsArray.length; i++) {
            basketsArray[i] = Character.getNumericValue(baskets.charAt(i));
        }

        for (int i = 0; i < basketsArray.length; i++) {
            for (int j = 0; j < basketsArray.length; j++) {
                if (i == j) {
                    continue;
                }
                if (basketsArray[j] == 1) {
                    movementsNumber[i] = movementsNumber[i] + ((j > i) ? (j - i) : (i - j));
                }
            }
        }
        return movementsNumber;
    }
}
