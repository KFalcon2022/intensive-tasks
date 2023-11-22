package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int age = 156;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if ( age < 0 || age > 150) {
            return "Введен неверный возраст.";
        }

        int i = age%10;

        if (i == 1) {
            return "Вам " + age + " год.";
        }
        if (i > 1 && i < 5) {
            return "Вам " + age + " года.";
        }
        return "Вам " + age + " лет.";
    }
}