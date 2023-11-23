package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 32;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
//        Место для вашего кода
        String message;

        if (age == 0 || age % 10 == 0 || age == 11 || age % 100 == 11 || age == 12 || age % 100 == 12 ||
                age == 13 || age % 100 == 13 || age == 14 || age % 100 == 14) {
            message = "Вам " + age + " лет";
        } else if (age == 1 || age % 10 == 1) {
            message = "Вам " + age + " год";
        } else if (age == 2 || age == 3 || age == 4 || age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
            message = "Вам " + age + " года";
        } else {
            message = "Вам " + age + " лет";
        }

        return message;
    }
}