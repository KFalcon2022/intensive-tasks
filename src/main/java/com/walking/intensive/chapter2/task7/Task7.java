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
        int maxSumFriendlyNumbers = 0;
        for (int i = m; i > 1 ; i--)
        {
            long firstNumberDivisorsSum = getDivisorsSum(i);
            for (int j = 1; j < m ; j++) {
                long secondNumberDivisorsSum = getDivisorsSum(j);
                if (i != j && firstNumberDivisorsSum == j && secondNumberDivisorsSum == i && (i + j > maxSumFriendlyNumbers)) {
                    maxSumFriendlyNumbers = i + j;
                    maxFriendlyNumber = Math.max(i, j);
                }
            }
        }
        return maxFriendlyNumber;
    }

    static long getDivisorsSum(int a) {
        long sum = 0;
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