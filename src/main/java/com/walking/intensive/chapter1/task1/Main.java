package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 0;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age > 127 || age < 0) {
            return ("Возраст введен некорректно");
        }
        int i = age % 100;
        if (i >= 11 && i <= 14) {
            return ("Вам" + age + "лет");
        }
        int a = i % 10;
        if (a == 1) {
            return ("Вам" + age + "год");
        } else if (a == 2 || a == 3 || a == 4) {
            return ("Вам" + age + "года");
        } else {
            return ("Вам" + age + "лет");
        }

    }
}