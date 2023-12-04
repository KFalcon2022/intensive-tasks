package com.walking.intensive.chapter3.task12;

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
        int[] answer = new int[baskets.length()];

        for (int i = 0; i < baskets.length(); i++) {
            int countSum = 0;
            for (int j = 0; j < baskets.length(); j++) {
                if (baskets.charAt(j) == '1') {
                    countSum += Math.abs(i - j);
                }
            }
            answer[i] = countSum;
        }

        return answer;
    }
}