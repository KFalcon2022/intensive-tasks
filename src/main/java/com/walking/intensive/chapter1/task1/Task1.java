package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {


        int age = 129;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age < 0 || age > 127) {
            return "Возраст указан неверно";
        }
        int temp = age;

        if (temp > 100) {
            temp %= 100;
        }

        if (temp > 15 && temp < 100) {
            temp %= 10;
        }

        if (temp == 1) {
            return "Вам " + age + " год";
        }

        if (temp > 1 && temp < 5) {
            return "Вам " + age + " года";
        }
        return "Вам " + age + " лет";
    }
}