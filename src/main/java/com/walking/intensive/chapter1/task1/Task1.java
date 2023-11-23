package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 111;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String year = "";
        String result = "";

        int lastNumberFromAge = age % 10;

        if (lastNumberFromAge == 1) {
            year = "год";
        } else {
            if (lastNumberFromAge == 2 || lastNumberFromAge == 3 || lastNumberFromAge == 4) {
                year = "года";
            } else {
                year = "лет";

            }
        }
        switch (age) {
            case 11 -> year = "лет";
            case 12 -> year = "лет";
            case 13 -> year = "лет";
            case 14 -> year = "лет";
            case 111 -> year = "лет";
            case 112 -> year = "лет";
            case 113 -> year = "лет";
            case 114 -> year = "лет";
        }

        result = ("Вам " + age + " " + year);
        return result;
    }
}