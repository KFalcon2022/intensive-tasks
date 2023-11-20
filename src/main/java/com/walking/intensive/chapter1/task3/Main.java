package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        boolean isLeapYear = isLeap(2024);
        String typeYear = (isLeapYear) ? "Введенный год является високосным" : "Введенный год не является високосным";
        System.out.println(typeYear);

    }

    static boolean isLeap(int year) {
        final int dividerLeapYear = 4;
        return year % dividerLeapYear == 0;
    }
}