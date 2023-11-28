package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNoc(10, 25));
        System.out.println(getNodByEuclideanAlgorithm(18, 15));
        System.out.println(getNod(25, 15));
    }

    static int getNoc(int m, int n) {
        return Math.abs(m * n) / getNodByEuclideanAlgorithm(m, n);
    }

    static int getNod(int m, int n) {
        while (m != 0 && n != 0) {
            if (m > n) {
                m = m % n;
            } else {
                n = n % m;
            }
        }
        return m + n;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (n != 0 && m != 0) {
            return m > n ? getNodByEuclideanAlgorithm(m % n, n) : getNodByEuclideanAlgorithm(m, n % m);
        }
        return n + m;
    }

}