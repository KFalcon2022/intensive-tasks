package com.walking.intensive.chapter3.task12;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-balls.html">МЯЧИКИ</a>
 */
public class Task12 {
    public static void main(String[] args) {
        String basketsLocation = "10101";
        System.out.println(Arrays.toString(getNumberOfMovements(basketsLocation)));
    }

    static int[] getNumberOfMovements(String baskets) {
        int stringLength = baskets.length();
        char[] basketsLocation = baskets.toCharArray();
        int[] numberOfMovements = new int[stringLength];

        for (int i = 0; i < stringLength; i++) {
            int movementOfOneBasket = 0;

            for (int j = 0; j < stringLength; j++) {
                if (basketsLocation[j] == '1') {
                    movementOfOneBasket += (j > i) ? (j - i) : (i - j);
                }
            }

            numberOfMovements[i] = movementOfOneBasket;
        }

        return numberOfMovements;
    }
}