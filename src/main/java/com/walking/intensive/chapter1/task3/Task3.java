package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        //Для собственных проверок можете делать любые изменения в этом методе

    }

    static boolean isLeap(int year) {
        boolean isYearStatus = false;
        isYearStatus = (year % 4 == 0) ? true: false;
        isYearStatus = (year % 100 == 0) ? false: isYearStatus;
        isYearStatus = (year % 400 == 0) ? true: isYearStatus;
        return isYearStatus; // Заглушка. При реализации - удалить
    }
}