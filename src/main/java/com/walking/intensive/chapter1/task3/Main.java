package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        for (int i = 1889; i < 2024; i++) {
            System.out.println("Год " + i + " " + (isLeap(i) ? "високосный" : "не вискосный"));
        }

    }

    static boolean isLeap(int year) {
        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;
    }
}