package com.walking.intensive.chapter1.task3;
/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
    }

    static boolean isLeap(int year) {
        return ((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0);
    }
}