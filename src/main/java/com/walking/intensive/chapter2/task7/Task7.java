package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(100000));
        System.out.println(getFriendlyPair(0));
    }

    static int getFriendlyPair(int m) {
        if (m < 1) {
            throw new IllegalArgumentException("Допускаются только натуральных числа");
        }

        int potentialPair;
        int delimiterSum;
        int result = 0;

        for (int i = 1; i <= m; i++) {
            delimiterSum = getDelimiterSum(i);
            potentialPair = getDelimiterSum(delimiterSum);

            if (potentialPair == i && i < 1000000) {
                result = Math.max(Math.max(delimiterSum, i), result);
            }
        }

        return result;
    }

    static int getDelimiterSum(int m) {
        int sum = 0;

        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}