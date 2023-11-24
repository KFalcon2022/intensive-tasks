package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        //Для собственных проверок можете делать любые изменения в этом методе
        System.out.println("Is it leap year? : " + isLeap(1903));
    }

    static boolean isLeap(int year) {
        //Место для вашего кода
        if (year % 4 == 0) {
            return year % 100 != 0 || year % 400 == 0;
        }

        return false;
    }
}