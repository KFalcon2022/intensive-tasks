package com.walking.intensive.chapter1.task3;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Чтобы проверить является ли год високосным, введите год: ");
        int year = in.nextInt();

        in.close();
        System.out.println(isLeap(year));
    }

    static boolean isLeap(int year) {
        return (year > 0 & year % 4 == 0) ^ (year % 400 == 0 ^ year % 100 == 0);
    }
}