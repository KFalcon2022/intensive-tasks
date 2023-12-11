package com.walking.intensive.chapter2.task8;

/**
 * Условие: <a href="http://geometry-math.ru/homework/Java-ticket.html">ссылка</a>
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(getHappyTicketChance());
    }

    static double getHappyTicketChance() {
        int maxDigitsCount = 6;
        double[] probabilities;
        double result = 0;
        int maxHalfSumOfDigits = (maxDigitsCount / 2) * 9 + 1;

        if (maxDigitsCount % 2 == 1) {
            return 0;
        } else {
            probabilities = new double[maxHalfSumOfDigits];
        }

        int maxHalfNumber = 9;
        for (int i = 0; i < maxDigitsCount / 2 - 1; i++) {
            maxHalfNumber *= 10;
            maxHalfNumber += 9;
        }

        for (int i = 0; i <= maxHalfNumber; i++) {
            probabilities[getDigitsSum(i)]++;
        }

        int halfProbabilityCount = (maxHalfSumOfDigits + 1) / 2 - 1;
        for (int i = 0; i <= halfProbabilityCount; i++) {
            result += 2 * Math.pow(probabilities[i] / Math.pow(10, maxDigitsCount / 2), 2);
        }
        if (maxHalfSumOfDigits % 2 != 0) {
            result += Math.pow(probabilities[halfProbabilityCount + 1] / Math.pow(10, maxDigitsCount / 2), 2);
        }

        return result;
    }

    static int getDigitsSum(int n) {
        int result = 0;
        while (n / 10 > 0) {
            result += n % 10;
            n /= 10;
        }
        return result + n;
    }
}