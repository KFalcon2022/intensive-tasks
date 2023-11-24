package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст ");
        int age = scanner.nextInt();
        scanner.close();
        System.out.print(getAgeString(age));
    }

    private static final String ONE_YEAR = "год";
    private static final String SOME_YEARS = "года";
    private static final String MANY_YEARS = "лет";

    static String getAgeString(int age) {
        if (age < 0) {
            return "Вы еще не родились. Введите число больше 0";
        } else if (age >= 128) {
            return "Вы превысили порог долгожительства. Введите число меньше 128";
        } else {
            int num = age % 100;
            if (num > 20) {
                num %= 10;
            }
            String ageString = switch (num) {
                case 1 -> ONE_YEAR;
                case 2, 3, 4 -> SOME_YEARS;
                default -> MANY_YEARS;
            };
            return "Вам " + age + " " + ageString;
        }
    }
}