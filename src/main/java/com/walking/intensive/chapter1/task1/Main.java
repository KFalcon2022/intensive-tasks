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

        System.out.println(getAgeString(age));
    }
    static String getAgeString(int age) {
        if (age <= 0 || age > 127) {
            return "Вы не попали в диапозон";
        }
        else if (age % 10 == 1 && age % 100 != 11) {
            return "Вам " + age + " год";
        } else if (age % 10 > 1 && age % 10 < 5 && (age % 100 <= 9 || age % 100 > 19)) {
            return "Вам " + age + " года";
        }
        return "Вам " + age + " лет";
    }
}