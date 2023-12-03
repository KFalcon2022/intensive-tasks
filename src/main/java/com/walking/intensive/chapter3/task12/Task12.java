package com.walking.intensive.chapter3.task12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String baskets = scanner.nextLine();

        scanner.close();

        System.out.println(Arrays.toString(getNumberOfMovements(baskets)));
    }
    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {
        int[] answer = new int[baskets.length()];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                answer[i] += Character.getNumericValue(baskets.charAt(j)) * Math.abs(j - i);
            }
        }

        return answer;
    }
}