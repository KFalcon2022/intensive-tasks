package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {

        System.out.println(getDivisors(220));
        System.out.println(getDivisors(284));
        System.out.println(getDivisors(440));
        System.out.println(getDivisors(880));
        System.out.println(getDivisors(1760));
        System.out.println();
        System.out.println(getFriendlyPair(1000));
        System.out.println(getFriendlyPair(5000));
        System.out.println(getFriendlyPair(10000));
        System.out.println(getFriendlyPair(15000));
        System.out.println(getFriendlyPair(20000));
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