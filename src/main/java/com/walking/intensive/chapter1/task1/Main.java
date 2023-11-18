package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите возраст");
        int age = in.nextInt();
        in.close();

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        String message = "";

        if (age % 100 >= 11 && age % 100 <= 14) {
            message = "Вам " + age + " лет";
        } else if (age % 10 == 1) {
            message = "Вам " + age + " год";
        } else if (age % 10 <= 4) {
            message = "Вам " + age + " года";
        } else {
            message = "Вам " + age + " лет";
        }

        return message;
    }
}
