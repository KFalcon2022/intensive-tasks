package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        //Для собственных проверок можете делать любые изменения в этом методе
        int year = 1700;

        System.out.println(isLeap(year));

    }

    static boolean isLeap(int year) {
        //Место для вашего кода
        if(year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;


        //return false; // Заглушка. При реализации - удалить
    }
}