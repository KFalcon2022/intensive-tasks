package com.walking.intensive.chapter1.task3;

public class Main {
    public static void main(String[] args) {
        boolean num1 = isLeapYear(100);
        System.out.println(num1);

        boolean num2 = isLeapYear(1896);
        System.out.println(num2);

        System.out.println(isLeapYear(2023));
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2600));
        System.out.println(isLeapYear(0));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1913));
        System.out.println(isLeapYear(-803));
    }

    public static boolean isLeapYear(int year) {
        return year > 0 && (year % 4 == 0 || year % 100 == 0 & year % 400 == 0);
    }
}