package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 0;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int mod = age % 10;
        if (mod == 1) {
            return "Вам " + age + " год.";
        } else {
            if (mod >= 2 && mod <= 4) {
                return "Вам " + age + " года.";
            } else {
                return "Вам " + age + " лет.";
            }
        }
    }
}