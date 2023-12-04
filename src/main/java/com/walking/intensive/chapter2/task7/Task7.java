package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {

        System.out.println(getFriendlyPair(200));
        System.out.println(getFriendlyPair(497));
        System.out.println(getFriendlyPair(10_000));
        System.out.println(getFriendlyPair(20_000));

    }

    static int getFriendlyPair(int m) {
        if (m < 1 || m > 1000_000) {
            return 0;
        }

        int maxFriendlyNumber = 0;

        for (int i = 1; i < m; i++) {
            int friendlyOne = getDivisors(i);
            int friendlyTwo = getDivisors(friendlyOne);
            int maxNumber = Math.max(friendlyOne, friendlyTwo);

            if (i == friendlyTwo && maxNumber < m && friendlyOne != friendlyTwo) {
                maxFriendlyNumber = maxNumber;
            }
        }

        return maxFriendlyNumber;
    }

    static int getDivisors(int m) {
        int result = 0;

        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                result += i;
            }
        }

        return result;
    }
}