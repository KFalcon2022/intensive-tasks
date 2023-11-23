package com.walking.intensive.chapter1.task3;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Год, который вы бы хотели проверить:");
        int year = input.nextInt();
        System.out.println(isLeap(year));
    }

    static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}