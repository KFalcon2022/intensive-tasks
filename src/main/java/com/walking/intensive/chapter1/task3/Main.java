package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        for (int i = -3; i < 2024; i++) {
            printYearInfo(i);
        }
    }

    static void printYearInfo(int year) {
        try {
            System.out.println("Год " + year + " " + (isLeap(year) ? "високосный" : "не вискосный"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean isValidYear(int year) {
        return year > 0;
    }

    static boolean isLeap(int year) {
        if (isValidYear(year)) {

            if (year % 400 == 0) {
                return true;
            }

            if (year % 100 == 0) {
                return false;
            }

            return year % 4 == 0;
        } else {
            throw new IllegalArgumentException("Неверное число");
        }
    }
}