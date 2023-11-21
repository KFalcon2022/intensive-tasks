package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        int[] years1 = {400, 1600, 2000, 2020, 2024, 2028, 2032, 2040, 2400};
        int[] years2 = {1000, 1100, 1300, 1400, 1500, 1700, 1800, 2023, 2100};

        System.out.println("Должно быть true:");
        for (int year : years1) {
            System.out.println("Указанный год: " + year + " результат проверки: " + isLeap(year));
        }

        System.out.println("Должно быть false:");
        for (int year : years2) {
            System.out.println("Указанный год: " + year + " результат проверки: " + isLeap(year));
        }
    }

    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}