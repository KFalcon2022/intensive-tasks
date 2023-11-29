package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        int year = 800;
        if (isLeap(year)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }

    static boolean isLeap(int year) {

        return (year % 4 == 0 && year % 100 != 0 || year % 400==0);
    }
}