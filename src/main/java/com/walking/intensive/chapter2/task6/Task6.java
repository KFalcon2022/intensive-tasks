package com.walking.intensive.chapter2.task6;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
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
        System.out.printf("НОД числа %d и числа %d равен %d\n", a, b, getNodByEuclideanAlgorithm(a, b));
    }

    static int getNoc(int m, int n) {
        int result = Math.max(m, n);
        for (int i = result; i % m + i % n != 0; i++) {
            result = i;
        }

        if (result == Math.max(m, n)) {
            return result;
        }
        return result + 1;
    }

    static int getNod(int m, int n) {
        int result = Math.min(m, n);
        for (int i = result; m % i + n % i != 0; i--) {
            result = i;
        }

        if (result == Math.min(m, n)) {
            return result;
        }
        return result - 1;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (n == 0) {
            return m;
        }
        return getNodByEuclideanAlgorithm(n, m % n);
    }

}