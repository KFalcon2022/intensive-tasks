package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ваш возраст");

        Scanner Scan = new Scanner(System.in);
        int age = Scan.nextInt();
        Scan.close();

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age < 0 || age > 127) {
            return "Неверно введен возраст";
        } else {
            if (age % 100 >= 11 && age % 100 <= 14) {
                return "Вам " + age + " лет";
            } else if (age % 10 == 1) {
                return "Вам " + age + " год";
            } else if (age % 10 >= 2 && age % 10 <= 4) {
                return "Вам " + age + " года";
            } else {
                return "Вам " + age + " лет";
            }
        }
    }
}