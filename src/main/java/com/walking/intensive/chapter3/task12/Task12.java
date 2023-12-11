package com.walking.intensive.chapter3.task12;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        int[] result = getNumberOfMovements("110");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {
        int n = baskets.length();
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int totalMovements = 0;
            for (int j = 0; j < n; j++) {
                if (baskets.charAt(j) == '1') {
                    int diff = i - j; //difference
                    totalMovements += (diff >= 0) ? diff : -diff;
                }
            }
            answer[i] = totalMovements;
        }
        return answer;
    }
}