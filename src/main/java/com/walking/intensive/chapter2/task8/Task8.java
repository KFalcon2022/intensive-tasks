package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {

        System.out.printf("\nThe odds to get a happy ticket are %f", getHappyTicketChance(999_999));
        //System.out.println(getCombinations(27, 3));
    }

    static double getHappyTicketChance(int ticketNumber) {
        final int TRIAD_MAX_SUM = 27;
        final int TRIAD_DIGITS_NUMBER = 3;
        final int TRIAD_NUMBER = 2;
        double happyTicketsNumber = 0;

        for (int sum = 0; sum <= TRIAD_MAX_SUM; sum++) {
            happyTicketsNumber += Math.pow(getCombinations(sum, TRIAD_DIGITS_NUMBER), TRIAD_NUMBER);
        }

        return happyTicketsNumber / 1_000_000;
    }

    static int getCombinations(int sum, int digitsNumber) {
        int combinations = 0;

        if (digitsNumber >= 1 && digitsNumber <= 3) {
            digitsNumber--;

            for (int digit = 0; digit <= 9; digit++) {
                int remainderDigitsSum = sum - digit;

                if (remainderDigitsSum == 0) {
                    combinations++;
                }

                if (remainderDigitsSum > 0) {
                    combinations += getCombinations(remainderDigitsSum, digitsNumber);
                }
            }
        }

        return combinations;
    }
}