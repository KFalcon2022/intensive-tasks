package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 18;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age <= 0) {
            return "Сначала Вы должны родиться";
        }

        String old = "";

        if (age > 10 && age < 20) {
            old = "лет";
        }

        int ageLastNumber = age % 10;

        if (ageLastNumber == 1) {

            old = "год";
        } else if (ageLastNumber > 1 && ageLastNumber < 5) {
            old = "года";
        } else if (ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9) {
            old = "лет";
        }

        return "Вам " + age + " " + old;
    }
}