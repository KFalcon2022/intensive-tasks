package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {

        int m = 16;
        int n = 20;

        System.out.println(getNodByEuclideanAlgorithm(m, n));
        System.out.println(getNod(m, n));
        System.out.println(getNoc(m, n));
    }

    static int getNoc(int m, int n) {
        return Math.abs(m * n) / getNod(m, n);
    }

    static int getNod(int m, int n) {
        while (m != 0 && n != 0) {
            if (m > n) {
                m = m % n;
            }
            if (m == 0) {
                return m + n;
            }
            n %= m;
        }
        return m + n;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (n == 0) {
            return m;
        }
        return getNodByEuclideanAlgorithm(n, m % n);
    }
}