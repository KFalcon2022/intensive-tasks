package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {

        System.out.printf("\nThe odds to get a happy ticket are %.2f",getHappyTicketChance(999_999));
    }

    static double getHappyTicketChance(int ticketNumber) {
        final int TRIAD_MAX_SUM = 27;

        int happyTicketsAmount = 1; // 000_000

        int combinationsAmountPerThreeEqualDigits = 1; // 3! / 3!
        int combinationsAmountPerTwoEqualDigits = 3;   // 3! / (2! * 1!)
        int combinationsAmountPerAllUnequalDigits = 6; // 3!


        for (int s = TRIAD_MAX_SUM; s >= 1; s--) {

            int triadCombinationsPerEachSum = 0;

            for (int i = 9; i >= 1; i--) {

                int twoLastDigitsSum = s - i;

                if (twoLastDigitsSum == 0) {

                    triadCombinationsPerEachSum += combinationsAmountPerTwoEqualDigits;
                }

                for (int j = 9; j >= 1; j--) {

                    int lastDigit = twoLastDigitsSum - j;

                    if (lastDigit == 0 && i == j) {

                        triadCombinationsPerEachSum += combinationsAmountPerTwoEqualDigits;
                    }

                    if ((lastDigit == 0 && i > j)) {

                        triadCombinationsPerEachSum += combinationsAmountPerAllUnequalDigits;
                    }

                    for (int k = 9; k >= 1; k--) {

                        int remainder = lastDigit - k;

                        if ((remainder == 0) && ((i == j) && (j == k))) {

                            triadCombinationsPerEachSum += combinationsAmountPerThreeEqualDigits;
                        }

                        if ((remainder == 0) && (j == k && k != i)) {
                            triadCombinationsPerEachSum += combinationsAmountPerTwoEqualDigits;
                        }

                        if ((remainder == 0) && ((i > j) && (j > k))) {
                            triadCombinationsPerEachSum += combinationsAmountPerAllUnequalDigits;
                        }

                    }
                }
            }

            happyTicketsAmount += (triadCombinationsPerEachSum * triadCombinationsPerEachSum); // two triads
        }

        return (double) happyTicketsAmount / 1_000_000;
    }
}