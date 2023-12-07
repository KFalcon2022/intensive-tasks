package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static final int MAX_NUMBER = 1000000;

    public static void main(String[] args) {
        System.out.println(getFriendlyPair(200));
    }

    static int getSumNumberDivisors(int number) {
        int sumNumberDivisors = 0;

        if (number >= MAX_NUMBER || number < 0) {
            System.out.println("Invalid number input. Try again");
        }

        for (int i = 1; i <= number; i++) {
            if ((number % i == 0) & (number / i != number)) {
                sumNumberDivisors += number / i;
            }
        }
        return sumNumberDivisors;
    }

    static int getFriendlyPair(int m) {
        int friendlyPair = 0;

        for (int i = m - 1; i >= 1; i--) {
            int pairNumber1 = getSumNumberDivisors(i);

            if (pairNumber1 < m) {
                int pairNumber2 = getSumNumberDivisors(pairNumber1);

                if (pairNumber1 != i && pairNumber2 == i) {
                    friendlyPair = Math.max(friendlyPair, Math.max(pairNumber1, pairNumber2));
                }
            }
        }
        return friendlyPair;
    }
}