//package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int year = 1996;
        //int[] yearArray = {1900, 2022, 1904, 1999, 2000, 1720, 1721}
        System.out.println(year + " год высокосный? " + isLeap(year));
    }



      static boolean isLeap(int year) {
        boolean isTrue = false;

        if (year % 100 == 0) {
            isTrue = false;
        } else if (year % 4 == 0) {
            isTrue = true;
        }


        return isTrue;
    }
}
