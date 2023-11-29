package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        getFriendlyPair(100000);
    }

    static int getFriendlyPair(int m) {
        int number1 = 0;
        int number2 = 0;
        int summNumbers = 0;
        for (int i = 1; i <= m; i++) {
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
            if (i == number2 && i != number1) {
                System.out.println("Число " + i + " число " + number1 + " - дружественные");
                summNumbers = summNumbers + 1;
            }
            number2 = 0;
            number1 = 0;
        }
        System.out.println("Всего таких чисел - " + summNumbers);
        return 0;
    }
}