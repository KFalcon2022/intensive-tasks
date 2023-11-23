package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int age = 91;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String answerAge = " Ваш возраст ";

        if (age >= 11 && age <= 19 || age == 0 || age % 10 == 0) {
            return answerAge + age + " лет";
        }
        if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
            return answerAge + age + " года";
        }
        if (age % 10 == 1) {
        }
        return answerAge + age + " год";
    }
}

