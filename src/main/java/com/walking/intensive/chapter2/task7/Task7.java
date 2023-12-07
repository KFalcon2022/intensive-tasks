package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(1000000));
    }

    static int getFriendlyPair(int m) {
        int firstPairNum = 0;
        int secondPairNum = 0;

        for (int i = 1; i < m; i++) {
            int j = getSumDivisors(i);
            if (i < j && i == getSumDivisors(j)) {
                firstPairNum = i;
                secondPairNum = j;
            }
        }

        if (firstPairNum < secondPairNum  && secondPairNum < m ) {
            return secondPairNum;
        }

        return firstPairNum;
    }

    static int getSumDivisors(int m) {
        int sum = 0;

        for (int i = 1; i < m / 2 + 1; i++) {
            if (m % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}