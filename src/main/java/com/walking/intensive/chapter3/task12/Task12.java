package com.walking.intensive.chapter3.task12;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        String baskets = "110";
        int[] answer = getNumberOfMovements(baskets);
        for (int op : answer) {
            System.out.print(op + " ");
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
        int[] leftBalls = new int[n];
        int[] rightBalls = new int[n];

        int leftCount = 0, rightCount = 0;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            leftCount += baskets.charAt(i) - '0';
            rightCount += baskets.charAt(j) - '0';
            leftBalls[i] = leftCount;
            rightBalls[j] = rightCount;
        }

        for (int i = 0; i < n; i++) {
            int operations = 0;
            for (int j = 0; j < i; j++) {
                operations += (i - j) * (baskets.charAt(j) - '0');
            }
            for (int j = i + 1; j < n; j++) {
                operations += (j - i) * (baskets.charAt(j) - '0');
            }
            answer[i] = operations;
        }

        return answer;
    }
}