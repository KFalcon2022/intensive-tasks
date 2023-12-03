package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNumberOfMovements("10101")));
    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {
        final int ballsCount = getBallsCount(baskets);

        if (ballsCount == 0) {
            return new int[baskets.length()];
        }

        int[] ballsPosition = getStartPosition(baskets, ballsCount);
        int[][] ballsMovementsMap = new int[ballsCount][baskets.length()];

        for (int j = 0; j < baskets.length(); j++) {
            for (int i = 0; i < ballsCount; i++) {
                ballsMovementsMap[i][j] = Math.abs(j - ballsPosition[i]);
            }
        }

        int[] result = new int[baskets.length()];
        int common = 0;

        for (int i = 0; i < baskets.length(); i++) {
            for (int j = 0; j < ballsCount; j++) {
                common += ballsMovementsMap[j][i];
            }

            result[i] = common;
            common = 0;
        }

        return result;
    }

    static int[] getStartPosition(String baskets, int balls) {
        int[] result = new int[balls];

        for (int i = 0, j = 0; i < baskets.length(); i++) {
            if (isBall(baskets.charAt(i))) {
                result[j] = i;
                j++;
            }
        }

        return result;
    }

    static int getBallsCount(String baskets) {
        int count = 0;

        for (int i = 0; i < baskets.length(); i++) {
            if (isBall(baskets.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    static boolean isBall(char symbol) {
        if(symbol != '1' && symbol != '0'){
            throw new IllegalArgumentException("Входная строка должна содержать только 0 и 1");
        }

        return symbol == '1';
    }
}