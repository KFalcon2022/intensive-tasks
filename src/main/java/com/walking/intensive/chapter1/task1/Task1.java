package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */

public class Task1 {
    public static void main(String[] args) {}

    static String getAgeString(int age) {
        if (age % 10 == 1 && age != 11 && age != 111) {
            return "Вам " + age + " год";
        } else if ((age % 10 > 1 && age % 10 < 5) && !(age >= 12 && age <= 15) && !(age % 100 == 12 || age % 100 == 13 || age % 100 == 14)) {
            return "Вам " + age + " года";
        } else {
            return "Вам " + age + " лет";
        }
    }
}