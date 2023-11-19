package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isLeap(2000));
        System.out.println(isLeap(1900));
        System.out.println(isLeap(2004));
        System.out.println(isLeap(2001));

    }

    static boolean isLeap(int year) {
        return (year % 4 == 0 && ((year % 400 == 0) || (year % 100 != 0)));

    }
}