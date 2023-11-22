package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        for (int i = -1; i < 128; i++) {
            System.out.println(getAgeString(i));
        }
    }

    static String getAgeString(int age) {
        int module = age % 100;
        if (age > 127 || age < 0) {
            return "Incorrect age!";
        } else if (module >= 11 && module <= 20) {
            return "Вам " + age + " лет";
        } else {
            module = age % 10;
            switch (module) {
                case 1 -> {
                    return "Вам " + age + " год";
                }
                case 2, 3, 4 -> {
                    return "Вам " + age + " года";
                }
                case 5, 6, 7, 8, 9, 0 -> {
                    return "Вам " + age + " лет";
                }
                default -> {
                    return "Error!";
                }
            }
        }
    }
}