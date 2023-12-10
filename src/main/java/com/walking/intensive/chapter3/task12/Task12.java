package com.walking.intensive.chapter3.task12;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        int[] a = getNumberOfMovements("001011");
        for (int i : a) {
            System.out.println(i);
        }

    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {
        int arrayLength = baskets.length();
        int[] result = new int[arrayLength];
        char BALL = '1';
        char NO_BALL = '0';

        for (int i = 0; i < arrayLength; i++) {
            if (baskets.charAt(i) == BALL) {

                for (int j = 0; j < arrayLength; j++) {
                    result[j] += Math.abs(i - j);
                }

            } else if (baskets.charAt(i) != NO_BALL) {
                return new int[0];
            }
        }

        return result;
    }
}