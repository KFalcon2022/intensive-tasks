package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int age = 122;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String answerAge = " Ваш возраст ";
        int result = age % 10;

        if (result >= 5 && result <= 20 || (result % 10) == 0) {
            return answerAge + age + " лет";
        }

        if (result >= 2 && result <= 4) {
            return answerAge + age + " года";

        }
        else if (age == 1) {
            return answerAge + age + " год";
        }

        return answerAge + age + " год";
    }
}



