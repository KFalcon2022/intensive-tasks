package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите ваш возраст ");
        int age = num.nextInt();
        if (age < 0) {
            System.out.println("Вы еще не родились. Введите число больше 0");
        } else if (age >= 128) {
            System.out.println("Вы превысили порог долгожительства. Введите число меньше 128");
        } else if (age == 11 || age == 12 || age == 13 || age == 14 || age == 111) {
            System.out.println("Вам " + age + " лет");
        } else {
            System.out.println("Вам " + age + " " + getAgeString(age));
        }
        num.close();
    }

    private static final String one = "год";
    private static final String two = "года";
    private static final String three = "лет";

    static String getAgeString(int age) {
        return switch (age % 10) {
            case 1 -> one;
            case 2, 3, 4 -> two;
            default -> three;
        };
    }
}