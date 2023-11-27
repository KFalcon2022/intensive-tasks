package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {

        int age = 127;
        System.out.println(getAgeString(age));

        for (int i = -1; i < 129; i++) {
            System.out.println(getAgeString(i));

        }
    }

    static String getAgeString(int age) {
        String answerAge = " Ваш возраст ";


        if (age < 0 || age > 127) {
            return " Возраст введен неверно ";
        }
        int resultRemainder = age % 10;
        int resultExclusion = age % 100;


        if (resultExclusion >= 11 && resultExclusion <= 14 || resultRemainder >= 5 && resultRemainder <= 9 || resultRemainder == 0) {
            return answerAge + age + " лет";
        }

        if (resultRemainder >= 2 && resultRemainder <= 4) {
            return answerAge + age + " года";

        }

        if (age == 1) {
            return answerAge + age + " год";
        }

        return answerAge + age + " год";
    }
}

