package com.walking.intensive.chapter2.task6;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Введите первое число m ");
        int m = number.nextInt();

        System.out.println("Введите второе число n ");
        int n = number.nextInt();

        number.close();

        System.out.println("НОД " + getNod(m, n) + "\n" + "НОК " + getNoc(m, n));

        System.out.println("НОД по алгоритму Евклида " + getNodByEuclideanAlgorithm(m, n));
    }

    static int getNoc(int m, int n) {
        return m / getNod(m, n) * n;
    }

    static int getNod(int m, int n) {
        int result = 0;
        for (int i = 1; i <= Math.max(m, n); i++) {
            if (m % i == 0 && n % i == 0) {
                result = i;
            }
        }

        return result;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        return n == 0 ? m : getNodByEuclideanAlgorithm(n, m % n);
    }
}