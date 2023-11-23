package com.walking.intensive.chapter1.task1;

public class Task1 {
    public static void main(String[] args) {
        int age = 1;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int remainder10 = age % 10;
        int remainder100 = age % 100;

        if (age < 0 || age > 127) {
            return "Неверно указан возраст";
        } else if (remainder100 == 11 || remainder100 == 12 || remainder100 == 13 || remainder100 == 14) {
            return "Вам " + age + " лет";
        } else if (remainder10 == 1) {
            return "Вам " + age + " год";
        } else if (remainder10 == 2 || remainder10 == 3 || remainder10 == 4) {
            return "Вам " + age + " года";
        } else {
            return "Вам " + age + " лет";
        }
    }
}
