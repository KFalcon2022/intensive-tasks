package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int year = 2023;

        if (isLeap(year)) {
            System.out.println(year + " год - високостный!");
        } else {
            System.out.println(year + " год - невисокостный!");
        }
    }

    static boolean isLeap(int year) {

        if (year % 400 == 0) {          //  високостный
            return true;
        } else if (year % 100 == 0) {   //  невисокостный
            return false;
        } else
            return year % 4 == 0;       //  високостный
    }
}