package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {

        int age = 1;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String answerAge = " Ваш возраст ";
        int resultRemainder = age % 10;
        int resultExclusion = age % 100;


        if (resultExclusion >= 11 && resultExclusion <= 14 || resultRemainder >= 5 && resultRemainder <= 9 || resultRemainder == 0) {
            return answerAge + age + " лет";
        }

        if (resultRemainder >= 2 && resultRemainder <= 4) {
            return answerAge + age + " года";

        } else if (age == 1) {
            return answerAge + age + " год";
        }

        return answerAge + age + " год";
    }
}

