package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int a = 42,
                b = 23;

        System.out.println("НОД: " + getNod(a, b) +
                "\nНОК: " + getNoc(a, b) +
                "\nНОД по алгоритму Евклида: " + getNodByEuclideanAlgorithm(a, b));
    }

    static int getNoc(int m, int n) {
        int noc = 0;
        for (int i = 1; i <= n; i++) {
            noc = i * m;

            if (noc % n == 0) {
                break;
            }
        }

        return noc;
    }

    static int getNod(int m, int n) {
        int ceiling = Math.min(m, n),
                nod = 0;

        for (int i = 1; i <= ceiling; i++) {
            if (m % i == 0 && n % i == 0) {
                nod = i;
            }
        }

        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (m%n == 0) {
            return Math.min(m, n);
        }

        return getNodByEuclideanAlgorithm(n, m%n);
    }
}