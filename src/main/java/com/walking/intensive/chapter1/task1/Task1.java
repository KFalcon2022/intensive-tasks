package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age;

        for (age = 0; age < 128; age++) {
            System.out.println(getAgeString(age));
        }
    }

    static String getAgeString(int age) {
        int ageMod = age % 100;

        if (ageMod % 10 == 1 && ageMod != 11) {
            return "Вам " + age + " год";
        }

        if (ageMod % 10 > 1 && ageMod % 10 < 5 && (ageMod < 12 || ageMod > 14)) {
            return "Вам " + age + " года";
        }

        return "Вам " + age + " лет";
    }
}