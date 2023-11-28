package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {

        int m = 10000;

        System.out.println("Friendly max: " + getFriendlyPair(m));
    }

    static int getFriendlyPair(int m) {

        final int MAX_VALUE = 1_000_000;

        m = Math.abs(m);

        if (m >= MAX_VALUE) {
            return 0;
        }

        int maxFriendlyNumbersSum = 0;
        int maxFriendlyPair = 0;

        for (int i = 1; i < m; i++) {

            int iDivisorsSum = getDivisorsSum(i);

            if (isNumbersFriendly(i, iDivisorsSum) && iDivisorsSum < m) {

                int friendlyNumbersSum = i + iDivisorsSum;

                if (friendlyNumbersSum > maxFriendlyNumbersSum) {

                    maxFriendlyNumbersSum = friendlyNumbersSum;
                    maxFriendlyPair = Math.max(i, iDivisorsSum);
                }
            }
        }

        return maxFriendlyPair;
    }

    static boolean isNumbersFriendly(int num1, int num2) {

        if (num1 == num2) {
            return false;
        }

        return num1 == getDivisorsSum(num2) && num2 == getDivisorsSum(num1);
    }

    static int getDivisorsSum(int number) {

        number = Math.abs(number);

        int divisorsSum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {

                divisorsSum += i;
            }
        }

        return divisorsSum;
    }
}