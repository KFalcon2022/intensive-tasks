package com.walking.intensive.chapter1.task1;

public class Main {
    public static void main(String[] args) {
        int age = 100;
        int age1 = -5;
        int age2 = 0;
        int age3 = 2;
        int age4 = 6;
        int age5 = 10;
        int age6 = 37;
        int age7 = 111;
        int age8 = 130;

        System.out.println(getAgeString(age));
        System.out.println(getAgeString(age1));
        System.out.println(getAgeString(age2));
        System.out.println(getAgeString(age3));
        System.out.println(getAgeString(age4));
        System.out.println(getAgeString(age5));
        System.out.println(getAgeString(age6));
        System.out.println(getAgeString(age7));
        System.out.println(getAgeString(age8));
    }

    static String getAgeString(int age) {
        if (age < 0) {
            return "Введено отрицательное число. Введите число, равное не менее 0.";
        } else if (age > 127) {
            return "Превышен рекорд долгожительности, равного 127 лет.";
        } else if (age % 10 == 0 || (age <= 20 && age >= 11) || (age <= 120 && age >= 111)) {
            return "Вам " + age + " лет.";
        } else if (age % 10 <= 4 && age % 10 >= 2) {
            return "Вам " + age + " года.";
        } else if (age % 10 <= 9 && age % 10 >= 5) {
            return "Вам " + age + " лет.";
        } else {
            return "Вам " + age + " год.";
        }
    }
}