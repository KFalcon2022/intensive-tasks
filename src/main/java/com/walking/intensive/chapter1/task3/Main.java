package com.walking.intensive.chapter1.task3;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner years = new Scanner(System.in);

        System.out.println("Введите год");
        int year = years.nextInt();
        years.close();

        System.out.println(isLeap(year));
    }
    static boolean isLeap(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}