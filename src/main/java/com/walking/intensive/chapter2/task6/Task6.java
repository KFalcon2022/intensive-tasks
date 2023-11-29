package com.walking.intensive.chapter2.task6;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        do {
            System.out.print("Введите положительное число а: ");
            a = scanner.nextInt();

            System.out.print("Введите положительное число b: ");
            b = scanner.nextInt();
        }
        while (a < 1 || b < 1);

        scanner.close();

        System.out.printf("НОД числа %d и числа %d равен %d\n", a, b, getNod(a, b));
        System.out.printf("НОК числа %d и числа %d равен %d\n", a, b, getNoc(a, b));
        System.out.printf("НОД числа %d и числа %d, рассчитанный по алгоритму Евклида, равен %d\n", a, b, getNodByEuclideanAlgorithm(a, b));
    }

    static int getNoc(int m, int n) {
        int result = Math.max(m, n);

        for (int i = result; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {

                return i;
            }
        }

        return result;

    }

    static int getNod(int m, int n) {
        int result = Math.min(m, n);

        for (int i = result; i > 0; i--) {
            if (m % i == 0 && n % i == 0) {

                return i;
            }
        }

        return result;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (n == 0) {

            return m;
        }

        return getNodByEuclideanAlgorithm(n, m % n);
    }
}