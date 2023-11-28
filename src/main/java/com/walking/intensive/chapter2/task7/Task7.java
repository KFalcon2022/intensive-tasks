package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        int limit = 10000;

        System.out.println(getFriendlyPair(limit));
    }

    static int getFriendlyPair(int m) {
        int maxFriendlyNumber = 0;
        int sumFriendlyPair = 0;

        for (int i = m - 1; i > 0; i--) {
            int friendlyNumber1 = getDivisors(i);
            int friendlyNumber2 = getDivisors(friendlyNumber1);
            int maxNumber = Math.max(friendlyNumber1, friendlyNumber2);
            int sumNumbers = friendlyNumber1 + friendlyNumber2;

            if (i == friendlyNumber2 && maxNumber < m && sumFriendlyPair < sumNumbers && friendlyNumber1 != friendlyNumber2) {
                maxFriendlyNumber = maxNumber;
                sumFriendlyPair = sumNumbers;
            }
        }

        return maxFriendlyNumber;
    }

    static int getDivisors(int number) {
        int result = 0;

        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                result += i;
            }
        }

        return result;
    }
}