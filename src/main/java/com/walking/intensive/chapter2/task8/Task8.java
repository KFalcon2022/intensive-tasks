package com.walking.intensive.chapter2.task8;

import java.util.Arrays;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        // Ваш код
        double sumOfCombinations = 0.0;
        int[] numberOfCombinations = new int[28];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    numberOfCombinations[i + j + k]++;
                }
            }
        }
        for (int numberOfCombination : numberOfCombinations) {
            sumOfCombinations += Math.pow(numberOfCombination, 2);
        }
        return sumOfCombinations / 1000000;
    }
}