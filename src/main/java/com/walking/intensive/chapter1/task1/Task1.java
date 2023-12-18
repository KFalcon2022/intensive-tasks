package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {

        for (int age = 500; age <= 700; age++) {
            System.out.println(getAgeString(age));
        }
    }

    static String getAgeString(int age) {

        int lastDigitInAge = age % 10;
        int lastTwoDigitsInAge = age % 100;

        if (lastDigitInAge == 0) {
            return "Вам " + age + " лет";
        } else if (lastDigitInAge > 4 && lastDigitInAge < 21) {
            return "Вам " + age + " лет";
        } else if (lastTwoDigitsInAge > 4 && lastTwoDigitsInAge < 21) {
            return "Вам " + age + " лет";
        } else if (lastDigitInAge == 1 && age % 100 != 11) {
            return "Вам " + age + " год";
        } else if (lastDigitInAge >= 2 && lastDigitInAge <= 4) {
            return "Вам " + age + " года";
        }

        return "";
    }
}