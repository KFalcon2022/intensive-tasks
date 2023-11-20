package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        Scanner years = new Scanner(System.in);

        System.out.println("Введите ваш возраст от 1 до 127");
        int age = years.nextInt();
        years.close();

        getAgeString(age);
    }
    static void getAgeString(int age) {

        if (age > 1 && age <= 4 || age > 21 && age <= 24 || age > 41 && age <= 44 || age > 51 && age <= 54
                || age > 61 && age <= 64 || age > 71 && age <= 74 || age > 81 && age <= 84 || age > 91 && age <= 94
                || age > 101 && age <= 104 || age > 121 && age <= 124) {
            System.out.println("Вам " + age + " года");

        } else if (age > 4 && age <= 20 || age > 24 && age <= 30 || age > 34 && age <= 40 || age > 44 && age <= 50
                || age > 54 && age <= 60 || age > 64 && age <= 70 || age > 74 && age <= 80 || age > 84 && age <= 90
                || age > 94 && age <= 100 || age > 104 && age <= 120 || age > 124 && age <= 127) {
            System.out.println("Вам " + age + " лет");

        } else if (age == 1 || age == 21 || age == 31 || age == 41 || age == 51 || age == 61 || age == 71
                || age == 81 || age == 91 || age == 101 || age == 121) {
            System.out.println("Вам " + age + " год");

        } else if (age > 127 || age <= 0) {
            System.out.println("Ваш возраст " + age + " не попадает в диапозон заданного возраста");
        }
    }
}
