package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 146;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
//        Место для вашего кода
        int lastNumber = age % 10;
        if ((lastNumber == 0) || (lastNumber >= 5))
            return ("Вам " + age + " лет.");
        else if (lastNumber == 1) {
            return ("Вам " + age + " год.");

        } else return ("Вам " + age + " года.");
    }
}