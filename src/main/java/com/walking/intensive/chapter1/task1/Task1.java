package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age;
        for (age = 0; age < 128; age++) {
            System.out.println(getAgeString(age));
        }
    }

    static String getAgeString(int age) {
        int ageRecalc = age % 100;
        if (ageRecalc > 4 && ageRecalc < 21) {
            return "Вам " + age + " лет";
        } else if (ageRecalc % 10 == 1) {
            return "Вам " + age + " год";
        } else if (ageRecalc % 10 == 2 || ageRecalc % 10 == 3 || ageRecalc % 10 == 4) {
            return "Вам " + age + " года";
        } else {
            return "Вам " + age + " лет";
        }
    }
}