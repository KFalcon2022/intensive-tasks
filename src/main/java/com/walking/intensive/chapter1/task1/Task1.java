package com.walking.intensive.chapter1.task1;

public class Task1 {
    public static void main(String[] args) {
        int age = 5;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age < 0 || age > 127) {
            return "Некорректно введен возраст";
        }

        int ageTens = age % 100;
        int ageUnits = age % 10;

        if (ageUnits == 1 && ageTens != 11) {
            return "Вам " + age + " год";
        }

        if (ageTens > 4 && ageTens < 21 || ageUnits > 4 || ageUnits == 0) {
            return "Вам " + age + " лет";
        }

        return "Вам " + age + " года";
    }
}