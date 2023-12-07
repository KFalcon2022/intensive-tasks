package com.walking.intensive.chapter3.task12;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        getNumberOfMovements("110111");
    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {
        int[] resultBasket = new int[baskets.length()];
        int[] resultBasketCount = new int[baskets.length()];

        for (int i = 0; i < baskets.length(); i++) {
            resultBasket[i] = Character.getNumericValue(baskets.charAt(i));
        }

        for (int i = 0; i < baskets.length(); i++) {
            resultBasketCount[i] = getBallsCount(resultBasket, i);
        }

        return resultBasketCount;
    }

    public static int getBallsCount(int[] baskets, int ballPlace) {
        int ballCount = 0;
        for (int i = 0; i < ballPlace; i++) {
            if (baskets[i] == 1) {
                ballCount += ballPlace - i;
            }
        }
        for (int i = ballPlace; i < baskets.length; i++) {
            if (baskets[i] == 1) {
                ballCount += i - ballPlace;
            }
        }
        return ballCount;
    }
}