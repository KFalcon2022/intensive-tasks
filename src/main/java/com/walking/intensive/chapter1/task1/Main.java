package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 103;
        System.out.println("Вам " + age + " " + getAgeString(age));

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age % 100 >= 11 && age % 100 <= 14) {
            return "лет";
        } else {
            if (age % 10 == 1) {
                return "год";
            } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
                return "года";
            }
            return "лет";
        }
    }
}