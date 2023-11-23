package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(isLeap(2000));       //true
        System.out.println(isLeap(4));          //true
        System.out.println(isLeap(100));        //false
        System.out.println(isLeap(200));        //false
        System.out.println(isLeap(1999));       //false
        System.out.println(isLeap(400));        //true
    }

    static boolean isLeap(int year) {
        if (year % 4 == 0) {
            return !(year % 100 == 0 & year % 400 != 0);
        } else return false;
    }
}