package com.walking.intensive.chapter2.task6;

/*КУРСОВАЯ ЗАДАЧА - НОК и НОД

Напишите два метода. Первый метод возвращает НОК двух чисел. Второй метод возвращает НОД двух чисел.
P.S. По желанию: Если знакомы с рекурсией напишите алгоритм Евклида поиска НОД.

 */
public class Task6 {
    public static void main(String[] args) {

        int a = 9;
        int b = 15;

        try {
            System.out.printf("Наименьшее общее кратное для %d и %d: %d\n", a, b, getLeastCommonMultiple(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.printf("Наибольший общий делитель для %d и %d: %d\n", a, b, getGreatestCommonDivisor(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("Наибольший общий делитель для %d и %d рекурсивно: %d", a, b, useEuclideanAlgorithm(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getLeastCommonMultiple(int a, int b) throws IllegalArgumentException {

        if (a < 1 || b < 1) {
            throw new IllegalArgumentException("a и b должны быть положительными");
        }

        int i = Math.max(a, b);
        while (true) {
            if (i % a == 0 && i % b == 0) {
                return i;
            } else {
                i++;
            }
        }
    }

    public static int getGreatestCommonDivisor(int a, int b) throws IllegalArgumentException {

        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        throw new IllegalArgumentException("a и b должны быть положительными");
    }

    public static int useEuclideanAlgorithm(int a, int b) {

        if (a == 0 || b == 0) {
            return a + b;
        }
        if (a > b) {
            return useEuclideanAlgorithm(a % b, b);
        } else {
            return useEuclideanAlgorithm(a, b % a);
        }
    }
}