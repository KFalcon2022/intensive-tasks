package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 128;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String message;
        if (age <= 0 || age > 127) {
            message = "Неверно введен возраст";
        } else if (age < 5) {
            message = "Вам " + age + " года";
        } else {
            message = "Вам " + age + " лет";
        }
        return message;
    }
}
