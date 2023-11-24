package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 1222;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        int lastNumber = age % 10;
        int last2Numbers = age % 100;

        if (age < 0) {
            return "Некорректный возраст";
        }

        if ((11 <= last2Numbers && 14 >= last2Numbers) || 5 <= lastNumber || lastNumber == 0) {
            return ("Вам " + age + " лет");
        } else if (2 <= lastNumber) {
            return ("Вам " + age + " года");
        } else if (lastNumber == 1) {
            return ("Вам " + age + " год");
        } else {
            return null;
        }
    }
}