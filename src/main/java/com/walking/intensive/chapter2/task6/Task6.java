package com.walking.intensive.chapter2.task6;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNod(1000, 2000));
        System.out.println(getNoc(1000, 2000));
        System.out.println(getNodByEuclideanAlgorithm(1000, 2000));
    }

    static int getNoc(int m, int n) {
        return m / getNod(m, n) * n;
    }

    static int getNod(int m, int n) {
        if (n == 0) {
            return m;
        }

        return getNod(n, m % n);
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }

        return m;
    }
}