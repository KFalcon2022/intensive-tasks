package com.walking.intensive.chapter1.task3;

import java.util.Random;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int year = random.nextInt(1538, 2500);
        String str = isLeap(year) ? year + " год высокостный!" : year + " год невысокостный!";
        System.out.println(str);
    }

    static boolean isLeap(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
