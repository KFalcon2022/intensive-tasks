package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int a = 72;
        int b = 96;

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
        int nod = 1;
        int i = 2;

        while (i < Math.min(m, n)) {
            if (m % i == 0 && n % i == 0) {
                if (i > nod) {
                    nod = i;
                }
            }
            i++;
        }

        return nod;
    }
}