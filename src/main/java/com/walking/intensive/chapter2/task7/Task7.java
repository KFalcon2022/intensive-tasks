package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {

        int m = 99_999;
        int maxFriendlyPair = getFriendlyPair(m);
        int minFriendlyPair = getDivisorsSum(maxFriendlyPair);

        System.out.println("Friendly max: " + maxFriendlyPair +
                         "\nFriendly min: " + minFriendlyPair);
    }

    static int getFriendlyPair(int m) {

        final int MAX_VALUE = 1_000_000;

        m = Math.abs(m);

        if (m >= MAX_VALUE) {
            return 0;
        }

        /*
         * Выполнение кода в предыдущем коммите для максимального значения занимало около 4,5 часов(!)
         * Выполнение нового кода для максимального значения занимает около 2 минут
        */

        int maxFriendlyPair = m - 1;
        int minFriendlyPair = getDivisorsSum(maxFriendlyPair);

        while (!isNumbersFriendly(maxFriendlyPair, minFriendlyPair) && maxFriendlyPair > 0 ||
                minFriendlyPair > m) {

            maxFriendlyPair--;
            minFriendlyPair = getDivisorsSum(maxFriendlyPair);
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