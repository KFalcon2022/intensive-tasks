package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 111;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age % 100 >= 11 && age % 100 <= 14) {
            return ("Вам " + age + " лет");
        }

        if (age % 10 >= 2 && age % 10 <= 4) {
            return ("Вам " + age + " года");
        }

        if (age % 10 == 1) {
            return ("Вам " + age + " год");
        }

        return ("Вам " + age + " лет");
    }
}
