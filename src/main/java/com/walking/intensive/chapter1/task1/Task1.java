package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        int age = 15;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int ageLastNumber = age % 10;
        if ((age % 100 >= 11) && (age % 100 <= 14)) {
            return "Вам " + age + " лет";
        }
        if (ageLastNumber == 1) {
            return "Вам " + age + " год";
        }
        if (ageLastNumber == 0 || ageLastNumber >= 5) {
            return "Вам " + age + " лет";
        }
        return "Вам " + age + " года";
    }
}





