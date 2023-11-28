package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {

        int m = 112;
        int n = 14;

        System.out.println("НОК чисел " + m + " и " + n + " равен: " + getNoc(m, n));
        System.out.println("НОД чисел " + m + " и " + n + " равен: " + getNod(m, n));
        System.out.println("НОД чисел " + m + " и " + n + " равен: " + getNodByEuclideanAlgorithm(m, n));
    }

    static int getNoc(int m, int n) {

        int noc = Math.max(m, n);

        while (noc % m != 0 || noc % n != 0) {
            noc++;
        }

        return noc;
    }

    static int getNod(int m, int n) {

        int nod = Math.min(m, n);

        while (m % nod != 0 || n % nod != 0) {
            nod--;
        }

        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {

        if (Math.max(m, n) % Math.min(m, n) == 0) return Math.min(m, n);

        return getNodByEuclideanAlgorithm(Math.abs(m - n), Math.min(m, n));
    }

}