package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 0;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
//        Место для вашего кода
        int mod10 = age % 10;
        int mod100 = age % 100;
        String result = " ";

        if (mod10 == 0 || mod10 >= 5 || (mod100 >= 11 && mod100 < 15)) {
            result += "лет";
        } else if (mod10 == 1) {
            result += "год";
        } else if (mod10 > 1 && mod10 < 5) {
            result += "года";
        }

        return result; // Заглушка. При реализации - удалить
    }
}