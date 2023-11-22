package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int age = 15;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        return age + " is your age";
    }
}