package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(isLeap(321));
    }

    static boolean isLeap(int year) {

        if (year < 1) {
            throw new IllegalArgumentException("Год указан некорректно");
        }
        return year % 400 == 0 || year % 4 == 0;
    }
}