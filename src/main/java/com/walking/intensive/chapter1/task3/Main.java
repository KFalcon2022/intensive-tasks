package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        for (int i = -3; i < 2024; i++) {
            if (isValidYear(i)) {
                System.out.println("Год " + i + " " + (isLeap(i) ? "високосный" : "не вискосный"));
            } else {
                System.out.println("Неверное число");
            }
        }
    }

    static boolean isValidYear(int year) {
        return year > 0;
    }

    static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }
}