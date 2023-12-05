package com.walking.intensive.chapter3.task12;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        String str = "110";

        int[] answer = getNumberOfMovements(str);

        for(int tmp: answer)
            System.out.println(tmp);

    }

    static int[] getNumberOfMovements(String baskets) {
        char[] charMas = baskets.toCharArray(); // создаем массив char "1" и "0"
        int[] result = new int[charMas.length];

        for (int i = 0; i < charMas.length; i++) {
            for (int j = 0; j < charMas.length; j++) {
                if (charMas[j] == '1' && i != j)
                    result[i] += Math.abs(i - j);
            }
        }

        return result;
    }

}