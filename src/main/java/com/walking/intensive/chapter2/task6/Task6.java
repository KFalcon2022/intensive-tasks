package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNodByEuclideanAlgorithm(116150, 232704));
    }

    static int getNoc(int m, int n) {
        return Math.abs(m * n) / getNod(m, n);
    }

    static int getNod(int m, int n) {
        while (m != 0 && n != 0) {
            if (m > n) {
                m %= n;
            } else {
                n %= m;
            }
        }

        return m + n;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (m == 0 || n == 0) {
            return m + n;
        } else if (m > n) {
            return getNodByEuclideanAlgorithm(m % n, n);
        } else {
            return getNodByEuclideanAlgorithm(m, n % m);
        }

    }

}