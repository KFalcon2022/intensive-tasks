package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        int age = 112;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String s = "Вам ";

        if (age < 0) {
            return " Вы не родились";
        }

        int[] ageArray = new int[]{11, 12, 13, 14, 15, 16, 17, 17, 19, 111, 112, 113, 114};
        for (int id : ageArray) {
            if (age == id) {
                return s + age + " лет";
            }
        }

        switch (age % 10) {
            case 1:
                return s + age + " год";
            case 2:
            case 3:
            case 4:
                return s + age + " года";
            default:
                return s + age + " лет";
        }
    }
}