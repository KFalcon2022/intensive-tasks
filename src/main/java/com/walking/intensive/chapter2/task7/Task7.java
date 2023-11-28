package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {

    }

    static int getFriendlyPair(int m){
        if (m >= 1_000_000) {
            return 0;
        }

        int maxFriendlyNumber = 0;
        for (int i = 1; i < m; i++)
        {
            for (int j = 1; j < m; j++) {
                if (getDivisorsSum(i) == j && getDivisorsSum(j) == i) {
                    maxFriendlyNumber = Math.max(i, j);
                }
            }
        }
        return maxFriendlyNumber;
    }

    static double getDivisorsSum(int a) {
        double sum = 0;
        if (a > 0) {
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    sum += i;
                }
            }
            return sum;
        } else {
            return 0;
        }
    }
}