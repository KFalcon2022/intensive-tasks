package com.walking.intensive.chapter1.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        Для собственных проверок можете делать любые изменения в этом методе
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        reader.close();

        String particles = "";
        if (!isLeap(year)) particles = " не";
        System.out.println(year + " год" + particles + " является високосным");
    }

    static boolean isLeap(int year) {
        //        Место для вашего кода
        if (year % 4 == 0 && year % 100 != 0) return true;
        else return false;
    }
}