package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int lastNumberFromAge = age % 10;
        String year = "";
        String result = "";

        if (age == 0) {
            result = "Вы ещё не родились";
        } else {
            if (age == 11 || age == 12 || age == 13 || age == 14) {
                year = "лет";
            } else {
                if (lastNumberFromAge == 1) {
                    year = "год";
                } else {
                    if (lastNumberFromAge == 2 || lastNumberFromAge == 3 || lastNumberFromAge == 4) {
                        year = "года";
                    } else {
                        year = "лет";
                    }
                }
            }
        }
        result = ("Вам " + age + " " + year);
        return result;
    }
}