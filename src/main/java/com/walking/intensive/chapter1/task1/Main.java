package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 51;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age < 0 || age > 127) {
            return "Указан неправильный возраст";
        }

        int temporaryAgeCondition = 0;

        if (age <= 4 || age > 20 && age <= 104 || age > 120) {
            temporaryAgeCondition = age % 10;
        }

        if (temporaryAgeCondition == 1) {
            return "Вам " + age + " год";
        }

        if (temporaryAgeCondition != 0 && temporaryAgeCondition <= 4) {
            return "Вам " + age + " года";
        }

        return "Вам " + age + " лет";
    }
}