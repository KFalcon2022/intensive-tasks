package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
//        int age = 114;
//
//        System.out.println(getAgeString(age));
        for (int i = 0; i < 127; i++) {
            System.out.println(getAgeString(i));
        }

    }

    static String getAgeString(int age) {
        if (age < 0) {
            return "Введен неверный возраст.";
        }
        if (age % 10 == 1 && age % 100 != 11) {
            return "Вам " + age + " год.";
        }

        if (1 < age % 10 && age % 10 < 5 && age % 100 != 12 && age % 100 != 13 && age % 100 != 14) {
            return "Вам " + age + " года.";
        }
        return "Вам " + age + " лет.";
    }
}