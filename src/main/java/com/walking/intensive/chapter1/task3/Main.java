package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 * Год считается высокосным, если он кратен 4.
 * Однако если год кратен 100, он не считается высокосным,
 * за исключением случаев, когда он также кратен 400.
 */
public class Main {
    public static void main(String[] args) {
        int year = 2000;
        System.out.println(year + " is a leap yaer, it`s " + isLeap(year));
    }

    static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }
}