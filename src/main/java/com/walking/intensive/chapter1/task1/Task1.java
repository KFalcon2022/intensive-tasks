package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {

        int age = 112;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        int remainder = age % 100 / 10;

        if (age < 0 || age > 127) {
            return "Это врядли";
        }

        if ((remainder == 1 || age % 10 == 1) && !(age > 9 && age < 20 || age > 109 && age < 120)) {
            return "Вам " + age + " год";
        }

        if (age % 10 > 1 && age % 10 < 5 && !(age > 11 && age < 15 || age > 111 && age < 115)) {
            return "Вам " + age + " года";
        }

        return "Вам " + age + " лет";
    }
}
