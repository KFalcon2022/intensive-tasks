package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(200));
    }

    static int getFriendlyPair(int m) {

        int sumOfFriendlyPair = 0;
        int maxSumOfFriendlyPair = 0;
        int maxFriendlyNumber = 0;

        if (m >= 1000000) {
            return -1;
        }

        while (m != 0) {
            if ((sumOfDividers(sumOfDividers(m)) == m) && (sumOfDividers(m) < m)) {
                sumOfFriendlyPair = sumOfDividers(m) + m;
                if (sumOfFriendlyPair > maxSumOfFriendlyPair) {
                    maxSumOfFriendlyPair = sumOfFriendlyPair;
                    maxFriendlyNumber = Math.max(sumOfDividers(m), m);
                }
            }
            m--;
        }

        return maxFriendlyNumber;
    }

    static int sumOfDividers(int m) {

        int sumOfDividers = 0;

        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                sumOfDividers += i;
            }
        }

        return sumOfDividers;
    }
}