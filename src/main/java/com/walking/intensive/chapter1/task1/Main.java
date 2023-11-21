package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int age = 111;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age < 0) {
            return "Неверный возраст.";
        }
        if (age % 10 == 1 && age != 11 && age != 111) {
            return "Вам " + age + " год.";
        }
        if (age % 10 >= 2 && age % 10 <= 4 && age != 12 && age != 13 && age != 14 && age != 112 && age != 113 && age != 114) {
            return "Вам " + age + " года.";
        }

        return "Вам " + age + " лет.";
    }
}