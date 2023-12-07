package com.walking.intensive.chapter1.task3;

import java.time.Year;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int year = 2400;
        System.out.println(isLeap(year));
    }

    static boolean isLeap(int year) {
        return  Year.of(year).isLeap();
    }
}