package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        //Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(isLeap(504));
    }

    static boolean isLeap(int year) {
        //Место для вашего кода
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));// Заглушка. При реализации - удалить
    }
}