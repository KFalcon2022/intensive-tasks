package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
    }

    static boolean isLeap(int year) {

        if (year < 1) {
            throw new IllegalArgumentException("Год указан некорректно");
        }

        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return year % 400 == 0 || year % 4 == 0;
    }
}