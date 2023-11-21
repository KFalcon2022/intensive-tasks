package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;
        System.out.println(getAgeString(age));
//Проверка
//        for (int i = 1; i < 120; i++) {
//            System.out.println(getAgeString(i));
//        }
    }

    static String getAgeString(int age) {
//        Место для вашего кода
        // последние 2 цифры кода
        int lastNumbers = age % 100;
        if (age < 0) {
            return "Вы не родились";
        } else if ((lastNumbers > 9 && lastNumbers < 21)) {
            return "Вам " + age + " лет";
            }

        lastNumbers %= 10;
        if (lastNumbers == 0) {
            return "Вам " + age + " лет";
        } else if (lastNumbers < 2) {
            return "Вам " + age + " год";
        } else if (lastNumbers < 5 ) {
            return "Вам " + age + " года";
        } else {
            return "Вам " + age + " лет";
        }
    }
}