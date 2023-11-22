package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int age = 101;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age < 0 || age > 127) {
            return "error";
        }
        if (age % 100 > 10 & age % 100 < 15) {
            return "Вам " + age + " лет.";
        }
        if (age % 10 > 1 & age % 10 < 5) {
            return "Вам " + age + " года.";
        }
        if (age % 10 == 1) {
            return "Вам " + age + " год.";
        } else {
            return "Вам " + age + " лет.";
        }

    }
}