package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        int startNumber = 2620;

        System.out.println(getFriendlyPair(startNumber));
        System.out.println();
        msg(startNumber, getFriendlyPair(startNumber));

    }

    static int getFriendlyPair(int m) {
        if (m < 1 || m > 1_000_000) {
            return 0;
        }

        int quantityOfDivisors = sumOfDivisor(m);
        int potentialPair = sumOfDivisor(quantityOfDivisors);

        return (potentialPair == m && quantityOfDivisors != m ? quantityOfDivisors : 0);

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
            System.out.println("Дружественная пара для числа " + start + ": (" + start + ", " + end + ")");
        } else {
            System.out.println("Дружественная пара для числа " + start + ": отсутствует");
        }
    }
}