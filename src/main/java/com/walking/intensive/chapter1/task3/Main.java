package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 1598; i < 2025; i++) {
            String leap;

            if (isLeap(i)) {
                leap = "високосный";
            }
            else {
                leap = "обычный";
            }

            System.out.println(i + " - " + leap + " год");
        }
    }

    static boolean isLeap(int year) {

        if (year % 4 == 0) {
            return year % 100 != 0 || (year / 100) % 4 == 0;
        }

        return false;
    }
}