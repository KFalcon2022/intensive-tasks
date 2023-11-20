package com.walking.intensive.chapter1.task2;

public class Main {
    public static void main(String[] args) {
        boolean num1 = isLeapYear(100);
        System.out.println(num1);

        boolean num2 = isLeapYear(1896);
        System.out.println(num2);

        isLeapYear(2023);
        isLeapYear(2024);
        isLeapYear(2600);
        isLeapYear(0);
        isLeapYear(2000);
        isLeapYear(1913);
        isLeapYear(-803);
    }

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;

        if (year <= 0) {
            System.out.println("Введите год равный или более 1.");
            isLeap = false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0 & year % 400 == 0) {
                System.out.println(year + " год - високосный.");
                isLeap = true;
            } else if (year % 100 == 0 & year % 400 != 0) {
                System.out.println(year + " год - невисокосный.");
                isLeap = false;
            } else {
                System.out.println(year + " год - високосный.");
                isLeap = true;
            }
        } else {
            System.out.println(year + " год - невисокосный.");
            isLeap = false;
        }
        return isLeap;
    }
}