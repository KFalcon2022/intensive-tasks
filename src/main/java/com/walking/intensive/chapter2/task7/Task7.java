package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(10000));
    }

    static int getFriendlyPair(int m) {

        if (m < 0) {
            System.out.println("The number is not a natural number");
            return -1;
        }

        if (m >= 1000000) {
            return -1;
        }

        int maxSum = 0;
        int maxFriendlyNumber = 0;
        int n = m;

        while (n != 0) {

            int sumFriendlyPair = 0;
            int k = getDivisorsSum(n);

            if ((getDivisorsSum(k) == n) && (Math.max(k, n) < 1000000) && (n != k)) {
                sumFriendlyPair = k + n;

                if (sumFriendlyPair > maxSum) {
                    maxSum = sumFriendlyPair;
                    maxFriendlyNumber = Math.max(k, n);
                }
            }

            n--;
        }

        return maxFriendlyNumber;
    }

    static int getDivisorsSum(int m) {

        int sumDivisors = 0;

        for (int i = 1; i < (m / 2 + 1); i++) {
            if (m % i == 0) {
                sumDivisors += i;
            }
        }

        return sumDivisors;
    }
}