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

        if (lastDigitInAge == 0 || lastDigitInAge >= 5
                || (lastTwoDigitsInAge > 4 && lastTwoDigitsInAge < 21)) {
            return "Вам " + age + " лет";
        }

        if (lastDigitInAge == 1 && age % 100 != 11) {
            return "Вам " + age + " год";
        }
        return "Вам " + age + " года";
    }
}