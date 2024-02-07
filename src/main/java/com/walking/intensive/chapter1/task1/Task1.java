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

        int ageValue = age;

        if (ageValue > 100) {
            ageValue %= 100;
        }

        if (ageValue > 15 && ageValue < 100) {
            ageValue %= 10;
        }

        if (ageValue == 1) {
            return "Вам " + age + " год";
        }

        if (ageValue > 1 && ageValue < 5) {
            return "Вам " + age + " года";
        }

        return "Вам " + age + " лет";
    }
}