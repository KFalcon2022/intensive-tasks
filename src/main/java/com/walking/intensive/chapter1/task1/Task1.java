package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 112;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String getAgeStr = "";
        if (age%100 == 11 || age%100 == 12 || age%100 == 13 || age%100 == 14) {
            getAgeStr = " лет";
        } else {
            if (age % 10 == 1) {
                getAgeStr = " год";
            } else {
                if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
                    getAgeStr = " года";
                } else {
                    getAgeStr = " лет";
                }
            }
        }
        return "Вам " + age + getAgeStr;
    }
}