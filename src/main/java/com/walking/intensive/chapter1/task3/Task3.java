package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        //Для собственных проверок можете делать любые изменения в этом методе
        if (isLeap(1600)) {
            System.out.println("ok");
        }

    }
    static boolean isLeap(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

    }
}