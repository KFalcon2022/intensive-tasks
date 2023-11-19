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
        if (age < 0) {
            return "Вы ввели неправильный возраст. Он должен быть больше нуля";
        }

        if (((age % 100) > 10) && ((age % 100) < 20)) {
            return "Вам " + age + " лет";
        } else {
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
