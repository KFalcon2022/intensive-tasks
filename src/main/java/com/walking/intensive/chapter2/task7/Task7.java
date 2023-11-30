package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        getFriendlyPair(1000000);
    }

    static int getFriendlyPair( int m ) {
        int number1 = 0;
        int number2 = 0;
        for (int i = m; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    number1 = number1 + j;
                }
            }
            for (int j = 1; j < number1; j++) {
                if (number1 % j == 0) {
                    number2 = number2 + j;
                }
            }
            if (i == number2 && i != number1 && number1 <= m) {
                System.out.println("Число " + i + " число " + number1 + " - дружественные");
            }
            number2 = 0;
            number1 = 0;
        }
        return 0;
    }
}