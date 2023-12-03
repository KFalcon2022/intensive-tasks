package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */

public class Task7 {
    public static void main(String[] args) {
        int value = 10000;
        if (isCorrectInput(value)) {
            System.out.println(getFriendlyPair(value));
        }
    }

    static int getFriendlyPair(int m) {
        int result = 0;
        for (int i = 1; i < m; i++) {

            int firstValue;
            int secondValue;

            firstValue = getSumDivisors(i);

            if (firstValue == i) {
                continue;
            }

            secondValue = getSumDivisors(firstValue);

            if (secondValue == i) {
                result = Math.max(firstValue, secondValue);
            }
        }
        return result;
    }

    static int getSumDivisors(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0)
                sum += i;
        }
        return sum;
    }


    static boolean isCorrectInput(int m) {
        return (m > 0 || m < 1000000);
    }
}