package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;
        if (age < 0) {
            System.out.println("Вы еще не родились:)");
        }
        else if (age % 100 == 11 | age % 100 == 12 | age % 100 == 13 | age % 100 == 14) {
            System.out.println("Вам " + age + " лет");
        }
        else if (age % 10 == 1) {
            System.out.println("Вам " + age + " год");
        }
        else if (age % 10 == 2 | age % 10 == 3 | age % 10 == 4) {
            System.out.println("Вам " + age + " года");
        }
        else {
            System.out.println("Вам " + age + " лет");
        }
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
//      Место для вашего кода
        return null;
    }
}