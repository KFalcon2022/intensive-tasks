package com.walking.intensive.chapter2.task7;


/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(getFriendlyPair(100000));

    }

    static int getFriendlyPair(int m) {
        for (int i = m - 1; i > 0; i--) {
            int divisorsSum = 0;

            for (int j = 1; j < (i / 2) + 1; j++) {
                if (divisorsSum + j >= i) {
                    divisorsSum = 0;
                    break;
                }
                if (i % j == 0) {
                    divisorsSum += j;
                }
            }

            int secondNumber = 0;

            for (int k = 1; k < divisorsSum; k++) {
                if (divisorsSum % k == 0) {
                    secondNumber += k;
                }
                if (secondNumber == i) {
                    return i;
                }
            }
        }
        return 0;
    }
}
