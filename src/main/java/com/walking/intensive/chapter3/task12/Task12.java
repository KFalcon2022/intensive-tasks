package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(checkAndConvert("110000")));
        System.out.println(Arrays.toString(getNumberOfMovements("110000")));
        System.out.println(Arrays.toString(getNumberOfMovements("001011")));
        System.out.println(Arrays.toString(getNumberOfMovements("fgf")));
    }

    /**
     * Подсчет минимального количества операций, необходимых для перемещения всех мячиков в i-ю ячейку.
     *
     * @param baskets Строка с указанием наличия или отсутсвия мячика
     * @return массив с минимальным количеством операций
     */
    static int[] getNumberOfMovements(String baskets) {
        int[] input = checkAndConvert(baskets);
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[j] == 1) {
                    result[i] += Math.abs(i - j);
                }
            }
        }
        return result;
    }

    static int[] checkAndConvert(String string) {
        int[] result = new int[string.length()];
        try {
            for (int i = 0; i < result.length; i++) {
                if (string.substring(i, i + 1).equals("1") || string.substring(i, i + 1).equals("0")) {
                    result[i] = Integer.parseInt(string.substring(i, i + 1));
                } else {
                    throw new Exception();
                }
            }
            return result;
        } catch (Exception ex) {
            System.err.println("Wrong input, return 111");
            return new int[]{1, 1, 1};
        }

    }

}