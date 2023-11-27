package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(300));
    }

    static int getFriendlyPair(int N) {
        for (int i = N; i > 1; i--) {
            int sum1number = 0;
            int sum2number = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum1number += j;
                }
            }

            for (int j = 1; j < sum1number; j++) {
                if (sum1number % j == 0) {
                    sum2number += j;
                }
            }

            if (sum2number == i) {
                return i;
            }

        }
        return 0;
    }

}