package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 113;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if ((age >= 11 && age <= 14) || (age>111 && age<=114)) {
            return "Вам " + age + " лет";
        } else {
            int suffix = age % 10;
            if (suffix == 1) {
                return "Вам " + age + " год";
            } else if (suffix >= 2 & suffix <= 4) {
                return "Вам " + age + " года";
            }
            return "Вам " + age + " лет";
        }
    }
}