package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {

        int m = -9;
        int n = 12;

        System.out.println(
                "D by Euclidean's Algorithm (" + m + "; " + n + ") = " +getNodByEuclideanAlgorithm(n, m) +
                "\nD (" + m + "; " + n + ") = " + getNod(m, n) +
                "\nK (" + m + "; " + n + ") = " + getNoc(m, n)
        );
    }

    static int getNoc(int m, int n) {

        if (m == 0 || n == 0) {
            return 0;
        }

        return Math.abs(m * n) / getNod(m, n);
    }

    static int getNod(int m, int n) {

        if (m == 0 || n == 0) {
            return m + n;
        }

        m = Math.abs(m);
        n = Math.abs(n);

        int nod = 1;

        for (int i = 1; i <= m && i <= n; i++) {

            if (m % i == 0 && n % i == 0) {
                nod = i;
            }
        }

        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {

        m = Math.abs(m);
        n = Math.abs(n);

        if (n == 0) {
            return m;
        }

        return getNodByEuclideanAlgorithm(n, m % n);
    }

}