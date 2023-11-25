package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {


        int x = age % 100;

        if (x != 11 && x % 10 == 1) {
            return "Вам " + age + " год";

        } else if (x % 10 > 1 && x % 10 < 5 && x != 12 && x != 13 && x != 14) {
            return "Вам " + age + " года";

        } else {
            return "Вам " + age + " лет";
        }
    }

}