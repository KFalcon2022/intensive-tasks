package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int a = 96;
        int b = 72;

        System.out.printf("НОК (%s, %s) = %s\n", a, b, getNoc(a, b));
        System.out.printf("НОД Евклид (%s, %s) = %s\n", a, b, getNodByEuclideanAlgorithm(a, b));
        System.out.printf("НОД (%s, %s) = %s\n", a, b, getNod(a, b));
    }

    static int getNoc(int m, int n) {
        return (m * n) / getNod(m, n);
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (n == 0) {
            return Math.abs(m);
        }
        return Math.abs(getNodByEuclideanAlgorithm(n, m % n));
    }

    static int getNod(int m, int n) {
        if (m == 0 && n == 0) {
            return 0;
        }

        if (m == 0) {
            return Math.abs(n);
        }

        if (n == 0) {
            return Math.abs(m);
        }

        m = Math.abs(m);
        n = Math.abs(n);
        int gcd = 1;

        for (int i = 2; i < Math.min(m, n); i++) {
            while (m % i == 0 && n % i == 0) {
                gcd *= i;
                m /= i;
                n /= i;
            }
        }

        return gcd;
    }
}