package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        for (int i = -1; i <= 128; i++) {
            System.out.println(getAgeString(i));
        }
    }

    static String getAgeString(int age) {
        int module = age % 100;

        if (age < 0 || age > 127) {
            return "Incorrect age!";
        }
        if (module >= 11 && module <= 20) {
            return "Вам " + age + " лет";
        }

        int remainder = age % 10;

        if (remainder == 1) {
            return "Вам " + age + " год";
        }
        if (remainder >= 2 && remainder <= 4){
            return "Вам " + age + " года";
        }
        return "Вам " + age + " лет";
    }
}