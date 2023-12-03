package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
    }

    static int getFriendlyPair(int m){
        int maxFriendlyNumber = 0;
        int maxSumFriendlyNumbers = 0;

        if (m >= 1_000_000) {
            return 0;
        }
        for (int i = m; i > 1 ; i--)
        {
            int firstNumberDivisorsSum = getDivisorsSum(i);
            int secondNumberDivisorsSum = getDivisorsSum(firstNumberDivisorsSum);

            if (i == secondNumberDivisorsSum && firstNumberDivisorsSum != secondNumberDivisorsSum && (i + secondNumberDivisorsSum) > maxSumFriendlyNumbers) {
                maxSumFriendlyNumbers = i + secondNumberDivisorsSum;
                maxFriendlyNumber = i;
            }
        }
        return maxFriendlyNumber;
    }

    static int getDivisorsSum(int a) {
        int sum = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}