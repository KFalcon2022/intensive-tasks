package com.walking.intensive.chapter1.task3;

import java.util.Random;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();
        int year = random.nextInt(1582, 2024);

        System.out.println(isLeap(year) ? year + " год невискокостный!" : year + " год вискокостный!");
    }

    static boolean isLeap(int year) {

        return year % 100 == 0 || year % 4 != 0;
    }
}
