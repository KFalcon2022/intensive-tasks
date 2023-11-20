package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 127;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int remainder = age % 10;

        if (age > 0 & age < 128) {

            if (remainder == 1) {
                return ("Вам " + age + " год");
            } else if (remainder == 2 || remainder == 3 || remainder == 4) {
                return ("Вам " + age + " года");
            } else {
                return ("Вам " + age + " лет");
            }
        } else {
            return ("Неверно указан возраст");
        }
    }
}