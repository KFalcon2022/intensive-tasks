package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;

        System.out.println("НОК = " + getNoc(m, n));
        System.out.println("НОД = " + getNod(m, n));
        System.out.println("НОД = " + getNodByEuclideanAlgorithm(m, n));
    }

    static boolean checkValue(int m, int n) {
        return m == 0 || n == 0;
    }

    static int getNoc(int m, int n) {
        if (checkValue(m, n)) {
            return 0;
        }

        int maxValue = Math.max(m, n);
        int minValue = Math.min(m, n);
        int noc = maxValue;

        while (noc % minValue != 0) {
            noc += maxValue;
        }

        return Math.abs(noc);
    }

    static int getNod(int m, int n) {
        if (checkValue(m, n)) {
            if (m != 0) {
                return Math.abs(m);
            }
            if (n != 0) {
                return Math.abs(n);
            }

            return 0;
        }

        int maxValue = Math.max(m, n);
        int minValue = Math.min(m, n);
        int temp;

        while (minValue != 0) {
            temp = minValue;
            minValue = maxValue % minValue;
            maxValue = temp;
        }

        return Math.abs(maxValue);
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (n == 0) {
            return Math.abs(m);
        }

        return getNodByEuclideanAlgorithm(n, m % n);
    }
}