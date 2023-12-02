package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(284));
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

            if (potentialPair == i && delimiterSum != i) {
                int max = Math.max(i, delimiterSum);
                if (max < m) {
                    result = max;
                }
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