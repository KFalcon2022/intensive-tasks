package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//
        int age = 2;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if ((age % 10 >= 2 && age % 10 <= 4) && (age / 10 != 1 && age / 10 != 11)) {
            return "Вам " + age + " года";
        } else if ((age % 10 == 1) && (age % 100 != 11)) {
            return "Вам " + age + " год";
        }
        return "Вам " + age + " лет";
    }
}