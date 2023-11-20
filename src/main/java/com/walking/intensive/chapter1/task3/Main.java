package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
//        System.out.println(isLeap(1900));
//        System.out.println(isLeap(1979));
//        System.out.println(isLeap(1980));
    }

    static boolean isLeap(int year) {
        if (year % 4 != 0) return false;
        return year % 100 != 0;
        //        Место для вашего кода

//        return false; // Заглушка. При реализации - удалить
    }
}