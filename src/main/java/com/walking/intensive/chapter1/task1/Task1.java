package com.walking.intensive.chapter1.task1;

/**
 * Условие:
 */
public class Task1 {
    public static void main(String[] args) {
        int age = 122;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int x = age;
        if (x >= 100) {
            x -= 100;
        }
        if (x == 1) {
            return "Вам " + age + " год";
        }
        if (x > 4 && x <= 20 || x == 0) {
            return "Вам " + age + " лет";
        }
        if (x % 10 > 4 && x % 10 < 10 || x % 10 == 0) {
            return "Вам " + age + " лет";
        }
        if (x % 10 == 1) {
            return "Вам " + age + " год";
        } else return "Вам " + age + " года";
    }
}