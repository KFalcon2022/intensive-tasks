package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        int startNumber = 1000;

        System.out.println(getFriendlyPair(startNumber));
        System.out.println();
        msg(startNumber, getFriendlyPair(startNumber));

    }

    static int getFriendlyPair(int m) {
        if (m < 1 || m > 1_000_000) {
            return 0;
        }

        int maxFriendlyPair = 0;
        for (int i = 1; i < m; i++) {

            int quantityOfDivisors = sumOfDivisor(i);
            int potentialPair = sumOfDivisor(quantityOfDivisors);

            if (potentialPair == i && quantityOfDivisors != i) {
                maxFriendlyPair = Math.max(maxFriendlyPair, i);
            }
        }

        return maxFriendlyPair;
    }


    public static int sumOfDivisor(int x) {

        int sum = 1;

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                sum += i;
                if (i != x / i) {
                    sum += x / i;
                }
            }
        }

        return sum;
    }

    static void msg(int start, int end) {

        if (end != 0) {
            System.out.println("Наибольшее число из пары дружественных чисел для " + start + ": " + end);
        } else {
            System.out.println("Дружественная пара для числа " + start + ": отсутствует");
        }
    }
}