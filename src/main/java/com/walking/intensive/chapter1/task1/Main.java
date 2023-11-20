package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 113;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int modHundred = age % 100;
        if (modHundred >= 11 && modHundred <= 14) {
            return "Вам " + age + " лет.";
        } else {
            int modTen = age % 10;
            if (modTen == 1) {
                return "Вам " + age + " год.";
            } else {
                if (modTen >= 2 && modTen <= 4) {
                    return "Вам " + age + " года.";
                } else {
                    return "Вам " + age + " лет.";
                }
            }
        }

    }
}