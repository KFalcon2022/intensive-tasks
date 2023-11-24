package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
 int year = 0;
    System.out.println(isLeap(year));
    }

    static boolean isLeap(int year) {
        //        Место для вашего кода
        boolean isLeap = year%4 == 0 && year%100 != 0 || year%400 == 0;

        return isLeap;
    }
}