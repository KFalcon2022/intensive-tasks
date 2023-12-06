package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getNumberOfMovements("011101")));

    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {
        int[] moveCount = new int[baskets.length()];
        int sumOfBalls = 0;

        String[] splitBaskets = baskets.split("");

        int[] initialBaskets = new int[splitBaskets.length];
        for (int i = 0; i < splitBaskets.length; i++) {
            initialBaskets[i] = Integer.parseInt(splitBaskets[i]);
            sumOfBalls += initialBaskets[i];
        }

        int[] resultBaskets = initialiseBaskets(initialBaskets);

        for (int i = 0; i < resultBaskets.length; i++) { // перекладываем мячики в i корзину
            while (resultBaskets[i] != sumOfBalls) {
                for (int j = 0; j < resultBaskets.length; j++) {
                    if (resultBaskets[j] != 0 && j > i) {
                        resultBaskets[j - 1]++;
                        resultBaskets[j]--;
                        moveCount[i]++;
                    } else if (resultBaskets[j] != 0 && j < i) {
                        resultBaskets[j + 1]++;
                        resultBaskets[j]--;
                        moveCount[i]++;
                    }
                }
            }
            resultBaskets = initialiseBaskets(initialBaskets);
        }
        return moveCount;
    }

    static int[] initialiseBaskets(int[] baskets) {
        int[] resultBaskets = new int[baskets.length];

        for (int i = 0; i < baskets.length; i++) {
            resultBaskets[i] = baskets[i];
        }

        return resultBaskets;
    }
}