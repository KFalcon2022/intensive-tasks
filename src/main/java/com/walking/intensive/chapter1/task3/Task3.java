package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        int year = 100;
        isLeap(year);
    }
    static boolean isLeap(int year) {
        if ((year % 40 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}