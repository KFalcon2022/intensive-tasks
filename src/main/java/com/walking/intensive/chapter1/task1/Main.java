package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите ваш возраст ");
        int age = num.nextInt();
        if (age < 0) {
            System.out.println("Вы еще не родились. Введите число больше 0");
        } else if (age >= 127) {
            System.out.println("Вы превысили порог долгожительства. Введите число меньше 127");
        } else {
            System.out.println("Вам " + age + " " + getAgeString(age));
        }
        num.close();
    }

    private static final String one = "года";
    private static final String two = "лет";

    static String getAgeString(int age) {
        return switch (age % 10) {
            case 2, 3, 4 -> one;
            default -> two;
        };
    }
}