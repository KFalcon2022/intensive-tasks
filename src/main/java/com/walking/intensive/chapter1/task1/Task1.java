package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
        private static final int[] AGE_ARRAY = new int[]{11, 12, 13, 14, 15, 16, 17, 17, 19, 111, 112, 113, 114};

    public static void main(String[] args) {
        int age = 112;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age < 0) {
            return "Вы не родились";
        }

        for (int exceptionAge : AGE_ARRAY) {
            if (age == exceptionAge) {
                return "Вам " + age + " лет";
            }
        }

        return switch (age % 10) {
            case 1 -> "Вам " + age + " год";
            case 2, 3, 4 -> "Вам " + age + " года";
            default -> "Вам " + age + " лет";
        };
    }
}