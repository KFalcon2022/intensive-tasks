package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int years[] = {2023, 2020, 2000, 1996, 1900, 1800, 1600, 1200, 444, 500, 400, 0};

        for (int year : years
        ) {
            System.out.println("Год " + year + " - " + isLeap(year));
        }
    }

    static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else return false;
    }
}