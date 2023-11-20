package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(isLeap(1500));
        System.out.println(isLeap(1980));
        System.out.println(isLeap(1999));

    }

    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 !=0);
    }
}