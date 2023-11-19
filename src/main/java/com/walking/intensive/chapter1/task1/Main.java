package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой возраст: ");
        int age = scanner.nextInt();

        scanner.close();

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        switch (age % 100) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20: {
                return "Вам " + age + " лет";
            }
            default: {
                switch (age % 10) {
                    case 1:
                        return "Вам " + age + " год";
                    case 2:
                    case 3:
                    case 4: {
                        return "Вам " + age + " года";
                    }
                    default: {
                        return "Вам " + age + " лет";
                    }
                }
            }
        }
    }
}