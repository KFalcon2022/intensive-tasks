package com.walking.intensive.chapter2.task7;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        int number1 = 1000000; //220;
        int number2 = 0; //284;

        if (number1 == 0 || number2 == 0) {
            System.out.println( "Должны бать меньше 1 000 000");
//            return 0;
        }

        if ((number1 >= 1000000 & number2 >= 1000000)) {
            System.out.println( "Должны бать меньше 1 000 000");
        }

        if (areFriendlyNumbers(number1, number2)) {
            System.out.println(number1 + " и " + number2 + " являются дружественной парой чисел.");
        } else {
            System.out.println(number1 + " и " + number2 + " не являются дружественной парой чисел.");
        }
    }

    public static boolean areFriendlyNumbers(int number1, int number2) {
        int sum1 = getFriendlyPair(number1);
        int sum2 = getFriendlyPair(number2);

        return (sum1 == number2) && (sum2 == number1);
    }

    static int getFriendlyPair(int m){
        int sum = 0;

        for (int i = 1; i <= m / 2; i++) {
            if (m % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}