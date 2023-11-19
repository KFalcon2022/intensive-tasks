package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        isLeap(100);
    }

    static boolean isLeap(int year) {

        return (year % 4 == 0 && year % 100 != 0) ? true : false;

    }
}