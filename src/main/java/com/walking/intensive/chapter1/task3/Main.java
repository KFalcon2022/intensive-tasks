package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(isLeap(2024));
        System.out.println(isLeap(100));
    }

    static boolean isLeap(int year) {
        if((year % 4 == 0 &&  year % 100 != 0) ||(year % 400 == 0)){
            return true;
        }
        else {
            return false;
        }

    }
}