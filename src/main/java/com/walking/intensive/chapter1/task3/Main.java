package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int year = 2100;
        if (isLeap(year)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }
    }

    static boolean isLeap(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}