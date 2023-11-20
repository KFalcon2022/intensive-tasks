package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 * https://ru.wikipedia.org/wiki/%D0%92%D0%B8%D1%81%D0%BE%D0%BA%D0%BE%D1%81%D0%BD%D1%8B%D0%B9_%D0%B3%D0%BE%D0%B4
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(isLeap(1600));
        System.out.println(isLeap(2000));
        System.out.println(isLeap(1700));
        System.out.println(isLeap(1800));
        System.out.println(isLeap(1900));
        System.out.println(isLeap(2020));
        System.out.println(isLeap(2024));
    }

    static boolean isLeap(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }

        return false;
    }
}
