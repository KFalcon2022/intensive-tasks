package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        String baskets = "10000";
        System.out.println(Arrays.toString(getNumberOfMovements(baskets)));
    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {

        int arraysLength = baskets.length();
        int[] balls = new int[arraysLength];
        int[] numberOfMovements = new int[arraysLength];

        for (int i = 0; i < arraysLength; i++) {
            balls[i] = Integer.parseInt(baskets.substring(i, i + 1));
        }

        for (int j = 0; j < numberOfMovements.length; j++) {

            for (int leftBalls = j - 1; leftBalls >= 0; leftBalls--) {

                if (balls[leftBalls] == 1) {
                    numberOfMovements[j] += j - leftBalls;
                }
            }

            for (int rightBalls = j + 1; rightBalls < numberOfMovements.length; rightBalls++) {

                if (balls[rightBalls] == 1) {
                    numberOfMovements[j] += rightBalls - j;
                }
            }
        }

        return numberOfMovements;
    }
}