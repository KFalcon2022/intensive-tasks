package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 0;

        for (; age < 128; age = age + 1) {
            System.out.println(getAgeString(age));
        }
    }

    static String getAgeString(int age) {
        int remainderOfDivision = age % 10;

        if ((age > 4 && age < 21) || (age > 104 && age < 121)) {
            return "Вам " + age + " лет";
        }

        if (remainderOfDivision == 1) {
            return "Вам " + age + " год";
        }

        if (remainderOfDivision == 2 || remainderOfDivision == 3 || remainderOfDivision == 4) {
            return "Вам " + age + " года";
        }

        return "Вам " + age + " лет";
    }
}