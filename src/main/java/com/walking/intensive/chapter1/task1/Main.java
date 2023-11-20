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
        if (age < 1) return "Вы не родились";
        if (age < 2) return "Вам 1 год";
        if (age < 5 ) return "Вам" + age + "года";
        return "Вам" + age + "лет";
//        return null; // Заглушка. При реализации - удалить
    }
}