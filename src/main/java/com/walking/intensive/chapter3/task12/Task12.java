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

        int[] basketsArray = getBasketsArray(baskets);
        int basketsAmount = baskets.length();
        int[] ballMovementsInEachBasket = new int[basketsAmount];

        for (int i = 0; i < basketsAmount; i++) {
            int[] basketsArrayCopy = Arrays.copyOf(basketsArray, basketsAmount);

            for (int k = 0; k < i; k++) {

                while (!(basketsArrayCopy[k] == 0)) {
                    basketsArrayCopy[k] -= 1;
                    basketsArrayCopy[k + 1] += 1;
                    ballMovementsInEachBasket[i] += 1;
                }
            }

            for (int j = basketsAmount - 1; j > i; j--) {

                while (!(basketsArrayCopy[j] == 0)) {
                    basketsArrayCopy[j] -= 1;
                    basketsArrayCopy[j - 1] += 1;
                    ballMovementsInEachBasket[i] += 1;
                }
            }
        }

        return ballMovementsInEachBasket;
    }

    static int[] getBasketsArray(String baskets) {
        int[] basketsArray = new int[baskets.length()];

        for (int i = 0; i < baskets.length(); i++) {
            basketsArray[i] = Integer.parseInt(String.valueOf(baskets.charAt(i)));
        }

        return basketsArray;
    }

}