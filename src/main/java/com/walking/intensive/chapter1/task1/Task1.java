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

        int young = age % 100;

        if (young != 11 && young % 10 == 1) {
            return "Вам " + age + " год";
        } else if (young % 10 > 1 && young % 10 < 5 && young != 12 && young != 13 && young != 14) {
            return "Вам " + age + " года";
        } else {
            return "Вам " + age + " лет";
        }
    }
}