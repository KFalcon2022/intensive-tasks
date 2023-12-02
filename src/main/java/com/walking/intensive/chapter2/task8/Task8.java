package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {

        System.out.printf("\nThe odds to get a happy ticket are %f", getHappyTicketChance(999_999));
    }

    static double getHappyTicketChance(int ticketNumber) {
        final int TRIAD_MAX_SUM = 27;

        int happyTicketsAmount = 0;

        int combinationsAmountPerAllUnequalDigits = 6; // 3!
        int combinationsAmountPerTwoEqualDigits = 3;   // 3! / (2! * 1!)
        int combinationsAmountPerThreeEqualDigits = 1; // 3! / 3!

        for (int s = TRIAD_MAX_SUM; s >= 0; s--) {

            int triadCombinationsPerEachSum = 0;

            for (int i = 9; i >= 0; i--) {

                int twoLastDigitsSum = s - i;

                for (int j = 9; j >= 0; j--) {

                    int lastDigit = twoLastDigitsSum - j;

                    for (int k = 9; k >= 0; k--) {

                        if (lastDigit - k == 0) {

                            if (i == j && j == k) {

                                triadCombinationsPerEachSum += combinationsAmountPerThreeEqualDigits;
                            }

                            if ((i == j && k < j) || (j == k && j < i)) {

                                triadCombinationsPerEachSum += combinationsAmountPerTwoEqualDigits;
                            }

                            if (i > j && j > k) {

                                triadCombinationsPerEachSum += combinationsAmountPerAllUnequalDigits;
                            }
                        }
                    }
                }
            }

            happyTicketsAmount += (triadCombinationsPerEachSum * triadCombinationsPerEachSum); // two triads
        }

        return (double) happyTicketsAmount / 1_000_000;
    }
}