package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(isLeap(2000));
        System.out.println(isLeap(4));
        System.out.println(isLeap(100));
        System.out.println(isLeap(200));
        System.out.println(isLeap(1999));
        System.out.println(isLeap(400));
    }

    static boolean isLeap(int year) {
        if (year % 4 == 0) {
            return !(year % 100 == 0 & year % 400 != 0);
        } else return false;
    }
}