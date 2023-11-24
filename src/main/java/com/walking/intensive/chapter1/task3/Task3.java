package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        int year = 2023;

        if (isLeap(year)) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
}
