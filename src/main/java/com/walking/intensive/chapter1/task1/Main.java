package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 11;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int ageLastNum = age % 10;

        String old = "";

        boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);

        if (ageLastNum == 1) {
            old = "год";
        } else if (ageLastNum == 0 || ageLastNum >= 5 && ageLastNum <= 9) {
            old = "лет";
        } else if (ageLastNum >= 2 && ageLastNum <= 4) {
            old = "года";
        }
        if (exclusion)
            old = "лет";

        return "Вам" + " " + age + " " + old;
    }
}