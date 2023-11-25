package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        for (int i = -1; i < 129; i++) {
            System.out.println(getAgeString(i));
        }

    }

    static String getAgeString(int age) {
        int age10 = age % 10;
        int age100 = age % 100;
        String s = "";

        if (age < 0 || age > 127) {
            return "Проверьте правильность ввода возраста";
        }

        if (age10 == 1) {

            if (age100 == 11) {
                s = "Вам " + age + " лет";
            } else {
                s = "Вам " + age + " год";
            }

        } else if (age10 == 2 || age10 == 3 || age10 == 4) {

            if (age100 == 12 || age100 == 13 || age100 == 14) {
                s = "Вам " + age + " лет";
            } else {
                s = "Вам " + age + " года";
            }

        } else {
            s = "Вам " + age + " лет";
        }

        return s;
    }
}