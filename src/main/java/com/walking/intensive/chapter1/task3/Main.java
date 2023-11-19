package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int testYear = 2023;
        boolean isTestYearLeap = isLeap(testYear);

        if (isTestYearLeap) {
            System.out.printf("Год %d - это високосный год.", testYear);
        } else {
            System.out.printf("Год %d - это не високосный год.", testYear);
        }
    }

    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}