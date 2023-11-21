package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 29;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
//        Место для вашего кода
        int lastNumber = age % 10;
        String old = "";

        if (lastNumber == 1) {
            old = "год";
        } else if (lastNumber == 0 || (lastNumber >= 5 && lastNumber <= 9)) {
            old = "лет";
        } else if (lastNumber >= 2 && lastNumber <= 4) {
            old = "года";
        }
        if ((age % 100 >= 11) && (age % 100 <= 14)) {
            old = "лет";
        }

        return "Вам " + age + " " + old;
    }
}
